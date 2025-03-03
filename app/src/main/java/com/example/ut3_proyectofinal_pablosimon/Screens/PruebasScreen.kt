package com.example.ut3_proyectofinal_pablosimon.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PruebasScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(50.dp),
    ) {
        Text("Lista de Pruebas", fontSize = 24.sp,
            color = colorScheme.onBackground)
        Spacer(Modifier.height(20.dp))


        Text(
            text = "ABDOMINALES 30”",
            fontSize = 18.sp,
            modifier = Modifier.clickable { navController.navigate("detalle_prueba") },
            color = colorScheme.onBackground
        )
        Spacer(Modifier.height(10.dp))

        Text(
            text = "FLEXIBILIDAD",
            fontSize = 18.sp,
            modifier = Modifier.clickable { navController.navigate("detalle_prueba2") },
            color = colorScheme.onBackground
        )
        Spacer(Modifier.height(10.dp))

        Text(
            text = "TEST COOPER",
            fontSize = 18.sp,
            modifier = Modifier.clickable { navController.navigate("detalle_prueba3") },
            color = colorScheme.onBackground
        )
        Spacer(Modifier.height(10.dp))

        Text(
            text = "VELOCIDAD 5x10",
            fontSize = 18.sp,
            modifier = Modifier.clickable { navController.navigate("detalle_prueba4") },
            color = colorScheme.onBackground
        )
        Spacer(Modifier.height(10.dp))

        Text(
            text = "LANZAMIENTO BALON 2 KG",
            fontSize = 18.sp,
            modifier = Modifier.clickable { navController.navigate("detalle_prueba5") },
            color = colorScheme.onBackground
        )
        Spacer(Modifier.height(20.dp))
        Button(onClick = { navController.navigate("home") }) { Text("Volver",
            color = colorScheme.onBackground) }

    }
}