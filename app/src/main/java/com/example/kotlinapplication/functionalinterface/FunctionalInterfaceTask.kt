package com.example.kotlinapplication.functionalinterface

// TODO:
// Zdefiniuj functional interface dla operacji arytmetycznych
// Funkcja powinna przyjmować dwie liczby jako parametry i zwracać wynik

fun interface Operation {
    fun params(x: Int, y : Int) : Int
}

fun performOperation(a: Int, b: Int, operation: Operation): Int{
    return operation.params(a,b)
}



// TODO:
// Zaimplementuj funkcję pomocniczą, która wywołuje funkcję z interfasu
//fun performOperation(a: Int, b: Int, operation: Operation) = 0

fun main() {
    // TODO: Odkomentuj
    val addition: Operation = Operation { x,y -> x + y }
    val multiplication: Operation = Operation {x,y -> x * y}
    val subtraction: Operation = Operation {x,y -> x - y}
    val division: Operation = Operation{x,y -> x/y}

    println("Addition: ${performOperation(5, 3, addition)}")
    println("Multiplication: ${performOperation(5, 3, multiplication)}")
    println("Subtraction: ${performOperation(5, 3, subtraction)}")

    println("Division: ${performOperation(10, 2, division)}")
}

// TODO*
// Przerób przykład w taki sposób, żeby wykorzystać operator fun
