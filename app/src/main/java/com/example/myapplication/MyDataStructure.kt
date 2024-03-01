package com.example.myapplication

class MyDataStructure {
    private val arr = mutableListOf<Int>()
    private val map = mutableMapOf<Int, Int>()

    fun add(x: Int) {
        if (x !in map) {
            val index = arr.size
            arr.add(x)
            map[x] = index
        }
    }

    fun remove(x: Int) {
        if (x in map) {
            val indexToRemove = map[x]!!
            val lastIndex = arr.size - 1

            if (indexToRemove != lastIndex) {
                val lastElement = arr[lastIndex]
                arr[indexToRemove] = lastElement
                map[lastElement] = indexToRemove
            }

            arr.removeAt(lastIndex)
            map.remove(x)
        }
    }

    // return -1 if element does not exist
    fun search(x: Int): Int {
        return map[x] ?: -1
    }

}



