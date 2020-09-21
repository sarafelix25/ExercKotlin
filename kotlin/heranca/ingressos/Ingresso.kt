package heranca.ingressos

import java.math.BigDecimal

abstract class Ingresso (val valor: BigDecimal) {

    open fun imprimeValor() {
        println("Valor do ingresso: $valor")
    }
}