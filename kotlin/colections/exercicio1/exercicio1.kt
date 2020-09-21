package br.com.digitalhouse.exercicio1

fun main() {
    val loteriaDosSonhos = mapOf(0 to "Ovos",
            1 to "Água",
            2 to "Escopera",
            3 to "Cavalo",
            4 to "Dentista",
            5 to "Fogo")

    println(loteriaDosSonhos[0])
    println(loteriaDosSonhos[2])
    println(loteriaDosSonhos[5])
    println(loteriaDosSonhos[4])

    loteriaDosSonhos.forEach { entrada ->
        println("${entrada.key} -> ${entrada.value}")
    }

    val apelidos = mapOf("João" to listOf("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf("Lukinha", "Jorge", "George"))

    apelidos.forEach {
        println("${it.key} -> ${it.value}")
    }
}
