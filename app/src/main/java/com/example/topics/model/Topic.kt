package com.example.topics.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val numTopics: Int,
    @DrawableRes val imageResourceId: Int,
)
