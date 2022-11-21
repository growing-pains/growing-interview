import algorithm.BOJ10828
import src.algorithm.BOJ10799
import src.algorithm.BOJ1406
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

//    val problem = BOJ9012()
//    problem.solution("""
//        6
//        (())())
//        (((()())()
//        (()())((()))
//        ((()()(()))(((())))()
//        ()()()()(()()())()
//        (()((())()(
//    """.trimIndent())

//    val problem = BOJ10799()
//    problem.solution("()(((()())(())()))(())")
//    problem.solution("(((()(()()))(())()))(()())")

    val problem = BOJ1406()
    problem.solution("""
        abcd
        3
        P x
        L
        P y
    """.trimIndent())
    problem.solution("""
        abc
        9
        L
        L
        L
        L
        L
        P x
        L
        B
        P y
    """.trimIndent())
    problem.solution("""
        dmih
        11
        B
        B
        P x
        L
        B
        B
        B
        P y
        D
        D
        P z
    """.trimIndent())
}
