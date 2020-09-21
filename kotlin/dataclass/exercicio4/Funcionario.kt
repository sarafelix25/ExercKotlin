package dataclass.exercicio4

class Funcionario(val nome: String, val numeroDeRegistro: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Funcionario) {
            return false
        }

        return this.numeroDeRegistro == other.numeroDeRegistro
    }
}