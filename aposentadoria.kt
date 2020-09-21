package br.com.digitalHouse.kotlinExercicios.aula05

class aposentadoria(var idade: Int, val sexo: String, var anoDeContribuicao: Int){
    //-------- Atributos --------//

    //--------- Métodos ---------//
    fun permitirAposentar(): Boolean {
        if (anoDeContribuicao >= 30) {
            if (sexo == "Feminino")
                return idade >= 60
            else
                return idade >= 65
        }
        else
            return false
    }
}