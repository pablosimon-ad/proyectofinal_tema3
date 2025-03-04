package com.example.ut3_proyectofinal_pablosimon.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DetallePruebaScreen(navController: NavController) {
    var resultado by remember { mutableStateOf("") }
    var nota by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Detalles de la Prueba", fontSize = 24.sp, color = MaterialTheme.colorScheme.onBackground)
        Spacer(Modifier.height(20.dp))

        Text(
            "Evalúa la resistencia muscular del abdomen. Consiste en realizar el mayor número de abdominales posibles en 30 segundos, manteniendo la técnica adecuada.",
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            value = resultado,
            onValueChange = { resultado = it },
            label = { Text("Marca conseguida") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(20.dp))

        Button(onClick = {
            nota = calcularNota(resultado)
        }) {
            Text("Calcular nota")
        }

        Spacer(Modifier.height(20.dp))

        if (nota.isNotEmpty()) {
            Text("Nota: $nota", fontSize = 18.sp, color = MaterialTheme.colorScheme.onBackground)
        }

        Spacer(Modifier.height(20.dp))

        Button(onClick = { navController.navigate("pruebas") }) {
            Text("Volver")
        }
    }
}

fun calcularNota(resultado: String): String {
    val valor = resultado.toIntOrNull()
    return when {
        valor == null -> "Ingrese un valor válido"
        valor >= 30 -> "Sobresaliente"
        valor >= 20 -> "Notable"
        valor >= 10 -> "Aprobado"
        else -> "Insuficiente"
    }
}
