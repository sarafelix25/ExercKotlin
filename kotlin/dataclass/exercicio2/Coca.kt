package dataclass.exercicio2

data class Coca(val tamanho: Int, val preco: Double) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Coca) {
            return false
        }

        return this.tamanho == other.tamanho
    }
}