package com.peto.manitto.designsystem.extension

import androidx.compose.ui.text.TextStyle
import com.peto.manitto.designsystem.theme.AppTypography
import com.peto.manitto.designsystem.theme.ManittoTextStyle

fun ManittoTextStyle.toTextStyle(typo: AppTypography): TextStyle =
    when (this) {
        ManittoTextStyle.J1 -> typo.j1
        ManittoTextStyle.J2 -> typo.j2
        ManittoTextStyle.N1 -> typo.n1
        ManittoTextStyle.N2 -> typo.n2
        ManittoTextStyle.N3 -> typo.n3
        ManittoTextStyle.N4 -> typo.n4
        ManittoTextStyle.N5 -> typo.n5
        ManittoTextStyle.N6 -> typo.n6
    }
