package br.com.nearby.ui.components.button
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.nearby.R
import br.com.nearby.ui.theme.GreenBase

//// o parametro modifier é o que vai controlar as ações do componente

@Composable
fun NearbyButton (modifier: Modifier = Modifier, text : String? = null , @DrawableRes iconRes: Int? = null, onClick : ()-> Unit) {
    Button(modifier = modifier.heightIn(min = 86.dp), onClick = onClick, shape = RoundedCornerShape(16.dp),
    colors = ButtonDefaults.buttonColors(containerColor = GreenBase),
    contentPadding = if (text == null && iconRes != null) PaddingValues(0.dp) else ButtonDefaults.ContentPadding
    ) {

        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            iconRes?.let { Icon(painter = painterResource(id = iconRes), contentDescription = null) }
            text?.let { Text(text = text.uppercase()) }
        }

    }
}

@Preview
@Composable
private fun NearbyButtonPreview() {
    NearbyButton(modifier = Modifier.fillMaxWidth(), text = "confirmar", iconRes = R.drawable.ic_scan) {

    }
}

@Preview
@Composable
private fun NearbyButtonNoTextPreview() {
    NearbyButton(modifier = Modifier, iconRes = R.drawable.ic_arrow_left) {
    }
}

@Preview
@Composable
private fun NearbyButtonNoIconPreview() {
    NearbyButton(modifier = Modifier.fillMaxWidth(), text = "confirmar") {
    }
}