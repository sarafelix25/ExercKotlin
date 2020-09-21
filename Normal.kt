package br.com.digitalHouse.kotlinExercicios.aula06

class Normal(): Ingresso() {
    val localizacao = "N1"
    override fun imprimeValor() {
        println("Ingresso Normal")
        println("O local para se sentar é $localizacao")
        println("O valor do ingresso é: R$ $valor")
    }
}