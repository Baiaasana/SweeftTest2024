package com.example.myapplication

fun main() {

    // 1
    val numbers = intArrayOf(1, 1, 0, -2, 3, -2, 3, 3, 4)
    findUniqueNum(numbers)

    // 2
    val ways = coinChange(intArrayOf(1, 2, 5, 10), 50)
    println("\nMinimum number of coin-change operations is $ways")

    // 3
    println(
        "\nCommon string - ${
            longestCommonPrefix(
                arrayOf(
                    "apple", "application", "apartment", "apollo11"
                )
            )
        }"
    )

    // 4
    val a = "1010"
    val b = "1011"
    println("\nBinary sum of $a and $b is ${addBinary(a, b)}")

    // 5
    val stairs = 5
    println("\nCount variants number for $stairs stairs is - ${climbStairs(stairs)}")

    // 6
    println("\nMy Data Structure")
    val mds = MyDataStructure()
    mds.add(30)
    println(mds.search(30))
    mds.remove(30)
    println(mds.search(30))
}