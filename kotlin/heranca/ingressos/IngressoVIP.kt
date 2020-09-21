package heranca.ingressos

import java.math.BigDecimal

open class IngressoVIP(valor: BigDecimal, val valorAdicional: BigDecimal) : Ingresso(valor) {

    override fun imprimeValor() {
        println("Valor do ingresso: ${valor + valorAdicional}")
    }
}