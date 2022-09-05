package com.githubyss.mobile.common.res.layout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import com.githubyss.mobile.common.res.common.dimen.BorderWidthNone


/** Layout common shape style. */

/**  */
@Stable
inline val MaterialTheme.layoutShapeRound
    get() = RoundedCornerShape(Dp.layoutCornerRadius)

@Stable
inline val MaterialTheme.layoutShapeRectangle
    get() = RectangleShape

/** Layout common border style. */

@Stable
inline val MaterialTheme.layoutBorderNone
    get() = BorderStroke(Dp.BorderWidthNone, Color.Transparent)


/** Layout white style. */

/**  */
@Stable
inline val MaterialTheme.layoutWhiteBackground
    get() = Brush.horizontalGradient(colors = listOf(Color.layoutWhiteBgStart, Color.layoutWhiteBgEnd))

@Stable
inline val MaterialTheme.layoutWhiteBorder
    get() = BorderStroke(Dp.layoutBorderWidth, Color.layoutWhiteBorderColor)
