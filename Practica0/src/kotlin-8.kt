fun main() {

    val escalones = 0

    crearEscalera(escalones)

}

fun crearEscalera(escalones: Int) {

    val escalonArriba = "_|"
    val escalonAbajo = "|_"
    val sueloPlano = "__"
    var espacio = ""

    if (escalones > 0) {
        for (i in 0 until escalones) {
            espacio += " "
        }
        for (i in 1..espacio.length) {
            println("$espacio$escalonArriba")
            espacio = espacio.drop(1)
        }
    }
    else if (escalones < 0)
        for (i in escalones..0){
            println("$espacio$escalonAbajo$espacio")
            espacio += " "
        }
    else
        println(sueloPlano)

}

