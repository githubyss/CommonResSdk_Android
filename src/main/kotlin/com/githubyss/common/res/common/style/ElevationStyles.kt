package com.githubyss.common.res.common.style

import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import com.githubyss.common.res.common.dimen.ElevationNone


@Stable

inline val ButtonDefaults.elevationNone
    @Composable get() = ButtonDefaults.elevation(Dp.ElevationNone, Dp.ElevationNone, Dp.ElevationNone)
