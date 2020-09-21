package br.com.digitalHouse.kotlinExercicios.aula06

class CamaroteInferior(): VIP() {
    var localizacao: String = "I1"

    override fun imprimeValor() {
        println("Ingresso VIP - Camarote Inferior")
        println("O local para se sentar é $localizacao")
        println("O valor do ingresso é: R$ ${super.retornarValor()}")
    }
}