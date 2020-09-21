package excecoes

import java.lang.IndexOutOfBoundsException
import java.lang.NullPointerException

fun main() {
    val strings: MutableList<String>? = null

    try {
        strings!!.add("Pato")
        strings.add("Cachorro")
        strings.add("Gato")

        println(strings[2])
    } catch (e: NullPointerException) {
        println("Erro ao tentar acessar método ou propriedade de objeto nullo. Exceção: ${e.javaClass.simpleName}, local: ")
        e.printStackTrace()
    } catch (e: IndexOutOfBoundsException) {
        println("Erro ao acessar índice inexistente na lista. Exceção: ${e.javaClass.simpleName}, local: ")
        e.printStackTrace()
    }
}
