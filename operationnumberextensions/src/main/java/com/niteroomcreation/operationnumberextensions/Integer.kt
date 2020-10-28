package com.niteroomcreation.operationnumberextensions

/**
 * Created by Septian Adi Wijaya on 28/10/2020.
 * please be sure to add credential if you use people's code
 */

fun Int.isNegative(): Boolean {
    return (this < 0)
}

fun Int.isPositive(): Boolean {
    return (this > 0)
}

/**
 * prime number a number which divider
 * only able to divide by 1 & their number it self, 2 is exceptional & can't be a negative
 *
 * ex. 4 not a prime: divider
 */
fun Int.isPrimeNumber(): Boolean {

    //would be
    return !(this <= 1 || this % 2 == 0)

}

