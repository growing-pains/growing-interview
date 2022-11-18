import algorithm.BOJ10828
import src.algorithm.BOJ9012

fun main(args: Array<String>) {
//    val problem = BOJ10828()
//    problem.solution("""
//        14
//        push 1
//        push 2
//        top
//        size
//        empty
//        pop
//        pop
//        pop
//        size
//        empty
//        pop
//        push 3
//        empty
//        top
//    """.trimIndent())

    val problem = BOJ9012()
    problem.solution("""
        6
        (())())
        (((()())()
        (()())((()))
        ((()()(()))(((())))()
        ()()()()(()()())()
        (()((())()(
    """.trimIndent())
}
