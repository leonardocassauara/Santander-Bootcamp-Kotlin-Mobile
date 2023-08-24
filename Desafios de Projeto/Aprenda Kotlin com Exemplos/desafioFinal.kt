class Usuario(val nome: String)


enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }


data class ConteudoEducacional(val nome: String, val duracaoHoras: Int = 1, val nivel: Nivel, val expert: String)


class Formacao(val nome: String, val nivel: Nivel) {

    val inscritos: MutableList<Usuario> = mutableListOf<Usuario>()
    val conteudos: MutableList<ConteudoEducacional> = mutableListOf<ConteudoEducacional>()
    var duracaoHoras: Int = 0
    

    fun matricular(vararg usuario: Usuario) : Unit {
        for (user in usuario) {
            inscritos.add(user)
            println("Usuário ${user.nome} foi matriculado com sucesso.")
        }
    }

    fun adicionarConteudo(vararg conteudo: ConteudoEducacional) : Unit {
        for (content in conteudo) {
            conteudos.add(content)
            duracaoHoras += content.duracaoHoras
        }
    }

    fun printPropriedades() : Unit {
        println("Dados da formação:\n Nome: ${nome} | Nivel: ${nivel} | Duração: ${duracaoHoras} horas\n Inscritos: ${inscritos.map { it.nome }} \n Conteúdos: ${conteudos.map { it.nome }}\n")
    }
}


fun main() {

    val anderson: Usuario = Usuario("Anderson")
    val vladileia: Usuario = Usuario("Vladileia")
    
    val sgbds: ConteudoEducacional = ConteudoEducacional("Introdução aos SGBDs", 2, Nivel.BASICO, "Juliana Mascarenhas")
    val bancoDeDadosRelacionais: ConteudoEducacional = ConteudoEducacional("Bancos de Dados Relacionais", 3, Nivel.INTERMEDIARIO,  "Juliana Mascarenhas")

    val formSQLDatabase: Formacao = Formacao("SQL Database Specialist", Nivel.AVANCADO)
    
    formSQLDatabase.adicionarConteudo(sgbds, bancoDeDadosRelacionais)
    formSQLDatabase.matricular(anderson, vladileia)
    formSQLDatabase.printPropriedades()


    val judiscreia: Usuario = Usuario("Judiscréia")
    val edelgard: Usuario = Usuario("Edelgard")

    val introducaoPraticaKotlin: ConteudoEducacional = ConteudoEducacional("Introdução Prática à Linguagem de Programação Kotlin", 2, Nivel.BASICO, "Venilton Falvo")
    val desafioProjetoClasses: ConteudoEducacional = ConteudoEducacional("Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin", 1, Nivel.BASICO, "Venilton Falvo")

    val linguagemKotlin: Formacao = Formacao("Android Mobile Developer com Kotlin", Nivel.AVANCADO)

    linguagemKotlin.adicionarConteudo(introducaoPraticaKotlin, desafioProjetoClasses)
    linguagemKotlin.matricular(judiscreia, edelgard, anderson)
    linguagemKotlin.printPropriedades()
}