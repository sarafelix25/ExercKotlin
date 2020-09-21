package orientacaoobjetos.exercicio1

import java.math.BigDecimal

class Conta (val numeroDaConta: Long, var saldo: BigDecimal, val titular: Cliente) {

    init {
        saldo.setScale(2)
    }

    fun deposito(valor: BigDecimal) {
        if (valor.scale() != 2 || valor.compareTo(BigDecimal.ZERO) == 0) {
            imprimeErroValorInvalido(valor)
            return
        }
        saldo += valor

        registraOperacao("depósito")
    }

    fun saque(valor: BigDecimal) {
        if (valor.scale() != 2 || valor.compareTo(BigDecimal.ZERO) == 0) {
            imprimeErroValorInvalido(valor)
            return
        }

        if (saldo < valor) {
            println("Saldo insuficiente")
            return
        }

        saldo -= valor

        registraOperacao("saque")
    }

    private fun imprimeErroValorInvalido(valor: BigDecimal) =
        println("Valor inválido $valor. Deve ser positivo e com precisão 2")

    private fun registraOperacao(nomeOperacao: String) =
        println("Realizado $nomeOperacao. Novo saldo: R$ $saldo")
}
