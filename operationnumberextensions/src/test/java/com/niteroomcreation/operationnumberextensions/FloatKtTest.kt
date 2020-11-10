package com.niteroomcreation.operationnumberextensions

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Septian Adi Wijaya on 10/11/20
 */
class FloatKtTest {

    private val DELTA = 1e-3f

    @Test
    fun isNegative() {
        var number = -2f

        assertEquals("the $number should be a negative", true, number.isNegative())
    }

    @Test
    fun isPositive() {
        var number = 3.5f
        var anotherNumber = -6.8f

        assertEquals("the $number should be a positive", true, number.isPositive())
        assertEquals("the $number should be a non positive", false, anotherNumber.isPositive())
    }

    @Test
    fun power() {
        var number = 4.6f
        var anotherNumber = -4.6f

        var powNumber = 4
        var anotherPowNumber = 3

        assertEquals(447.745f, number.power(powNumber), DELTA)
        assertEquals(-97.336f, anotherNumber.power(anotherPowNumber), DELTA)
    }

    @Test
    fun square() {
        var number = 5f

        assertEquals("the $number^2", 25f, number.square())
    }

    @Test
    fun cubic() {
        var number = 6.0f

        assertEquals("the $number^3", 216f, number.cubic())
    }

    @Test
    fun absolute() {
        var number = -4f

        assertEquals("the $number should always be a positive", 4f, number.absolute())
    }

    @Test
    fun round() {
        var number = 4.7f
        var anotherNumber = 7.2f

        assertEquals(5.0f, number.round(), DELTA)
        assertEquals(7.0f, anotherNumber.round(), DELTA)
    }

    @Test
    fun inverse() {
        var number = 3.5f
        var anotherNumber = -4.4f

        assertEquals(0.285f, number.inverse(), DELTA)
        assertEquals(-0.227f, anotherNumber.inverse(), DELTA)
    }
}