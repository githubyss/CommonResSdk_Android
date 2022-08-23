package com.githubyss.mobile.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/** Overall elevation dimens. */

@Stable
inline val Dp.Companion.ElevationNone
    get() = 0.dp

@Stable
inline val Dp.Companion.ElevationLow
    get() = 1.dp

@Stable
inline val Dp.Companion.ElevationHigh
    get() = 10.dp
