package com.githubyss.mobile.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/* Overall space / margin / padding dimens. */

@Stable
inline val Dp.Companion.SpaceNone
    get() = 0.dp

@Stable
inline val Dp.Companion.SpaceNano
    get() = 2.dp

@Stable
inline val Dp.Companion.SpaceMicro
    get() = 5.dp

@Stable
inline val Dp.Companion.SpaceMini
    get() = 8.dp

@Stable
inline val Dp.Companion.SpaceTiny
    get() = 10.dp

@Stable
inline val Dp.Companion.SpaceSmall
    get() = 12.dp

@Stable
inline val Dp.Companion.SpaceNormal
    get() = 14.dp

@Stable
inline val Dp.Companion.SpaceBig
    get() = 16.dp

@Stable
inline val Dp.Companion.SpaceLarge
    get() = 20.dp

@Stable
inline val Dp.Companion.SpaceHuge
    get() = 25.dp


/* Default space / margin / padding dimens. */

@Stable
inline val Dp.Companion.SpaceSideMarginDefault
    get() = Dp.SpaceNormal

@Stable
inline val Dp.Companion.SpaceTextPaddingDefault
    get() = Dp.SpaceTiny

@Stable
inline val Dp.Companion.SpaceButtonPaddingDefault
    get() = Dp.SpaceTiny

@Stable
inline val Dp.Companion.SpaceCardPaddingDefault
    get() = Dp.SpaceNormal