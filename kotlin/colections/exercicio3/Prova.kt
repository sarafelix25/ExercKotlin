package br.com.digitalhouse.exercicio3

class Prova() {

    fun somaTotal(conjuntoDeInteiros: Set<Int>): Int {
        var soma = 0

        conjuntoDeInteiros.forEach {
            soma += it
        }

        return soma
    }
}