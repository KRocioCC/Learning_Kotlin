// LISTAS EN KOTLIN - REPASO RAPIDO

fun main(){

    // Lista fija
    val nombres = listOf("Ana", "Juan", "Pedro")

    println("Lista de nombres:")
    for(nombre in nombres){
        println("Nombre: $nombre")
    }


    // Lista modificable
    val usuarios = mutableListOf<String>()

    usuarios.add("Karen")
    usuarios.add("Luis")

    println(usuarios)

    //lista modificable 2

    val edades = mutableListOf<Int>()
    edades.add(23)
    edades.add(45)

    // Lista de objetos usando data class
    val productos = listOf(
        Producto("Laptop", 5000.0),
        Producto("Mouse", 100.0),
        Producto("Teclado", 200.0)
    )


    for(producto in productos){
        println("Producto: ${producto.nombre} Precio: ${producto.precio}")
    }

    //ejercicio 1
    var nom = listOf("ana", "luis", "pedro", "maria")
    for(n in nom ){
        print("nombre: $n")
    }

    //ejercicio 2
    var pro = listOf(
        Prod("zapato", 34.5),
        Prod("camisa", 69.0),
        Prod("polera", 67.8)
    )
    for(p in pro ){
        println("productos: ${p.nombre} Precio: ${p.precio}")
    }


}


// Data class para guardar datos
data class Producto(
    val nombre:String,
    val precio:Double
)
data class Prod(
    val nombre:String,
    val precio:Double
)


// EJERCICIO 1:
// Crea una lista con 4 nombres y muestra:
// Nombre: Ana
// Nombre: Luis
// Nombre: Pedro
// Nombre: Maria


// EJERCICIO 2:
// Crea una data class llamada Producto con:
// nombre
// precio
// Luego crea una lista con 3 productos y recórrela con un for.