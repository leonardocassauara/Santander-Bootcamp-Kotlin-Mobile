fun sacar(saldoTotal: Int, valorSaque: Int) : Unit {
  if (valorSaque <= saldoTotal)
  {
    println("Saque realizado com sucesso. Novo saldo: ${saldoTotal-valorSaque}")
  }
  else
  {
    println("Saldo insuficiente. Saque nao realizado!")
  }
}


fun main() {
  val saldoTotal = readLine() !!.toInt()
  val valorSaque = readLine() !!.toInt()

  sacar(saldoTotal, valorSaque)
}