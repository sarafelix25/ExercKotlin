package br.com.digitalHouse.kotlinExercicios.aula05

class Concessionaria {
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double){
        println("Adicionando ao registro de venda que o ${veiculo.modelo} foi vendido para ${cliente.nome} pelo valor de R$ ${valor}")
        val novaVenda = Venda(cliente,veiculo,valor)
    }
}