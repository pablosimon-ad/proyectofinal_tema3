package com.example.ut3_proyectofinal_pablosimon.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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

    Column(
        modifier = Modifier.fillMaxSize().padding(50.dp).verticalScroll(rememberScrollState()),
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

        if ("Abdominales 30”".contains(searchQuery, ignoreCase = true) || searchQuery.isEmpty()) {
            PruebaCard("Abdominales 30”", R.drawable.abdominales) { navController.navigate("detalle_prueba") }
        }
        if ("Flexibilidad".contains(searchQuery, ignoreCase = true) || searchQuery.isEmpty()) {
            PruebaCard("Flexibilidad", R.drawable.flexibilidad) { navController.navigate("detalle_prueba2") }
        }
        if ("Test Cooper".contains(searchQuery, ignoreCase = true) || searchQuery.isEmpty()) {
            PruebaCard("Test Cooper", R.drawable.test_cooper) { navController.navigate("detalle_prueba3") }
        }
        if ("Velocidad 5x10".contains(searchQuery, ignoreCase = true) || searchQuery.isEmpty()) {
            PruebaCard("Velocidad 5x10", R.drawable.velocidad) { navController.navigate("detalle_prueba4") }
        }
        if ("Lanzamiento Balón 2 KG".contains(searchQuery, ignoreCase = true) || searchQuery.isEmpty()) {
            PruebaCard("Lanzamiento Balón 2 KG", R.drawable.lanzamiento_balon) { navController.navigate("detalle_prueba5") }
        }

        Spacer(Modifier.height(20.dp))
        Button(onClick = { navController.navigate("home") }) {
            Text("Volver")
        }
    }
}

@Composable
fun PruebaCard(nombre: String, imagen: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp).clickable { onClick() },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(imagen), contentDescription = nombre, modifier = Modifier.size(64.dp))
            Spacer(Modifier.width(16.dp))
            Text(nombre, fontSize = 18.sp, color = MaterialTheme.colorScheme.onBackground)
        }
    }
}
