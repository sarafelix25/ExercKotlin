package br.com.digitalHouse.kotlinExercicios.aula07

class Foto(override val nome: String = ""): Imprimivel {
    override val tipoDeDocumento: String = "FOTO"

    override fun imprimir() {
        println("Tipo de Documento: $tipoDeDocumento")
        println("Nome do Documento: $nome")
        println("Eu sou uma selfie")
    }
}