package orientacaoobjetos.exercicio1

import java.math.BigDecimal

fun main() {
    val cliente1 = Cliente("Rafael", "Santana")
    val cliente2 = Cliente("Sara", "Felix")

    val conta1 = Conta(8975831, BigDecimal("0.00"), cliente1)
    val conta2 = Conta(8975832, BigDecimal("0.00"), cliente2)

    conta1.deposito(BigDecimal("250.20"))
    conta2.deposito(BigDecimal("320.50"))

    conta1.saque(BigDecimal("300.00"))
    conta2.saque(BigDecimal("200.00"))
}
