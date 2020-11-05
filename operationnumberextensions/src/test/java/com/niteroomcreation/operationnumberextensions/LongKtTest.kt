package com.niteroomcreation.operationnumberextensions

import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Test

/**
 * Created by Septian Adi Wijaya on 05/11/20
 */
class LongKtTest {

    @Test
    fun isNegative() {
        var number = -43L
        assert(number.isNegative())
    }

    @Test
    fun isPositive() {
        var number = 23L
        assert(number.isPositive())
    }

    @Test
    fun isPrime() {
        var number = 4L
        var anotherNumber = 23L

        assertEquals("$number isn't prime", false, number.isPrime())
        assertEquals("$anotherNumber is prime", true, anotherNumber.isPrime())
    }

    @Test
    fun primeFactor() {
        var number = 23L
        var result = number.primeFactor()

        assertEquals(
            "list number of factor prime $number",
            listOf(23L).toString(),
            result.toString()
        )
        assertEquals("size list of factor prime ${result.size}", 1, result.size)
    }

    @Test
    fun power() {
        var number = 3L
        var powNumber = 4
        var result: Long = number.power(powNumber)

        assertThat(result, instanceOf(Long::class.java))
        assertEquals("$number ^ $powNumber should be", 81, result)
    }

    @Test
    fun square() {
        var number = 6L
        var result = number.square()

        assertEquals("on square for $number", 36L, result)
    }

    @Test
    fun cubic() {
        var number = 4L
        var result = number.cubic()

        assertEquals("on cubic for $number", 64L, result)
    }

    @Test
    fun squareRoot() {
        var number = 144L
        var result = number.squareRoot()

        assertEquals("square root of $number", 12, result)
    }
}