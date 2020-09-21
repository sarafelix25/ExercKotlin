package dataclass.exercicio3

fun main() {
    val alunos = listOf(Aluno("Rafael", 123123),
            Aluno("Gustuvo", 123124),
            Aluno("Michele", 123125),
            Aluno("Maria", 123126))

    val aluno = Aluno("Luis", 123123)

    println(alunos.contains(aluno))
}
