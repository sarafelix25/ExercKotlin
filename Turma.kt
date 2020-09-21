package com.digitalhouse.cadastroalunos

class Turma(override val nome: String, val curso: Curso) : INomeavel{
    override fun toString(): String {
        var `return` = "Turma: $nome\nCurso: ${curso.nome}\nProfessor: ${curso.professor.nome} (${curso.professor.RD})\nAlunos:\n"
        for(aluno in curso.listaAlunos){
            `return` += "\t${aluno.nome} ${aluno.sobrenome} (${aluno.registroAcademico})\n"
        }
        `return` += "Aulas:\n"
        for(aula in curso.listaAulas){
            `return` += "\tMatéria: ${aula.materia} | Horário: dás ${aula.horarioIni} ás ${aula.horarioTerm}\n"
        }
        return `return`
    }
}