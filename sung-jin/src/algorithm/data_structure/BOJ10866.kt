package src.algorithm.data_structure

/**
 * https://www.acmicpc.net/problem/10866
 * 덱
 */
class BOJ10866 {
    fun solution(input: String) {
        val deque = Deque()
        val splitInput = input.split("\n")
        (1..splitInput[0].toInt()).forEach {
            deque.execute(splitInput[it])
        }
    }

    enum class COMMAND {
        PUSH_FRONT, PUSH_BACK, POP_FRONT, POP_BACK, SIZE, EMPTY, FRONT, BACK
    }

    class Deque {
        private val value: MutableList<Int> = mutableListOf()

        fun execute(input: String) {
            val splitInput = input.split(" ")
            val command = COMMAND.valueOf(splitInput[0].uppercase())

            when (command) {
                COMMAND.PUSH_FRONT -> pushFront(splitInput[1].toInt())
                COMMAND.PUSH_BACK -> pushBack(splitInput[1].toInt())
                COMMAND.POP_FRONT -> popFront()
                COMMAND.POP_BACK -> popBack()
                COMMAND.SIZE -> size()
                COMMAND.EMPTY -> empty()
                COMMAND.FRONT -> front()
                COMMAND.BACK -> back()
            }
        }

        fun pushFront(value: Int) {
            this.value.add(0, value)
        }

        fun pushBack(value: Int) {
            this.value.add(value)
        }

        fun popFront() {
            if (isEmpty()) println(INVALID)
            else {
                println(this.value.removeFirst())
            }
        }

        fun popBack() {
            if (isEmpty()) println(INVALID)
            else {
                println(this.value.removeLast())
            }
        }

        fun size() {
            println(this.value.size)
        }

        fun empty() {
            if (isEmpty()) println(EMPTY_QUEUE)
            else println(NOT_EMPTY_QUEUE)
        }

        fun front() {
            if (isEmpty()) println(INVALID)
            else println(this.value.first())
        }

        fun back() {
            if (isEmpty()) println(INVALID)
            else println(this.value.last())
        }

        private fun isEmpty(): Boolean {
            return this.value.isEmpty()
        }

        companion object {
            private const val INVALID = -1
            private const val EMPTY_QUEUE = 1
            private const val NOT_EMPTY_QUEUE = 0
        }
    }
}
