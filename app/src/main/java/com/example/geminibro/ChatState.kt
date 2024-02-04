package com.example.geminibro
import android.graphics.Bitmap
import com.example.geminibro.data.Chat



data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)