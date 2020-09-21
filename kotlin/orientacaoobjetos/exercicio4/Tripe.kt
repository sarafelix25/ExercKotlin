package orientacaoobjetos.exercicio4

class Tripe (private var dobrado: Boolean, val alturaMinima: Int, val alturaMaxima: Int, private var alturaAtual: Int) {

    constructor(alturaMinima: Int, alturaMaxima: Int) : this(true, alturaMinima, alturaMaxima, alturaMinima)

    fun definirAltura(novaAltura: Int) {
        if (novaAltura > alturaMaxima || novaAltura < alturaMinima) {
            println("Altura inválida, deve estar entre ${alturaMinima}cm e ${alturaMaxima}cm")
            return
        }
        alturaAtual = novaAltura
    }

    fun dobrar() {
        dobrado = true
    }

    fun desdobrar() {
        dobrado = false
    }

    fun prontoParaGuardar() {
        dobrar()
        definirAltura(alturaMinima)
    }

    fun usar() {
        desdobrar()
        definirAltura(alturaMaxima / 2)
    }

    override fun toString(): String {
        return "${if (dobrado) "dobrado" else "desdobrado"}, ${alturaAtual}cm. Altura mínima: ${alturaMinima}cm. Altura máxima: ${alturaMaxima}cm"
    }
}