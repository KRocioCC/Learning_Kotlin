package com.karenkotlin.pruebakoala
// CLASES  EN KOTLIN

class Mascota(
    val nombre:String,
    val edad:Int
){
    fun mostrar(){
        println("$nombre tiene $edad años")
    }
}


fun main(){

    val perro = Mascota(
        "Firulais",
        3
    )

    perro.mostrar()

    val persona = Persona(
        "Karen",
        20
    )
    persona.mostrar()


    val producto = Producto(
        "Laptop",
        5000.0
    )

    producto.mostrarProducto()

    val productoNu = PersonaN(
        "karen",
        5666
    )
    productoNu.mostrarN()
}


// Clase Persona
class Persona(
    val nombre:String,
    val edad:Int
){

    fun mostrar(){
        println("$nombre tiene $edad años")
    }

}


// Clase Producto
class Producto(
    val nombre:String,
    val precio:Double
){

    fun mostrarProducto(){
        println("$nombre cuesta $precio Bs")
    }

}


// EJERCICIO 1:
// Crear una clase Persona con:
// nombre
// edad
//
// Función mostrar()
// Resultado:
// Karen tiene 20 años

class PersonaN(
    val nombre:String,
    val edad:Int
){
    fun mostrarN(){
        println("$nombre y $edad")
    }
}

