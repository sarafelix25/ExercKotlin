package com.digitalhouse.cadastroalunos

class Professor(override val nome: String, val RD: Int) : INomeavel {
    fun darAula(aula: Aula){
        println("O professor $nome está dando aula de ${aula.materia}.")
    }

    fun fazerChamada(aula: Aula, curso: Curso){
        for (aluno in curso.listaAlunos){
            println("O aluno ${aluno.nome} está presente? S/N")
            when(readLine()!!.toUpperCase()){
                "S" -> {
                    aula.listaPresenca[aluno.registroAcademico] = true
                    println("Salvo como presente")
                }
                "N" -> {
                    aula.listaPresenca[aluno.registroAcademico] = false
                    println("Salvo como falta")
                }
                else -> {
                    aula.listaPresenca[aluno.registroAcademico] = false
                    println("Opção invalida, salvo como falta")
                }
            }
        }
    }
}