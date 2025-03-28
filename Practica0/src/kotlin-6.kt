import java.util.*

val timer = Timer()
val delay:Long = 1000
val period:Long = 2000
var segundos = 3

fun main() {

    val mostrarSegundos = object : TimerTask() {
        override fun run() {
            println(intervalo())
        }
    }

    timer.scheduleAtFixedRate(mostrarSegundos, delay, period)

}

fun intervalo ():Int{
    if (segundos==0)
        timer.cancel()
    return segundos--
}