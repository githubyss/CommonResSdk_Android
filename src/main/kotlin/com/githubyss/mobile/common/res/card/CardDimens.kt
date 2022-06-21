package com.githubyss.mobile.common.res.card

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.githubyss.mobile.common.res.common.dimen.BorderWidthThin
import com.githubyss.mobile.common.res.common.dimen.CornerRadiusNormal
import com.githubyss.mobile.common.res.common.dimen.FontSizeBig
import com.githubyss.mobile.common.res.common.dimen.FontSizeSmall


/** Card corner radius. */

@Stable
inline val Dp.Companion.cardCornerRadius: Dp
    get() = Dp.CornerRadiusNormal


/** Card border width. */

@Stable
inline val Dp.Companion.cardBorderWidth: Dp
    get() = Dp.BorderWidthThin


/** Card font size. */

@Stable
inline val TextUnit.Companion.cardPrimaryFontSize: TextUnit
    get() = TextUnit.FontSizeBig

@Stable
inline val TextUnit.Companion.cardSecondaryFontSize: TextUnit
    get() = TextUnit.FontSizeSmall
