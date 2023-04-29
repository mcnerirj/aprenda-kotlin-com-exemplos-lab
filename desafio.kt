// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuario ${usuario.nome} matriculado na formação ${nome}.")
    }
    
}

fun main() {
    println("---- Criando os usuários ----")
    val usuario1 = Usuario("Marcelo")
    val usuario2 = Usuario("Pepa")
	val usuario3 = Usuario("George")
    println("---- Criando os conteúdos ----")
    val conteudo1 = ConteudoEducacional("Introdução à Kotlin", 30, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Funções em Kotlin", 45, Nivel.INTERMEDIARIO)
    println("---- Criacao as Formações ----")
    val formacao1 = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2))
	val formacao2 = Formacao("Introdução Kotlin", listOf(conteudo2))
	println("---- Matriculando os usuários ----")
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
	formacao2.matricular(usuario3)
}
