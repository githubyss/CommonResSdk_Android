package com.githubyss.common.res.button_click

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.githubyss.common.res.common.style.*


@Stable
inline val ButtonDefaults.buttonClickShapeRound
    get() = MaterialTheme.shapeRound(Dp.buttonClickCornerRadius)

@Stable
inline val ButtonDefaults.buttonClickShapeRoundTop
    get() = MaterialTheme.shapeRoundTop(Dp.buttonClickCornerRadius)

@Stable
inline val ButtonDefaults.buttonClickShapeRoundBottom
    get() = MaterialTheme.shapeRoundBottom(Dp.buttonClickCornerRadius)

@Stable
inline val ButtonDefaults.buttonClickShapeRectangle
    get() = MaterialTheme.shapeRectangle

@Stable
inline val MaterialTheme.buttonClickBorderNone
    get() = MaterialTheme.borderNone


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
inline val ButtonDefaults.buttonClickBlueBorder
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
inline val ButtonDefaults.buttonClickWhiteBorder
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickWhiteBorderColor)


/** Button click gray style. */

@Stable
@Composable
fun ButtonDefaults.buttonClickGrayBackground(pressState: Boolean): ButtonColors {
    return when {
        pressState -> ButtonDefaults.buttonColors(
            backgroundColor = Color.buttonClickGrayBgPressed, contentColor = Color.buttonClickGrayTextPressed,
            disabledBackgroundColor = Color.buttonClickGrayBgDisabled, disabledContentColor = Color.buttonClickGrayTextDisabled)
        else -> ButtonDefaults.buttonColors(
            backgroundColor = Color.buttonClickGrayBgNormal, contentColor = Color.buttonClickGrayTextNormal,
            disabledBackgroundColor = Color.buttonClickGrayBgDisabled, disabledContentColor = Color.buttonClickGrayTextDisabled)
    }
}

@Stable
inline val ButtonDefaults.buttonClickGrayBorder
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickGrayBorderColor)


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
inline val ButtonDefaults.buttonClickTransparentBorder
    get() = BorderStroke(Dp.buttonClickBorderWidth, Color.buttonClickTransparentBorderColor)
