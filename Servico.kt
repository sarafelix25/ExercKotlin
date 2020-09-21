package br.com.digitalHouse.kotlinExercicios.aula07

class Servico(private val descricao: String = "", private val horas: Int = 0, private val precoHora: Double = 0.00): IRecebivel{
    fun servico(){
        println("Servico: $descricao a venda, por $horas horas com o valor de R$$precoHora por hora")
    }

    override fun totalizarReceita(): Double {
        println("Receita do serviço")
        return precoHora
    }

    fun ToStrin(): String{
        return "String"
    }
}