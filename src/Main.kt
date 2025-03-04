fun main() {
    val lstLibro = mutableListOf<Libro>()

    val libro1 = Libro(
        "Relato de un asesino",
        "Mario Mendoza",
        "123456",
        271,
        89000.0,
        4
    )
    while (true){
        println("1. Pedir prestado un libro")
        println("2. Devolver un libro")
        println("3. Informacion del libro")
        println("4. Salir")

        var opcion = readLine()

        when(opcion){
            "1" ->{
                println("Libros Dsponibles")
                var contador = 1
                lstLibro.forEach{libro ->
                println("$contador. ${libro.titulo} (Disponibles: ${libro.cantidadDisponible}")}
                contador ++
            }
        }
    }
}