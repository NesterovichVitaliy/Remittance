package ru.netology

fun main() {
    val feePercent = 0.0075
    val minFee = 35
    val amount = 1000

    val feeAmount = amount * feePercent
    if (feeAmount < 35) println("Комиссия по платежу в рублях составила: $minFee ") else println("Комиссия по платежу в рублях составила: $feeAmount ")
}