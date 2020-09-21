package heranca.banco

import java.lang.Exception
import java.math.BigDecimal

abstract class Conta (var saldo: BigDecimal) {

    abstract fun depositar(valor: BigDecimal)
    abstract fun sacar(valor: BigDecimal)

    protected fun validaValor(valor: BigDecimal) {
        if (valor.scale() != 2 || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw Exception("Valor inválido! Deve ser maior que zero com escala 2")
        }
    }
}