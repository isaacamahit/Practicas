import java.util.*

val longitudCircuito = 7
val delayCarrera:Long = 1000
val periodoCarrera:Long = 2000
var segundosCarrera = longitudCircuito
var ganador = ""

fun main() {

    var circuitos = crearCarrera(longitudCircuito)


    val carrera = object : TimerTask() {
        override fun run() {
            var circutiosEnMovimiento=(mostrarCarrera(circuitos))
            println(circutiosEnMovimiento["jugador1"])
            println(circutiosEnMovimiento["jugador2"])
            println("++++++++++++++++++++++++++++++")
            if (ganador != "")
                println(ganador)
        }
    }

    timer.scheduleAtFixedRate(carrera, delayCarrera, periodoCarrera)

}

fun crearCarrera(longitudCircuito: Int): MutableMap<String, String> {


    val longitud = longitudCircuito
    var contadorArbol = 0
    var contadorPista = 0
    var circuito1 = "M"
    var circuito2 = "M"

    for (i in 0 .. longitud) {

        var uno = (Math.random()*2+1).toInt()
        var dos = (Math.random()*2+1).toInt()

        if (uno == 1){
            circuito1 += "A"
            contadorArbol++
        } else if (uno == 2){
            circuito1 += "_"
            contadorPista++
        }

        if (dos == 1){
            circuito2 += "A"
            contadorArbol++
        } else if (dos == 2){
            circuito2 += "_"
            contadorPista++
        }

    }

    circuito1 += "1"
    circuito2 += "2"

    return mutableMapOf("jugador1" to circuito1, "jugador2" to circuito2)

}

fun mostrarCarrera(circuitos: MutableMap<String, String>): MutableMap<String, String> {

    var circuito1 = (circuitos["jugador1"].toString()).substring(0,longitudCircuito)
    var circuito2 = (circuitos["jugador2"].toString()).substring(0,longitudCircuito)

    var movimiento1 = (Math.random()*2+1).toInt()
    var movimiento2 = (Math.random()*2+1).toInt()

    if (movimiento1 == 1) {
        if (circuito1[segundosCarrera - 1] == 'A') {
            circuito1 += "X"
        } else if (circuito1[segundosCarrera - 1] == 'M'){
            ganador = "Gana piloto 1"
        } else {
            circuito1 += "1"
        }
    } else {
        if (circuito1[segundosCarrera - 2] == 'A') {
            circuito1 += "X"
        } else if (circuito1[segundosCarrera - 1] == 'M'){
            ganador = "Gana piloto 1"
        } else {
            circuito1 += "1"
        }
    }

    if (movimiento2 == 1) {
        if (circuito2[segundosCarrera - 1] == 'A') {
            circuito2 += "X"
        } else if (circuito2[segundosCarrera - 1] == 'M'){
            ganador = "Gana piloto 2"
        } else {
            circuito2 += "2"
        }
    } else {
        if (circuito2[segundosCarrera - 2] == 'A') {
            circuito2 += "X"
        } else if (circuito2[segundosCarrera - 1] == 'M'){
            ganador = "Gana piloto 2"
        } else {
            circuito2 += "2"
        }
    }

    segundosCarrera--

    if (segundosCarrera == 0 || ganador != "")
        timer.cancel()

    return mutableMapOf("jugador1" to circuito1, "jugador2" to circuito2)
}