package com.niteroomcreation.operationnumberextensions

/**
 * Created by Septian Adi Wijaya on 28/10/2020.
 * please be sure to add credential if you use people's code
 */

fun Double.isNegative(): Boolean {
    return (this < 0)
}

fun Double.isPositive(): Boolean {
    return (this > 0)
}

/**
 * bilangan berpangkat
 * ex. 3^2 = 9
 */
fun Double.power(pow: Int): Double {

    var value = 1.0
    repeat(pow) {
        value = value * this
    }

    return value
}

fun Double.square(): Double {
    return power(2)
}

fun Double.cubic(): Double {
    return power(3)
}

fun Double.absolute(): Double {
    if (this < 0)
        return -this
    return this
}

/**
 * berapapun nilainya selama diatas .5 atau dibawah
 * akan di bulatkan kebawah
 */
fun Double.round(): Double {
    var value = (this + .5).toInt()

    return value.toDouble()
}