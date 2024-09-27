package com.example.kotlinapplication.patternmatching

// TODO:
// Napisz funkcję, która za pomocą wyrażenia when będzie sprawdzać zawartość podanej listy i zwracać opisujący ją string
// Warianty do sprawdzenia:
// - pusta lista
// - wszystkie wartości w liście są dodatnie
// - wszystkie wartości w liście są ujemne
// - lista zawiera liczbę 0
// - lista zawiera zarówno waartości dodatnie jak i ujemne
private fun analyzeList(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "List is empty"
        numbers.all { it > 0 } -> "All numbers are positive"
        numbers.all {it < 0} -> "All numbers are negative"
        numbers.contains(0) -> "The list contains a 0"
        else -> "List contains both negative and positive numbers"


    }
}

fun main() {
    val numbers = listOf(-3, -5, 0, 4, 7)
    val numbers2 = listOf(1, 2, 3, 4)

    println(analyzeList(numbers))
    println(analyzeList(numbers2))
    println(analyzeList(listOf()))
}



