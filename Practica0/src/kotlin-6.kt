import java.util.*

fun main() {
    val timer = Timer()
    val delay:Long = 0
    val tiempoTotal:Long = 10000
    var n = 0

    val task = object : TimerTask() {
        override fun run() {
            n+=1
            println(n)
        }
    }

    timer.scheduleAtFixedRate(task, delay, tiempoTotal)
    Thread.sleep(tiempoTotal)
    timer.cancel()
}