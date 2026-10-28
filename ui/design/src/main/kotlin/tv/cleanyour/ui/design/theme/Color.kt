package tv.cleanyour.ui.design.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

// DESIGN-SYSTEM 2 and 11. Dark is the default and the brand; light mirrors the roles one to one.
@Immutable
data class CytColors(
    val bg: Color, val surface1: Color, val surface2: Color, val surface3: Color,
    val rim: Color, val outline: Color, val outlineStrong: Color,
    val textPrimary: Color, val textSecondary: Color, val textTertiary: Color,
    val primary: Color, val onPrimary: Color, val primaryPressed: Color, val accent: Color,
    val glowBrand: Color, val glowTv: Color,
    val success: Color, val successContainer: Color, val onSuccessContainer: Color,
    val warning: Color, val warningContainer: Color, val onWarningContainer: Color,
    val danger: Color, val dangerFill: Color, val onDanger: Color,
    val dangerContainer: Color, val onDangerContainer: Color,
    val scrim: Color,
    // Glass recipe (DESIGN-SYSTEM 5.1): fill top and bottom, specular top, rim.
    val glassFillTop: Color, val glassFillBottom: Color, val glassSpecular: Color,
    // The springy highlight: brighter fill, an 80% rim and three outer rings.
    val highlightFillTop: Color, val highlightFillBottom: Color, val highlightSpecular: Color,
    val highlightRim: Color, val highlightRing: Color,
    // Ambient glow core alpha (24% dark, 14% light) and its mid stop.
    val glowCoreAlpha: Float, val glowMidAlpha: Float,
    val isDark: Boolean,
)

// Atlas TV Cleaner visual skin. The roles and behaviour are unchanged; only the palette is branded.
// Moroccan red is the primary action colour and a restrained green is used as the secondary accent.
val DarkCytColors = CytColors(
    bg = Color(0xFF070B0D), surface1 = Color(0xFF0D1418), surface2 = Color(0xFF121C21),
    surface3 = Color(0xFF19272D), rim = Color(0x33FFFFFF), outline = Color(0x1FFFFFFF),
    outlineStrong = Color(0x5CFFFFFF), textPrimary = Color(0xFFF7F7F7),
    textSecondary = Color(0xFFA9B0B4), textTertiary = Color(0xFF858F94),
    primary = Color(0xFFE31B23), onPrimary = Color(0xFFFFFFFF), primaryPressed = Color(0xFFC8151C),
    accent = Color(0xFF00A859),
    glowBrand = Color(0xFFE31B23), glowTv = Color(0xFF00A859),
    success = Color(0xFF22C972), successContainer = Color(0xFF0B291B),
    onSuccessContainer = Color(0xFF65E6A4), warning = Color(0xFFFFB340),
    warningContainer = Color(0xFF33240A), onWarningContainer = Color(0xFFFFC46B),
    danger = Color(0xFFFF6961), dangerFill = Color(0xFFE31B23), onDanger = Color(0xFFFFFFFF),
    dangerContainer = Color(0xFF351416), onDangerContainer = Color(0xFFFF8C88),
    scrim = Color(0xA8070B0D),
    glassFillTop = Color.White.copy(alpha = 0.09f), glassFillBottom = Color.White.copy(alpha = 0.04f),
    glassSpecular = Color.White.copy(alpha = 0.08f),
    highlightFillTop = Color.White.copy(alpha = 0.16f), highlightFillBottom = Color.White.copy(alpha = 0.06f),
    highlightSpecular = Color.White.copy(alpha = 0.14f), highlightRim = Color.White.copy(alpha = 0.80f),
    highlightRing = Color.White,
    glowCoreAlpha = 0.24f, glowMidAlpha = 0.10f,
    isDark = true,
)

val LightCytColors = CytColors(
    bg = Color(0xFFF4F3F1), surface1 = Color(0xFFFFFFFF), surface2 = Color(0xFFFAF8F6),
    surface3 = Color(0xFFECE9E5), rim = Color(0x1A000000), outline = Color(0x14000000),
    outlineStrong = Color(0x52000000), textPrimary = Color(0xFF111315),
    textSecondary = Color(0xFF50565A), textTertiary = Color(0xFF62686C),
    primary = Color(0xFFE31B23), onPrimary = Color(0xFFFFFFFF), primaryPressed = Color(0xFFC8151C),
    accent = Color(0xFF008B4A),
    glowBrand = Color(0xFFE31B23), glowTv = Color(0xFF00A859),
    success = Color(0xFF08733E), successContainer = Color(0xFFE1F4E9),
    onSuccessContainer = Color(0xFF075B32), warning = Color(0xFF8F5300),
    warningContainer = Color(0xFFFFF1DB), onWarningContainer = Color(0xFF7A4600),
    danger = Color(0xFFB8171E), dangerFill = Color(0xFFE31B23), onDanger = Color(0xFFFFFFFF),
    dangerContainer = Color(0xFFFCE6E7), onDangerContainer = Color(0xFF981118),
    scrim = Color(0x66000000),
    glassFillTop = Color.White.copy(alpha = 0.72f), glassFillBottom = Color.White.copy(alpha = 0.56f),
    glassSpecular = Color.White.copy(alpha = 0.50f),
    highlightFillTop = Color.White.copy(alpha = 0.95f), highlightFillBottom = Color.White.copy(alpha = 0.80f),
    highlightSpecular = Color.White.copy(alpha = 0.60f), highlightRim = Color.Black.copy(alpha = 0.55f),
    highlightRing = Color.Black,
    glowCoreAlpha = 0.14f, glowMidAlpha = 0.06f,
    isDark = false,
)

// Stock Material 3 components inherit the brand without wrappers (DESIGN-SYSTEM 11).
fun CytColors.toM3(): ColorScheme = (if (isDark) darkColorScheme() else lightColorScheme()).copy(
    primary = primary, onPrimary = onPrimary, background = bg, onBackground = textPrimary,
    surface = bg, onSurface = textPrimary, onSurfaceVariant = textSecondary,
    surfaceContainerLowest = bg, surfaceContainerLow = surface1, surfaceContainer = surface2,
    surfaceContainerHigh = surface3, surfaceContainerHighest = surface3,
    surfaceVariant = surface3, inverseSurface = surface3, inverseOnSurface = textPrimary,
    outline = outlineStrong, outlineVariant = outline, error = danger,
    errorContainer = dangerContainer, onErrorContainer = onDangerContainer,
    secondary = accent, onSecondary = onPrimary, tertiary = accent, scrim = scrim,
    primaryContainer = surface3, onPrimaryContainer = textPrimary,
    secondaryContainer = surface3, onSecondaryContainer = textPrimary,
)
