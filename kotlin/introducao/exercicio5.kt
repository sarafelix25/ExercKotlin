package introducao
fun analisaNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}

fun main() {
    println(analisaNumeros(32, 20, 1, 2))
    println(analisaNumeros(2, 3, 1, 1))
    println(analisaNumeros(32, -45, 1, 2))
    println(analisaNumeros(-32, -20, -2, 0))
    println(analisaNumeros(0, 0, 0, 0))
}
