package br.com.digitalhouse.exercicio3

fun main() {
    val notasPrimeira = setOf<Int>(3, 1, 5, 7, 2, 6, 9, 10)
    val notasSegunda = setOf<Int>(1, 5, 8, 6, 5)
    val notasTerceira = setOf<Int>(1, 4, 7, 1, 2, 6, 7)

    val prova = Prova()

    println("Notas da primeira prova: $notasPrimeira\nTotal: ${prova.somaTotal(notasPrimeira)}")
    println("Notas da segunda prova: $notasSegunda\nTotal: ${prova.somaTotal(notasSegunda)}")
    println("Notas da terceira prova: $notasTerceira\nTotal: ${prova.somaTotal(notasTerceira)}")
}