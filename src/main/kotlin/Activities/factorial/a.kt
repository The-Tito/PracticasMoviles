fun main() {

//    Ejercicio practico 1
//    Haz un ciclo for y while que obtenga la sumatoria de los números hasta n,
//    ejemplo, para 5 debes obtener 15 (1+2+3+4+5), para 3 debes obtener 6. Imprime el resultado así:
//    "La suma es 15" usando formatos de String

    println("Ingresa hasta que numero deseas llegar")
    var limitNumber = readln()!!.toInt()

    println("La suma es ${addNumbers(limitNumber)}")
    println("El factorial de $limitNumber es: ${factorialNumber(limitNumber)}")


}


fun addNumbers(limit: Int): Int {
    var result = 0
    for (i in 1 .. limit) {
        result += i
    }
    return result
}

fun factorialNumber(limitNumber: Int): Int {
    var result: Int = 1
    var counter: Int = 0
    var aux = limitNumber
    do {
        result = result * (aux - counter)
        counter++
    }while (limitNumber > counter)
    return result
}