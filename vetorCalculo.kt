package br.com.digitalHouse.kotlinExercicios.aula05

class vetorCalculo(val vetor: ArrayList<Int>){
    fun multiplicacao(){
        var mult = 0
        for(i in 0..vetor.size - 1){
            if (i == 0)
                mult = vetor[i]
            else
                mult*= vetor[i]
        }
        println("A multiplicação de todos os elementos do vetor é: $mult")
    }
}