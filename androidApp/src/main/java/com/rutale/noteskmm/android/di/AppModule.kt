package com.rutale.noteskmm.android.di

import android.app.Application
import com.rutale.noteskmm.data.local.DatabaseDriverFactory
import com.rutale.noteskmm.data.note.SqlDelightNoteDataSource
import com.rutale.noteskmm.database.NotesDB
import com.rutale.noteskmm.domain.note.NoteDataSource
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NotesDB(driver))
    }
}