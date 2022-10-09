package com.githubyss.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/** Overall separator thickness dimens. */

@Stable
inline val Dp.Companion.SeparatorThicknessNone
    get() = 0.dp

@Stable
inline val Dp.Companion.SeparatorThicknessThin
    get() = 1.dp

@Stable
inline val Dp.Companion.SeparatorThicknessNormal
    get() = 2.dp

@Stable
inline val Dp.Companion.SeparatorThicknessThick
    get() = 5.dp

@Stable
inline val Dp.Companion.SeparatorThicknessMargin
    get() = 10.dp