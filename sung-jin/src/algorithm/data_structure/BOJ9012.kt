package src.algorithm.data_structure

import java.util.*

/**
 * https://www.acmicpc.net/problem/9012
 * 괄호
 */
class BOJ9012 {
    fun solution(input: String) {
        val splitInput = input.split("\n")

        (1..splitInput[0].toInt()).forEach {
            checkValidParenthesis(splitInput[it])
        }
    }

    private fun checkValidParenthesis(input: String) {
        val parenthesisPair = Stack<Boolean>()

        for (parenthesis in input.toCharArray()) {
            when (PARENTHESIS.parse(parenthesis)) {
                PARENTHESIS.LEFT -> parenthesisPair.add(true)
                PARENTHESIS.RIGHT -> {
                    if (parenthesisPair.size == EMPTY) {
                        println(INVALID)
                        return
                    }
                    parenthesisPair.pop()
                }
            }
        }

        if (parenthesisPair.size == EMPTY) println(VALID)
        else println(INVALID)
    }

    private enum class PARENTHESIS(val value: Char) {
        LEFT('('), RIGHT(')');

        companion object {
            fun parse(value: Char): PARENTHESIS {
                return values().find { it.value == value } ?: throw IllegalArgumentException()
            }
        }
    }

    companion object {
        private const val EMPTY = 0
        private const val INVALID = "NO"
        private const val VALID = "YES"
    }
}
