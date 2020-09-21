package br.com.digitalHouse.kotlinExercicios.aula06

import java.util.*

class Teste() {
    fun main(){
        val input = Scanner(System.`in`)

        println("Selecione uma opção:")
        println("1 - Ingresso Normal")
        println("2 - Ingresso VIP")

        when (input.nextInt()){
            1 -> {
                val ingresso = Normal()
                ingresso.imprimeValor()
            }
            2 -> {
                println("Selecione uma opção:")
                println("1 - Ingresso VIP - Camarote Superior")
                println("2 - Ingresso VIP - Camarote Inferior")

                when (input.nextInt()){
                    1 -> {
                        val ingresso = CamaroteSuperior()
                        ingresso.imprimeValor()
                    }
                    2 -> {
                        val ingresso = CamaroteInferior()
                        ingresso.imprimeValor()
                    }
                    else -> println("Opção inválida")
                }
            }
            else -> println("Opção inválida")
        }
    }
}