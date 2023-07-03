package com.rutale.noteskmm.data.local

import android.content.Context
import com.rutale.noteskmm.database.NotesDB
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(NotesDB.Schema, context, "note.db")
    }
}