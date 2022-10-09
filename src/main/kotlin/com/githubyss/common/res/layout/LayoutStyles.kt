package com.githubyss.common.res.layout

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.githubyss.common.res.common.style.borderNone
import com.githubyss.common.res.common.style.shapeRectangle
import com.githubyss.common.res.common.style.shapeRound


/** Layout common shape style. */

/**  */
@Stable
inline val MaterialTheme.layoutShapeRound
    get() = MaterialTheme.shapeRound(Dp.layoutCornerRadius)

@Stable
inline val MaterialTheme.layoutShapeRectangle
    get() = MaterialTheme.shapeRectangle

/** Layout common border style. */

@Stable
inline val MaterialTheme.layoutBorderNone
    get() = MaterialTheme.borderNone


/** Layout white style. */

/**  */
@Stable
inline val MaterialTheme.layoutWhiteBackground
    get() = Brush.horizontalGradient(colors = listOf(Color.layoutWhiteBgStart, Color.layoutWhiteBgEnd))

@Stable
inline val MaterialTheme.layoutWhiteBorder
    get() = BorderStroke(Dp.layoutBorderWidth, Color.layoutWhiteBorderColor)
