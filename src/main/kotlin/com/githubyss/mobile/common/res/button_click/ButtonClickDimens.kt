package com.githubyss.mobile.common.res.button_click

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.githubyss.mobile.common.res.common.dimen.BorderWidthThin
import com.githubyss.mobile.common.res.common.dimen.CornerRadiusMicro
import com.githubyss.mobile.common.res.common.dimen.FontSizeTiny


/** Card corner radius. */

@Stable
inline val Dp.Companion.buttonClickCornerRadius: Dp
    get() = Dp.CornerRadiusMicro


/** Button click border width. */

@Stable
inline val Dp.Companion.buttonClickBorderWidth: Dp
    get() = Dp.BorderWidthThin


/** Button click text font size. */

@Stable
inline val TextUnit.Companion.buttonClickFontSize: TextUnit
    get() = TextUnit.FontSizeTiny
