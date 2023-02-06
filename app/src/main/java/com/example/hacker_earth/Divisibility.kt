package com.example.hacker_earth

fun main() {
    val lenght = readLine()!!.toInt()
    val valores = readLine()!!
    val delim = " "

    val prueba = valores.split(delim).toTypedArray()

   val array = intArrayOf( lenght)

    //{i : Int -> i.inc()}
    prueba.forEach {
        println(it)
    }
    //array = readLine()!!
    println(prueba)




}

