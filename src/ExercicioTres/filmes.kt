package ExercicioTres

class filmes(tituloParametro: String, duracaoEmMinutosParametro: Int) {
    var titulo: String = tituloParametro
    var duracaoEmMinutos: Int = duracaoEmMinutosParametro
    var listaFilme: ArrayList<filmes> = ArrayList()

    fun exibirDuracaoEmHoras() {

        var horas = duracaoEmMinutos / 60
        var minutos = duracaoEmMinutos % 60
        println("O filme $titulo possui $horas horas e $minutos minutos de duração")
    }

    fun inserirFilmes(Filmes: filmes) {
        listaFilme.add(Filmes)
    }

    fun exibirFilmes() {
        listaFilme.forEach {
            it.exibirDuracaoEmHoras()

        }

    }
}