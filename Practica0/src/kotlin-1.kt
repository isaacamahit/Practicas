fun main() {

    println("Introduce un número")
    val numeroIntroducir = readln().toInt()
    println(numeroIntroducir)
    val numeroRevertido = invertirNumero(numeroIntroducir)
    println(numeroRevertido)

    if (numeroRevertido == numeroIntroducir){
        println("Es capicua")
    }
    else{
        println("No es capicua")
    }

}

fun invertirNumero(numero: Int): Int{
    var n = numero
    var numeroInvertido = 0
    while (n > 0) {
        numeroInvertido = 10 * numeroInvertido + n % 10
        n = n / 10
    }
    return numeroInvertido
}