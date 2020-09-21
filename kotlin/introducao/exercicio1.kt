package introducao
fun encontraMaior(a: Int, b: Int, c: Int) : Int {
    return arrayListOf(a, b, c).maxOrNull()!!
}

fun main() {
    println(encontraMaior(23, 123, -32))
    println(encontraMaior(0, 1, 2))
    println(encontraMaior(65465, 0, -4254))
    println(encontraMaior(-312, -3, -2))
    println(encontraMaior(1, 1, 1))
    println(encontraMaior(2, 2, 1))
}
