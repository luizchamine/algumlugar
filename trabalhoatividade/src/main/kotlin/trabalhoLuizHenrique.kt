fun main(){
    /* */ println("exercicio 1\n monte uma funçao que le três nomes digitados e imprima os três nomes na ordem inversa")
    var emon = readLine()!!.toString()
    println("\no inverso dessa string é: ${emon.reversed()}")

    println("\nexercicio 2\n receber um numero e verificar se está entre 50 e 100. se estiver na faixa, imprimir:\n" +
            "'voce digitou um numero entre 50 e 100'\n" +
            "se nao estiver na faixa, imprimir:\n" +
            "'voce digitou um numero fora da faixa entre 50 e 100'\n")
    println("digite um numero qualquer:")
    var num = readLine()!!.toInt()
    if (num > 50 && num < 100){
        println("o numero digitado está entre 50 e 100")
    }else{println("o numero digitado NÃO está entre 50 e 100")}

    println("\nexercicio 3\nsolicitar a idade de varias pessoas e imprimir:" +
            "total de pessoas digitado\na funçao termina quando a soma das idades ultrapassar 300 anos. " +
            "use a funçao while")
    var soma = 0
    var x = 0

    while (soma < 301) run {  println ("digite a idade:")
        var idade = readLine()!!.toInt()
        soma += idade
        x += 1
    }
    println("\nforam necessarias a idade de $x pessoas para que a soma delas ultrapassasse 300 anos")

    println("\nexercicio 3\nsolicitar a idade de varias pessoas e imprimir:" +
            "total de pessoas digitado\na funçao termina quando a soma das idades ultrapassar 300 anos. " +
            "use a funçao for")

}