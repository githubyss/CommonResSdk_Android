package com.githubyss.mobile.common.res.text_field

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import com.githubyss.mobile.common.res.common.dimen.BorderWidthThin
import com.githubyss.mobile.common.res.common.dimen.CornerRadiusTiny
import com.githubyss.mobile.common.res.common.dimen.FontSizeTiny


/** Text field corner radius. */

@Stable
inline val Dp.Companion.textFieldCornerRadius: Dp
    get() = Dp.CornerRadiusTiny


/** Text field border width. */

@Stable
inline val Dp.Companion.textFieldBorderWidth: Dp
    get() = Dp.BorderWidthThin


/** Text field text font size. */

@Stable
inline val TextUnit.Companion.textFieldFontSize: TextUnit
    get() = TextUnit.FontSizeTiny
