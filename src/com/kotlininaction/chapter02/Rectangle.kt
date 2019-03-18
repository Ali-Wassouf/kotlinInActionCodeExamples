package com.kotlininaction.chapter02

import java.util.*

class Rectangle(val height: Int, val width: Int) {

    val isSquare: Boolean
        get() = height == width

}

fun createRandomRectangle() = Rectangle(Random().nextInt(), Random().nextInt())

fun main() {

    println(createRandomRectangle().isSquare)
}