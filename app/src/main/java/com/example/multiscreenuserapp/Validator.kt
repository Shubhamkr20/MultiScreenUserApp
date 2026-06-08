package com.example.multiscreenuserapp

object Validator {

    fun isNotEmpty(text: String): Boolean {
        return text.trim().isNotEmpty()
    }

    fun isValidEmail(email: String): Boolean {
        return email.contains("@") && email.contains(".")
    }
}