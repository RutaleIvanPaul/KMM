package com.rutale.noteskmm.android.note_detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\tJ\u0006\u0010!\u001a\u00020\u001bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/rutale/noteskmm/android/note_detail/NoteDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "noteDataSource", "Lcom/rutale/noteskmm/domain/note/NoteDataSource;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/rutale/noteskmm/domain/note/NoteDataSource;Landroidx/lifecycle/SavedStateHandle;)V", "_hasNoteBeenSaved", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "existingNoteId", "", "Ljava/lang/Long;", "hasNoteBeenSaved", "Lkotlinx/coroutines/flow/StateFlow;", "getHasNoteBeenSaved", "()Lkotlinx/coroutines/flow/StateFlow;", "isNoteContentFocused", "isNoteTitleFocused", "noteColor", "noteContent", "", "noteTitle", "state", "Lcom/rutale/noteskmm/android/note_detail/NoteDetailState;", "getState", "onNoteContentChanged", "", "text", "onNoteContentFocusChanged", "isFocused", "onNoteTitleChanged", "onNoteTitleFocusChanged", "saveNote", "androidApp_debug"})
public final class NoteDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.rutale.noteskmm.domain.note.NoteDataSource noteDataSource = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> noteTitle = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNoteTitleFocused = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> noteContent = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNoteContentFocused = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Long> noteColor = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.rutale.noteskmm.android.note_detail.NoteDetailState> state = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _hasNoteBeenSaved = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> hasNoteBeenSaved = null;
    private java.lang.Long existingNoteId;
    
    @javax.inject.Inject()
    public NoteDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.rutale.noteskmm.domain.note.NoteDataSource noteDataSource, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.rutale.noteskmm.android.note_detail.NoteDetailState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getHasNoteBeenSaved() {
        return null;
    }
    
    public final void onNoteTitleChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onNoteContentChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onNoteTitleFocusChanged(boolean isFocused) {
    }
    
    public final void onNoteContentFocusChanged(boolean isFocused) {
    }
    
    public final void saveNote() {
    }
}