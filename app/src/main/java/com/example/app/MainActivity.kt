@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstScreen()
        }
    }
}

@Composable
fun FirstScreen() {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Aplikasi Pertama Saya") })
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Nama: Rijan Ananta")
                Text(text = "NIM: 12350112945")
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = {
                    // Navigasi ke SecondActivity
                    context.startActivity(Intent(context, SecondActivity::class.java))
                }) {
                    Text("Ke Activity Kedua")
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    FirstScreen()
}
