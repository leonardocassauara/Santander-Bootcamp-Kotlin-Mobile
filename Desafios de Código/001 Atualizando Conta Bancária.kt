class Conta(var saldoAtual: Float, val valorDeposito: Float, val valorRetirada: Float) {
  
  fun depositar() : Unit {
    saldoAtual += valorDeposito
  }
  
  fun sacar() : Unit {
    saldoAtual -= valorRetirada
  }
}


fun main() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()
    
    val conta: Conta = Conta(saldoAtual, valorDeposito, valorRetirada)
    conta.depositar()
    conta.sacar()
    val saldoFinal = String.format("%.${1}f", conta.saldoAtual)
    println("Saldo atualizado na conta: $saldoFinal")
}