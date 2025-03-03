package com.example.ut3_proyectofinal_pablosimon.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun IMCScreen(navController: NavController) {
    var peso by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var imc by remember { mutableStateOf("") }
    var sexo by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Calcular IMC", fontSize = 24.sp, color = MaterialTheme.colorScheme.onBackground)
        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text("Peso (kg)", color = MaterialTheme.colorScheme.onBackground) },
            singleLine = true
        )
        Spacer(Modifier.height(10.dp))

        OutlinedTextField(
            value = altura,
            onValueChange = { altura = it },
            label = { Text("Altura (m)", color = MaterialTheme.colorScheme.onBackground) },
            singleLine = true
        )
        Spacer(Modifier.height(10.dp))

        Text("Sexo:", fontSize = 18.sp, color = MaterialTheme.colorScheme.onBackground)
        Row {
            Checkbox(
                checked = sexo == "Hombre",
                onCheckedChange = { if (it) sexo = "Hombre" }
            )
            Text("Hombre", color = MaterialTheme.colorScheme.onBackground)
        }
            Spacer(Modifier.width(20.dp))
        Row {
            Checkbox(
                checked = sexo == "Mujer",
                onCheckedChange = { if (it) sexo = "Mujer" }
            )
            Text("Mujer", color = MaterialTheme.colorScheme.onBackground)
    }
        Spacer(Modifier.height(20.dp))

        Button(onClick = {
            val pesoDouble = peso.toDoubleOrNull()
            val alturaDouble = altura.toDoubleOrNull()
            if (pesoDouble != null && alturaDouble != null && alturaDouble > 0) {
                imc = (pesoDouble / (alturaDouble * alturaDouble)).toString()
            }
        }) {
            Text("Calcular IMC", color = MaterialTheme.colorScheme.onBackground)
        }

        Text(text = imc, fontSize = 18.sp, color = MaterialTheme.colorScheme.onBackground)

        Spacer(Modifier.height(20.dp))

        Button(onClick = { navController.navigate("home") }) {
            Text("Volver", color = MaterialTheme.colorScheme.onBackground)
        }
    }
}