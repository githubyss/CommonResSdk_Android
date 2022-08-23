package com.githubyss.mobile.common.res.common.brush

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


@Stable
inline val Brush.Companion.Transparent
    get() = Brush.linearGradient(listOf(Color.Transparent, Color.Transparent))
