package com.githubyss.mobile.common.res.card

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color


/** Card orange colors. */

@Stable
inline val Color.Companion.cardOrangeBgStart: Color
    get() = Color(0xFFFFA42D)

@Stable
inline val Color.Companion.cardOrangeBgEnd: Color
    get() = Color(0xFFFFC047)

@Stable
inline val Color.Companion.cardOrangeBorderColor: Color
    get() = Color(0x00000000)

@Stable
inline val Color.Companion.cardOrangeContent: Color
    get() = Color(0xFFFFFFFF)


/** Card white colors. */

@Stable
inline val Color.Companion.cardWhiteBgStart: Color
    get() = Color(0xFFFFFFFF)

@Stable
inline val Color.Companion.cardWhiteBgEnd: Color
    get() = Color(0xFFFFFFFF)

@Stable
inline val Color.Companion.cardWhiteBorderColor: Color
    get() = Color(0xFF1F86ED)

@Stable
inline val Color.Companion.cardWhiteContent: Color
    get() = Color(0xFF333333)


/** Card transparent colors. */

@Stable
inline val Color.Companion.cardTransparentBg: Color
    get() = Color(0x00000000)

@Stable
inline val Color.Companion.cardTransparentBorderColor: Color
    get() = Color(0xFF1F86ED)

@Stable
inline val Color.Companion.cardTransparentContent: Color
    get() = Color(0xFF333333)
