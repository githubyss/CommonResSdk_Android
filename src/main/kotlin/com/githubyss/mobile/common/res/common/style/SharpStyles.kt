package com.githubyss.mobile.common.res.common.style

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp


@Stable
fun MaterialTheme.shapeRound(radius: Dp) = RoundedCornerShape(radius)

@Stable
fun MaterialTheme.shapeRoundTop(radius: Dp) = RoundedCornerShape(radius).copy(bottomStart = ZeroCornerSize, bottomEnd = ZeroCornerSize)

@Stable
fun MaterialTheme.shapeRoundBottom(radius: Dp) = RoundedCornerShape(radius).copy(topStart = ZeroCornerSize, topEnd = ZeroCornerSize)

@Stable
inline val MaterialTheme.shapeRectangle
    get() = RectangleShape
