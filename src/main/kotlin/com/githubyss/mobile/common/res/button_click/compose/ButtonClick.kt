package com.githubyss.mobile.common.res.button_click.compose

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.githubyss.mobile.common.res.button_click.buttonClickBlueBorder
import com.githubyss.mobile.common.res.button_click.buttonClickBlueColors
import com.githubyss.mobile.common.res.button_click.buttonClickBlueFontSize
import com.githubyss.mobile.common.res.button_click.buttonClickBlueShape
import com.githubyss.mobile.common.res.common.dimen.SideMarginNano
import com.githubyss.mobile.common.res.common.dimen.SideMarginTiny


// @Composable
// fun ButtonClickBlue(@IdRes resId: Int, enabled: Boolean = true, onClick: () -> Unit) {
//     ButtonClickBlue(getStringFromRes(resId), enabled, onClick)
// }

@Composable
fun ButtonClickBlue(text: String, enabled: Boolean = true, onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressState = interactionSource.collectIsPressedAsState().value

    Button(
        onClick = onClick,
        enabled = enabled,
        interactionSource = interactionSource,
        shape = ButtonDefaults.buttonClickBlueShape,
        border = ButtonDefaults.buttonClickBlueBorder,
        colors = ButtonDefaults.buttonClickBlueColors(pressState),
        contentPadding = PaddingValues(Dp.SideMarginTiny),
        modifier = Modifier
            // 先设置 padding，再设置长高，padding 作用等同于 margin
            .padding(Dp.SideMarginNano)
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Text(
                text = text,
                fontSize = ButtonDefaults.buttonClickBlueFontSize,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}