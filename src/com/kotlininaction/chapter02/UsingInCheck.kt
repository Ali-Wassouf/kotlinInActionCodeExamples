@file:Suppress("IMPLICIT_CAST_TO_ANY")

package com.kotlininaction.chapter02

fun isLetter(c: Char) = c in 'a'..'z'|| c in 'A'..'Z'

fun isDigit(c :Char) = c in '0'..'9'

fun recognize(c :Char) = when (c) {
    in 'a'..'z', in 'A'..'Z' -> print("a letter")
    in '0'..'9' -> print("a digit")
    else -> "I dont know"
}

fun main(){
    recognize('D')
}