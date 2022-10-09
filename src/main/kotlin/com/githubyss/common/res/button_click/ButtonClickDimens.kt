package com.githubyss.common.res.button_click

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.githubyss.common.res.common.dimen.BorderWidthThin
import com.githubyss.common.res.common.dimen.CornerRadiusMicro
import com.githubyss.common.res.common.dimen.FontSizeTiny


/** Button click corner radius. */

/**  */
@Stable
inline val Dp.Companion.buttonClickCornerRadius
    get() = Dp.CornerRadiusMicro


/** Button click border width. */

/**  */
@Stable
inline val Dp.Companion.buttonClickBorderWidth
    get() = Dp.BorderWidthThin


/** Button click text font size. */

/**  */
@Stable
inline val TextUnit.Companion.buttonClickFontSize: TextUnit
    get() = TextUnit.FontSizeTiny
