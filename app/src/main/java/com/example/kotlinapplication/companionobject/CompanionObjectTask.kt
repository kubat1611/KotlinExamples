package com.example.kotlinapplication.companionobject

// TODO:
// 1. Każdy użytkownik powinien mieć unikalne ID, rozpoczynjące się od 1000 i zwiększające się o 1 z każdym nowym użytkownikiem
// 2. Klasa ta powinna też liczyć stworzonych użytkowników i przechowywać ich liczbę w zmiennej

// 3. Powinna być wystawiona metoda, która będzie tworzyć użytkownika i go zwracać
// 4. Klasa użytkownika powinna mieć prywatny konstruktor, tak, żeby nowego użytkownika dało się stworzyć tylko za pomocą tej metody
// 5. Funkcje do tworzenia użytkowników i pobierania ich aktualnej liczby, powinny być wewnątrz companion object

    private class User(ID: Int) {


        companion object{
            private var ID:Int = 999
            private var userCount:Int = 0

            fun createUser(): User{
                userCount +=1
                ID +=1
                return User(ID)
            }

            fun getUserCount() :Int{
                return userCount
            }

        }
    }


fun main() {
    // TODO: odkomentuj
    val user1 = User.createUser()
    println(user1)

    val user2 = User.createUser()
    println(user2)

    val user3 = User.createUser()
    println(user3)

    println("Total users created: ${User.getUserCount()}")
}
