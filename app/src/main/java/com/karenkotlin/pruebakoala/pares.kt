package com.karenkotlin.pruebakoala

//Dado el número 45346:
//Descomponer el número.
//Mostrar solo los números pares.
//Calcular la suma de los números pares.
//Salida:
//6
//4
//Suma pares: 10

fun main(){
    var x = 45346
    desc(x)

}
fun desc(a:Int){
    var n = a
    var sumap = 0
    while(n > 0){
        var d = n % 10
        if(numpares(d)){
            println(d)
            sumap = sumap + d
        }
        n = n /10

    }
    println("suma pares: $sumap")


}

fun numpares(x:Int):Boolean{
    if(x % 2 == 0){
        return true
    }else{
        return false
    }

}