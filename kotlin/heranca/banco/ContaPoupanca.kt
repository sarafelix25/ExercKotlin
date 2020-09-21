package heranca.banco

import java.lang.Exception
import java.math.BigDecimal

class ContaPoupanca(saldo: BigDecimal, var taxaDeJuros: BigDecimal) : Conta(saldo) {

    override fun depositar(valor: BigDecimal) {
        validaValor(valor)
        saldo += valor
    }

    override fun sacar(valor: BigDecimal) {
        validaValor(valor)

        if (valor > saldo) {
            throw Exception("Saldo insuficiente!")
        }
        saldo -= valor
    }

    fun recolherJuros(): BigDecimal {
        return saldo * taxaDeJuros
    }
}