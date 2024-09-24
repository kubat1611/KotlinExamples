package com.example.kotlinapplication.constructors

class Book(val title: String, val author: String, val publicationYear: Int, val pages: Int) {

    constructor(title: String, author: String) : this(title, author, 0, 0) {

    }

    constructor(title: String, author: String, pages: Int) : this(title, author, 0, pages) {

    }

    

    // TODO:
    // 1. Zdefiniuj secondary constructor, który będzie przyjmował tytuł i autora jako parametry.
    // Pozostałym parametrom nadaj domyślne wartości.
    // 2. Zdefiniuj secondary constructor, który będzie przyjmował tytuł, autora i liczbę stron jako parametry

    fun bookSummary(): String {
        return """
            Title: $title
            Author: $author
            Published: $publicationYear
            Pages: $pages
        """.trimIndent()
    }
}

fun main() {
    val book1 = Book("1984", "George Orwell", 1949, 328)
    val book2 = Book("The Catcher in the Rye", "J.D. Salinger")
    val book3 = Book("Brave New World", "Aldous Huxley", 268)

    println(book1.bookSummary())
    println(book2.bookSummary())
    println(book3.bookSummary())
}
