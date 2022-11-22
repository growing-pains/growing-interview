package src.algorithm

class BOJ10845 {

    fun solution(input: String) {
        val queue = Queue()
        val splitInput = input.split("\n")
        (1..splitInput[0].toInt()).forEach {
            queue.execute(splitInput[it])
        }
    }

    enum class COMMAND {
        PUSH, FRONT, BACK, EMPTY, POP, SIZE
    }

    class Queue {
        private val value: MutableList<Int> = mutableListOf()

        fun execute(input: String) {
            val splitInput = input.split(" ")
            val command = COMMAND.valueOf(splitInput[0].uppercase())

            when (command) {
                COMMAND.PUSH -> push(splitInput[1].toInt())
                COMMAND.FRONT -> front()
                COMMAND.BACK -> back()
                COMMAND.EMPTY -> empty()
                COMMAND.POP -> pop()
                COMMAND.SIZE -> size()
            }
        }

        fun push(value: Int) {
            this.value.add(value)
        }

        fun front() {
            if (isEmpty()) println(INVALID)
            else println(this.value.first())
        }

        fun back() {
            if (isEmpty()) println(INVALID)
            else println(this.value.last())
        }

        fun empty() {
            if (isEmpty()) println(EMPTY_QUEUE)
            else println(NOT_EMPTY_QUEUE)
        }

        fun pop() {
            if (isEmpty()) println(INVALID)
            else {
                println(this.value.removeFirst())
            }
        }

        fun size() {
            println(this.value.size)
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
