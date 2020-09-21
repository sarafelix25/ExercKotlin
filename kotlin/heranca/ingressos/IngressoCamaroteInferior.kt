package heranca.ingressos

import java.awt.Point
import java.math.BigDecimal

class IngressoCamaroteInferior(valor: BigDecimal, valorAdicional: BigDecimal, val localizacao: Point) : IngressoVIP(valor, valorAdicional) {

    fun imprimeLocalizacao() {
        println("Fila: ${localizacao.y} coluna: ${localizacao.x}")
    }
}