package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant( ) {
    Column() {
        Row(
            Modifier
                .weight(1f)
                .fillMaxWidth()) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = Color.Green)
                    .padding(16.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "hello")
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = Color.Blue)
                    .padding(16.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "hello")
            }

        }
        Row(
            Modifier
                .weight(1f)
                .fillMaxWidth()) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = Color.Blue)
                    .padding(16.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "hello")
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = Color.Green)
                    .padding(16.dp),
                contentAlignment = Alignment.Center) {
                Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Text composable")
                    Text(text = "Displays text and follows the recommended Material Design guidelines.")
                }
            }

        }

    }
}

//@Composable
//fun Quadrant(weig){
//    Box(
//        Modifier
//            .weight(1f)
//            .fillMaxHeight()
//            .background(color = Color.Green)
//            .padding(16.dp),
//        contentAlignment = Alignment.Center) {
//        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(text = "Text composable")
//            Text(text = "Displays text and follows the recommended Material Design guidelines.")
//        }
//    }
//}



@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}