package com.githubyss.mobile.common.res.page.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.githubyss.mobile.common.res.common.dimen.SideMarginNone
import com.githubyss.mobile.common.res.common.dimen.SideMarginNormal
import com.githubyss.mobile.common.res.page.pageBgLightGray


@Composable
fun PageSideMargin(
    background: Color = Color.pageBgLightGray,
    paddingHorizontal: Dp = Dp.SideMarginNormal,
    paddingVertical: Dp = Dp.SideMarginNone,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        content = content,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(background)
            .verticalScroll(rememberScrollState())
            // 先设置长高、背景、滑动，再设置 padding，padding 作用等同于 padding
            .padding(horizontal = paddingHorizontal, vertical = paddingVertical)
    )
}