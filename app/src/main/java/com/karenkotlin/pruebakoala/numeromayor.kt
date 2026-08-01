package com.karenkotlin.pruebakoala

//EJEMPLO 2
//Problema:
//
//Dado:
//
//89769
//
//Mostrar los números mayores a 8.
//
//Salida:
//
//9
//9

fun main(){
    val x = 89769
    descompo(x)
}

//descomponer
fun descompo(a:Int) {
    var n = a
    while (n > 0){
        var d = n % 10
        if(esmayor(d)) {
            println(d)
        }
        n = n / 10
    }
}

//esmayor
fun esmayor(x:Int): Boolean{
    return x > 8
}