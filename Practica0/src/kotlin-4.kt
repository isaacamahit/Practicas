fun main() {

    val numero = 121
    val hexNumero = Integer.toHexString(numero)
    val binNumero = Integer.toBinaryString(numero)
    val romaNumero = pasarRomano(numero)

    println(hexNumero)
    println(binNumero)
    println(romaNumero)

}

fun pasarRomano(numero: Int): String {
    // I=1 V=5 X=10 L=50 C=100 D=500 M=1000

    var arabico = numero
    val numerosYromanos = arrayOf(1000 to "M", 900 to "C",500 to "D", 400 to "CD", 100 to "C",90 to "XC",50 to "L", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV",1 to "I")
    var romano = ""
    var i = 0


    while (i < numerosYromanos.size) {
        if (numerosYromanos[i].first <= arabico) {
            arabico = arabico - numerosYromanos[i].first
            romano = romano + numerosYromanos[i].second
            i--
        }
        i++
    }

    return romano

}

