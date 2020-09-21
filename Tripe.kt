package br.com.digitalHouse.kotlinExercicios.aula05

class Tripe(var dobrado: Boolean, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int){
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun definirAltura(novaAltura: Int){
        alturaAtual = novaAltura
        println("Tripé a $alturaAtual cm")
    }

    fun dobrar(){
        dobrado = true
        println("Tripé dobrado")
    }

    fun desdobrar(){
        dobrado = false
        println("Tripé desdobrado")
    }

    fun guardar(){
        dobrado = true
        alturaAtual = alturaMinima
        println("Tripé pronto para ser guardado")
    }

    fun prontoParaGuardar(){
        println("Tripé pronto para ser guardado? ${dobrado == true && alturaAtual == alturaMinima}")
    }

    fun usar(){
        dobrado = false
        alturaAtual = alturaMaxima/2 + 1
        println("Tripé pronto para ser usado")
    }

    fun prontoParaUsar(){
        println("Tripé pronto para ser usado? ${dobrado == false && alturaAtual > alturaMaxima/2}")
    }
}