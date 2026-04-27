package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    if (numero < 0)
        return "No positivo"
    else
        return "Positivo"
}

fun clasificarNumero(numero: Int): String {
    if (numero > 10 ){
        return "mayor a 10"
    }
    if (numero <10){
        return "Menor a 10"

    }
    if (numero == 10) {
        return "Numero es igual a 10"
    }
}

fun evaluarEdad(edad: Int): String {
    TODO("Menor de edad: < 18, Adulto: 18-65, Adulto mayor: > 65")
}

fun obtenerDescuento(monto: Double): Double {
    TODO("Retornar descuento: 10% si monto > 100, 20% si > 150, 30% si > 200, sino 0%")
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    TODO("Realizar operacion: + - * /. Retornar 0.0 si division por cero u operador invalido")
}
