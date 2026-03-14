package com.peto.manitto.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalAppTypography =
    staticCompositionLocalOf<AppTypography> {
        error("AppTypography가 제공되지 않음")
    }

@Composable
fun ManittoTheme(content: @Composable () -> Unit) {
    val typography = provideAppTypography()

    CompositionLocalProvider(
        LocalAppTypography provides typography,
    ) {
        MaterialTheme(content = content)
    }
}
