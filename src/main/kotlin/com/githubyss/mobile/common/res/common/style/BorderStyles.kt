package com.githubyss.mobile.common.res.common.style

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import com.githubyss.mobile.common.res.button_click.buttonClickBlueBorderColor
import com.githubyss.mobile.common.res.button_click.buttonClickBorderWidth
import com.githubyss.mobile.common.res.common.dimen.BorderWidthNone


@Stable
inline val MaterialTheme.borderNone
    get() = BorderStroke(Dp.BorderWidthNone, Color.Transparent)
