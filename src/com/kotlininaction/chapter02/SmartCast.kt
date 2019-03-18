package com.kotlininaction.chapter02

import java.lang.IllegalArgumentException

interface Expr

class Num(val value: Double) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

class Mult(val left: Expr, val right: Expr) : Expr

class Sub(val left: Expr, val right: Expr) : Expr

class Div(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Double = when (e) {
    is Num -> {
        println("The Num is: ${e.value}")
        e.value
    }
    is Sum -> {
        val left = eval(e.left)
        val right = eval(e.right)
        println("The Sum is: $left + $right")
        left + right
    }
    is Mult -> {
        val left = eval(e.left)
        val right = eval(e.right)
        println("The Multiplication is: $left * $right")
        left * right
    }
    is Sub -> {
        val left = eval(e.left)
        val right = eval(e.right)
        println("The Subtraction is: $left - $right")
        left - right
    }
    is Div ->{
        val left = eval(e.left)
        val right = eval(e.right)
        println("The division is: $left / $right")
        left / right
    }
    else -> throw IllegalArgumentException("Unknown expression")
}


