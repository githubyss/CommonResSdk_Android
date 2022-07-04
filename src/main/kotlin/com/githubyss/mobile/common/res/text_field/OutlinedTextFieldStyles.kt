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
inline val TextFieldDefaults.outlinedTextFieldShape: Shape
    get() = RoundedCornerShape(Dp.textFieldCornerRadius)


/** Text field black style. */

@Stable
inline val TextFieldDefaults.outlinedTextFieldBlackColors: TextFieldColors
    @Composable
    get() = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.outlinedTextFieldBlackBackgroundNormal,
        textColor = Color.outlinedTextFieldBlackTextNormal, disabledTextColor = Color.outlinedTextFieldBlackTextDisabled,
        unfocusedLabelColor = Color.outlinedTextFieldBlackLabelUnfocused, focusedLabelColor = Color.outlinedTextFieldBlackLabelFocused,
        errorLabelColor = Color.outlinedTextFieldBlackLabelError, disabledLabelColor = Color.outlinedTextFieldBlackLabelDisabled,
        placeholderColor = Color.outlinedTextFieldBlackPlaceholderNormal, disabledPlaceholderColor = Color.outlinedTextFieldBlackPlaceholderDisabled,
        cursorColor = Color.outlinedTextFieldBlackCursorNormal, errorCursorColor = Color.outlinedTextFieldBlackCursorError,
        focusedIndicatorColor = Color.outlinedTextFieldBlackIndicatorFocused, unfocusedIndicatorColor = Color.outlinedTextFieldBlackIndicatorUnfocused,
        errorIndicatorColor = Color.outlinedTextFieldBlackIndicatorError, disabledIndicatorColor = Color.outlinedTextFieldBlackIndicatorDisabled,
        leadingIconColor = Color.outlinedTextFieldBlackLeadingIconNormal, disabledLeadingIconColor = Color.outlinedTextFieldBlackLeadingIconDisabled, errorLeadingIconColor = Color.outlinedTextFieldBlackLeadingIconError,
        trailingIconColor = Color.outlinedTextFieldBlackTrailingIconNormal, disabledTrailingIconColor = Color.outlinedTextFieldBlackTrailingIconDisabled, errorTrailingIconColor = Color.outlinedTextFieldBlackTrailingIconError,
    )

@Stable
inline val TextFieldDefaults.outlinedTextFieldBlackBorder: BorderStroke
    get() = BorderStroke(Dp.textFieldBorderWidth, Color.outlinedTextFieldBlackBorderColor)
