package com.example.app

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecondScreen()
        }
    }
}

@Composable
fun SecondScreen() {
    val context = LocalContext.current

    Scaffold(

        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Selamat datang di Activity Kedua")
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = {
                    // Kembali ke Activity sebelumnya dengan menyelesaikan activity saat ini
                    (context as? Activity)?.finish()
                }) {
                    Text("Kembali ke Activity Pertama")
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    SecondScreen()
}
