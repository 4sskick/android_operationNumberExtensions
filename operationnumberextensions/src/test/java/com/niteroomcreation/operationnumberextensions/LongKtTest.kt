package com.niteroomcreation.operationnumberextensions

import org.junit.Test

import org.junit.Assert.*

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
        var number = 3
        var powNumber = 4
        var result = number.power(powNumber)

        assertEquals("$number ^ $powNumber should be",81, result)
    }
}