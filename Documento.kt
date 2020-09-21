package br.com.digitalHouse.kotlinExercicios.aula07

class Documento(override val nome: String = ""): Imprimivel {
    override val tipoDeDocumento: String = "DOCUMENTO"

    override fun imprimir() {
        println("Tipo de Documento: $tipoDeDocumento")
        println("Nome do Documento: $nome")
        println("Eu sou um documento WORD")
    }
}