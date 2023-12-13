@file:OptIn(ExperimentalTextApi::class)

package com.example.typography

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val testText = "a"
        setContent {
            Row {
                MaterialTheme {
                    Column {
                        Text(
                            testText,
                            style = MaterialTheme.typography.headlineLarge.copy(
                                //                                fontSynthesis = FontSynthesis.None
                            ),
                            maxLines = 1,
                        )
                        //                        Text("headlineMedium", style = MaterialTheme.typography.headlineMedium, maxLines = 1)
                        //                        Text("headlineSmall", style = MaterialTheme.typography.headlineSmall, maxLines = 1)
                        //                        Text("bodyLarge", style = MaterialTheme.typography.bodyLarge)
                        //                        Text("bodyMedium", style = MaterialTheme.typography.bodyMedium)
                        //                        Text("bodySmall", style = MaterialTheme.typography.bodySmall)
                    }
                }

                MaterialTheme(
                    typography = proximaTypography(),
                ) {
                    Column {
                        Text(
                            testText,
                            style = MaterialTheme.typography.headlineLarge.copy(
//                                fontSynthesis = FontSynthesis.None
                            ),
                            maxLines = 1,
                        )
//                        Text("headlineMedium", style = MaterialTheme.typography.headlineMedium, maxLines = 1)
//                        Text("headlineSmall", style = MaterialTheme.typography.headlineSmall, maxLines = 1)
//                        Text("bodyLarge", style = MaterialTheme.typography.bodyLarge)
//                        Text("bodyMedium", style = MaterialTheme.typography.bodyMedium)
//                        Text("bodySmall", style = MaterialTheme.typography.bodySmall)
                    }
                }

                MaterialTheme(
                    typography = robotoTypography(),
                ) {
                    Column {
                        Text(
                            testText,
                            style = MaterialTheme.typography.headlineLarge.copy(
//                                fontSynthesis = FontSynthesis.None
                            ),
                            maxLines = 1,
                        )
//                        Text("headlineMedium", style = MaterialTheme.typography.headlineMedium, maxLines = 1)
//                        Text("headlineSmall", style = MaterialTheme.typography.headlineSmall, maxLines = 1)
//                        Text("bodyLarge", style = MaterialTheme.typography.bodyLarge)
//                        Text("bodyMedium", style = MaterialTheme.typography.bodyMedium)
//                        Text("bodySmall", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}

private val proxima = FontFamily(
    Font(
        R.font.proximavara,
        weight = FontWeight.W100,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W100.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W200,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W200.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W300,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W300.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W400,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W400.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W500,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W500.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W600,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W600.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W700,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W700.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W800,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W800.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W900,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W900.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W100,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W100.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W200,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W200.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W300,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W300.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W400,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W400.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W500,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W500.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W600,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W600.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W700,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W700.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W800,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W800.weight),
        ),
    ),
    Font(
        R.font.proximavara,
        weight = FontWeight.W900,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W900.weight),
        ),
    ),

)

// https://issuetracker.google.com/issues/270111243
@Composable
fun proximaTypography() = Typography(
    displayLarge = MaterialTheme.typography.displayLarge.copy(
        fontFamily = proxima,
    ),
    displayMedium = MaterialTheme.typography.displayMedium.copy(
        fontFamily = proxima,
    ),
    displaySmall = MaterialTheme.typography.displaySmall.copy(
        fontFamily = proxima,
    ),
    headlineLarge = MaterialTheme.typography.headlineLarge.copy(
        fontFamily = proxima,
    ),
    headlineMedium = MaterialTheme.typography.headlineMedium.copy(
        fontFamily = proxima,
    ),
    headlineSmall = MaterialTheme.typography.headlineSmall.copy(
        fontFamily = proxima,
    ),
    titleLarge = MaterialTheme.typography.titleLarge.copy(
        fontFamily = proxima,
    ),
    titleMedium = MaterialTheme.typography.titleMedium.copy(
        fontFamily = proxima,
    ),
    titleSmall = MaterialTheme.typography.titleSmall.copy(
        fontFamily = proxima,
    ),
    bodyLarge = MaterialTheme.typography.bodyLarge.copy(
        fontFamily = proxima,
    ),
    bodyMedium = MaterialTheme.typography.bodyMedium.copy(
        fontFamily = proxima,
    ),
    bodySmall = MaterialTheme.typography.bodySmall.copy(
        fontFamily = proxima,
    ),
    labelLarge = MaterialTheme.typography.labelLarge.copy(
        fontFamily = proxima,
    ),
    labelMedium = MaterialTheme.typography.labelMedium.copy(
        fontFamily = proxima,
    ),
    labelSmall = MaterialTheme.typography.labelSmall.copy(
        fontFamily = proxima,
    ),
)

private val robotoFlex = FontFamily(
    Font(
        R.font.robotoflex,
        weight = FontWeight.W100,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W100.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W200,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W200.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W300,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W300.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W400,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W400.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W500,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W500.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W600,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W600.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W700,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W700.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W800,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W800.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W900,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(0f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W900.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W100,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W100.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W200,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W200.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W300,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W300.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W400,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W400.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W500,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W500.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W600,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W600.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W700,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W700.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W800,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W800.weight),
        ),
    ),
    Font(
        R.font.robotoflex,
        weight = FontWeight.W900,
        style = FontStyle.Italic,
        variationSettings = FontVariation.Settings(
            FontVariation.italic(1f),
            FontVariation.width(100f),
            FontVariation.weight(FontWeight.W900.weight),
        ),
    ),

)

// https://issuetracker.google.com/issues/270111243
@Composable
fun robotoTypography() = Typography(
    displayLarge = MaterialTheme.typography.displayLarge.copy(
        fontFamily = robotoFlex,
    ),
    displayMedium = MaterialTheme.typography.displayMedium.copy(
        fontFamily = robotoFlex,
    ),
    displaySmall = MaterialTheme.typography.displaySmall.copy(
        fontFamily = robotoFlex,
    ),
    headlineLarge = MaterialTheme.typography.headlineLarge.copy(
        fontFamily = robotoFlex,
    ),
    headlineMedium = MaterialTheme.typography.headlineMedium.copy(
        fontFamily = robotoFlex,
    ),
    headlineSmall = MaterialTheme.typography.headlineSmall.copy(
        fontFamily = robotoFlex,
    ),
    titleLarge = MaterialTheme.typography.titleLarge.copy(
        fontFamily = robotoFlex,
    ),
    titleMedium = MaterialTheme.typography.titleMedium.copy(
        fontFamily = robotoFlex,
    ),
    titleSmall = MaterialTheme.typography.titleSmall.copy(
        fontFamily = robotoFlex,
    ),
    bodyLarge = MaterialTheme.typography.bodyLarge.copy(
        fontFamily = robotoFlex,
    ),
    bodyMedium = MaterialTheme.typography.bodyMedium.copy(
        fontFamily = robotoFlex,
    ),
    bodySmall = MaterialTheme.typography.bodySmall.copy(
        fontFamily = robotoFlex,
    ),
    labelLarge = MaterialTheme.typography.labelLarge.copy(
        fontFamily = robotoFlex,
    ),
    labelMedium = MaterialTheme.typography.labelMedium.copy(
        fontFamily = robotoFlex,
    ),
    labelSmall = MaterialTheme.typography.labelSmall.copy(
        fontFamily = robotoFlex,
    ),
)
