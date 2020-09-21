package orientacaoobjetos.exercicio3

class Prova (val dificuldade: Int, val energiaNecessaria: Int) {

    fun podeRealizar(atleta: Atleta): Boolean = atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
}
