package interfaces

class Contrato(override val nome: String, override val tipoDeDocumento: String) : Imprimivel {

    override fun imprimir() {
        println("Eu sou um contrato muito legal. Nome: $nome$tipoDeDocumento")
    }
}