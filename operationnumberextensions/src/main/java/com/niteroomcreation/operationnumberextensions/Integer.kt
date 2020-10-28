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
 * bilangan yang hanya mempunyai 2 faktor,
 * yaitu bilangan 1 dan bilangan itu sendiri & nilainya selalu positif
 *
 * ex. 4 bukan bilangan prima: faktor pembagi 1,2,4
 */
fun Int.isPrime(): Boolean {

    if (this <= 1 || this % 2 == 0)
        return false

    for (i in 3..this / 2 step 2) {
        if (this % i == 0)
            return false
    }

    return true
}

fun Int.primeFactor(): List<Int> {

    var factorNumbers = ArrayList<Int>()
    var value: Int = this

    for (i in 2..value) {

        while (value % i === 0) {
            if (!factorNumbers.contains(i))
                factorNumbers.add(i)
            value = value / i
        }
    }

    return factorNumbers
}



