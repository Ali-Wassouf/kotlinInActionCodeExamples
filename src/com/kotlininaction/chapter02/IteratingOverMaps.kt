package com.kotlininaction.chapter02

import java.util.*

val binaryReps = TreeMap<Char, String>();

fun main(){
    for(c in 'A'..'F'){
        binaryReps[c] = Integer.toBinaryString(c.toInt())
    }

   for((K, V) in binaryReps){
       println("$K => $V")
   }
}