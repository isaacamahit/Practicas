fun main() {

    val numeros = listOf(1,2,3,3,4,5,10,15,222,50,35,8)

    println("moda")
    println(moda(numeros))
    println("media")
    println(media(numeros))
    println("mediana")
    println(if(numeros.size % 2 == 0){medianaPar(numeros)} else{medianaImpar(numeros)})

}

fun moda (numeros: List<Int>): Int {

    val n = numeros.size
    var contadorMaximo = 0
    var mayor = 0

    for (i in 0..<n) {

        var contador = 0

        for (j in 0..<n) {
            if (numeros[i] == numeros[j]) contador++
        }

        if (contador > contadorMaximo || (contador == contadorMaximo && numeros[i] > mayor)) {
            contadorMaximo = contador
            mayor = numeros[i]
        }
    }

    return mayor

}

fun media (numeros: List<Int>): Int {

    return numeros.sum()/numeros.size

}

fun medianaPar (numeros: List<Int>): Int {


    val numeroMediana = numeros[numeros.size / 2]

    return numeroMediana
}

fun medianaImpar (numeros: List<Int>): List<Int> {

    val numeroMediana = listOf(numeros[(numeros.size / 2)+1], numeros[(numeros.size / 2)])

    return numeroMediana
}