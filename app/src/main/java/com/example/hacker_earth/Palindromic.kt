package com.example.hacker_earth

fun main() {
    val word: String = readLine()!!
    val pal: String = word.reversed()
    if (word == pal){
        println("Yes")
    } else {
        println("No")
    }

}