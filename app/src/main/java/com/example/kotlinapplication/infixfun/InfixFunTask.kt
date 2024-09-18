package com.example.kotlinapplication.infixfun// TODO:
// 1. Stwórz funkcję, która będzie przyjmować jako parametr parę.
// Pierwszy argument z pary bedzie mówił, ile razy należy powtórzyć string,
// a drugi, jakiego separatora należy użyć.

infix fun String.repeatAndJoinWith(pair: Pair<Int, String>) : String {
    val (repetition, separator) = pair
    var nowaNitka = this
    for (i in 2..repetition) {
        nowaNitka = nowaNitka.plus(separator)
        nowaNitka = nowaNitka.plus(this)
    }


    return nowaNitka

}

fun main() {

    val result1 = "Hello" repeatAndJoinWith (3 to "-") // Powinno zwracać Hello-Hello-Hello
    val result2 = "Kotlin" repeatAndJoinWith (2 to " ")
    val result3 = "Hi" repeatAndJoinWith (5 to ", ")

    println(result1)
    println(result2)
    println(result3)
}
