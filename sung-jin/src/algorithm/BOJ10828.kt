package algorithm

class BOJ10828 {
    private val stack = mutableListOf<Int>()
    // 1 ~ 100_000

    fun solution(input: String) {
        // 각종 예외 처리는 우선 무시한다
        stack.clear()
        val commands = input.split("\n")

        (1..commands[0].toInt()).forEach {
            execute(commands[it])
        }
    }

    private fun execute(inputCommand: String) {
        val splitCommand = inputCommand.split(" ")
        val command = COMMAND.valueOf(splitCommand[0].toUpperCase())

        when (command) {
            COMMAND.PUSH -> stack.add(splitCommand[1].toInt())
            COMMAND.POP -> {
                if (emptyStack()) {
                    println(INVALID_COMMAND)
                    return
                }
                println(stack.removeAt(stack.size - 1))
            }
            COMMAND.SIZE -> println(stack.size)
            COMMAND.EMPTY -> println(isEmpty())
            COMMAND.TOP -> {
                if (emptyStack()) {
                    println(INVALID_COMMAND)
                    return
                }
                println(stack.last())
            }
        }
    }

    private fun isEmpty(): Int {
        return if (stack.size == EMPTY_STACK) 1 else 0
    }

    private fun emptyStack(): Boolean {
        return stack.size == EMPTY_STACK
    }

    enum class COMMAND {
        PUSH, POP, SIZE, EMPTY, TOP
    }

    companion object {
        private const val EMPTY_STACK = 0
        private const val INVALID_COMMAND = -1
    }
}
