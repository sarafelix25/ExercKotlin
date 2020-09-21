package br.com.digitalHouse.kotlinExercicios.aula05

class Conta(val numeroConta: Int, private var saldo: Double, val titular: Cliente) {
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun deposito(quantia: Double){
        when (quantia >= 0.00){
            false -> println("Desculpe, a quantia digitada não é válida")
            true  -> {
                saldo += quantia
                println("TRANSAÇÃO REALIZADA: Depósito")
                println("Seu novo saldo é de R$ %.2f".format(saldo))
            }
        }
    }
    fun saque(quantia: Double){
        when (quantia > 0.00){
            false -> println("Desculpe, a quantia digitada não é válida")
            true  -> {
                when (quantia > saldo) {
                    true -> println("Saldo Insuficiente")
                    false -> {
                        saldo -= quantia
                        println("TRANSAÇÃO REALIZADA: Saque")
                        println("Seu novo saldo é de R$ %.2f".format(saldo))

                    }
                }
            }
        }
    }
}