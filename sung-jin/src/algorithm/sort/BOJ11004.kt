package src.algorithm.sort

/**
 * https://www.acmicpc.net/problem/11004
 * K번째 수
 */
class BOJ11004 {
    fun solution(input: String) {
        val splitInput = input.split("\n")
        val (_, index) = splitInput[0].split(" ").map { it.toInt() }
        println(
            splitInput[1].split(" ").sortedWith { a, b -> a.toInt() - b.toInt() }[index - 1]
        )
    }
}
