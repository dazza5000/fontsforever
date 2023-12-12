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
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.typography.ui.theme.TypographyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row {
                MaterialTheme {
                    Column {
                        Text("headlineLarge", style = MaterialTheme.typography.headlineLarge, maxLines = 1)
                        Text("headlineMedium", style = MaterialTheme.typography.headlineMedium, maxLines = 1)
                        Text("headlineSmall", style = MaterialTheme.typography.headlineSmall, maxLines = 1)
                        Text("bodyLarge", style = MaterialTheme.typography.bodyLarge)
                        Text("bodyMedium", style = MaterialTheme.typography.bodyMedium)
                        Text("bodySmall", style = MaterialTheme.typography.bodySmall)
                    }
                }

                MaterialTheme(
                    typography = wellTypography(),
                ) {
                    Column {
                        Text("headlineLarge", style = MaterialTheme.typography.headlineLarge, maxLines = 1)
                        Text("headlineMedium", style = MaterialTheme.typography.headlineMedium, maxLines = 1)
                        Text("headlineSmall", style = MaterialTheme.typography.headlineSmall, maxLines = 1)
                        Text("bodyLarge", style = MaterialTheme.typography.bodyLarge)
                        Text("bodyMedium", style = MaterialTheme.typography.bodyMedium)
                        Text("bodySmall", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TypographyTheme {
        Greeting("Android")
    }
}

private val proximaVara = FontFamily(
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
fun wellTypography() = Typography(
    displayLarge = MaterialTheme.typography.displayLarge.copy(
        fontFamily = proximaVara,
    ),
    displayMedium = MaterialTheme.typography.displayMedium.copy(
        fontFamily = proximaVara,
    ),
    displaySmall = MaterialTheme.typography.displaySmall.copy(
        fontFamily = proximaVara,
    ),
    headlineLarge = MaterialTheme.typography.headlineLarge.copy(
        fontFamily = proximaVara,
    ),
    headlineMedium = MaterialTheme.typography.headlineMedium.copy(
        fontFamily = proximaVara,
    ),
    headlineSmall = MaterialTheme.typography.headlineSmall.copy(
        fontFamily = proximaVara,
    ),
    titleLarge = MaterialTheme.typography.titleLarge.copy(
        fontFamily = proximaVara,
    ),
    titleMedium = MaterialTheme.typography.titleMedium.copy(
        fontFamily = proximaVara,
    ),
    titleSmall = MaterialTheme.typography.titleSmall.copy(
        fontFamily = proximaVara,
    ),
    bodyLarge = MaterialTheme.typography.bodyLarge.copy(
        fontFamily = proximaVara,
    ),
    bodyMedium = MaterialTheme.typography.bodyMedium.copy(
        fontFamily = proximaVara,
    ),
    bodySmall = MaterialTheme.typography.bodySmall.copy(
        fontFamily = proximaVara,
    ),
    labelLarge = MaterialTheme.typography.labelLarge.copy(
        fontFamily = proximaVara,
    ),
    labelMedium = MaterialTheme.typography.labelMedium.copy(
        fontFamily = proximaVara,
    ),
    labelSmall = MaterialTheme.typography.labelSmall.copy(
        fontFamily = proximaVara,
    ),
)
