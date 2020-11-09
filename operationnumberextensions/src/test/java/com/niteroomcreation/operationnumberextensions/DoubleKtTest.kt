package com.niteroomcreation.operationnumberextensions

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Septian Adi Wijaya on 09/11/20
 */
class DoubleKtTest {

    val DELTA = 1e-1

    @Test
    fun isNegative() {
        var number = 2.0

        assertEquals("the number ${number} should be a negative", false, number.isNegative())
    }

    @Test
    fun isPositive() {
        var number = 34.5

        assertEquals("the number ${number} should be a positive", true, number.isPositive())
    }

    @Test
    fun power() {
        var number = 3.1
        var powNumber = 2

        assertEquals(9.61, number.power(powNumber), DELTA)
    }
}