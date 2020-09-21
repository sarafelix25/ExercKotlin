package br.com.digitalHouse.kotlinExercicios.aula07

fun main(){
    //val aviao = Aviao()
    //val pato = Pato()
    //val superHomem = SuperHomem()

    //aviao.voar()
    //pato.voar()
    //superHomem.voar()

    val impressora = Impressora()
    impressora.adicionaFila(Foto("Selfie.png"),Documento("Trabalho_Agora_Vai.docx"),Contrato("Locação.docx"))
    impressora.imprimeFila()

    val cama = ItemVenda("Cama de casal", 10,200.00)
    val instalacao = Servico("Montar Cama",1,100.00)

    cama.itemVenda()
    println(cama.totalizarReceita())
    println(cama.ToStrin())

    instalacao.servico()
    println(instalacao.totalizarReceita())
    println(instalacao.ToStrin())
}