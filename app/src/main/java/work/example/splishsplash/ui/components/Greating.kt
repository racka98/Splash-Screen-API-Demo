package work.example.splishsplash.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import work.example.splishsplash.ui.theme.ComposeAndroidTemplateTheme

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAndroidTemplateTheme {
        Greeting("Android")
    }
}