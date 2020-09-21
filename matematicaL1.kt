package br.com.digitalHouse.kotlinExercicios.aula05

class matematicaL1(val n: Int){
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun fatorial(){
        var fat = 1;
        if (n < 0){
            println("Não é possível calcular fatorial de número negativo")
        }
        else if (n == 0){
            println("$n! = $fat")
        }
        else {
            for (i in 1..n) fat *= i
            println("$n! = $fat")
        }
    }
}