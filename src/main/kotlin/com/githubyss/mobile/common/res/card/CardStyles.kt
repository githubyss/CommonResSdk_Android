package com.githubyss.mobile.common.res.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit


/** Card orange style. */

@Stable
inline val MaterialTheme.cardOrangeBackground: Brush
    get() = Brush.horizontalGradient(colors = listOf(Color.cardOrangeBgStart, Color.cardOrangeBgEnd))

@Stable
inline val MaterialTheme.cardOrangeShape: Shape
    get() = RoundedCornerShape(Dp.cardCornerRadius)

@Stable
inline val MaterialTheme.cardOrangeBorder: BorderStroke
    get() = BorderStroke(Dp.cardBorderWidth, Color.cardOrangeBorderColor)

@Stable
inline val MaterialTheme.cardOrangePrimaryFontSize: TextUnit
    get() = TextUnit.cardPrimaryFontSize

@Stable
inline val MaterialTheme.cardOrangeSecondaryFontSize: TextUnit
    get() = TextUnit.cardSecondaryFontSize


/** Card white style. */

@Stable
inline val MaterialTheme.cardWhiteBackground: Brush
    get() = Brush.horizontalGradient(colors = listOf(Color.cardWhiteBgStart, Color.cardWhiteBgEnd))

@Stable
inline val MaterialTheme.cardWhiteShape: Shape
    get() = RoundedCornerShape(Dp.cardCornerRadius)

@Stable
inline val MaterialTheme.cardWhiteBorder: BorderStroke
    get() = BorderStroke(Dp.cardBorderWidth, Color.cardWhiteBorderColor)

@Stable
inline val MaterialTheme.cardWhitePrimaryFontSize: TextUnit
    get() = TextUnit.cardPrimaryFontSize

@Stable
inline val MaterialTheme.cardWhiteSecondaryFontSize: TextUnit
    get() = TextUnit.cardSecondaryFontSize


/** Card transparent style. */

@Stable
inline val MaterialTheme.cardTransparentBackground: Color
    get() = Color.cardTransparentBg

@Stable
inline val MaterialTheme.cardTransparentShape: Shape
    get() = RoundedCornerShape(Dp.cardCornerRadius)

@Stable
inline val MaterialTheme.cardTransparentBorder: BorderStroke
    get() = BorderStroke(Dp.cardBorderWidth, Color.cardTransparentBorderColor)

@Stable
inline val MaterialTheme.cardTransparentPrimaryFontSize: TextUnit
    get() = TextUnit.cardPrimaryFontSize

@Stable
inline val MaterialTheme.cardTransparentSecondaryFontSize: TextUnit
    get() = TextUnit.cardSecondaryFontSize
