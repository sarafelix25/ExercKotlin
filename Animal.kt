package br.com.digitalHouse.kotlinExercicios.aula06

abstract class Animal(open val idade: Int = 0, open val especie: String = "") {
    //-------- Atributos --------//

    //--------- Métodos ---------//
    open fun locomover(){/*---*/}

    fun idade(){
        println("Animal de espécie $especie tem $idade anos de idade")
    }

    abstract fun come(comida: String): String
}