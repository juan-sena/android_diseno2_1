package com.example.diseo2_1.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diseo2_1.ui.sections.SeccionResumen
import com.example.diseo2_1.ui.sections.SeccionTablero
import com.example.diseo2_1.ui.sections.SeccionTarea

@Composable
fun Contendor() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            SeccionTarea()

            Spacer(modifier = Modifier.height(16.dp))

            SeccionTablero()

            Spacer(modifier = Modifier.height(16.dp))

            SeccionResumen()

            Spacer(modifier = Modifier.height(16.dp))

        }
    }
}
@Preview(showBackground = true)
@Composable
fun MostrarSurface() {
    Contendor()
}
