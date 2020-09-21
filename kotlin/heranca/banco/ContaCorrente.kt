package heranca.banco

import java.lang.Exception
import java.math.BigDecimal

class ContaCorrente(saldo: BigDecimal, var limiteChequeEspecial: BigDecimal) : Conta(saldo) {

    override fun depositar(valor: BigDecimal) {
        validaValor(valor)
        saldo += valor
    }

    override fun sacar(valor: BigDecimal) {
        validaValor(valor)

        if (valor > saldo + limiteChequeEspecial) {
            throw Exception("Saldo insuficiente!")
        }
        saldo -= valor
    }

    fun depositarCheque(cheque: Cheque) {
        validaValor(cheque.valor)
        saldo += cheque.valor
    }
}
