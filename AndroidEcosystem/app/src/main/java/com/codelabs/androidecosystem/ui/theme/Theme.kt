package com.codelabs.androidecosystem.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material3.ColorScheme
import androidx.wear.compose.material3.MaterialTheme

private val WearColorScheme = ColorScheme(
    primary = WearGreen,
    primaryDim = WearGreenContainer,
    primaryContainer = WearGreenContainer,
    onPrimary = WearSurface,
    onPrimaryContainer = WearOnSurface,
    secondary = WearBlue,
    secondaryDim = WearBlueContainer,
    secondaryContainer = WearBlueContainer,
    onSecondary = WearSurface,
    onSecondaryContainer = WearOnSurface,
    tertiary = WearBlue,
    tertiaryDim = WearBlueContainer,
    tertiaryContainer = WearBlueContainer,
    onTertiary = WearSurface,
    onTertiaryContainer = WearOnSurface,
    surfaceContainerLow = WearSurfaceVariant,
    surfaceContainer = WearSurface,
    surfaceContainerHigh = WearSurfaceVariant,
    onSurface = WearOnSurface,
    onSurfaceVariant = WearBlue,
    outline = WearBlue,
    outlineVariant = WearSurfaceVariant,
    background = WearSurface,
    onBackground = WearOnSurface,
    error = Color(0xFFFFB4AB),
    errorDim = Color(0xFFFF5449),
    errorContainer = Color(0xFF93000A),
    onError = Color(0xFF690005),
    onErrorContainer = Color(0xFFFFDAD6),
)

@Composable
fun AndroidEcosystemTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = WearColorScheme,
        typography = Typography,
        content = content
    )
}
