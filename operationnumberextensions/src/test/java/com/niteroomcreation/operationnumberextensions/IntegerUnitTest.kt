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

}