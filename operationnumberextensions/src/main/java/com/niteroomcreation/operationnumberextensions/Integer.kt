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

/**
 * bilangan berpangkat
 * ex. 3^2 = 9
 */
fun Int.power(pow: Int): Int {

    var value = 1
    repeat(pow) {
        value = value * this
    }

    return value
}

fun Int.square(): Int {
    return power(2)
}

fun Int.cubic(): Int {
    return power(3)
}

/**
 * akar pangkat 2 dari bilangan
 */
fun Int.squareRoot(): Int {

    var temp: Int
    var squareRoot = this / 2

    do {
        temp = squareRoot
        squareRoot = (temp + (this / temp)) / 2
    } while ((temp - squareRoot) != 0)

    return squareRoot
}

/**
 * bilangan absolut atau mutlak
 * merupakan bilangan riil yang nilainya selalu positif
 *
 * ex. -3 nilai absolutnya 3
 */
fun Int.absolute(): Int {
    if (this < 0)
        return -this
    return this
}

/**
 * bilangan fibonacci didapat dari penjumlahan dari deret bilangan sebelumnya
 *
 * ex. deret fibo ke-6: 1 1 2 3 5 8
 * nilai 8 merupakan bilangan hasil fibonacci
 */
fun Int.fibonacci(): Int {

    var value: Int = 1
    var prevValue: Int = 0

    if (this == 1 || this == 2)
        return 1

    for (i in 3..this) {
        prevValue = value - prevValue
        value = value + prevValue
    }

    return value

}