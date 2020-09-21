package br.com.digitalHouse.kotlinExercicios.aula05

class Exercicio05 {
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun main(){
        val veiculoGol = Veiculo("Volkswagem","Gol",2010,"Prata",100000)
        val clienteGol = Cliente("Tiquinho","da Silva")
        clienteGol.contatoEmail = "tiquinhodasilva@email.com"
        val megaVenda = Concessionaria()
        megaVenda.registrarVenda(veiculoGol,clienteGol,28000.00)
    }
}