package com.mazen.tasbeeh

object TasbeehConfig {
    const val APP_NAME = "Tasbeeh"
    const val BUILD_LANGUAGE = "Kotlin"
    const val VERSION = "8.1.0"
}

data class ZikrModel(
    val id: Int,
    val text: String,
    val count: Int,
    val category: String
)

enum class AppTheme {
    LIGHT,
    DARK,
    SYSTEM_DEFAULT
}

class TasbeehHelper {
    fun getWelcomeMessage(): String {
        return "Welcome to Tasbeeh App"
    }
}
