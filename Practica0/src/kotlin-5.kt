fun main() {

    val cadenaNormal = "enverdad bro retiro lo dicho"

    println(pasarHacker(cadenaNormal.lowercase()))

}

fun pasarHacker(cadena: String): String {

    val alfabHacker = mapOf("a" to "4", "b" to "I3","c" to "[", "d" to ")", "e" to "3","f" to "|=","g" to "&", "h" to "#",
        "i" to "1", "j" to ",_|", "k" to ">|", "l" to "£","m" to "/\\/\\","n" to "^/","o" to "0","p" to "|*", "q" to "(_,)",
        "r" to "I2", "s" to "5","t" to "7","u" to "(_)","v" to "\\/","w" to "\\/\\/", "x" to "><", "y" to "j", "z" to "2")

    val original = cadena
    var traduccion = ""

    for (i in 0..original.length - 1) {
        if (original[i] >= 'a' &&  original[i] <= 'z')
            traduccion += alfabHacker[original[i].toString()]
        else
            traduccion += " "
    }
    return traduccion

}

