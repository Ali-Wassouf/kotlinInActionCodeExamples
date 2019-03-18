package com.kotlininaction.chapter02

val list = listOf("Ali", "Issa", "Wassouf")

fun main(){
    for((index, element) in list.withIndex()){
        println("$element is at $index")
    }
}