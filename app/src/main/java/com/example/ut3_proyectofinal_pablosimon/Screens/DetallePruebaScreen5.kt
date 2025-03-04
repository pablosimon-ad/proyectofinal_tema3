package com.example.ut3_proyectofinal_pablosimon.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController

@Composable
fun DetallePruebaScreen5(navController: NavController) {
    val result = remember { mutableStateOf(TextFieldValue("")) }
    val nota = remember { mutableStateOf("") }

    fun calcularNota() {
        val distancia = result.value.text.toFloatOrNull()

        if (distancia != null) {
            if (distancia >= 6) {
                nota.value = "Excelente"
            } else if (distancia >= 4) {
                nota.value = "Buena"
            } else if (distancia >= 2) {
                nota.value = "Regular"
            } else {
                nota.value = "Insuficiente"
            }
        } else {
            nota.value = "Por favor ingresa un número válido."
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Detalles de la Prueba", fontSize = 24.sp, color = colorScheme.onBackground)
        Spacer(Modifier.height(20.dp))
        Text("Evalúa la fuerza explosiva de los brazos y el tronco. Se lanza un balón medicinal de 2 kg desde una posición estática, buscando alcanzar la mayor distancia posible.", color = colorScheme.onBackground)

        Spacer(Modifier.height(30.dp))
        Text("Ingresa la distancia del lanzamiento (en metros):", color = colorScheme.onBackground)
        TextField(
            value = result.value,
            onValueChange = { result.value = it },
            label = { Text("Distancia lanzada") },
            modifier = Modifier.padding(top = 8.dp)
        )

        Spacer(Modifier.height(20.dp))
        Button(onClick = { calcularNota() }) {
            Text("Calcular nota", color = colorScheme.onBackground)
        }

        Spacer(Modifier.height(20.dp))
        Text("Nota: ${nota.value}", fontSize = 20.sp, color = colorScheme.onBackground)

        Spacer(Modifier.height(20.dp))

        Button(onClick = { navController.navigate("pruebas") }) {
            Text("Volver", color = colorScheme.onBackground)
        }
    }
}
