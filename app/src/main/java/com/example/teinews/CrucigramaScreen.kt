package com.example.teinews

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Word(val text: String, val row: Int, val col: Int, val horizontal: Boolean, val number: Int)

@Composable
fun CrucigramaScreen() {
    val backgroundColor = colorResource(id = R.color.background_light)
    val cardColor = colorResource(id = R.color.background_card)
    val primaryColor = colorResource(id = R.color.primary_blue)
    val textPrimary = colorResource(id = R.color.text_primary)
    val textSecondary = colorResource(id = R.color.text_secondary)

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        color = backgroundColor
    ) {
        CrucigramaBody(
            backgroundColor = backgroundColor,
            cardColor = cardColor,
            primaryColor = primaryColor,
            textPrimary = textPrimary,
            textSecondary = textSecondary
        )
    }
}

@Composable
fun CrucigramaBody(
    backgroundColor: Color,
    cardColor: Color,
    primaryColor: Color,
    textPrimary: Color,
    textSecondary: Color
) {
    val rows = 16
    val cols = 16

    val words = listOf(
        Word("TABLET", 0, 2, false, 1),
        Word("NUBE", 0, 5, false, 2),
        Word("RAM", 2, 8, false, 4),
        Word("ROUTER", 0, 10, false, 5),
        Word("BOTON", 4, 0, false, 7),
        Word("WIFI", 1, 13, false, 9),
        Word("ALTAVOZ", 2, 6, false, 12),
        Word("PIXEL", 4, 15, false, 14),
        Word("CABLE", 2, 0, true, 3),
        Word("USB", 6, 3, true, 6),
        Word("RATON", 8, 7, true, 8),
        Word("TECLADO", 10, 2, true, 10),
        Word("GIGABYTE", 12, 4, true, 11),
        Word("APP", 14, 7, true, 13),
        Word("LED", 15, 10, true, 15)
    )

    val correctGrid = remember { Array(rows) { Array(cols) { "" } } }
    val playable = remember { mutableSetOf<Pair<Int, Int>>() }
    val numbers = remember { mutableMapOf<Pair<Int, Int>, Int>() }

    // Inicialización inmediata del crucigrama
    remember {
        for (word in words) {
            val w = word.text.uppercase()
            for (i in w.indices) {
                val r = if (word.horizontal) word.row else word.row + i
                val c = if (word.horizontal) word.col + i else word.col
                if (r in 0 until rows && c in 0 until cols) {
                    correctGrid[r][c] = w[i].toString()
                    playable.add(Pair(r, c))
                }
            }
            numbers[Pair(word.row, word.col)] = word.number
        }
        true
    }

    val userGrid = remember {
        List(rows) { MutableList(cols) { mutableStateOf("") } }
    }

    var showResult by remember { mutableStateOf(false) }
    var allCorrect by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Crucigrama Tecnológico",
            color = textPrimary,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(12.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            for (r in 0 until rows) {
                Row {
                    for (c in 0 until cols) {
                        val coord = Pair(r, c)
                        val isPlayable = playable.contains(coord)
                        val expected = correctGrid[r][c]
                        val userLetter = userGrid[r][c].value

                        val bgColor by animateColorAsState(
                            when {
                                !isPlayable -> Color(0xFFE0E0E0) // gris no jugable
                                showResult -> {
                                    if (userLetter.uppercase() == expected) Color(0xFFBBDEFB) // azul claro si correcto
                                    else if (userLetter.isNotBlank()) Color(0xFFFFE0B2) // naranja si incorrecto
                                    else Color.White
                                }
                                else -> if (isPlayable) Color.White else Color(0xFFE0E0E0)
                            }
                        )

                        Box(
                            modifier = Modifier
                                .size(26.dp)
                                .background(bgColor)
                                .border(0.5.dp, Color.Gray),
                            contentAlignment = Alignment.Center
                        ) {
                            numbers[coord]?.let {
                                Text(
                                    text = it.toString(),
                                    fontSize = 8.sp,
                                    color = textSecondary,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .padding(2.dp)
                                )
                            }

                            if (isPlayable) {
                                BasicTextField(
                                    value = userLetter,
                                    onValueChange = {
                                        if (it.length <= 1) userGrid[r][c].value = it.uppercase()
                                    },
                                    textStyle = TextStyle(
                                        color = textPrimary,
                                        fontSize = 14.sp,
                                        textAlign = TextAlign.Center
                                    ),
                                    singleLine = true,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(10.dp))

        Row {
            Button(
                onClick = {
                    showResult = true
                    allCorrect = true
                    for (r in 0 until rows) {
                        for (c in 0 until cols) {
                            val coord = Pair(r, c)
                            if (playable.contains(coord)) {
                                if (userGrid[r][c].value.uppercase() != correctGrid[r][c]) {
                                    allCorrect = false
                                }
                            }
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = primaryColor)
            ) {
                Text("Comprobar", color = Color.White)
            }

            Spacer(Modifier.width(8.dp))

            Button(
                onClick = {
                    showResult = false
                    allCorrect = false
                    for (r in 0 until rows) {
                        for (c in 0 until cols) {
                            userGrid[r][c].value = ""
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = primaryColor)
            ) {
                Text("Limpiar", color = Color.White)
            }
        }

        Spacer(Modifier.height(12.dp))

        if (showResult) {
            Text(
                if (allCorrect) "¡Correcto!" else "Hay errores, revisa tus respuestas.",
                color = if (allCorrect) Color(0xFF1976D2) else Color(0xFFFF6F00),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(Modifier.height(16.dp))

        Text("Pistas Verticales", color = primaryColor, fontWeight = FontWeight.Bold)
        val pistasVerticales = listOf(
            "1. Dispositivo portátil con pantalla táctil.",
            "2. Servicio que permite almacenar datos en internet.",
            "4. Memoria de acceso aleatorio.",
            "5. Dispositivo que distribuye señal de red.",
            "7. Elemento que se presiona para ejecutar una acción.",
            "9. Tecnología que habilita la conexión inalámbrica.",
            "12. Dispositivo que emite sonido.",
            "14. Unidad mínima de una imagen digital."
        )
        pistasVerticales.forEach {
            Text(it, color = textSecondary, fontSize = 14.sp)
        }

        Spacer(Modifier.height(8.dp))

        Text("Pistas Horizontales", color = primaryColor, fontWeight = FontWeight.Bold)
        val pistasHorizontales = listOf(
            "3. Medio físico para transmitir datos.",
            "6. Conector estándar para periféricos.",
            "8. Dispositivo apuntador usado en computadoras.",
            "10. Dispositivo de entrada con teclas.",
            "11. Unidad de almacenamiento digital.",
            "13. Programa instalado en un dispositivo.",
            "15. Tipo de luz utilizada en pantallas."
        )
        pistasHorizontales.forEach {
            Text(it, color = textSecondary, fontSize = 14.sp)
        }
    }
}
