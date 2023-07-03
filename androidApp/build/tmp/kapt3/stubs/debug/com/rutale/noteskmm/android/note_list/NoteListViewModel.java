package com.rutale.noteskmm.android.note_list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/rutale/noteskmm/android/note_list/NoteListViewModel;", "Landroidx/lifecycle/ViewModel;", "noteDataSource", "Lcom/rutale/noteskmm/domain/note/NoteDataSource;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/rutale/noteskmm/domain/note/NoteDataSource;Landroidx/lifecycle/SavedStateHandle;)V", "isSearchActive", "Lkotlinx/coroutines/flow/StateFlow;", "", "notes", "", "Lcom/rutale/noteskmm/domain/note/Note;", "searchNotes", "Lcom/rutale/noteskmm/domain/note/SearchNotes;", "searchText", "", "state", "Lcom/rutale/noteskmm/android/note_list/NoteListState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteNoteById", "", "id", "", "loadNotes", "onSearchTextChange", "text", "onToggleSearch", "androidApp_debug"})
public final class NoteListViewModel extends androidx.lifecycle.ViewModel {
    private final com.rutale.noteskmm.domain.note.NoteDataSource noteDataSource = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final com.rutale.noteskmm.domain.note.SearchNotes searchNotes = null;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.rutale.noteskmm.domain.note.Note>> notes = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchText = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSearchActive = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.rutale.noteskmm.android.note_list.NoteListState> state = null;
    
    @javax.inject.Inject()
    public NoteListViewModel(@org.jetbrains.annotations.NotNull()
    com.rutale.noteskmm.domain.note.NoteDataSource noteDataSource, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.rutale.noteskmm.android.note_list.NoteListState> getState() {
        return null;
    }
    
    public final void loadNotes() {
    }
    
    public final void onSearchTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onToggleSearch() {
    }
    
    public final void deleteNoteById(long id) {
    }
}