package br.com.digitalHouse.kotlinExercicios.aula05

class Exercicio03 {
    //-------- Atributos --------//


    //--------- Métodos ---------//
    fun main(){
        val atletaA = Atleta("Foguete Aquático",5,9)
        var provaA1 = Prova(1,5)
        println("${atletaA.nome} pode participar da prova 1? ${provaA1.podeRealizar(atletaA)}")
        var provaA2 = Prova(3,8)
        println("${atletaA.nome} pode participar da prova 2? ${provaA2.podeRealizar(atletaA)}")
        var provaA3 = Prova(5,10)
        println("${atletaA.nome} pode participar da prova 3? ${provaA3.podeRealizar(atletaA)}")

        val atletaB = Atleta("Corredor Intergalático",4,10)
        var provaB1 = Prova(1,5)
        println("${atletaB.nome} pode participar da prova 1? ${provaB1.podeRealizar(atletaB)}")
        var provaB2 = Prova(3,8)
        println("${atletaB.nome} pode participar da prova 2? ${provaB2.podeRealizar(atletaB)}")
        var provaB3 = Prova(5,10)
        println("${atletaB.nome} pode participar da prova 3? ${provaB3.podeRealizar(atletaB)}")
    }
}