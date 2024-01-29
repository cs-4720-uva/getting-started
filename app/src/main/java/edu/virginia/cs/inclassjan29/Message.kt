package edu.virginia.cs.inclassjan29

import android.net.Uri

data class Message(
    val author: String,
    val authorImagePath: Uri,
    val text: String
)
