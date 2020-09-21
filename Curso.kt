package com.digitalhouse.cadastroalunos

class Curso(override var nome: String, var professor: Professor):INomeavel {
    var listaAulas: ArrayList<Aula> = arrayListOf()
    var listaAlunos: ArrayList<Aluno> = arrayListOf()

    fun adicionarAulas(aula: Aula) = listaAulas.add(aula)

    fun adicionarAulas(vararg aulas: Aula) {
        listaAulas.addAll(aulas)
    }
    fun adicionarAlunos(aluno: Aluno) = listaAlunos.add(aluno)

    fun adicionarAlunos(vararg alunos: Aluno){
        listaAlunos.addAll(alunos)
    }



}

