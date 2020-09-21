package orientacaoobjetos.exercicio2

class SessaoDeTreinamento (var experiencia: Int) {

    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        val experienciaAnterior = jogador.experiencia
        jogador.experiencia += experiencia

        println("O jogador ${jogador.nome} treinou. Experiência anterior: $experienciaAnterior, nova experiência: ${jogador.experiencia}")
    }
}