package com.githubyss.mobile.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/** Overall stroke width dimens. */

@Stable
inline val Dp.Companion.BorderWidthNone: Dp
    get() = 0.dp

@Stable
inline val Dp.Companion.BorderWidthThin: Dp
    get() = 1.dp

@Stable
inline val Dp.Companion.BorderWidthThick: Dp
    get() = 5.dp