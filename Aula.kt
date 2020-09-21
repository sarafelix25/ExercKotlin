package com.digitalhouse.cadastroalunos

class Aula(val materia: String, var horarioIni: String, var horarioTerm: String) {
    val listaPresenca= hashMapOf<Int, Boolean>()
    fun iniciarAula(){
        println("Aula de $materia começa $horarioIni com termino em $horarioTerm")
    }
}