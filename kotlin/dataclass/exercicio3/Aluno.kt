package dataclass.exercicio3

data class Aluno(val nome: String, val numeroDeAluno: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Aluno) {
            return false
        }

        return this.numeroDeAluno == other.numeroDeAluno
    }
}