package com.cittduocucpmontt.scan2katalog.ui.registro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun ComponerVistaRegistro(){
    Column(modifier = Modifier
        .background(Color.Red)
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Bienvenida()
    }
}

@Composable
fun Bienvenida(){
    Text(text = "Bienvenido", color = Color.White, fontSize = 45.sp)
}