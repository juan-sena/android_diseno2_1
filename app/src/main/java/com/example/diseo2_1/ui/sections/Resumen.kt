package com.example.diseo2_1.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SeccionResumen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {

        Text(
            text = "Resumen",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = "8",
                    fontSize = 22.sp,
                    color = Color.White,
                    modifier = Modifier


                        .clip(CircleShape)


                        .background(Color(0xFF90CAF9))

                        .padding(20.dp)
                )

                Text(text = "Pendientes", fontSize = 14.sp)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = "3",
                    fontSize = 22.sp,
                    color = Color.White,
                    modifier = Modifier


                        .clip(CircleShape)


                        .background(Color(0xFFA5D6A7))

                        .padding(20.dp)
                )

                Text(text = "Completadas", fontSize = 14.sp)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = "2",
                    fontSize = 22.sp,
                    color = Color.White,
                    modifier = Modifier


                        .clip(CircleShape)


                        .background(Color(0xFFCE93D8))

                        .padding(20.dp)
                )

                Text(text = "En progreso", fontSize = 14.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MostrarResumen() {
    SeccionResumen()
}