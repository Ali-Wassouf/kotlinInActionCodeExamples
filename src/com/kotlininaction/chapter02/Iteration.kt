package com.kotlininaction.chapter02

fun fizBuzz( i: Int) = when {
    (i % 2 == 0) -> "FizBuzz 2"
    (i % 3 == 0) -> "FizBuzz 3"
    (i % 4 == 0) -> "FizBuzz 4"
    else -> "Fizbuzz Unknown"
}

fun main(){
    for (i in 100 downTo 1 step 15)
        println(fizBuzz(i))
}