package heranca.ingressos

import java.math.BigDecimal

class IngressoNormal(valor: BigDecimal) : Ingresso(valor) {

    fun imprimeTipoIngresso() {
        println("Ingresso Normal")
    }
}