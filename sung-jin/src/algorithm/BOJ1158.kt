package src.algorithm

import java.util.*

class BOJ1158 {

    fun solution(input: String) {
        val (numberOfPeople, josephusCount) = input.split(" ").map { it.toInt() }
        val josephus = LinkedList((1..numberOfPeople).toList())
        val result: MutableList<Int> = mutableListOf()

        while (josephus.isNotEmpty()) {
            result.add(leave(josephus, josephusCount))
        }

        println(result.joinToString(", ", "<", ">"))
    }

    fun leave(josephus: Queue<Int>, josephusCount: Int): Int {
        repeat(josephusCount - 1) {
            josephus.offer(josephus.poll())
        }

        return josephus.poll()
    }
}
