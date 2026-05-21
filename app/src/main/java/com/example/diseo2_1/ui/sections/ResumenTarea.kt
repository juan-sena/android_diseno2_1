package com.example.diseo2_1.ui.sections

import androidx.compose.foundation.background
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
fun SeccionResumenTareas() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Text(
            text = "Próximas tareas",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        // TARJETA 1
        TareaItem(
            icon = "</>",
            iconBg = Color(0xFFDDE7FF),
            title = "Jetpack Compose",
            subtitle = "Layouts básicos",
            time = "1 h",
            dotColor = Color.Blue
        )

        Spacer(modifier = Modifier.height(8.dp))

        // TARJETA 2
        TareaItem(
            icon = "📖",
            iconBg = Color(0xFFDDF5E3),
            title = "Leer docs",
            subtitle = "Column, Row, Box",
            time = "30 min",
            dotColor = Color.Green
        )

        Spacer(modifier = Modifier.height(8.dp))

        // TARJETA 3
        TareaItem(
            icon = "{ }",
            iconBg = Color(0xFFFFE7D6),
            title = "Practicar UI",
            subtitle = "3 pantallas",
            time = "45 min",
            dotColor = Color(0xFFFF9800)
        )
    }
}

@Composable
fun TareaItem(
    icon: String,
    iconBg: Color,
    title: String,
    subtitle: String,
    time: String,
    dotColor: Color
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5), RoundedCornerShape(14.dp))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = icon,
            fontSize = 16.sp,
            modifier = Modifier
                .background(iconBg, RoundedCornerShape(50))
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column(modifier = Modifier.weight(1f)) {

            Text(text = title, fontSize = 14.sp)
            Text(text = subtitle, fontSize = 12.sp, color = Color.Gray)
        }

        Column(horizontalAlignment = Alignment.End) {

            Text(text = time, fontSize = 12.sp)
            Text(text = "●", color = dotColor)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MostrarTareas() {
    SeccionResumenTareas()
}