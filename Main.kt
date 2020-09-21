package aula11exceptions.exercicio1

import java.lang.Exception

fun main() {
    val lista = arrayListOf<String>()

    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")

    try {
        println(lista[3])
    } catch (exception: Exception) {
        println("Exceção: ${exception.message}")
        println(exception.stackTrace)
    }

}