package com.karenkotlin.pruebakoala

//Funcion Saludar
fun main(){
    val resultado = saludar("Karen")
    println(resultado)
    val resultadoSuma = suma(5,6)
    println(resultadoSuma)

    val resultadomultiplicacion = multicacion(6, 9)
    println(resultadomultiplicacion)


}

fun saludar(nombre:String):String{
    return "Hola $nombre"
}

//Funcion de suma
fun suma(a:Int, b:Int):Int {
    val suma = a + b
    return suma
}

//Funcion resta
fun resta(a:Int, b:Int):Int {
    val resta = a - b
    return resta
}

//
fun multicacion(a:Int, b:Int):Int {
    val multiplicacion = a * b
    return multiplicacion
}


// Función usando if
fun verificarEdad(edad:Int):String {
    if(edad >= 18){
        return "Es mayor de edad"
    }else{
        return "Es menor de edad"
    }
}

//peso mayo a 80
fun pesoMayor(peso:Float):String{
    if(peso >= 80){
        return "EL PESO ES MAYOR"
    }else {
        return "el peso es menor"
    }
}

