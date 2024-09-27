package com.example.kotlinapplication.inlineclassesandtypealias

// TODO: Poniższy kod posiada buga: wartości są błędnie przypisywane
// Zaproponuj rozwiązanie, które zapobiegnie tego typu błędom
// Wykorzystaj do tego inline classes
@JvmInline
value class UserId(val value: String)
@JvmInline
value class OrderId(val value: String)

fun processOrder(userId: UserId, orderId: OrderId) {
    println("Processing order with ID ${orderId.value} for user ${userId.value}")
}

fun main() {
    val userId = UserId("user123")
    val orderId = OrderId("ORD-456")

    processOrder(userId, orderId)
}
