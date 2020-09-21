package orientacaoobjetos.exercicio5

import java.math.BigDecimal

class Concessionaria {

    val registroDeVendas = mutableListOf<Venda>()

    fun registrarVenda(valorDaVenda: BigDecimal, veiculoVendido: Veiculo, cliente: Cliente) {
        registroDeVendas.add(Venda(valorDaVenda, veiculoVendido, cliente))
    }
}
