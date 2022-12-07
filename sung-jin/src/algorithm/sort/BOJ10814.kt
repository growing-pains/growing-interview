package src.algorithm.sort

/**
 * https://www.acmicpc.net/problem/10814
 * 나이순 정렬
 */
class BOJ10814 {
    fun solution(input: String) {
        val splitInput = input.split("\n")
        (1..splitInput[0].toInt()).map {
            val value = splitInput[it].split(" ")
            value[0].toInt() to value[1]
        }.sortedBy { it.first }.forEach { println("${it.first} ${it.second}") }
    }
}
