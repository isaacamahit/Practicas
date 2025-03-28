fun main() {

    val puntuacionAfragmentar = 12

    dividirEnCartas(puntuacionAfragmentar)

}

fun dividirEnCartas(puntuacionAfragmentar: Int) {

    val puntuacion = puntuacionAfragmentar
    val cartas = mutableListOf(1)
    var contador = 2
    var continua = true

    while (continua) {
        for (i in 1..10){
            if (cartas.sum()+i == puntuacion){
                cartas.add(i)
                continua = false
            }
        }
        if (continua){
            cartas.add(contador)
            contador++
        }
    }

    println("${cartas.size} cartas")
    println("$cartas")


}

