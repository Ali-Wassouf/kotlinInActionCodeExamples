package com.kotlininaction.chapter02

import java.lang.Exception

fun main(args: Array<String>) {
    /* println("Hello, ${if (args.isNotEmpty()) args[0] else "Kotlin!"}")
   val person = Person("Ali", false)
   println("${person.name} is ${if (person.isMarried) "married" else "not married"}") */

    println(Color.VIOLET.rgb())

    fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO

        else -> throw Exception("Dirty Color")
    }


    println(mix(Color.YELLOW, Color.BLUE))
}
