package br.com.digitalHouse.kotlinExercicios.aula06

class CamaroteSuperior(): VIP() {
    var localizacao: String = "S1"
    val valorSuperior: Double = 50.00

    override fun imprimeValor() {
        println("Ingresso VIP - Camarote Superior")
        println("O local para se sentar é $localizacao")
        println("O valor do ingresso é: R$ ${super.retornarValor() + valorSuperior}")
    }
}