package com.example.course.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResource: Int,
    val count: Int,
    @DrawableRes val imageResource: Int,
)
