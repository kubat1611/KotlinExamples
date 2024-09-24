package com.example.kotlinapplication.typechecks

import com.example.kotlinapplication.extensions.capitalizeWords
import kotlin.math.roundToInt

fun main() {
    val mixedList: List<Any> = listOf(1, "hello", false, 3.14, 2, "world", 7.5, true)

    val resultList = mutableListOf<Any>()


    fun typeChecker () {
        for (i in mixedList){
            if (i is Int ) {
                val modifiedInt = i * 2
                resultList += modifiedInt
            } else if (i is String){
                val modifiedStr = i.capitalizeWords()
                resultList += modifiedStr
            } else if (i is Double) {
                val modifiedDouble = i.roundToInt()
                resultList += modifiedDouble
            } else if (i is Boolean) {
                resultList += i
            }
        }

    }

    typeChecker()
    // TODO:
    // 1. Sprawdź typ elementu w liście.
    // Jeśli jest to Int, pomnóż go przez 2
    // Jeśli jest to String, zmień jego litery na wielkie
    // Jeśli jest to Double, zaokrąglij jego wartość do Inta
    // Jeśli jest to Boolean, nie rób nic

    println("Original List: $mixedList")
    println("Resulting List after operations: $resultList")
}
