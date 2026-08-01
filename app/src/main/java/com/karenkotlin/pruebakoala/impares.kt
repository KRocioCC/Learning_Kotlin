package com.karenkotlin.pruebakoala


fun main(){
    val x = 78456
    descop(x)
}


fun descop(a:Int){
    var n = a
    var cont = 0
    while(n > 0){
        val d = n % 10
        if(numImpares(d)){
            println(d)
            cont++
        }
        n = n / 10
    }
    println("Cantidad de impares: $cont")

}


fun numImpares(num:Int):Boolean{
    if(num % 2 != 0){
        return true
    }else{
        return false
    }
}