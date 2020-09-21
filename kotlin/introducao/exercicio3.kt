package introducao
fun ehPar(n: Int): Boolean = n % 2 == 0

fun main() {
    (0..1000).map { println(if (ehPar(it)) "$it é par" else "$it é ímpar") }
}
