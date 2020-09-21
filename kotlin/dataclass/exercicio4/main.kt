package dataclass.exercicio4

fun main() {
    val listaFuncionario = listOf(Funcionario("João", 1),
            Funcionario("Pedro", 2),
            Funcionario("Carlos", 3),
            Funcionario("Maria", 4))

    val funcionario = Funcionario("Gustavo", 1)

    println(listaFuncionario.contains(funcionario))
}
