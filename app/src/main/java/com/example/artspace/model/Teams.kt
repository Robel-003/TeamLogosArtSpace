package com.example.artspace.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Teams(@StringRes val stringResourceId: Int,
                 @DrawableRes val imageResourceId: Int)
