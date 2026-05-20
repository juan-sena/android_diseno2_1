package com.example.diseo2_1.ui.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diseo2_1.R


@Composable
fun SeccionTarea() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
       Column(

       ) {
           Text(
               text = "Mis Tareas",
               fontSize = 30.sp

           )
           Text(
               text = "Hoy es un buen dia para codificar \uD83D\uDCBB⭐",
               fontSize = 15.sp
           )
       }

        Image(
            painter = painterResource(id = R.drawable.sol),
            contentDescription = "Sol",
            modifier = Modifier.size(40.dp)
        )
    }
    }


@Preview(showBackground = true)
@Composable
fun MostrarTarea() {
    SeccionTarea()
}