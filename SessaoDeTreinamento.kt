package br.com.digitalHouse.kotlinExercicios.aula05

class SessaoDeTreinamento(var exp: Int) {
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun treinarA(jogador: JogadorDeFutebol){
        println("Experiência antes do treinamento: ${jogador.experiencia} EXP")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += exp
        println("Experiência apos do treinamento: ${jogador.experiencia} EXP")
    }
}