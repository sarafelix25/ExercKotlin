package br.com.digitalHouse.kotlinExercicios.aula07

class Contrato(override val nome: String = ""): Imprimivel {
    override val tipoDeDocumento: String = "CONTRATO"

    override fun imprimir() {
        println("Tipo de Documento: $tipoDeDocumento")
        println("Nome do Documento: $nome")
        println("Eu sou um contrato legal")
    }
}