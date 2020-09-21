package com.digitalhouse.cadastroalunos

fun main() {
    println("Teste")
    val professor = Professor( "Allan",1)
    val aluno1 = Aluno(1, "Igor", "")
    val aluno2 = Aluno(2, "levi", "")
    val aluno3 = Aluno(3, "Bruno", "")

    val curso = Curso("Kotlin", professor)

    val aula1 = Aula("POO", "14h", "17h30")
    val aula2 = Aula("Herança", "14h", "17h30")
    val aula3 = Aula("Interfaces", "14h", "17h30")

    curso.adicionarAulas(aula1, aula2, aula3)

    curso.adicionarAlunos(aluno1, aluno2, aluno3)

    val turma = Turma("Turma 1", curso)

    professor.fazerChamada(aula1, curso)
    professor.darAula(aula1)

    aluno1.assitirAula(aula1)
    aluno2.fazerLicao()

    println(turma)
}