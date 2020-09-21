package orientacaoobjetos.exercicio2

class JogadorDeFutebol (val nome: String, var energia: Int = 100, var alegria: Int = 50, var gols: Int = 0, var experiencia: Int = 0) {

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols++
        println("GOOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("Cansei")
    }
}
