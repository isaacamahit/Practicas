import java.util.*

/*val timer = Timer()
val delay:Long = 1000
val period:Long = 1000
var segundos = 10

fun main() {
    var n = 0

    val task = object : TimerTask() {
        override fun run() {
            println(intervalo())
        }
    }

    timer.scheduleAtFixedRate(task, delay, period)

}

fun intervalo ():Int{
    if (segundos==1)
        timer.cancel()
    return segundos--
}*/

fun main() {

    var n = 0
    val carrera = object : TimerTask() {
        override fun run() {
            mostrarCarrera()
        }
    }

    val longitudCircuito = 7

    var circuitos = crearCarrera(longitudCircuito)

    timer.scheduleAtFixedRate(carrera, delay, period)

}

fun crearCarrera(longitudCircuito: Int): Map<String, String> {


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

    return mapOf("jugador1" to circuito1, "jugador2" to circuito2)

}

fun mostrarCarrera(){

}