package com.githubyss.mobile.common.res.button_click

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit


/** Button click blue style. */

@Stable
@Composable
fun ButtonDefaults.buttonClickBlueBackground(pressState: Boolean): ButtonColors {
    return when {
        pressState -> ButtonDefaults.buttonColors(
            backgroundColor = Color.buttonClickBlueBgPressed, contentColor = Color.buttonClickBlueTextPressed,
            disabledBackgroundColor = Color.buttonClickBlueBgDisabled, disabledContentColor = Color.buttonClickBlueTextDisabled)
        else -> ButtonDefaults.buttonColors(
            backgroundColor = Color.buttonClickBlueBgNormal, contentColor = Color.buttonClickBlueTextNormal,
            disabledBackgroundColor = Color.buttonClickBlueBgDisabled, disabledContentColor = Color.buttonClickBlueTextDisabled)
    }
}

@Stable
inline val ButtonDefaults.buttonClickBlueShape: Shape
    get() = RoundedCornerShape(Dp.buttonClickCornerRadius)

@Stable
inline val ButtonDefaults.buttonClickBlueBorder: BorderStroke
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickBlueBorderColor)

@Stable
inline val ButtonDefaults.buttonClickBlueFontSize: TextUnit
    get() = TextUnit.buttonClickFontSize


/** Button click white style. */

@Stable
@Composable
fun ButtonDefaults.buttonClickWhiteColors(pressState: Boolean): ButtonColors {
    return when {
        pressState -> ButtonDefaults.buttonColors(backgroundColor = Color.buttonClickWhiteBgPressed, disabledBackgroundColor = Color.buttonClickWhiteBgDisabled)
        else -> ButtonDefaults.buttonColors(backgroundColor = Color.buttonClickWhiteBgNormal, disabledBackgroundColor = Color.buttonClickWhiteBgDisabled)
    }
}

@Stable
inline val ButtonDefaults.buttonClickWhiteRoundedCorner: Shape
    get() = RoundedCornerShape(Dp.buttonClickCornerRadius)

@Stable
inline val ButtonDefaults.buttonClickWhiteBorder: BorderStroke
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickWhiteBorderColor)

@Stable
inline val ButtonDefaults.buttonClickWhiteFontSize: TextUnit
    get() = TextUnit.buttonClickFontSize


/** Button click transparent style. */

@Stable
@Composable
fun ButtonDefaults.buttonClickTransparentColors(pressState: Boolean): ButtonColors {
    return when {
        pressState -> ButtonDefaults.buttonColors(backgroundColor = Color.buttonClickTransparentBgPressed, disabledBackgroundColor = Color.buttonClickTransparentBgDisabled)
        else -> ButtonDefaults.buttonColors(backgroundColor = Color.buttonClickTransparentBgNormal, disabledBackgroundColor = Color.buttonClickTransparentBgDisabled)
    }
}

@Stable
inline val ButtonDefaults.buttonClickTransparentRoundedCorner: Shape
    get() = RoundedCornerShape(Dp.buttonClickCornerRadius)

@Stable
inline val ButtonDefaults.buttonClickTransparentBorder: BorderStroke
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickTransparentBorderColor)

@Stable
inline val ButtonDefaults.buttonClickTransparentFontSize: TextUnit
    get() = TextUnit.buttonClickFontSize
