package com.example.kotlinapplication.scopefunctions

data class User(var id: Int, var name: String, var email: String)

fun getUserById(id: Int): User? {
    val userDatabase = mapOf(
        1 to User(1, "Alice", "alice@example.com"),
        2 to User(2, "Bob", "bob@example.com"),
        3 to User(3, "Charlie", "charlie@example.com")
    )

    return userDatabase[id]
}

// TODO: Wypisz id, imię i e-mail uźytkownika
//  wykorzystaj scope function w taki sposób, żeby nie powtarzać nazwy obiektu
private fun printUserDetails(user: User) {
   user.let {
        it.id
        it.name
        it.email
        println(it)
    }
}

// TODO: Zaktualizuj imię i e-mail użytkownika przypisując domyślne wartości
// Wykorzystaj scope function w taki sposób, żeby nie powtarzać nazwy obiektu
private fun updateUser(user: User) {
    user.apply {
        this.id = 0
        this.name = "baltion"
        this.email = "batlion@example.com"
    }
}

fun main() {
    val userId = 2

    // TODO: Zrób refactor kodu w taki sposób, żeby nie wykorzystywać zmiennej pośredniej user i instrukcji if-else
    // Wykorzystaj do tego scope functions
    getUserById(userId)?.let { user ->
        println("User found:")
        printUserDetails(user)

        updateUser(user)

        println("Updated user:")
        printUserDetails(user)
    } ?: run {
        println("User with ID $userId not found.")
    }
}


