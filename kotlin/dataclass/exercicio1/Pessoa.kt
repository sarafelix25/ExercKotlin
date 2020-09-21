package dataclass.exercicio1

data class Pessoa(val nome: String, val RG: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Pessoa) {
            return false
        }

        return this.RG == other.RG
    }
}
