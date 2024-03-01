package com.example.myapplication

fun findUniqueNum(numbers: IntArray) {
    val hashMap = HashMap<Int, Int>()

    for (i in numbers.indices) {
        var count = 1
        if (hashMap.containsKey(numbers[i])) {
            count = hashMap[numbers[i]] ?: 0
            count++
        }
        hashMap[numbers[i]] = count
    }

    for (i in numbers.indices) {
        if (hashMap[numbers[i]] == 1) {
            println("the Unique number is ${numbers[i]}")
            return
        }
    }
    println("There is not unique number in list")
}


