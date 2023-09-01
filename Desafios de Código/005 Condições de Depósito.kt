import java.util.Scanner

fun main() {
  while (true) {
    val scanner = Scanner(System.`in`)
    val valor = scanner.nextDouble()
  
    if (valor > 0) 
    {
      println("Deposito realizado com sucesso!")
      val value = String.format("%.${2}f", valor)
      println("Saldo atual: R$ $value")
      break
    } 
    else if (valor == 0.0) 
    {
      println("Encerrando o programa...")
      break // retirar break para inserir novos valores
    }
    else 
    {
      println("Valor invalido! Digite um valor maior que zero.")
      break // retirar break para inserir novos valores
    }
  }
}