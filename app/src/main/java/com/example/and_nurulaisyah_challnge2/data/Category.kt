package com.example.and_nurulaisyah_challnge2.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Category(

    var id: String = UUID.randomUUID().toString(),

    @DrawableRes
    var img: Int,

    var name: String
): Parcelable
