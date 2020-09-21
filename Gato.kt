package br.com.digitalHouse.kotlinExercicios.aula06

class Gato: Felino() {
    override val cor: String = "Amarelo"
    fun gatoLocomover(){
        super.locomover()
        println("A cor do gato é $cor")

    }
}