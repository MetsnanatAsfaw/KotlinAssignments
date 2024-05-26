import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CounterApp() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Count: $count")

        Button(onClick = { count++ }) {
            Text(text = "Increment")
        }

        Button(onClick = { count-- }) {
            Text(text = "Decrement")
        }

        Button(onClick = { count = 0 }) {
            Text(text = "Reset")
        }
    }
}

@Preview
@Composable
fun PreviewCounterApp() {
    CounterApp()
}
