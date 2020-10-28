package com.niteroomcreation.operationnumberextensions

import org.junit.Test

/**
 * Created by Septian Adi Wijaya on 28/10/2020.
 * please be sure to add credential if you use people's code
 */

class IntegerUnitTest {

    @Test
    fun isNegativeIsCorrect() {
        var number = -99

        assert(number.isNegative())
    }

    @Test
    fun isPositiveIsCorrect() {
        var number = 99

        assert(number.isPositive())
    }

    @Test
    fun isPrimeCorrect() {
        var number = 14
        var anotherNumber = 23

        if (number.isPrime() == false && anotherNumber.isPrime() == true) {
            assert(true)
        } else
            assert(false)
    }

    @Test
    fun primeFactorisCorrect() {
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
}