package com.example.aulacomponenteslistagemcolecoes.teste

//class Matematica{
//    fun somar(n1: Int, n2: Int): Int{
//        return n1 + n2
//    }
//}

//fun somar(n1: Int, n2: Int): Int{
//    return n1 + n2
//}
//
//fun calcular(minhaFuncao: (Int, Int) -> Int){
//    val retorno = minhaFuncao(10,10)
//    println(retorno)
//}

class Botao{
    fun configurarCliqueBotao( nome: String, funcao: (Int) -> Unit){
        funcao(30)
        println("Nome: $nome")
    }
}

fun main(){

    val botao = Botao()
    botao.configurarCliqueBotao ("Jana"){
        println("Executou função lambda. Idade: $it")
    }

    //função lambda
    //val funcaoLambda = { nome: String ->
    //   println("Função Lambda com parametro: $nome")
    //}
    //funcaoLambda("Jana")

    //calcular( ::somar )

    // matematica = Matematica()
    //val retorno = matematica.somar(10, 10)
    //val retorno = somar(20,20)
    //println(retorno)
}