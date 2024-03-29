package com.githubyss.common.res.card

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.githubyss.common.res.common.dimen.BorderWidthThin
import com.githubyss.common.res.common.dimen.CornerRadiusNormal
import com.githubyss.common.res.common.dimen.FontSizeBig
import com.githubyss.common.res.common.dimen.FontSizeSmall


/** Card common corner radius. */

/**  */
@Stable
inline val Dp.Companion.cardCornerRadius
    get() = Dp.CornerRadiusNormal


/** Card common border width. */

/**  */
@Stable
inline val Dp.Companion.cardBorderWidth
    get() = Dp.BorderWidthThin


/** Card common font size. */

/**  */
@Stable
inline val TextUnit.Companion.cardPrimaryFontSize: TextUnit
    get() = TextUnit.FontSizeBig

@Stable
inline val TextUnit.Companion.cardSecondaryFontSize: TextUnit
    get() = TextUnit.FontSizeSmall
