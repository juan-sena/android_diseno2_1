package com.example.diseo2_1.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SeccionBotones() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // BOTON IZQUIERDO
        Row(
            modifier = Modifier
                .weight(1f)
                .border(
                    2.dp,
                    Color(0xFF7E57C2),
                    RoundedCornerShape(12.dp)
                )
                .padding(vertical = 10.dp, horizontal = 8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "🗑",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = "Eliminar completadas",
                color = Color(0xFF7E57C2),
                fontSize = 13.sp
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        // BOTON DERECHO
        Row(
            modifier = Modifier
                .weight(1f)
                .background(
                    Color(0xFF5E35B1),
                    RoundedCornerShape(12.dp)
                )
                .padding(vertical = 10.dp, horizontal = 8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "+",
                color = Color.White,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = "Nueva tarea",
                color = Color.White,
                fontSize = 13.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MostrarBotones() {
    SeccionBotones()
}