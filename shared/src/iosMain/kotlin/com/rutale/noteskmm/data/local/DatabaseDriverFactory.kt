package com.rutale.noteskmm.data.local

import com.rutale.noteskmm.database.NotesDB
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(NotesDB.Schema, "note.db")
    }
}