package com.tali.fibotwo

object FibonacciGenerator {
    fun generateFibonacciNumbers(): List<Int> {
        val numbers = mutableListOf(0, 1)
        for (i in 2 until 100) {
            val num = numbers[i-1] + numbers[i-2]
            numbers.add(num)
        }
        return numbers
    }
}
