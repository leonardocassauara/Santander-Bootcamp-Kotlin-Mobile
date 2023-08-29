fun ordenarLista(lista: MutableList<String>) : Unit {
  for (i in 0..lista.size-1) 
  {
    for (j in i..lista.size-1) 
    {
      if (lista[i][0].toInt() > lista[j][0].toInt()) 
      {
        var aux: String = lista[i]
        lista[i] = lista[j]
        lista[j] = aux
      }
    }
  }
}


fun main() {
    var ativos = mutableListOf<String>()
    val quantidadeAtivos = readLine()!!.toInt()

    for (i in 1..quantidadeAtivos) 
    {
      val codigoAtivo = readLine()!!
      ativos.add(codigoAtivo)
    }
    
    ordenarLista(ativos)
    for (i in ativos) {
      println(i)
    }
}