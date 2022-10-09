package com.githubyss.common.res.common.style

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.githubyss.common.res.common.dimen.BorderWidthNone


@Stable
inline val MaterialTheme.borderNone
    get() = BorderStroke(Dp.BorderWidthNone, Color.Transparent)
