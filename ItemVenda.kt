package br.com.digitalHouse.kotlinExercicios.aula07

class ItemVenda(private val produto: String = "", private val quantidade: Int = 0, private val valorItem: Double = 0.00): IRecebivel {
    fun itemVenda(){
        println("Colocando item: $produto a venda, temos $quantidade em estoque com o valor de R$$valorItem por unidade")
    }

    override fun totalizarReceita(): Double {
        println("Receita do item a venda")
        return valorItem
    }

    fun ToStrin(): String{
        return "String"
    }
}