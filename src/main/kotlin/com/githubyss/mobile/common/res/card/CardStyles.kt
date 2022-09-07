package com.githubyss.mobile.common.res.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.githubyss.mobile.common.res.common.style.shapeRectangle
import com.githubyss.mobile.common.res.common.style.shapeRound
import com.githubyss.mobile.common.res.common.style.shapeRoundBottom
import com.githubyss.mobile.common.res.common.style.shapeRoundTop


/** Card common shape style. */

@Stable
inline val MaterialTheme.cardShapeRound
    get() = MaterialTheme.shapeRound(Dp.cardCornerRadius)

@Stable
inline val MaterialTheme.cardShapeRoundTop
    get() = MaterialTheme.shapeRoundTop(Dp.cardCornerRadius)

@Stable
inline val MaterialTheme.cardShapeRoundBottom
    get() = MaterialTheme.shapeRoundBottom(Dp.cardCornerRadius)

@Stable
inline val MaterialTheme.cardShapeRectangle
    get() = MaterialTheme.shapeRectangle


/** Card orange style. */

/**  */
@Stable
inline val MaterialTheme.cardOrangeBackground
    get() = Brush.horizontalGradient(colors = listOf(Color.cardOrangeBgStart, Color.cardOrangeBgEnd))

@Stable
inline val MaterialTheme.cardOrangeBorder
    get() = BorderStroke(width = Dp.cardBorderWidth, color = Color.cardOrangeBorderColor)

@Stable
inline val MaterialTheme.cardOrangeTextPrimary
    get() = TextStyle(color = Color.cardOrangeContent, fontSize = TextUnit.cardPrimaryFontSize)

@Stable
inline val MaterialTheme.cardOrangeTextSecondary
    get() = TextStyle(color = Color.cardOrangeContent, fontSize = TextUnit.cardSecondaryFontSize)


/** Card white style. */

/**  */
@Stable
inline val MaterialTheme.cardWhiteBackground
    get() = Brush.horizontalGradient(colors = listOf(Color.cardWhiteBgStart, Color.cardWhiteBgEnd))

@Stable
inline val MaterialTheme.cardWhiteBorder
    get() = BorderStroke(Dp.cardBorderWidth, Color.cardWhiteBorderColor)

@Stable
inline val MaterialTheme.cardWhiteTextPrimary
    get() = TextStyle(color = Color.cardWhiteContent, fontSize = TextUnit.cardPrimaryFontSize)

@Stable
inline val MaterialTheme.cardWhiteTextSecondary
    get() = TextStyle(color = Color.cardWhiteContent, fontSize = TextUnit.cardSecondaryFontSize)


/** Card transparent style. */

/**  */
@Stable
inline val MaterialTheme.cardTransparentBackground
    get() = Color.cardTransparentBg

@Stable
inline val MaterialTheme.cardTransparentBorder
    get() = BorderStroke(Dp.cardBorderWidth, Color.cardTransparentBorderColor)

@Stable
inline val MaterialTheme.cardTransparentTextPrimary
    get() = TextStyle(color = Color.cardTransparentContent, fontSize = TextUnit.cardPrimaryFontSize)

@Stable
inline val MaterialTheme.cardTransparentTextSecondary
    get() = TextStyle(color = Color.cardTransparentContent, fontSize = TextUnit.cardSecondaryFontSize)
