package orientacaoobjetos.exercicio3

fun main() {
    val atleta1 = Atleta("Rafael Santana", 54, 100)
    val atleta2 = Atleta("Vampeta", 98, 100)

    val provasAtleta1 = listOf(
        Prova(24, 100),
        Prova(51, 100),
        Prova(79, 10)
    )

    val provasAtleta2 = listOf(
        Prova(60, 100),
        Prova(95, 200),
        Prova(198, 17),
    )

    provasAtleta1.forEach { prova -> println(prova.podeRealizar(atleta1)) }
    provasAtleta2.forEach { prova -> println(prova.podeRealizar(atleta2)) }
}
