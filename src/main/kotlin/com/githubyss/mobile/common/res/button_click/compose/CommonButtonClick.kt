package com.githubyss.mobile.common.res.button_click.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.githubyss.mobile.common.res.button_click.buttonClickBlueBorder
import com.githubyss.mobile.common.res.button_click.buttonClickBlueColors
import com.githubyss.mobile.common.res.button_click.buttonClickBlueFontSize
import com.githubyss.mobile.common.res.button_click.buttonClickBlueShape
import com.githubyss.mobile.common.res.common.dimen.SideMarginNone


// @Composable
// fun ButtonClickBlue(@IdRes resId: Int, enabled: Boolean = true, onClick: () -> Unit) {
//     ButtonClickBlue(getStringFromRes(resId), enabled, onClick)
// }

@Composable
fun ButtonClickBlue(
    text: String,
    modifier: Modifier = Modifier,
    outsidePaddingHorizontal: Dp = Dp.SideMarginNone,
    outsidePaddingVertical: Dp = Dp.SideMarginNone,
    insidePaddingHorizontal: Dp = Dp.SideMarginNone,
    insidePaddingVertical: Dp = Dp.SideMarginNone,
    width: Dp = 0.dp,
    height: Dp = 60.dp,
    isFillMaxWidth: Boolean = false,
    isFillMaxHeight: Boolean = false,
    enabled: Boolean = true,
    onClick: () -> Unit = {},
) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressState = interactionSource.collectIsPressedAsState().value
    // 先设置 padding，再设置长高，padding 作用等同于 margin
    var modifierRevised = modifier.padding(outsidePaddingHorizontal, outsidePaddingVertical)

    modifierRevised = when {
        width > 0.dp -> modifierRevised.width(width)
        isFillMaxWidth -> modifierRevised.fillMaxWidth()
        else -> modifierRevised.wrapContentWidth()
    }

    modifierRevised = when {
        height > 0.dp -> modifierRevised.height(height)
        isFillMaxHeight -> modifierRevised.fillMaxHeight()
        else -> modifierRevised.wrapContentHeight()
    }

    Button(
        onClick = onClick,
        enabled = enabled,
        interactionSource = interactionSource,
        shape = ButtonDefaults.buttonClickBlueShape,
        border = ButtonDefaults.buttonClickBlueBorder,
        colors = ButtonDefaults.buttonClickBlueColors(pressState),
        contentPadding = PaddingValues(insidePaddingHorizontal, insidePaddingVertical),
        modifier = modifierRevised,
    ) {
        Text(
            text = text,
            fontSize = ButtonDefaults.buttonClickBlueFontSize,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .background(Color.Transparent)
        )
    }
}