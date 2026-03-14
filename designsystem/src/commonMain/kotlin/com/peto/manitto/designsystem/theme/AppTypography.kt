package com.peto.manitto.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import manitto.designsystem.generated.resources.Jua_Regular
import manitto.designsystem.generated.resources.Nunito_Bold
import manitto.designsystem.generated.resources.Nunito_ExtraBold
import manitto.designsystem.generated.resources.Nunito_ExtraLight
import manitto.designsystem.generated.resources.Nunito_Light
import manitto.designsystem.generated.resources.Nunito_Regular
import manitto.designsystem.generated.resources.Nunito_SemiBold
import manitto.designsystem.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
private fun JuaFontFamily(): FontFamily =
    FontFamily(
        Font(Res.font.Jua_Regular, weight = FontWeight.Normal),
    )

@Composable
private fun NunitoFontFamily(): FontFamily =
    FontFamily(
        Font(Res.font.Nunito_ExtraLight, weight = FontWeight.ExtraLight),
        Font(Res.font.Nunito_Light, weight = FontWeight.Light),
        Font(Res.font.Nunito_Regular, weight = FontWeight.Normal),
        Font(Res.font.Nunito_SemiBold, weight = FontWeight.SemiBold),
        Font(Res.font.Nunito_Bold, weight = FontWeight.Bold),
        Font(Res.font.Nunito_ExtraBold, weight = FontWeight.ExtraBold),
    )

@Immutable
data class AppTypography(
    val j1: TextStyle,
    val j2: TextStyle,
    val n1: TextStyle,
    val n2: TextStyle,
    val n3: TextStyle,
    val n4: TextStyle,
    val n5: TextStyle,
    val n6: TextStyle,
)

@Composable
fun provideAppTypography(): AppTypography {
    val jua = JuaFontFamily()
    val nunito = NunitoFontFamily()

    return AppTypography(
        j1 =
            TextStyle(
                fontFamily = jua,
                fontWeight = FontWeight.Normal,
                fontSize = 24.sp,
                lineHeight = lineHeightPercent(24f, 140f),
                letterSpacing = letterSpacingPercent(24f, -2f),
            ),
        j2 =
            TextStyle(
                fontFamily = jua,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,
                lineHeight = lineHeightPercent(20f, 140f),
                letterSpacing = letterSpacingPercent(20f, -2f),
            ),
        n1 =
            TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 22.sp,
                lineHeight = lineHeightPercent(22f, 140f),
                letterSpacing = letterSpacingPercent(22f, -1f),
            ),
        n2 =
            TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                lineHeight = lineHeightPercent(18f, 150f),
                letterSpacing = letterSpacingPercent(18f, -2f),
            ),
        n3 =
            TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = lineHeightPercent(14f, 150f),
                letterSpacing = letterSpacingPercent(14f, -2.5f),
            ),
        n4 =
            TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = lineHeightPercent(14f, 150f),
                letterSpacing = letterSpacingPercent(14f, -2.5f),
            ),
        n5 =
            TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                lineHeight = lineHeightPercent(12f, 150f),
                letterSpacing = letterSpacingPercent(12f, -2.5f),
            ),
        n6 =
            TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = lineHeightPercent(12f, 150f),
                letterSpacing = letterSpacingPercent(12f, -2.5f),
            ),
    )
}

private fun lineHeightPercent(
    fontSizeSp: Float,
    percent: Float,
): TextUnit = (fontSizeSp * (percent / 100f)).sp

private fun letterSpacingPercent(
    fontSizeSp: Float,
    percent: Float,
): TextUnit = (fontSizeSp * (percent / 100f)).sp
