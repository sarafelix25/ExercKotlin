package com.digitalhouse.cadastroalunos

class Aluno(var registroAcademico: Int, override val nome: String, var sobrenome: String): INomeavel{
    fun assitirAula(aula: Aula) {
        println("O aluno está assistindo a matéria: ${aula.materia}")
    }

    fun fazerLicao() {
        println("O aluno $nome está fazendo a lição")
    }
}