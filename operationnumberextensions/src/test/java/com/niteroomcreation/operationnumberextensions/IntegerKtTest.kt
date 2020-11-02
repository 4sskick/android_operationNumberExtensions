package com.niteroomcreation.operationnumberextensions

import org.junit.Test

import org.junit.Assert.*

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
        var factorNumbers = number.primeFactor()

        if (factorNumbers.size == 2
            && factorNumbers[0] == 3
            && factorNumbers[1] == 7
        )
            assert(true)
        else
            assert(false)
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
}