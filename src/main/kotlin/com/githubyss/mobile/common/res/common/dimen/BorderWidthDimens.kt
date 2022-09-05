package com.githubyss.mobile.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/** Overall border width dimens. */

@Stable
inline val Dp.Companion.BorderWidthNone
    get() = 0.dp

@Stable
inline val Dp.Companion.BorderWidthThinHalf
    get() = 0.5.dp

@Stable
inline val Dp.Companion.BorderWidthThin
    get() = 1.dp

@Stable
inline val Dp.Companion.BorderWidthNormal
    get() = 2.dp

@Stable
inline val Dp.Companion.BorderWidthThick
    get() = 5.dp

@Stable
inline val Dp.Companion.BorderWidthMargin
    get() = 10.dp
