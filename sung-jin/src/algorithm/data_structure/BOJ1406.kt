package src.algorithm.data_structure

import java.util.*

/**
 * https://www.acmicpc.net/problem/1406
 * 에디터
 */
class BOJ1406 {
    fun solution(input: String) {
        val splitInput = input.split("\n")
        val leftString = Stack<Char>()
        val rightString = Stack<Char>()

        leftString.addAll(splitInput[0].toCharArray().toList())

        (2..1 + splitInput[1].toInt()).forEach {
            val splitExecuteInput = splitInput[it].split(" ")

            when (EDITOR.parse(splitExecuteInput[0][0])) {
                EDITOR.LEFT -> if (leftString.isNotEmpty()) rightString.push(leftString.pop())
                EDITOR.RIGHT -> if (rightString.isNotEmpty()) leftString.push(rightString.pop())
                EDITOR.DELETE -> if (leftString.isNotEmpty()) leftString.pop()
                EDITOR.ENTER -> leftString.push(splitExecuteInput[1][0])
            }
        }

        println(leftString.joinToString("") + rightString.reversed().joinToString(""))
    }

    enum class EDITOR (val command: Char) {
        LEFT('L'), RIGHT('D'), DELETE('B'), ENTER('P');

        companion object {
            fun parse(command: Char): EDITOR {
                return EDITOR.values().find { it.command == command } ?: throw IllegalArgumentException()
            }
        }
    }
}
