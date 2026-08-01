package com.karenkotlin.pruebakoala

//Dado el número:
//754857
//Desarrolle un programa que permita analizar sus dígitos y mostrar únicamente los números pares encontrados dentro del número.
//Salida esperada:
//48


fun main(){
    var num = 64123
    mostrar(num)


}
fun descomp(a:Int):Int{
    var n = a
    var i = 0
    while(n > 0){
        var d = n % 10
        if(esPa(d)) {
            i = i * 10 + d
        }
        n = n /10
    }
    return inver(i)
}
fun inver(a:Int):Int{
    var n = a
    var inv = 0
    while(n > 0){
        var d = n % 10
        inv = inv * 10 + d
        n = n / 10
    }
    return inv
}
fun mostrar(x:Int) {
    var numnuevo = descomp(x)
    println(numnuevo)
}

fun esPa(x:Int):Boolean{
    if(x % 2 == 0){
        return true
    }else {
        return false
    }
}
