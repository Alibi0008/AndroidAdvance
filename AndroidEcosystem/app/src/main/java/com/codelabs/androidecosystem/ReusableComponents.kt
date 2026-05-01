package com.codelabs.androidecosystem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Message
import androidx.compose.material.icons.rounded.DirectionsRun
import androidx.compose.material.icons.rounded.LocalDrink
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.SelfImprovement
import androidx.wear.compose.material3.AppCard
import androidx.wear.compose.material3.Button
import androidx.wear.compose.material3.FilledIconButton
import androidx.wear.compose.material3.Icon
import androidx.wear.compose.material3.ListHeader
import androidx.wear.compose.material3.SurfaceTransformation
import androidx.wear.compose.material3.SwitchButton
import androidx.wear.compose.material3.Text
import androidx.wear.compose.material3.TitleCard

@Composable
fun IconButtonExample(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        FilledIconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = stringResource(R.string.icon_button_cd),
            )
        }
    }
}

@Composable
fun TextExample(
    modifier: Modifier = Modifier,
    transformation: SurfaceTransformation? = null,
) {
    ListHeader {
        Text(
            text = stringResource(R.string.hello_compose_codelab),
            modifier = modifier,
        )
    }
}

@Composable
fun CardExample(
    modifier: Modifier = Modifier,
    transformation: SurfaceTransformation? = null,
) {
    AppCard(
        modifier = modifier.fillMaxWidth(),
        appImage = {
            Icon(
                imageVector = Icons.AutoMirrored.Rounded.Message,
                contentDescription = stringResource(R.string.card_icon_cd),
            )
        },
        appName = { Text(stringResource(R.string.messages)) },
        time = { Text("12m") },
        title = { Text(stringResource(R.string.message_sender)) },
        onClick = {},
        transformation = transformation,
    ) {
        Text(stringResource(R.string.message_preview))
    }
}

@Composable
fun ChipExample(
    modifier: Modifier = Modifier,
    transformation: SurfaceTransformation? = null,
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = {},
        icon = {
            Icon(
                imageVector = Icons.Rounded.SelfImprovement,
                contentDescription = stringResource(R.string.meditation_icon_cd),
            )
        },
        secondaryLabel = {
            Text(
                text = stringResource(R.string.meditation_secondary),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        transformation = transformation,
    ) {
        Text(
            text = stringResource(R.string.meditation_label),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
fun SwitchChipExample(
    modifier: Modifier = Modifier,
    transformation: SurfaceTransformation? = null,
) {
    var checked by remember { mutableStateOf(true) }
    val stateText = if (checked) {
        stringResource(R.string.sound_on)
    } else {
        stringResource(R.string.sound_off)
    }
    val toggleDescription = stringResource(R.string.sound_toggle_state, stateText)

    SwitchButton(
        checked = checked,
        onCheckedChange = { checked = it },
        modifier = modifier.fillMaxWidth(),
        secondaryLabel = { Text(stateText) },
        label = {
            Text(
                text = stringResource(R.string.sound),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.semantics {
                    contentDescription = toggleDescription
                },
            )
        },
        transformation = transformation,
    )
}

@Composable
fun StatButtonExample(
    modifier: Modifier = Modifier,
    transformation: SurfaceTransformation? = null,
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = {},
        icon = {
            Icon(
                imageVector = Icons.Rounded.DirectionsRun,
                contentDescription = null,
            )
        },
        secondaryLabel = {
            Text(
                text = stringResource(R.string.run_secondary),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        transformation = transformation,
    ) {
        Text(
            text = stringResource(R.string.run_label),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
fun RecoveryCardExample(
    modifier: Modifier = Modifier,
    transformation: SurfaceTransformation? = null,
) {
    TitleCard(
        modifier = modifier.fillMaxWidth(),
        title = { Text(stringResource(R.string.heart_rate_label)) },
        subtitle = { Text(stringResource(R.string.heart_rate_secondary)) },
        onClick = {},
        transformation = transformation,
    ) {
        Text(stringResource(R.string.hydration_secondary))
    }
}
