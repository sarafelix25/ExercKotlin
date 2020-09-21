package excecoes

import java.lang.IndexOutOfBoundsException

fun main() {
    val strings: MutableList<String> = ArrayList()
    strings.add("Pato")
    strings.add("Cachorro")
    strings.add("Gato")

    try {
        println(strings[3])
    } catch (e: IndexOutOfBoundsException) {
        println("Erro ao acessar índice inexistente na lista. Exceção: ${e.javaClass.simpleName}, local: ")
        e.printStackTrace()
    }
}
