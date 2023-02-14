package com.kevin.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Scanner


fun main(){

    val scanner = Scanner(System.`in`)
    print("Ingresa los minutos que estuviste estacionado: ")
    var minutos : Int = scanner.nextInt()
    var costo : Double = minutosEstacionados(minutos)
    println("El costo total por $minutos minutos es de: $costo")
}

fun minutosEstacionados(minutos: Int): Double {
    var horas = minutos / 60
    var costo = 0.0

    costo = when {
        minutos < 60 -> 6.0 //fraccion
        horas >= 3 -> (horas * 8) + 6.0 //promocion
        else -> (horas * 10) + 6.0 //hora con fraccion
    }
    return costo
}