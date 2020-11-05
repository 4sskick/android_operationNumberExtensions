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

/**
 * bilangan yang hanya mempunyai 2 faktor,
 * yaitu bilangan 1 dan bilangan itu sendiri & nilainya selalu positif
 *
 * ex. 4 bukan bilangan prima: faktor pembagi 1,2,4
 */
fun Long.isPrime(): Boolean {

    if (this < 1L || this % 2L == 0L)
        return false

    for (i in 3L..this / 2L step 2L) {
        if (this % i == 0L)
            return false
    }

    return true
}

