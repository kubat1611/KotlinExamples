package com.example.kotlinapplication.ranges

// TODO:
// 1. Stwórz funkcję, która będzie wypisywać parzyste liczby z podanego przedziału
fun printEvenNumbersInRange(start: Int, end: Int) {
    for (i in start..end){
        if (i % 2 == 0){
            println(i)
        }
    }
}

fun main() {
    val start = 10
    val end = 50
    printEvenNumbersInRange(start, end)
}
