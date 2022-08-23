package com.githubyss.mobile.common.res.common.dimen

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp


/* Overall text spacing dimens. */

@Stable
inline val TextUnit.Companion.SpaceNone
    get() = 0.sp

@Stable
inline val TextUnit.Companion.SpaceNano
    get() = 1.sp

@Stable
inline val TextUnit.Companion.SpaceMicro
    get() = 2.sp

@Stable
inline val TextUnit.Companion.SpaceMini
    get() = 5.sp

@Stable
inline val TextUnit.Companion.SpaceTiny
    get() = 10.sp

@Stable
inline val TextUnit.Companion.SpaceSmall
    get() = 12.sp

@Stable
inline val TextUnit.Companion.SpaceNormal
    get() = 14.sp

@Stable
inline val TextUnit.Companion.SpaceBig
    get() = 16.sp

@Stable
inline val TextUnit.Companion.SpaceLarge
    get() = 20.sp

@Stable
inline val TextUnit.Companion.SpaceHuge
    get() = 25.sp
