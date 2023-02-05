package com.example.hacker_earth

fun main() {
    var prueba: String = readln()
    var contadorz = 0
    var contadory = 0

    if (prueba.length > 20 ) {
        println("No")
    } else{

        prueba = prueba.lowercase()

        for (i in 0 until prueba.length ) {
            when (prueba[i]) {
                'z' -> ++contadorz
                'o' -> ++contadory
            }
        }

        if (contadorz * 2 == contadory) {
            println("Yes")
        } else {
            println("No")
        }

    }


}