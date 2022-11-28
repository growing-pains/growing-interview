package src.algorithm.sort

/**
 * https://www.acmicpc.net/problem/11650
 * 좌표 정렬하기
 */
class BOJ11650 {
    fun solution(input: String) {
        val splitInput = input.split("\n")
        (1..splitInput[0].toInt()).map {
            val (x, y) = splitInput[it].split(" ").map { num -> num.toInt() }
            Point(x, y)
        }.sorted().forEach { println(it) }
    }

    private class Point(val x: Int, val y: Int): Comparable<Point> {
        override fun compareTo(other: Point): Int {
            if (x == other.x) return y.compareTo(other.y)
            return x.compareTo(other.x)
        }

        override fun toString(): String {
            return "$x $y"
        }
    }
}
