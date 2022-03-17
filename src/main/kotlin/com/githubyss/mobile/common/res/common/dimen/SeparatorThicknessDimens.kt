package com.githubyss.mobile.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/** Overall separator thickness dimens. */

@Stable
inline val Dp.Companion.SeparatorThicknessNone: Dp
    get() = 0.dp

@Stable
inline val Dp.Companion.SeparatorThicknessThin: Dp
    get() = 1.dp

@Stable
inline val Dp.Companion.SeparatorThicknessThick: Dp
    get() = 5.dp

@Stable
inline val Dp.Companion.SeparatorThicknessMargin: Dp
    get() = 10.dp