package br.com.digitalHouse.kotlinExercicios.aula06

class ContaPoupanca (cliente: Clientes, saldoConta: Double = 0.00): Contas(cliente, saldoConta) {
    val taxaDeJuros = 0.005

    fun recolherJuros(){
        println("Operação: Depositar em Dinheiro")
        saldo *= (1 + taxaDeJuros)
        println("Operação realizada com sucesso")
    }
}
