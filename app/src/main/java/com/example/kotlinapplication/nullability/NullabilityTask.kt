package com.example.kotlinapplication.nullability

data class Person(val name: String?, val age: Int?)

fun printPersonInfo(person: Person?) {
    if (person?.name == null){
        println("Unknown name")
    }
    else{
        println(person.name)
    }

    if (person?.age == null)
    {
        println("Age : Unknown")
    }
    else{
        if (person.age <= 18){
            println("${person.name} is underage")
        }
        else{
            println(person.age)
        }
    }

    //TODO:
    // 2. Sprawdź czy osoba jest dorosła, wypisz odpowiednią wiadomość na konsolę.
    // W przypadku, kiedy wiek jest nullem, wypisz "Age: Unknown"
}

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = Person(null, 17)
    val person3 = Person("Bob", null)

    printPersonInfo(person1)
    println()
    printPersonInfo(person2)
    println()
    printPersonInfo(person3)
}
