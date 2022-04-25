package Exercicios.Um

fun main() {
    var novoFuncionario: Funcionario = Funcionario()

    novoFuncionario.nome= "Luis"
    novoFuncionario.sobreNome= "Silva"
    novoFuncionario.horasTrabalhadas= 10.0
    novoFuncionario.valorPorHora = 25.50

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8.0)
    println("----Novo salario-----")
    novoFuncionario.calcularSalario()

    //-------------------------------------------------
    var novoFuncionarioUm: Funcionario = Funcionario()

    novoFuncionarioUm.nome= "Paulo"
    novoFuncionarioUm.sobreNome= "Ferreira"
    novoFuncionarioUm.horasTrabalhadas= 11.0
    novoFuncionarioUm.valorPorHora = 26.50
    val listaUm = ArrayList<Funcionario>()
    listaUm.add(novoFuncionarioUm)


    //-------------------------------------------------
    var novoFuncionarioDois: Funcionario = Funcionario()

    novoFuncionarioDois.nome= "Andre"
    novoFuncionarioDois.sobreNome= "Castro"
    novoFuncionarioDois.horasTrabalhadas= 13.0
    novoFuncionarioDois.valorPorHora = 25.50
    val listaDois = ArrayList<Funcionario>()
    listaDois.add(novoFuncionarioDois)

    //-------------------------------------------------
    var novoFuncionarioTres: Funcionario = Funcionario()

    novoFuncionarioTres.nome= "pele"
    novoFuncionarioTres.sobreNome= "santos"
    novoFuncionarioTres.horasTrabalhadas= 10.0
    novoFuncionarioTres.valorPorHora = 20.50
    val listaTres = ArrayList<Funcionario>()
    listaTres.add(novoFuncionarioTres)

    //-------------------------------------------------
    var novoFuncionarioQuatro: Funcionario = Funcionario()

    novoFuncionarioQuatro.nome= "Benicio"
    novoFuncionarioQuatro.sobreNome= "Santana"
    novoFuncionarioQuatro.horasTrabalhadas= 18.0
    novoFuncionarioQuatro.valorPorHora = 25.50
    val listaQuatro = ArrayList<Funcionario>()
    listaQuatro.add(novoFuncionarioQuatro)

    //-------------------------------------------------
    var novoFuncionarioCinco: Funcionario = Funcionario()

    novoFuncionarioCinco.nome= "Carlos"
    novoFuncionarioCinco.sobreNome= "Santana"
    novoFuncionarioCinco.horasTrabalhadas= 16.0
    novoFuncionarioCinco.valorPorHora = 25.50
    val listaCinco = ArrayList<Funcionario>()
    listaCinco.add(novoFuncionarioCinco)

    //-------------------------------------------------
    var novoFuncionarioSeis: Funcionario = Funcionario()

    novoFuncionarioSeis.nome= "Fabio"
    novoFuncionarioSeis.sobreNome= "Moreira"
    novoFuncionarioSeis.horasTrabalhadas= 16.0
    novoFuncionarioSeis.valorPorHora = 28.50
    val listaSeis = ArrayList<Funcionario>()
    listaSeis.add(novoFuncionarioSeis)

    //-------------------------------------------------
    var novoFuncionarioSete: Funcionario = Funcionario()

    novoFuncionarioSete.nome= "Fabio"
    novoFuncionarioSete.sobreNome= "Santos"
    novoFuncionarioSete.horasTrabalhadas= 13.0
    novoFuncionarioSete.valorPorHora = 24.50
    val listaSete = ArrayList<Funcionario>()
    listaSete.add(novoFuncionarioSete)

    //-------------------------------------------------

    var novoFuncionarioOito: Funcionario = Funcionario()

    novoFuncionarioOito.nome= "Jo"
    novoFuncionarioOito.sobreNome= "Santos"
    novoFuncionarioOito.horasTrabalhadas= 13.0
    novoFuncionarioOito.valorPorHora = 21.50
    val listaOito = ArrayList<Funcionario>()
    listaOito.add(novoFuncionarioOito)

    //-------------------------------------------------

    var novoFuncionarioNove: Funcionario = Funcionario()

    novoFuncionarioNove.nome= "Luiz Paulo"
    novoFuncionarioNove.sobreNome= "Rodrigues"
    novoFuncionarioNove.horasTrabalhadas= 14.0
    novoFuncionarioNove.valorPorHora = 23.50
    val listaNove = ArrayList<Funcionario>()
    listaNove.add(novoFuncionarioNove)

    //--------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------

    listaUm.forEach { funcionario ->
        println("--------------------Funcionário 1---------------------")
        novoFuncionarioUm.nomeCompleto()
        novoFuncionarioUm.calcularSalario()
        novoFuncionarioUm.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioUm.calcularSalario()
    }
    listaDois.forEach { funcionario ->
        println("--------------------Funcionário 2---------------------")
        novoFuncionarioDois.nomeCompleto()
        novoFuncionarioDois.calcularSalario()
        novoFuncionarioDois.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioDois.calcularSalario()
    }
    listaTres.forEach { funcionario ->
        println("--------------------Funcionário 3---------------------")
        novoFuncionarioTres.nomeCompleto()
        novoFuncionarioTres.calcularSalario()
        novoFuncionarioTres.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioTres.calcularSalario()
    }

    listaQuatro.forEach { funcionario ->
        println("--------------------Funcionário 4---------------------")
        novoFuncionarioQuatro.nomeCompleto()
        novoFuncionarioQuatro.calcularSalario()
        novoFuncionarioQuatro.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioQuatro.calcularSalario()
    }

    listaCinco.forEach { funcionario ->
        println("--------------------Funcionário 5---------------------")
        novoFuncionarioCinco.nomeCompleto()
        novoFuncionarioCinco.calcularSalario()
        novoFuncionarioCinco.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioCinco.calcularSalario()
    }

    listaSeis.forEach { funcionario ->
        println("--------------------Funcionário 6---------------------")
        novoFuncionarioSeis.nomeCompleto()
        novoFuncionarioSeis.calcularSalario()
        novoFuncionarioSeis.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioSeis.calcularSalario()
    }
    listaSete.forEach { funcionario ->
        println("--------------------Funcionário 7---------------------")
        novoFuncionarioSete.nomeCompleto()
        novoFuncionarioSete.calcularSalario()
        novoFuncionarioSete.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioSete.calcularSalario()
    }

    listaOito.forEach { funcionario ->
        println("--------------------Funcionário 8---------------------")
        novoFuncionarioOito.nomeCompleto()
        novoFuncionarioOito.calcularSalario()
        novoFuncionarioOito.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioOito.calcularSalario()
    }

    listaNove.forEach { funcionario ->
        println("--------------------Funcionário 9---------------------")
        novoFuncionarioNove.nomeCompleto()
        novoFuncionarioNove.calcularSalario()
        novoFuncionarioNove.incrementarHoras(8.0)
        println("----Novo salario-------")
        novoFuncionarioNove.calcularSalario()
    }

}