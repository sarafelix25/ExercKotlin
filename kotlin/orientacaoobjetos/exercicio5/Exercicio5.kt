package orientacaoobjetos.exercicio5

import java.awt.Color
import java.math.BigDecimal

fun main() {
    val carro = Veiculo("Gol", "Volkswagen", 2012, Color.RED, 12000)
    val cliente = Cliente("Rafael", "Santana", ContatoTelefone("(00) 90000-0000"))

    val concessionaria = Concessionaria()
    concessionaria.registrarVenda(BigDecimal("12500.00"), carro, cliente)
}
