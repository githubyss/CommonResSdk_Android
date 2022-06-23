package com.githubyss.mobile.common.res.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit


@Stable
inline val MaterialTheme.cardShape: Shape
    get() = RoundedCornerShape(Dp.cardCornerRadius)


/** Card orange style. */

@Stable
inline val MaterialTheme.cardOrangeBackground: Brush
    get() = Brush.horizontalGradient(colors = listOf(Color.cardOrangeBgStart, Color.cardOrangeBgEnd))

@Stable
inline val MaterialTheme.cardOrangeBorder: BorderStroke
    get() = BorderStroke(Dp.cardBorderWidth, Color.cardOrangeBorderColor)

@Stable
inline val MaterialTheme.cardOrangeTextPrimary: TextStyle
    get() = TextStyle(color = Color.cardOrangeTextPrimary, fontSize = TextUnit.cardPrimaryFontSize)

@Stable
inline val MaterialTheme.cardOrangeTextSecondary: TextStyle
    get() = TextStyle(color = Color.cardOrangeTextSecondary, fontSize = TextUnit.cardSecondaryFontSize)


/** Card white style. */

@Stable
inline val MaterialTheme.cardWhiteBackground: Brush
    get() = Brush.horizontalGradient(colors = listOf(Color.cardWhiteBgStart, Color.cardWhiteBgEnd))

@Stable
inline val MaterialTheme.cardWhiteBorder: BorderStroke
    get() = BorderStroke(Dp.cardBorderWidth, Color.cardWhiteBorderColor)

@Stable
inline val MaterialTheme.cardWhiteTextPrimary: TextStyle
    get() = TextStyle(color = Color.cardWhiteTextPrimary, fontSize = TextUnit.cardPrimaryFontSize)

@Stable
inline val MaterialTheme.cardWhiteTextSecondary: TextStyle
    get() = TextStyle(color = Color.cardWhiteTextSecondary, fontSize = TextUnit.cardSecondaryFontSize)


/** Card transparent style. */

@Stable
inline val MaterialTheme.cardTransparentBackground: Color
    get() = Color.cardTransparentBg

@Stable
inline val MaterialTheme.cardTransparentBorder: BorderStroke
    get() = BorderStroke(Dp.cardBorderWidth, Color.cardTransparentBorderColor)

@Stable
inline val MaterialTheme.cardTransparentTextPrimary: TextStyle
    get() = TextStyle(color = Color.cardTransparentTextPrimary, fontSize = TextUnit.cardPrimaryFontSize)

@Stable
inline val MaterialTheme.cardTransparentTextSecondary: TextStyle
    get() = TextStyle(color = Color.cardTransparentTextSecondary, fontSize = TextUnit.cardSecondaryFontSize)
