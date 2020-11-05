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

fun Long.primeFactor(): List<Long> {

    var numbers = ArrayList<Long>()
    var value: Long = this

    for (i in 2..value) {

        while (value % i == 0L) {
            if (!numbers.contains(i))
                numbers.add(i)

            value = value / i
        }
    }

    return numbers
}

/**
 * bilangan berpangkat
 * ex. 3L^2L = 9L
 */
fun Long.power(pow: Int): Long {

    var result = 1L

    repeat(pow) {
        result = result * this
    }

    return result
}

fun Long.square(): Long {
    return power(2)
}

fun Long.cubic(): Long {
    return power(3)
}

/**
 * akar pangkat 2 dari bilangan
 */
fun Long.squareRoot(): Long {

    var temp: Long
    var squareRoot = this / 2L


    do {
        temp = squareRoot
        squareRoot = (temp + (this / temp)) / 2
    } while ((temp - squareRoot) != 0L)

    return squareRoot
}