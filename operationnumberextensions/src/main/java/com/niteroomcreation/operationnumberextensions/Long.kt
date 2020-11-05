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

/**
 * bilangan absolut atau mutlak
 * merupakan bilangan riil yang nilainya selalu positif
 *
 * ex. -3 nilai absolutnya 3
 */
fun Long.absolute(): Long {
    if (this < 0)
        return -this
    return this
}

/**
 * bilangan fibonacci didapat dari penjumlahan dari deret bilangan sebelumnya
 *
 * ex. deret fibo ke-6: 1 1 2 3 5 8
 * nilai 8 merupakan bilangan hasil fibonacci yg merupakan kembalian pada kelas method
 *
 * this one gonna return what is the value of index position fibonacci on what its set
 */
fun Long.fibonacci(): Long {

    var value = 1L
    var prevValue = 0L

    if (this == value || this == 2L)
        return value

    for (i in 3..this) {
        prevValue = value - prevValue
        value = value + prevValue
    }

    return value
}

fun Long.fibonacciSeq():List<Long>{

    var seq = ArrayList<Long>()
    var numberOfSeq = this

    var fibo = 1L
    var prevFibo = 0L

    if (numberOfSeq == 1L)
        return arrayListOf(1L)
    else if (numberOfSeq == 2L)
        return arrayListOf(1L, 1L)

    repeat(2) {
        seq.add(1L)
    }

    for (i in 3L..this) {
        prevFibo = fibo - prevFibo
        fibo = fibo + prevFibo

        seq.add(fibo)
    }

    return seq
}