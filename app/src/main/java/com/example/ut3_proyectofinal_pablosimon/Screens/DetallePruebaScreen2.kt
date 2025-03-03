package com.example.ut3_proyectofinal_pablosimon.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DetallePruebaScreen2(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Detalles de la Prueba", fontSize = 24.sp,
            color = colorScheme.onBackground)
        Spacer(Modifier.height(20.dp))
        Text("Mide la capacidad de estiramiento de los músculos y articulaciones. Se realiza generalmente con el test de flexión profunda o el test de Sit and Reach, donde el sujeto se sienta y estira las manos hacia adelante para medir la distancia alcanzada.",
            color = colorScheme.onBackground)
        Button(onClick = { navController.navigate("pruebas") }) {
            Text("Volver",
                color = colorScheme.onBackground)
        }
    }
}