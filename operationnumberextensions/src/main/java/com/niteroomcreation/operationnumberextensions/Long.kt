package com.niteroomcreation.operationnumberextensions

/**
 * Created by Septian Adi Wijaya on 28/10/2020.
 * please be sure to add credential if you use people's code
 */

fun Long.isNegative(): Boolean {
    return (this < 0L)
}

fun Long.isPositive(): Boolean {
    return (this > 0L)
}

