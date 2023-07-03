package com.rutale.noteskmm.android.note_list

import com.rutale.noteskmm.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
