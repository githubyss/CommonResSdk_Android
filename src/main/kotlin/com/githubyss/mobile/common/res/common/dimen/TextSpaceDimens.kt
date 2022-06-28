package com.githubyss.mobile.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp


/* Overall text spacing dimens. */

@Stable
inline val TextUnit.Companion.SpaceNone: TextUnit
    get() = 0.sp

@Stable
inline val TextUnit.Companion.SpaceNano: TextUnit
    get() = 1.sp

@Stable
inline val TextUnit.Companion.SpaceMicro: TextUnit
    get() = 2.sp

@Stable
inline val TextUnit.Companion.SpaceMini: TextUnit
    get() = 5.sp

@Stable
inline val TextUnit.Companion.SpaceTiny: TextUnit
    get() = 10.sp

@Stable
inline val TextUnit.Companion.SpaceSmall: TextUnit
    get() = 12.sp

@Stable
inline val TextUnit.Companion.SpaceNormal: TextUnit
    get() = 14.sp

@Stable
inline val TextUnit.Companion.SpaceBig: TextUnit
    get() = 16.sp

@Stable
inline val TextUnit.Companion.SpaceLarge: TextUnit
    get() = 20.sp

@Stable
inline val TextUnit.Companion.SpaceHuge: TextUnit
    get() = 25.sp
