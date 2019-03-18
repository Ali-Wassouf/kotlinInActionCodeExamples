package com.kotlininaction.chapter02

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class EvalTesting {

    @Test
    fun `should evaluate the expression correctly`() {

        val evaluated = eval(Sum(Sum(Num(1.0), Num(2.0)), Num(4.0)))

        Assertions.assertThat(evaluated).isEqualTo(7)
    }

    @Test
    fun `should evaluate the multiplication expression correctly`() {

        val evaluated = eval(Sum(Mult(Num(2.0), Num(2.0)), Num(4.0)))

        Assertions.assertThat(evaluated).isEqualTo(8)
    }


    @Test
    fun `should evaluate the subtraction correctly`(){
        val evaluated = eval(Sub(Num(3.0), Num(2.0)))

        Assertions.assertThat(evaluated).isEqualTo(1)
    }

    @Test
    fun `should evaluate the division correctly`(){
        val evaluated = eval(Div(Num(3.0), Num(2.0)))

        Assertions.assertThat(evaluated).isEqualTo(1.5)
    }

}