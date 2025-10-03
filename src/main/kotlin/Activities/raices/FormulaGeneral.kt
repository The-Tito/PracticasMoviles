package org.example.Activities



fun main(args: Array<String>) {

    println("Ingresa los valores de a ,b y c")
    print("a: ")
    var a: Double = readLine()!!.toDouble()
    print("b: ")
    var b: Double = readLine()!!.toDouble()
    print("c: ")
    var c: Double = readLine()!!.toDouble()
    var raices: Raices = Raices()
    raices.obtenerRaices(a, b, c)
    raices.obtenerRaices(a, b, c)
    println(raices.tieneRaices(a, b, c))
    println(raices.tieneRaices(a, b, c))
    raices.calcular(a, b, c)


}