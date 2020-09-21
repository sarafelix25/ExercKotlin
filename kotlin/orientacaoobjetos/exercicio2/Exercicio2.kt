package orientacaoobjetos.exercicio2

fun main() {
    val jogador1 = JogadorDeFutebol("Carlos Roberto")
    val jogador2 = JogadorDeFutebol("Neymar Silva")

    val sessaoDeTreinamento = SessaoDeTreinamento(40)

    sessaoDeTreinamento.treinarA(jogador1)
    sessaoDeTreinamento.treinarA(jogador2)
}
