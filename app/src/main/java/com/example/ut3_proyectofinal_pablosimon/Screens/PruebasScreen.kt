package com.example.ut3_proyectofinal_pablosimon.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ut3_proyectofinal_pablosimon.R

@Composable
fun PruebasScreen(navController: NavController) {
    var searchQuery by remember { mutableStateOf("") }

    val pruebas = listOf(
        Triple("Abdominales 30”", "detalle_prueba", R.drawable.abdominales),
        Triple("Flexibilidad", "detalle_prueba2", R.drawable.flexibilidad),
        Triple("Test Cooper", "detalle_prueba3", R.drawable.test_cooper),
        Triple("Velocidad 5x10", "detalle_prueba4", R.drawable.velocidad),
        Triple("Lanzamiento Balón 2 KG", "detalle_prueba5", R.drawable.lanzamiento_balon)
    )

    Column(
        modifier = Modifier.fillMaxSize().padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Lista de Pruebas", fontSize = 24.sp, color = MaterialTheme.colorScheme.onBackground)
        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Buscar prueba") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(20.dp))

        pruebas.filter { it.first.contains(searchQuery, ignoreCase = true) || searchQuery.isEmpty() }
            .forEach { (nombre, ruta, imagen) ->
                Card(
                    modifier = Modifier.fillMaxWidth().padding(8.dp).clickable { navController.navigate(ruta) },
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                        Image(painter = painterResource(imagen), contentDescription = nombre, modifier = Modifier.size(64.dp))
                        Spacer(Modifier.width(16.dp))
                        Text(nombre, fontSize = 18.sp, color = MaterialTheme.colorScheme.onBackground)
                    }
                }
            }

        Spacer(Modifier.height(20.dp))
        Button(onClick = { navController.navigate("home") }) {
            Text("Volver")
        }
    }
}
