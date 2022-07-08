package com.githubyss.mobile.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/* Overall space / margin / padding dimens. */

@Stable
inline val Dp.Companion.SpaceNone: Dp
    get() = 0.dp

@Stable
inline val Dp.Companion.SpaceNano: Dp
    get() = 2.dp

@Stable
inline val Dp.Companion.SpaceMicro: Dp
    get() = 5.dp

@Stable
inline val Dp.Companion.SpaceMini: Dp
    get() = 8.dp

@Stable
inline val Dp.Companion.SpaceTiny: Dp
    get() = 10.dp

@Stable
inline val Dp.Companion.SpaceSmall: Dp
    get() = 12.dp

@Stable
inline val Dp.Companion.SpaceNormal: Dp
    get() = 14.dp

@Stable
inline val Dp.Companion.SpaceBig: Dp
    get() = 16.dp

@Stable
inline val Dp.Companion.SpaceLarge: Dp
    get() = 20.dp

@Stable
inline val Dp.Companion.SpaceHuge: Dp
    get() = 25.dp


/* Default space / margin / padding dimens. */

@Stable
inline val Dp.Companion.SpaceSideMarginDefault: Dp
    get() = Dp.SpaceNormal

@Stable
inline val Dp.Companion.SpaceTextPaddingDefault: Dp
    get() = Dp.SpaceTiny

@Stable
inline val Dp.Companion.SpaceButtonPaddingDefault: Dp
    get() = Dp.SpaceTiny

@Stable
inline val Dp.Companion.SpaceCardPaddingDefault: Dp
    get() = Dp.SpaceNormal