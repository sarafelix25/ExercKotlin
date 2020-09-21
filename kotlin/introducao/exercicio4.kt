package introducao
fun main() {
    var contagemImpares = 0
    var i = 0

    while (contagemImpares < 100) {
        if (!ehPar(i)) {
            println(i)
            contagemImpares++
        }
        i++
    }
}
