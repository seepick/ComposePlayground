import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

// https://medium.com/ekino-france/building-your-first-desktop-application-in-kotlin-with-compose-desktop-ff8a9191ee34
// https://github.com/JetBrains/compose-multiplatform-desktop-template
// https://developer.android.com/develop/ui/compose/tutorial

//@Composable
//fun Foo(viewModel: ..)

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Demo",
        state = rememberWindowState(width = 300.dp, height = 300.dp)
    ) {
        TableScreen()
//        Buttons()
    }
}
