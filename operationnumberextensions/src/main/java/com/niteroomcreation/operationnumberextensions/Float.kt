package com.niteroomcreation.operationnumberextensions

/**
 * Created by Septian Adi Wijaya on 28/10/2020.
 * please be sure to add credential if you use people's code
 */

fun Float.isNegative(): Boolean {
    return (this < 0)
}

fun Float.isPositive(): Boolean {
    return (this > 0)
}

/**
 * bilangan berpangkat
 * ex. 3^2 = 9
 */
fun Float.power(pow: Int): Float {

    var value = 1f
    repeat(pow) {
        value = value * this
    }

    return value
}

fun Float.square(): Float {
    return power(2)
}

fun Float.cubic(): Float {
    return power(3)
}

fun Float.absolute(): Float {
    if (this < 0)
        return -this
    return this
}

/**
 * berapapun nilainya selama diatas .5 atau dibawah
 * akan di bulatkan kebawah
 */
fun Float.round(): Float {
    var value = (this + .5).toInt()

    return value.toFloat()
}

fun Float.inverse(): Float {
    return 1 / this
}