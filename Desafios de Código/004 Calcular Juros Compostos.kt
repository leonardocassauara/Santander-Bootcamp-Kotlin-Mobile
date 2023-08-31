import java.text.DecimalFormat
import java.util.Scanner


fun calcularJurosCompostos(valorInicial: Double, taxaJuros: Double, periodo: Int) : Double {
  var valorFinal: Double = valorInicial
  for (i in 1..periodo)
  {
    valorFinal *= (1 + taxaJuros)
  }
  
  return valorFinal
}


fun main() {
    val scanner = Scanner(System.`in`)
    
    val df = DecimalFormat("#.##")
    
    val valorInicial = scanner.nextDouble()

    val taxaJuros = scanner.nextDouble()
  
    val periodo = scanner.nextInt()

    var valorFinal = calcularJurosCompostos(valorInicial, taxaJuros, periodo)

    println("Valor final do investimento: R$ ${df.format(valorFinal)}")
    scanner.close()
}