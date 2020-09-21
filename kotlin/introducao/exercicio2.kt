package introducao
fun saoDiferentes(a: String, b: String): Boolean = a != b

fun main() {
    println(saoDiferentes("teste", "teste2"))
    println(saoDiferentes("teste", "teste"))
    println(saoDiferentes("", ""))
    println(saoDiferentes("teste", ""))
}
