package excecoes.exercicio3

import java.lang.ArithmeticException

class CalculoMatematico {
    fun divisao(valor1: Int, valor2: Int) : Int {
        if (valor2 == 0) {
            throw ArithmeticException("Divisão por 0")
        }

        return try {
            valor1 / valor2
        } catch (e: ArithmeticException) {
            println("Divisão inválida: $valor1 / $valor2")
            0
        }
    }
}
