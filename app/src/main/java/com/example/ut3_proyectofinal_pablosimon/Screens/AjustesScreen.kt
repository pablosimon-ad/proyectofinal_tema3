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
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun AjustesScreen(navController: NavController, isDarkMode: Boolean, onDarkModeChange: (Boolean) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Ajustes", fontSize = 24.sp,
            color = colorScheme.onBackground)
        Spacer(Modifier.height(20.dp))


        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Modo Oscuro",
                color = colorScheme.onBackground)
            Spacer(modifier = Modifier.width(10.dp))
            Switch(
                checked = isDarkMode,
                onCheckedChange = { onDarkModeChange(it) }
            )
        }

        Spacer(Modifier.height(20.dp))

        Button(onClick = { navController.navigate("home") }) { Text("Volver",
            color = colorScheme.onBackground) }
    }
}
