package br.com.digitalHouse.kotlinExercicios.aula05

class Exercicio01 {
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun main(){
        val clienteA = Cliente("Josefina","Pedreira")
        val contaA   = Conta(1,0.00.toDouble(),clienteA)
        contaA.deposito(10000.00)
        contaA.saque(3000.00)

        val clienteB = Cliente("Joãozinho","Soares")
        val contaB   = Conta(2,0.00,clienteB)
        contaB.deposito(5000.00)
        contaB.saque(1000.00)
    }
}