package src.algorithm.data_structure

import java.util.*

/**
 * https://www.acmicpc.net/problem/10799
 * 쇠막대기
 */
class BOJ10799 {
    fun solution(input: String) {
        val leftParenthesis = Stack<PARENTHESIS>()
        var answer = 0
        var lastLeftParenthesisIndex = 0

        input.toCharArray().forEachIndexed { index, p ->
            when (PARENTHESIS.parse(p)) {
                PARENTHESIS.RIGHT -> {
                    leftParenthesis.pop()

                    if (lastLeftParenthesisIndex == index - 1) {
                        answer += leftParenthesis.size
                    } else {
                        answer++
                    }
                }
                PARENTHESIS.LEFT -> {
                    leftParenthesis.push(PARENTHESIS.LEFT)
                    lastLeftParenthesisIndex = index
                }
            }
        }

        println(answer)
    }

    private enum class PARENTHESIS(val value: Char) {
        LEFT('('), RIGHT(')');

        companion object {
            fun parse(value: Char): PARENTHESIS {
                return values().find { it.value == value } ?: throw IllegalArgumentException()
            }
        }
    }
}
