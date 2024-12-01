import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Buttons() {
    var text by remember { mutableStateOf("Hello, World!") }
    val count = remember { mutableStateOf(0) }

    MaterialTheme {
        Row {
            Image(
                painter = painterResource("img.jpg"),
                contentDescription = "Contact profile picture",
                /*
                    modifier = Modifier
                        .size(40.dp) // Set image size to 40 dp
                        .clip(CircleShape) // Clip image to be shaped as a circle
                 */
            )
            Column(Modifier.fillMaxSize(), Arrangement.spacedBy(5.dp)) {
                Button(modifier = Modifier.align(Alignment.CenterHorizontally).testTag(Tags.ButtonHello),
                    onClick = {
                        text = "Hello, Desktop!"
                    }) {
                    Text(text)
                }
                Button(modifier = Modifier.align(Alignment.CenterHorizontally),
                    onClick = {
                        count.value++
                    }) {
                    Text(if (count.value == 0) "Click me!" else "Clicked ${count.value}!")
                }
                Button(modifier = Modifier.align(Alignment.CenterHorizontally),
                    onClick = {
                        count.value = 0
                    }) {
                    Text("Reset")
                }
            }
        }
    }
}
