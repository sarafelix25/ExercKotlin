package br.com.digitalHouse.kotlinExercicios.aula07

class Impressora() {
    val listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionaFila(vararg imprimiveis: Imprimivel) {
        listaImprimivel.addAll(imprimiveis)
    }

    fun imprimeFila(){
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
        listaImprimivel.clear()
    }
}