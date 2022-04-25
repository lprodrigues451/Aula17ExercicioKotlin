package Exercicios.Um

class Funcionario {
    var nome : String= ""
    var sobreNome : String  = ""
    var horasTrabalhadas : Double = 0.0
    var valorPorHora : Double = 0.0

    fun nomeCompleto() {
        println("O nome do usuario completo: $nome $sobreNome")
    }

    fun calcularSalario(){
        val valorFinal = horasTrabalhadas * valorPorHora
        println("O valor que o funcionario vai recebe é : $valorFinal")
    }

    fun incrementarHoras(valorHorasTrabalhada: Double){
        horasTrabalhadas = valorHorasTrabalhada + horasTrabalhadas
    }
}