package com.example.myapplication

fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = IntArray(amount + 1) { Int.MAX_VALUE }
    dp[0] = 0

    for (coin in coins) {
        for (i in coin until dp.size) {
            if (dp[i - coin] != Int.MAX_VALUE) {
                dp[i] = minOf(dp[i], dp[i - coin] + 1)
            }
        }
    }

    return if (dp[amount] == Int.MAX_VALUE) -1 else dp[amount]
}