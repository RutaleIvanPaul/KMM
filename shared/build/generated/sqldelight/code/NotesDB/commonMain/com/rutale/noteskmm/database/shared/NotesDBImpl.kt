package com.rutale.noteskmm.database.shared

import com.rutale.noteskmm.database.NotesDB
import com.squareup.sqldelight.Query
import com.squareup.sqldelight.TransacterImpl
import com.squareup.sqldelight.`internal`.copyOnWriteList
import com.squareup.sqldelight.db.SqlCursor
import com.squareup.sqldelight.db.SqlDriver
import database.NoteEntity
import database.NoteQueries
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.MutableList
import kotlin.reflect.KClass

internal val KClass<NotesDB>.schema: SqlDriver.Schema
  get() = NotesDBImpl.Schema

internal fun KClass<NotesDB>.newInstance(driver: SqlDriver): NotesDB = NotesDBImpl(driver)

private class NotesDBImpl(
  driver: SqlDriver
) : TransacterImpl(driver), NotesDB {
  public override val noteQueries: NoteQueriesImpl = NoteQueriesImpl(this, driver)

  public object Schema : SqlDriver.Schema {
    public override val version: Int
      get() = 1

    public override fun create(driver: SqlDriver): Unit {
      driver.execute(null, """
          |CREATE TABLE noteEntity(
          |    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
          |    title TEXT NOT NULL,
          |    content TEXT NOT NULL,
          |    colorHex INTEGER NOT NULL,
          |    created INTEGER NOT NULL
          |)
          """.trimMargin(), 0)
    }

    public override fun migrate(
      driver: SqlDriver,
      oldVersion: Int,
      newVersion: Int
    ): Unit {
    }
  }
}

private class NoteQueriesImpl(
  private val database: NotesDBImpl,
  private val driver: SqlDriver
) : TransacterImpl(driver), NoteQueries {
  internal val getAllNotes: MutableList<Query<*>> = copyOnWriteList()

  internal val getNoteById: MutableList<Query<*>> = copyOnWriteList()

  public override fun <T : Any> getAllNotes(mapper: (
    id: Long,
    title: String,
    content: String,
    colorHex: Long,
    created: Long
  ) -> T): Query<T> = Query(629869783, getAllNotes, driver, "Note.sq", "getAllNotes", """
  |SELECT *
  |FROM noteEntity
  """.trimMargin()) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getLong(3)!!,
      cursor.getLong(4)!!
    )
  }

  public override fun getAllNotes(): Query<NoteEntity> = getAllNotes { id, title, content, colorHex,
      created ->
    NoteEntity(
      id,
      title,
      content,
      colorHex,
      created
    )
  }

  public override fun <T : Any> getNoteById(id: Long, mapper: (
    id: Long,
    title: String,
    content: String,
    colorHex: Long,
    created: Long
  ) -> T): Query<T> = GetNoteByIdQuery(id) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getLong(3)!!,
      cursor.getLong(4)!!
    )
  }

  public override fun getNoteById(id: Long): Query<NoteEntity> = getNoteById(id) { id_, title,
      content, colorHex, created ->
    NoteEntity(
      id_,
      title,
      content,
      colorHex,
      created
    )
  }

  public override fun insertNote(
    id: Long?,
    title: String,
    content: String,
    colorHex: Long,
    created: Long
  ): Unit {
    driver.execute(446142570, """
    |INSERT OR REPLACE
    |INTO noteEntity(
    |    id,
    |    title,
    |    content,
    |    colorHex,
    |    created
    |) VALUES(?, ?, ?, ?, ?)
    """.trimMargin(), 5) {
      bindLong(1, id)
      bindString(2, title)
      bindString(3, content)
      bindLong(4, colorHex)
      bindLong(5, created)
    }
    notifyQueries(446142570, {database.noteQueries.getNoteById + database.noteQueries.getAllNotes})
  }

  public override fun deleteNoteById(id: Long): Unit {
    driver.execute(-1849306034, """
    |DELETE FROM noteEntity
    |WHERE id = ?
    """.trimMargin(), 1) {
      bindLong(1, id)
    }
    notifyQueries(-1849306034, {database.noteQueries.getNoteById +
        database.noteQueries.getAllNotes})
  }

  private inner class GetNoteByIdQuery<out T : Any>(
    public val id: Long,
    mapper: (SqlCursor) -> T
  ) : Query<T>(getNoteById, mapper) {
    public override fun execute(): SqlCursor = driver.executeQuery(428048923, """
    |SELECT *
    |FROM noteEntity
    |WHERE id = ?
    """.trimMargin(), 1) {
      bindLong(1, id)
    }

    public override fun toString(): String = "Note.sq:getNoteById"
  }
}
