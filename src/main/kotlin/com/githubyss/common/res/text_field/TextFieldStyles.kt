package com.githubyss.common.res.text_field

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.githubyss.common.res.common.dimen.CornerRadiusNone


@Stable
inline val TextFieldDefaults.textFieldShape
    get() = RoundedCornerShape(Dp.textFieldCornerRadius).copy(bottomStart = ZeroCornerSize, bottomEnd = CornerSize(Dp.CornerRadiusNone))


/** Text field black style. */

@Stable
inline val TextFieldDefaults.textFieldBlackColors
    @Composable
    get() = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.textFieldBlackBackgroundNormal,
        textColor = Color.textFieldBlackTextNormal, disabledTextColor = Color.textFieldBlackTextDisabled,
        unfocusedLabelColor = Color.textFieldBlackLabelUnfocused, focusedLabelColor = Color.textFieldBlackLabelFocused,
        errorLabelColor = Color.textFieldBlackLabelError, disabledLabelColor = Color.textFieldBlackLabelDisabled,
        placeholderColor = Color.textFieldBlackPlaceholderNormal, disabledPlaceholderColor = Color.textFieldBlackPlaceholderDisabled,
        cursorColor = Color.textFieldBlackCursorNormal, errorCursorColor = Color.textFieldBlackCursorError,
        focusedIndicatorColor = Color.textFieldBlackIndicatorFocused, unfocusedIndicatorColor = Color.textFieldBlackIndicatorUnfocused,
        errorIndicatorColor = Color.textFieldBlackIndicatorError, disabledIndicatorColor = Color.textFieldBlackIndicatorDisabled,
        leadingIconColor = Color.textFieldBlackLeadingIconNormal, disabledLeadingIconColor = Color.textFieldBlackLeadingIconDisabled, errorLeadingIconColor = Color.textFieldBlackLeadingIconError,
        trailingIconColor = Color.textFieldBlackTrailingIconNormal, disabledTrailingIconColor = Color.textFieldBlackTrailingIconDisabled, errorTrailingIconColor = Color.textFieldBlackTrailingIconError,
    )

@Stable
inline val TextFieldDefaults.textFieldBlackBorder
    get() = BorderStroke(Dp.textFieldBorderWidth, Color.textFieldBlackBorderColor)


/** Text field transparent style. */

@Stable
inline val TextFieldDefaults.textFieldTransparentColors
    @Composable
    get() = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.textFieldTransparentBackgroundNormal,
        textColor = Color.textFieldTransparentTextNormal, disabledTextColor = Color.textFieldTransparentTextDisabled,
        unfocusedLabelColor = Color.textFieldTransparentLabelUnfocused, focusedLabelColor = Color.textFieldTransparentLabelFocused,
        errorLabelColor = Color.textFieldTransparentLabelError, disabledLabelColor = Color.textFieldTransparentLabelDisabled,
        placeholderColor = Color.textFieldTransparentPlaceholderNormal, disabledPlaceholderColor = Color.textFieldTransparentPlaceholderDisabled,
        cursorColor = Color.textFieldTransparentCursorNormal, errorCursorColor = Color.textFieldTransparentCursorError,
        focusedIndicatorColor = Color.textFieldTransparentIndicatorFocused, unfocusedIndicatorColor = Color.textFieldTransparentIndicatorUnfocused,
        errorIndicatorColor = Color.textFieldTransparentIndicatorError, disabledIndicatorColor = Color.textFieldTransparentIndicatorDisabled,
        leadingIconColor = Color.textFieldTransparentLeadingIconNormal, disabledLeadingIconColor = Color.textFieldTransparentLeadingIconDisabled, errorLeadingIconColor = Color.textFieldTransparentLeadingIconError,
        trailingIconColor = Color.textFieldTransparentTrailingIconNormal, disabledTrailingIconColor = Color.textFieldTransparentTrailingIconDisabled, errorTrailingIconColor = Color.textFieldTransparentTrailingIconError,
    )

@Stable
inline val TextFieldDefaults.textFieldTransparentBorder
    get() = BorderStroke(Dp.textFieldBorderWidth, Color.textFieldTransparentBorderColor)
