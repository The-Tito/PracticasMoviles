package org.example.Activities

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Programa que imprime los numeros pares hasta n")
    println("Ingresa el numero final")
    var finalNumber = readLine()!!.toInt()

    println("Los numeros pares hasta llegar a $finalNumber es: ${printNumbers(finalNumber)}")

}

fun printNumbers(numeros: Int): MutableList<Int> {
    var listOfPairNumbers = mutableListOf<Int>()
    for (i in 1..numeros) {
        if (i % 2 == 0 ) {
            listOfPairNumbers.add(i)
        }
    }
    return listOfPairNumbers

}