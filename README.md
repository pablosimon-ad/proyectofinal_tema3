Proyecto Final - App EuroFit

Descripción

Esta aplicación móvil desarrollada en Jetpack Compose permite a los usuarios visualizar diferentes ejercicios y calcular su Índice de Masa Corporal (IMC). La aplicación cuenta con una estructura bien organizada en diferentes pantallas y facilita la navegación entre ellas.

Jerarquía de Clases

El código está estructurado en paquetes para mejorar la organización y mantenimiento. A continuación, se describen los archivos principales:

📂 com.example.ut3_proyectofinal_pablosimon

Este es el paquete principal de la aplicación, donde se encuentran los archivos de las diferentes pantallas y configuraciones de la interfaz.

📁 Screens (Pantallas principales de la aplicación)

AjustesScreen.kt: Pantalla de configuración donde el usuario puede ajustar parámetros de la aplicación.

DetallePruebaScreen.kt - DetallePruebaScreen5.kt: Múltiples pantallas de detalles de ejercicios o pruebas.

HomeScreen.kt: Pantalla principal que da la bienvenida y muestra las opciones disponibles.

IMCScreen.kt: Pantalla dedicada al cálculo del Índice de Masa Corporal (IMC).

LoginScreen.kt: Pantalla de inicio de sesión para acceder a la aplicación.

MainActivity.kt: Actividad principal que sirve como punto de entrada a la aplicación.

PruebasScreen.kt: Pantalla que muestra un listado de ejercicios o pruebas disponibles.

📁 ui.theme

Contiene archivos relacionados con la personalización del tema de la aplicación, como colores y estilos.

📄 Navigation.kt

Archivo encargado de la gestión de la navegación entre las diferentes pantallas de la aplicación mediante Jetpack Compose.

Funcionalidades Principales

✅ Visualización de diferentes ejercicios o pruebas.
✅ Cálculo del Índice de Masa Corporal (IMC) en base a los datos ingresados por el usuario.
✅ Inicio de sesión para una experiencia personalizada.
✅ Configuración de preferencias dentro de la aplicación.

Tecnologías Utilizadas

Kotlin con Jetpack Compose para la interfaz de usuario.

Arquitectura basada en pantallas para una mejor organización del código.

Navegación en Compose para manejar las diferentes vistas de la aplicación.
