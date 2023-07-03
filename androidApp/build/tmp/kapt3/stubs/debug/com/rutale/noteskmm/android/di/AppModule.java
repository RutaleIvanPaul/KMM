package com.rutale.noteskmm.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/rutale/noteskmm/android/di/AppModule;", "", "()V", "provideNoteDataSource", "Lcom/rutale/noteskmm/domain/note/NoteDataSource;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "provideSqlDriver", "app", "Landroid/app/Application;", "androidApp_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.rutale.noteskmm.android.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.sqldelight.db.SqlDriver provideSqlDriver(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rutale.noteskmm.domain.note.NoteDataSource provideNoteDataSource(@org.jetbrains.annotations.NotNull()
    com.squareup.sqldelight.db.SqlDriver driver) {
        return null;
    }
}