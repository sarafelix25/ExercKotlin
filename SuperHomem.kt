package br.com.digitalHouse.kotlinExercicios.aula07

class SuperHomem: Voador {
    override fun voar(){
        println("Estou voando como Super-Homem")
        voarRapido()
    }
}