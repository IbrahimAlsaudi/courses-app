package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course(
    @StringRes val title: Int,
    val number: Int,
    @DrawableRes val image: Int,
)
