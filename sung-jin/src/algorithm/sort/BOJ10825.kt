package src.algorithm.sort

/**
 * https://www.acmicpc.net/problem/10825
 * 국영수
 */
class BOJ10825 {
    fun solution(input: String) {
        val splitInput = input.split("\n")
        (1..splitInput[0].toInt()).map {
            val value = splitInput[it].split(" ")
            Grade(
                name = value[0],
                korean = value[1].toInt(),
                english = value[2].toInt(),
                math = value[3].toInt()
            )
        }.sorted().forEach { println(it.name) }
    }

    private class Grade(
        val name: String,
        val korean: Int,
        val english: Int,
        val math: Int
    ): Comparable<Grade> {
        override fun compareTo(other: Grade): Int {
            // reflection 을 통해서 내림/올림을 필드를 넘겨서 할 수 있을 것 같은데..
            var compareResult = other.korean.compareTo(korean)
            // 내림차순

            if (compareResult == SAME_COMPARE) {
                compareResult = english.compareTo(other.english)
                // 올림차순
            }
            if (compareResult == SAME_COMPARE) {
                compareResult = other.math.compareTo(math)
                // 내림차순
            }
            if (compareResult == SAME_COMPARE) {
                compareResult = name.compareTo(other.name)
                // 올림차순
            }

            return compareResult
        }

        companion object {
            private const val SAME_COMPARE = 0
        }
    }
}
