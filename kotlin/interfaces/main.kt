package interfaces

fun main() {
    val documento = Documento("Tese de Doutorado", ".docx")
    val foto = Foto("Foto do dog", ".png")
    val contrato = Contrato("Contrato de desenvolvimento de software", ".pdf")

    val impressora = Impressora()

    impressora.adicionaNaFila(foto, documento, contrato)
    impressora.imprimeFila()
}
