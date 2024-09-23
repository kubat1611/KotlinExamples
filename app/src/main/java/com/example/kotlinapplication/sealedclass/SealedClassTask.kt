package com.example.kotlinapplication.sealedclass

// TODO: Stwórz klasę NetworkResponse z trzema podklasami reprezentującymi stany: sukces, błąd i ładowanie
// Podklasa sukces powinna zawierać przykładowe dane w postaci stringa i booleana
// Podklasa błąd powinna zawierać komunikat błędu i opcjonalnie jego kod
// Podklasa reprezentująca stan ładowanie nie zawiera parametrów

sealed class NetworkResponse {
    data class Success(val data: String, val isCached: Boolean) : NetworkResponse()
    data class Error(val errorMessage: String, val errorCode: Int? = null) : NetworkResponse()
    data object Loading : NetworkResponse()
}

// TODO: Zaimplementuj funkcję, która będzie przyjmować jako parametr klasę NetworkResponse
// W zależności od typu odpowiedzi, powinna zwrócić odpowiedni komunikat wraz z danymi zawartymi w odpowiedzi
fun handleResponse(response: NetworkResponse): String {
    return when (response) {
        is NetworkResponse.Success -> {
            val cacheStatus = if (response.isCached) "from cache" else "fresh data"
            "Success: ${response.data} ($cacheStatus)"
        }
        is NetworkResponse.Error -> {
            val errorCodeInfo = response.errorCode?.let { " Error code: $it" } ?: ""
            "Error: ${response.errorMessage}$errorCodeInfo"
        }
        is NetworkResponse.Loading -> "Loading..."
    }
}

fun main() {

    // TODO: Stwórz zmienne reprezentujące różne warianty odpowiedzi
    val successResponse = NetworkResponse.Success("Hello world", true)
    val errorResponseWithCode = NetworkResponse.Error("Internal server error", 505)
    val errorResponseWithoutCode = NetworkResponse.Error("Error")
    val loadingResponse = NetworkResponse.Loading


    println(handleResponse(successResponse))
    println(handleResponse(errorResponseWithCode))
    println(handleResponse(errorResponseWithoutCode))
    println(handleResponse(loadingResponse))
}
