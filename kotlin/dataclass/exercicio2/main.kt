package dataclass.exercicio2

fun main() {
    val cocaLata = Coca(3, 3.50)
    val cocaLataAeroporto = Coca(3, 4.50)

    println(cocaLata == cocaLataAeroporto)
}
