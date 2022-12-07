package src.algorithm.sort

/**
 * https://www.acmicpc.net/problem/11652
 * 카드
 */
class BOJ11652 {
    fun solution(input: String) {
        val splitInput = input.split("\n")
        val cardMap = mutableMapOf<Long, Long>()
        var maxCount = 0L
        val maxCountNumber = mutableListOf<Long>()

        (1..splitInput[0].toLong()).map {
            val count = cardMap.merge(it, 1) { a, b -> a + b }!!
            if (maxCount < count) {
                maxCountNumber.clear()
                maxCountNumber.add(it)
                maxCount = count
            }
            if (maxCount == count) maxCountNumber.add(it)
        }

        println(maxCountNumber.minByOrNull { it })
    }
}
