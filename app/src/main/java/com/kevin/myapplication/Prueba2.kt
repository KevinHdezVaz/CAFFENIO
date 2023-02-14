package com.kevin.myapplication

import java.util.Scanner
/**
 * Realiza una función que reciba un texto que va ser impreso en una impresora de tickets, pero la impresora solo
imprime 20 caracteres por línea,
 * */

fun main( ) {
    val scanner = Scanner(System.`in`)
    print("Ingrese el texto a imprimir: ")
    val texto = scanner.nextLine()
    val lineas = divideTexto(texto)
    lineas.forEach {
        println(it)
    }
}
fun divideTexto(texto: String): List<String> {
    //almacenara cada linea
    val lineas = mutableListOf<String>()
    //linea actual
    var linea = ""

    //texto se divide a palabras usando "split"
    texto.split(" ").forEach { palabra ->
        if (linea.length + palabra.length + 1 > 20) {
            lineas.add(linea)
            linea = ""
        }
        //agrega la palabra actual a la linea actual, seguida de un espacio
        linea += "$palabra "
    }
    //despues de iterar, se agregala ultima linea a la lista "lineas"
    lineas.add(linea)
    return lineas
}
