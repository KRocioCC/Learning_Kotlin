package com.karenkotlin.pruebakoala

//Problema:
//Dado el número:
//34563
//Debe mostrar:
//36543
//Verificar si el número es palíndromo.
//12321 → Es palíndromo
//
//34563 → No es palíndromo

fun main (){
    var num = 36543
    if(esPalindromo(num)){
        println("si es palindromo")
    } else {
        println("no es palindromo")
    }
    println(esPalindromo(num))

}
fun invertir(a:Int):Int{
    var n = a
    var inv = 0
    while(n > 0){
        var d = n % 10
        inv = inv * 10 + d
        n = n / 10
    }
    return inv
}
fun esPalindromo(x:Int):Boolean{
    var esPal = invertir(x)
    return esPal == x
}