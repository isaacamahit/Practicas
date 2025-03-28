fun main() {

    val numero = 121
    secuenciaFibonacci(numero)
}

fun secuenciaFibonacci(numero: Int) {

    val maximo = numero
    var secuencia = 1
    var guardaAnteriorSecuencia = 0
    var sumador = 0
    println(numero)

    while (secuencia < maximo) {

        sumador = secuencia + guardaAnteriorSecuencia
        print("$secuencia ")
        secuencia = guardaAnteriorSecuencia
        guardaAnteriorSecuencia = sumador
    }

}