fun main(args: Array<String>) {
    // ------------DECLARAÇÃO DE VARIÁVEIS-----------------
    //variável mutável
    var myName = "Helineth"

    //variável imutável
    val age = 23

    // ------------CONCATENAÇÃO DE STRING-----------------
    println("meu nome é $myName e tenho $age anos")


    // ------------OPERAÇÕES ARITMÉTICAS-----------------
    val numero1 = 10
    val numero2 = 20

    val resultSoma = numero1 + numero2
    val resultSubtracao = numero1 - numero2
    val resultDivisao = numero1 / numero2
    val resultMultiplicacao = numero1 * numero2

    println(
        "o resultado da soma é: $resultSoma \n " +
                "O resultado da subtração é: $resultSubtracao \n" +
        "O resultado da Divisão é: $resultDivisao \n" +
        "O resultado da multiplicação é: $resultMultiplicacao"
    )

    // ------------OPERAÇÕES RELACIONAIS-----------------
    val valor1 = 10
    val valor2 = 20

    val resultIgual = valor1 == valor2
    val resultMaior= valor1 > valor2
    val resultMenor= valor1 < valor2
    val resultMenorOuIgual = valor1 <= valor2
    val resultMaiorOuIgual = valor1  >= valor2
    val resultDiferente = valor1  != valor2

    println(
        "o resultado da comparação de igualdade é: $resultIgual \n " +
                "O resultado da comparação de maior é: $resultMaior \n" +
                "O resultado da comparação de menor é: $resultMenor \n" +
                "O resultado da comparação de menor ou igual é: $resultMenorOuIgual \n" +
                "O resultado da comparação de maior ou igual é: $resultMaiorOuIgual \n" +
                "O resultado da comparação de diferente é: $resultDiferente"
    )

        // ------------ESTRUTURA CONDICIONAL IF/ELSE E OPERADORES LÓGICOS-----------------
    val idade = 17
    if (idade > 18 || idade == 18){
        println("Adulto")
    }else if(idade < 18 && idade > 10 ){
        println("Adolescente")
    }else{
        println("Criança")
    }

    // ------------ARRAYS-----------------
var listaCompras = arrayOf("Arroz", "Feijão", "Uva", "Banana", "Carne", "Leite", "Ovos")
    //exibindo o índice do item no array e o tamanho da lista
    println(listaCompras[2] + listaCompras.size)

    // ------------ESTRUTURA DE REPETIÇÃO WHILE(ENQUANTO)-----------------
var indice = 0
    while (indice <= 8){
        println(listaCompras[indice])
        indice++
    }

    // ------------ESTRUTURA DE REPETIÇÃO WHEN(QUANDO)-----------------
var opcao = 1
    when(opcao){
        1 -> println("Programação web")
        2 -> println("Programação mobile")
        else -> println("Programação desktop")
    }
}