package br.com.digitalHouse.kotlinExercicios.aula05

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {
    //-------- Atributos --------//


    //--------- Métodos ---------//
    fun podeRealizar(atleta: Atleta): Boolean{
        when(atleta.energia >= energiaNecessaria){
            true -> return atleta.nivel >= dificuldade
            false -> return false
        }
    }
}