import java.util.*

fun main() {

    val rondas = 3

    partida(rondas)

}

fun partida(rondas: Int) {

    val movimientos = mapOf(1 to "Piedra", 2 to "Papel", 3 to "Tijera") // 1vs2 = 3 1vs
    val x = rondas
    var jugador1 = 0
    var jugador2 = 0
    var marcador1 = 0
    var marcador2 = 0

    for (i in 1..rondas) {

        jugador1 = (Math.random()*3+1).toInt()
        jugador2 = (Math.random()*3+1).toInt()

        println("${movimientos[jugador1]} vs ${movimientos[jugador2]}")

        if (jugador1 == 1){

            if (jugador2 == 2)
                marcador2 += 1
            else if (jugador2 == 3)
                marcador1 += 1


        } else if (jugador1 == 2){

            if (jugador2 == 1)
                marcador1 += 1
            else if (jugador2 == 3)
                marcador2 += 1


        } else if (jugador1 == 3){

            if (jugador2 == 1)
                marcador2 += 1
            else if (jugador2 == 2)
                marcador1 += 1

        }
    }

    println("$marcador1 + $marcador2")

    if (marcador1 > marcador2)
        println("Ganador: Jugador 1")
    else if (marcador2 > marcador1)
        println("Ganador: Jugador 2")
    else
        println("Empate")

}

