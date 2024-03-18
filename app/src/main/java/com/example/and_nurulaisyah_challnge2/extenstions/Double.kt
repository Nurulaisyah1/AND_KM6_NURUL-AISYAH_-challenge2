package com.example.and_nurulaisyah_challnge2.extenstions

import java.text.NumberFormat
import java.util.Locale

fun Double?.doubleToCurrency(language: String, country: String): String? {
    return try {
        val localeID = Locale(language, country)
        val numberFormat = NumberFormat.getCurrencyInstance(localeID)
        numberFormat.format(this).toString()
    } catch (e: Exception) {
        null
    }
}
fun Double?.toIndonesianFormat() = this.doubleToCurrency("in","ID")