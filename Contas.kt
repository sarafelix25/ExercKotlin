package br.com.digitalHouse.kotlinExercicios.aula06

open class Contas(val cliente: Clientes, open var saldo: Double) {
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun consultarSaldo(){
        println("Operação: Consultar Saldo")
        println("Seu saldo é de R$ $saldo")
    }

    fun depositarDinheiro(quantia: Double){
        println("Operação: Depositar em Dinheiro")
        when(quantia > 0.00){
            true -> {
                saldo += quantia
                println("Operação concluída com sucesso")
            }
            false ->{
                println("Operação não concluída, valor inválido")
            }
        }
    }

    fun sacar(quantia: Double) {
        println("Operação: Sacar")
        when(quantia > 0.00){
            true -> {
                when(quantia <= saldo){
                    true -> {
                        saldo -= quantia
                        println("Operação concluída com sucesso")
                    }
                    false -> {
                        println("Operação não concluída, saldo insuficiente")
                    }
                }
            }
            false ->{
                println("Operação não concluída, valor inválido")
            }
        }
    }
}