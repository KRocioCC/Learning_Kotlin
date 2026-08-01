package com.karenkotlin.pruebakoala

//Problema:
//
//Dado el número:
//
//789456
//
//Crear funciones para:
//
//Descomponer el número.
//Mostrar solamente los dígitos mayores a 5.
//Contar cuántos números mayores a 5 existen.

fun main (){
    val x = 789456
    des(x)

}

fun des(a:Int){
    var may = 0
    var n = a
    while(n > 0){
        var d  = n % 10
        if(mayores(d)){
            may = may + 1
            println(d)
        }
        n = n / 10

    }
    println("existen: $may mayores a 5")
}

fun mayores(x:Int): Boolean{
    if(x > 5 ){
        return true
    } else {
        return false
    }

}