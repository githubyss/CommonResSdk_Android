package com.githubyss.mobile.common.res.button

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.githubyss.mobile.common.res.common.dimen.BorderWidthNone
import com.githubyss.mobile.common.res.common.dimen.BorderWidthThin
import com.githubyss.mobile.common.res.common.dimen.FontSizeTiny


/** Button click blue dimens. */

@Stable
inline val TextUnit.Companion.buttonClickBlueFontSize: TextUnit
    get() = TextUnit.FontSizeTiny

@Stable
inline val Dp.Companion.buttonClickBlueBorder: Dp
    get() = Dp.BorderWidthNone


/** Button click white dimens. */

@Stable
inline val TextUnit.Companion.buttonClickWhiteFontSize: TextUnit
    get() = TextUnit.FontSizeTiny

@Stable
inline val Dp.Companion.buttonClickWhiteBorder: Dp
    get() = Dp.BorderWidthNone


/** Button click transparent dimens. */

@Stable
inline val TextUnit.Companion.buttonClickTransparentFontSize: TextUnit
    get() = TextUnit.FontSizeTiny

@Stable
inline val Dp.Companion.buttonClickTransparentBorder: Dp
    get() = Dp.BorderWidthThin