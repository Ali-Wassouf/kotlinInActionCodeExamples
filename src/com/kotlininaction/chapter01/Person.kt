package com.kotlininaction.chapter01

data class Person(
    val name: String,
    val age: Int? = null
)

fun main() {
    val persons = listOf(
        Person("Ali", 25),
        Person("Alex", 30),
        Person("Pavel")
    )

    val oldestPerson = persons.maxBy { it.age ?: 0 }

    println(max(9, 10))
}

fun max(a: Int, b: Int) = if (a > b) a else b


