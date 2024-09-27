package com.example.kotlinapplication.inlineclassesandtypealias

typealias pair = (Int, Int) -> Int

// TODO: Wykorzystaj typealias dla parametru sumFunction
fun calculateSum(x: Int, y: Int, sumFunction : pair): Int {
    return sumFunction(x, y)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}


fun main() {
    val sumFunction: pair = { a, b -> a + b }

    val result = calculateSum(10, 20, sumFunction)
    println("The sum is: $result")

    val result2 = calculateSum(5, 15, ::sum)
    println("The sum is: $result2")
}
