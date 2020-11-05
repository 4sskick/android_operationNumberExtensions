package com.niteroomcreation.operationnumberextensions

import org.junit.Test

import org.junit.Assert.*
import java.util.*
import kotlin.math.absoluteValue

/**
 * Created by Septian Adi Wijaya on 02/11/20
 */
class IntegerKtTest {

    @Test
    fun isNegative() {
        var number = -99

        assert(number.isNegative())
    }

    @Test
    fun isPositive() {
        var number = 99

        assert(number.isPositive())
    }

    @Test
    fun isPrime() {
        var number = 14
        var anotherNumber = 23

        if (number.isPrime() == false && anotherNumber.isPrime() == true) {
            assert(true)
        } else
            assert(false)
    }

    @Test
    fun primeFactor() {
        var number = 21
        var result = number.primeFactor()

        assertEquals(
            "list number of factor prime $number",
            listOf(3, 7).toString(),
            result.toString()
        )
        assertEquals("size list of factor prime $number", 2, result.size)
    }

    @Test
    fun power() {
        var number = 3
        var powNumber = 2
        var powResult = number.power(powNumber)

        assert(powResult == 9)
    }

    @Test
    fun square() {
        var number = 4
        var result = number.square()

        assert(result == 16)
    }

    @Test
    fun cubic() {
        var number = 2
        var result = number.cubic()

        assert(result == 8)

    }

    @Test
    fun squareRoot() {
        var number = 121
        var result = number.squareRoot()

        assert(result == 11)
    }

    @Test
    fun absolute() {
        var number = -1233
        var result = number.absolute()

        assert(result == 1233)
    }

    @Test
    fun fibonacci() {

        var number = 6
        var result = number.fibonacci()

        assert(result == 8)

    }

    @Test
    fun fibonacciSeq() {
        var number = 2
        var results = number.fibonacciSeq()

        var anotherNumber = 6
        var anotherResult = anotherNumber.fibonacciSeq()

        assert(results.size == 2 && results[0] == 1 && results[1] == 1)
        assertArrayEquals(anotherResult.toIntArray(), listOf<Int>(1, 1, 2, 3, 5, 8).toIntArray())
    }
}