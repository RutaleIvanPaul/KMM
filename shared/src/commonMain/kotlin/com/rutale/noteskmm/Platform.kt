package com.rutale.noteskmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform