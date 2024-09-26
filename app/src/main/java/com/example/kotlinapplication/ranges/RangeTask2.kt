package com.example.kotlinapplication.ranges

fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true  
}

fun printPrimesInRange(start: Int, end: Int) {
    if (start > end) {
        println("Invalid range: start should be less than or equal to end.")
        return
    }

    println("Prime numbers between $start and $end:")
    for (num in start..end) {
        if (isPrime(num)) {
            print("$num ")
        }
    }
    println()
}

fun main() {
    val start = 10
    val end = 50
    printPrimesInRange(start, end)
}
