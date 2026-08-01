package com.karenkotlin.pruebakoala

//Problema:
//Dado un número:
//45346
//Descomponerlo y mostrar solamente los números pares.
//Resultado:
//6
//4

fun main(){
    val x = 45346
    descomponer(x)
}
fun descomponer(a:Int){
    var n = a
    while(n > 0){
        val d = n % 10
        if( d % 2 == 0){
            println(d)
        }
        n = n / 10
    }
}

fun esPare(a:Int):Boolean{
    return a % 2 == 0
}
