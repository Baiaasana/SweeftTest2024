package com.example.myapplication

fun longestCommonPrefix(strings: Array<String>): String {
    var result = ""
    val firstStr = strings[0]
    for (i in firstStr.indices) {
        for (j in strings.indices) {
            if (i >= strings[j].length || strings[j][i] != firstStr[i]) {
                return result
            }
        }
        result += firstStr[i]
    }
    return result
}


fun longestCommonPrefix2(strings: Array<String>) = StringBuilder().apply {
    strings.minBy { it.length }.forEachIndexed { index, char ->
        if (strings.all { it[index] == char }) append(char) else return toString()
    }
}.toString()