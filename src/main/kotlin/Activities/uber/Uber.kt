package Activities.uber

import kotlin.text.toDouble
import kotlin.text.toInt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    do {
        var out: Boolean = true
        println("Ingresa la distancias del conductor en kilometros")
        var distance: Double = readln()!!.toDouble()
        println("Ingresa la disponibilidad")
        println("1.Disponible\n2.No disponible")
        var option: Int = readln()!!.toInt()
        if (option != 1 && option != 2) {
            do {
                println("Dato incorrecto")
                println("1.Disponible\n2.No disponible")
                option = readLine()!!.toInt()
            } while (option != 1 && option != 2)

        }
        var response = ""
            when {
            distance < 0.5 && option == 1 -> response = "Listo para inciar recorrido"

            distance < 0.5 && option == 2 ->  response = "Conductor cercano pero no disponible"

            distance >= 0.5 && option == 1 -> response = "Conductor disponible pero muy lejos, aplicaran tarifas mas altas"

            distance >= 0.5 && option == 2 -> response = "No hay conductores disponibles"

            else -> out = false
        }
        println(response)
    }while (!out)

}