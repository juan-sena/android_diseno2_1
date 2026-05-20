package com.example.diseo2_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.diseo2_1.ui.screens.Contendor
import com.example.diseo2_1.ui.theme.Diseño2_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Diseño2_1Theme {
                Contendor()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MostrarSurface() {
    Contendor()
}
