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
inline val TextFieldDefaults.textFieldBlackOutlinedColors: TextFieldColors
    @Composable
    get() = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.textFieldBlackOutlinedBackgroundNormal,
        textColor = Color.textFieldBlackOutlinedTextNormal, disabledTextColor = Color.textFieldBlackOutlinedTextDisabled,
        unfocusedLabelColor = Color.textFieldBlackOutlinedLabelUnfocused, focusedLabelColor = Color.textFieldBlackOutlinedLabelFocused,
        errorLabelColor = Color.textFieldBlackOutlinedLabelError, disabledLabelColor = Color.textFieldBlackOutlinedLabelDisabled,
        placeholderColor = Color.textFieldBlackOutlinedPlaceholderNormal, disabledPlaceholderColor = Color.textFieldBlackOutlinedPlaceholderDisabled,
        cursorColor = Color.textFieldBlackOutlinedCursorNormal, errorCursorColor = Color.textFieldBlackOutlinedCursorError,
        focusedIndicatorColor = Color.textFieldBlackOutlinedIndicatorFocused, unfocusedIndicatorColor = Color.textFieldBlackOutlinedIndicatorUnfocused,
        errorIndicatorColor = Color.textFieldBlackOutlinedIndicatorError, disabledIndicatorColor = Color.textFieldBlackOutlinedIndicatorDisabled,
        leadingIconColor = Color.textFieldBlackOutlinedLeadingIconNormal, disabledLeadingIconColor = Color.textFieldBlackOutlinedLeadingIconDisabled, errorLeadingIconColor = Color.textFieldBlackOutlinedLeadingIconError,
        trailingIconColor = Color.textFieldBlackOutlinedTrailingIconNormal, disabledTrailingIconColor = Color.textFieldBlackOutlinedTrailingIconDisabled, errorTrailingIconColor = Color.textFieldBlackOutlinedTrailingIconError,
    )

@Stable
inline val TextFieldDefaults.textFieldBlackOutlinedBorder: BorderStroke
    get() = BorderStroke(Dp.textFieldBorderWidth, Color.textFieldBlackOutlinedBorderColor)
