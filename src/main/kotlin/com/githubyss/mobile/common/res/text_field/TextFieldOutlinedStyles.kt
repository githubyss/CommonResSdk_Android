package com.githubyss.mobile.common.res.text_field

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp


@Stable
inline val TextFieldDefaults.textFieldOutlinedShape: Shape
    get() = RoundedCornerShape(Dp.textFieldCornerRadius)


/** Text field black style. */

@Stable
inline val TextFieldDefaults.textFieldOutlinedBlackColors: TextFieldColors
    @Composable
    get() = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.textFieldOutlinedBlackBackgroundNormal,
        textColor = Color.textFieldOutlinedBlackTextNormal, disabledTextColor = Color.textFieldOutlinedBlackTextDisabled,
        unfocusedLabelColor = Color.textFieldOutlinedBlackLabelUnfocused, focusedLabelColor = Color.textFieldOutlinedBlackLabelFocused,
        errorLabelColor = Color.textFieldOutlinedBlackLabelError, disabledLabelColor = Color.textFieldOutlinedBlackLabelDisabled,
        placeholderColor = Color.textFieldOutlinedBlackPlaceholderNormal, disabledPlaceholderColor = Color.textFieldOutlinedBlackPlaceholderDisabled,
        cursorColor = Color.textFieldOutlinedBlackCursorNormal, errorCursorColor = Color.textFieldOutlinedBlackCursorError,
        focusedIndicatorColor = Color.textFieldOutlinedBlackIndicatorFocused, unfocusedIndicatorColor = Color.textFieldOutlinedBlackIndicatorUnfocused,
        errorIndicatorColor = Color.textFieldOutlinedBlackIndicatorError, disabledIndicatorColor = Color.textFieldOutlinedBlackIndicatorDisabled,
        leadingIconColor = Color.textFieldOutlinedBlackLeadingIconNormal, disabledLeadingIconColor = Color.textFieldOutlinedBlackLeadingIconDisabled, errorLeadingIconColor = Color.textFieldOutlinedBlackLeadingIconError,
        trailingIconColor = Color.textFieldOutlinedBlackTrailingIconNormal, disabledTrailingIconColor = Color.textFieldOutlinedBlackTrailingIconDisabled, errorTrailingIconColor = Color.textFieldOutlinedBlackTrailingIconError,
    )

@Stable
inline val TextFieldDefaults.textFieldOutlinedBlackBorder: BorderStroke
    get() = BorderStroke(Dp.textFieldBorderWidth, Color.textFieldOutlinedBlackBorderColor)
