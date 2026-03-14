package com.peto.manitto.designsystem.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.peto.manitto.designsystem.extension.toTextStyle
import com.peto.manitto.designsystem.theme.LocalAppTypography
import com.peto.manitto.designsystem.theme.ManittoTextStyle
import com.peto.manitto.designsystem.theme.ManittoTheme

@Composable
fun ManittoText(
    text: String,
    style: ManittoTextStyle,
    color: Color,
    modifier: Modifier = Modifier,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    val density = LocalDensity.current.density
    val typo = LocalAppTypography.current
    val textStyle = style.toTextStyle(typo)

    CompositionLocalProvider(LocalDensity provides Density(density, fontScale = 1f)) {
        Text(
            modifier = modifier,
            text = text,
            style = textStyle,
            color = color,
            textAlign = textAlign,
            maxLines = maxLines,
            overflow = overflow,
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun ManittoTextAllStylesPreview() {
    ManittoTheme {
        Column(
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            ManittoText(
                text = "J1 · 마니또 타이틀",
                style = ManittoTextStyle.J1,
                color = Color.Black,
            )
            ManittoText(
                text = "J2 · 마니또 헤드라인",
                style = ManittoTextStyle.J2,
                color = Color.Black,
            )
            ManittoText(
                text = "N1 · Nunito ExtraBold 22sp",
                style = ManittoTextStyle.N1,
                color = Color.Black,
            )
            ManittoText(
                text = "N2 · Nunito Bold 18sp",
                style = ManittoTextStyle.N2,
                color = Color.Black,
            )
            ManittoText(
                text = "N3 · Nunito SemiBold 14sp",
                style = ManittoTextStyle.N3,
                color = Color.Black,
            )
            ManittoText(
                text = "N4 · Nunito Regular 14sp",
                style = ManittoTextStyle.N4,
                color = Color.Black,
            )
            ManittoText(
                text = "N5 · Nunito Bold 12sp",
                style = ManittoTextStyle.N5,
                color = Color.Black,
            )
            ManittoText(
                text = "N6 · Nunito Regular 12sp",
                style = ManittoTextStyle.N6,
                color = Color.Black,
            )
        }
    }
}
