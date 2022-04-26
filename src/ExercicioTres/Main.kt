package ExercicioTres

fun main() {
    var filme1 : filmes = filmes("", 0)
    filme1.titulo = "Os Vingadores"
    filme1.duracaoEmMinutos = 142
    filme1.exibirDuracaoEmHoras()

    var filme2 : filmes = filmes("", 0 )
    filme2.titulo = "Hotel Transilvânia"
    filme2.duracaoEmMinutos = 93
    filme2.exibirDuracaoEmHoras()

    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}")

    var filmes5 : filmes = filmes("", 0)

    for(i: Int in 1 .. 5){

        println("Por favor informe o nome do ${i} filme ")
        var nomeFilmeDigitado = readln()
        println("Por favor informe a quantidade de minutos que tem o $nomeFilmeDigitado")
        var quantidadeMinutosDigitada = readln().toInt()

        var filmesCadastrado = filmes(nomeFilmeDigitado, quantidadeMinutosDigitada)

        filmes5.inserirFilmes(filmesCadastrado)
    }

    filmes5.exibirFilmes()
}
