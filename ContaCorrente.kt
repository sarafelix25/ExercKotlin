package br.com.digitalHouse.kotlinExercicios.aula06

class ContaCorrente(cliente: Clientes, saldoConta: Double = 0.00, val chequeEspecial: Double = 0.00): Contas(cliente,saldoConta) {
    override var saldo = super.saldo + chequeEspecial

    fun depositarCheque (cheque: Cheque){
        println("Operação: Depositar em Cheque")
        when(cheque.valorCheque > 0.00){
            true -> {
                saldo += cheque.valorCheque
                println("Operação concluída com sucesso")
            }
            false ->{
                println("Operação não concluída, valor inválido")
            }
        }
    }
}