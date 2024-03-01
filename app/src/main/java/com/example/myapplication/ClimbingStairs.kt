package com.example.myapplication

fun climbStairs(numberOfStairs: Int): Int {
    if (numberOfStairs <= 0) return 0
    val stairs = IntArray(numberOfStairs + 1)
    stairs[0] = 1
    stairs[1] = 1
    for (i in 2..numberOfStairs) {
        stairs[i] = stairs[i - 1] + stairs[i - 2]
    }
    return stairs[numberOfStairs]
}