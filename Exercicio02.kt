package br.com.digitalHouse.kotlinExercicios.aula05

class Exercicio02 {
    //-------- Atributos --------//


    //--------- Métodos ---------//
    fun main(){
        val florisvaldo = JogadorDeFutebol("Florisvaldo",100,0,0,0)
        val treinoFlorisvaldo = SessaoDeTreinamento(20)
        treinoFlorisvaldo.treinarA(florisvaldo)

        val martenzita = JogadorDeFutebol("Martenzita",100,50,100,80)
        val treinoMartenzita = SessaoDeTreinamento(20)
        treinoMartenzita.treinarA(martenzita)
    }
}