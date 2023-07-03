package com.rutale.noteskmm.database

import com.rutale.noteskmm.database.shared.newInstance
import com.rutale.noteskmm.database.shared.schema
import com.squareup.sqldelight.Transacter
import com.squareup.sqldelight.db.SqlDriver
import database.NoteQueries

public interface NotesDB : Transacter {
  public val noteQueries: NoteQueries

  public companion object {
    public val Schema: SqlDriver.Schema
      get() = NotesDB::class.schema

    public operator fun invoke(driver: SqlDriver): NotesDB = NotesDB::class.newInstance(driver)
  }
}
