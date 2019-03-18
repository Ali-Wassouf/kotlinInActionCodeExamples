package com.kotlininaction.chapter02

import java.lang.IllegalArgumentException

fun checkPercentage(number: Int) =
    if (number in 0..100) number
    else throw IllegalArgumentException("percentage must be between 0 and 100: $number ")


fun main() {
    println(if(9 in 0..100) "it's alive" else "it's not alive")
}