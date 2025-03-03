package com.example.ut3_proyectofinal_pablosimon.Screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import com.example.ut3_proyectofinal_pablosimon.AppNavegacion
import com.example.ut3_proyectofinal_pablosimon.ui.theme.UT3_ProyectoFinal_PabloSimonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var isDarkMode by remember { mutableStateOf(false) }

            UT3_ProyectoFinal_PabloSimonTheme(darkTheme = isDarkMode) {
                val navController = rememberNavController()
                AppNavegacion(navController, isDarkMode) { isDarkMode = it }
            }
        }
    }
}
