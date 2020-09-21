package br.com.digitalHouse.kotlinExercicios.aula05

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun fazerGol(){
        when (energia < 10){
            false -> {
                energia-=5
                alegria+=10
                gols++
                println("GOOOOL!")
            }
            true -> println("Pouca energia")
        }

    }
    fun correr(){
        when (energia < 10){
            false -> {
                energia-=10
                println("Cansei")
            }
            true -> println("Pouca energia")
        }
    }
}