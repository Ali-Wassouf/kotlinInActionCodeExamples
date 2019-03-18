package com.kotlininaction.chapter02


import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ColorTest {

    @Test
    fun `should create a correct color`(){

        val blue = Color.BLUE

        Assertions.assertThat(blue.b).isEqualTo(255)
        Assertions.assertThat(blue.r).isEqualTo(0)
        Assertions.assertThat(blue.g).isEqualTo(0)

    }
}