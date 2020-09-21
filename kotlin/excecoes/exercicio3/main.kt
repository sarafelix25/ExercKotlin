package excecoes.exercicio3

import java.lang.ArithmeticException

fun main() {
    val calculoMatematico = CalculoMatematico()
    try {
        calculoMatematico.divisao(4, 0)
    } catch (e: ArithmeticException) {
        println(e.message)
    }
}
