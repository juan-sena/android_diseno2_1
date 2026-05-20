package com.example.diseo2_1.ui.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diseo2_1.R

@Composable
fun SeccionTablero(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(horizontal = 16.dp),
             contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.captura),
            contentDescription = "Tablero",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MostrarTablero(){
    SeccionTablero()
}