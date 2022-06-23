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


@Stable
inline val ButtonDefaults.buttonClickShape: Shape
    get() = RoundedCornerShape(Dp.buttonClickCornerRadius)


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
inline val ButtonDefaults.buttonClickBlueBorder: BorderStroke
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickBlueBorderColor)


/** Button click white style. */

@Stable
@Composable
fun ButtonDefaults.buttonClickWhiteBackground(pressState: Boolean): ButtonColors {
    return when {
        pressState -> ButtonDefaults.buttonColors(
            backgroundColor = Color.buttonClickWhiteBgPressed, contentColor = Color.buttonClickWhiteTextPressed,
            disabledBackgroundColor = Color.buttonClickWhiteBgDisabled, disabledContentColor = Color.buttonClickWhiteTextDisabled)
        else -> ButtonDefaults.buttonColors(
            backgroundColor = Color.buttonClickWhiteBgNormal, contentColor = Color.buttonClickWhiteTextNormal,
            disabledBackgroundColor = Color.buttonClickWhiteBgDisabled, disabledContentColor = Color.buttonClickWhiteTextDisabled)
    }
}

@Stable
inline val ButtonDefaults.buttonClickWhiteBorder: BorderStroke
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickWhiteBorderColor)


/** Button click transparent style. */

@Stable
@Composable
fun ButtonDefaults.buttonClickTransparentBackground(pressState: Boolean): ButtonColors {
    return when {
        pressState -> ButtonDefaults.buttonColors(
            backgroundColor = Color.buttonClickTransparentBgPressed, contentColor = Color.buttonClickTransparentTextPressed,
            disabledBackgroundColor = Color.buttonClickTransparentBgDisabled, disabledContentColor = Color.buttonClickTransparentTextDisabled)
        else -> ButtonDefaults.buttonColors(
            backgroundColor = Color.buttonClickTransparentBgNormal, contentColor = Color.buttonClickTransparentTextNormal,
            disabledBackgroundColor = Color.buttonClickTransparentBgDisabled, disabledContentColor = Color.buttonClickTransparentTextDisabled)
    }
}

@Stable
inline val ButtonDefaults.buttonClickTransparentBorder: BorderStroke
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickTransparentBorderColor)
