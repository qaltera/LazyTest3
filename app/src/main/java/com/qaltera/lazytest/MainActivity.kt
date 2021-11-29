package com.qaltera.lazytest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.qaltera.lazytest.ui.theme.LazyTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    runTest()
                }
            }
        }
    }
}

@Composable
fun runTest() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(count = 700) { rowIndex ->
            Text(text = "|         \n|       \n$rowIndex     \n|       \n|  ")
        }
    }
}