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
}