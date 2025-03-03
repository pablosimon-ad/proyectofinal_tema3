package com.example.ut3_proyectofinal_pablosimon

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ut3_proyectofinal_pablosimon.Screens.AjustesScreen
import com.example.ut3_proyectofinal_pablosimon.Screens.DetallePruebaScreen
import com.example.ut3_proyectofinal_pablosimon.Screens.DetallePruebaScreen2
import com.example.ut3_proyectofinal_pablosimon.Screens.DetallePruebaScreen3
import com.example.ut3_proyectofinal_pablosimon.Screens.DetallePruebaScreen4
import com.example.ut3_proyectofinal_pablosimon.Screens.DetallePruebaScreen5
import com.example.ut3_proyectofinal_pablosimon.Screens.HomeScreen
import com.example.ut3_proyectofinal_pablosimon.Screens.IMCScreen
import com.example.ut3_proyectofinal_pablosimon.Screens.LoginScreen
import com.example.ut3_proyectofinal_pablosimon.Screens.PruebasScreen

@Composable
fun AppNavegacion(navController: NavHostController,
                  isDarkMode: Boolean,
                  onDarkModeChange: (Boolean) -> Unit) {

    NavHost(navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("pruebas") { PruebasScreen(navController) }
        composable("detalle_prueba") { DetallePruebaScreen(navController) }
        composable("detalle_prueba2") { DetallePruebaScreen2(navController) }
        composable("detalle_prueba3") { DetallePruebaScreen3(navController) }
        composable("detalle_prueba4") { DetallePruebaScreen4(navController) }
        composable("detalle_prueba5") { DetallePruebaScreen5(navController) }
        composable("imc") { IMCScreen(navController) }
        composable("ajustes") { AjustesScreen(navController, isDarkMode, onDarkModeChange) }

    }
}