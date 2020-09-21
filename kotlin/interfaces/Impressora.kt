package interfaces

class Impressora {

    private val listaImprimivel: MutableList<Imprimivel> = mutableListOf()

    fun adicionaNaFila(imprimivel: Imprimivel) = listaImprimivel.add(imprimivel)

    fun adicionaNaFila(vararg imprimiveis: Imprimivel) = imprimiveis.forEach { adicionaNaFila(it) }

    fun imprimeFila() {
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
        listaImprimivel.clear()
    }
}
