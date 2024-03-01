package com.example.myapplication

fun addBinary(a: String, b: String): String {
    val sb = StringBuilder()
    var carry = 0
    var i = a.length - 1
    var j = b.length - 1
    while (i >= 0 || j >= 0 || carry == 1) {
        if (i >= 0)
            carry += a[i--] - '0'
        if (j >= 0)
            carry += b[j--] - '0'
        sb.append(carry % 2)
        carry /= 2
    }
    return sb.reverse().toString()
}
