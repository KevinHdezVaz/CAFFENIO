package com.kevin.myapplication

import java.util.Scanner
/**
 * regresa true si es superior o igual,
 * false si es inferior la versión actual.
 *
 * */


fun main() {
    val scan = Scanner(System.`in`)
    println("Ingrese la versión actual:")
    val versionActual = scan.nextLine()
    println("Ingrese la segunda version:")
    val versionSegunda = scan.nextLine()

    val result = versionActualSegunda(versionActual, versionSegunda)
    if (result) {
        println(result)
    } else {
        println(result)

    }
}

fun versionActualSegunda(versionActual: String, versionSegunda: String): Boolean {
    val verActual = versionActual.split(".")
    val verSegunda = versionSegunda.split(".")

    for (i in verActual.indices) {
        val actual = verActual[i].toInt()
        val comparar = verSegunda[i].toInt()

        if (actual < comparar) {
            return false
        } else if (actual > comparar) {
            return true
        }
    }
    return true
}