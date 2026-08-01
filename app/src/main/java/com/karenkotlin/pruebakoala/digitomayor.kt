package com.karenkotlin.pruebakoala
//Dado el número:
//78143
//Descomponer el número.
//Encontrar el dígito mayor.
//Verificar si el número mayor es par o impar.
//Salida esperada:
//Número mayor: 8
//El número es par

fun main(){
    var num = 78143

    val digmayor = digmayor(num)
    println("el numero mayor es : $digmayor")

    if(numPar(num)){
        println("el numero es par")
    } else {
        println("en numero es impar")
    }
}

fun digmayor(a:Int):Int {
    var n = a
    var may = 0
    while(n > 0 ){
        var d = n % 10
        if (may < d){
            may = d
        }
        n = n / 10
    }
    return may
}

fun numPar(x:Int):Boolean{
    var num = digmayor(x)
    if(num % 2 == 0){
        return true
    } else {
        return false
    }
}