class Libro {

    var titulo: String = ""
    var autor: String = ""
    var isbn: String = ""
    var numeroPaginas: Int = 0
    var precio: Double = 0.0
    var cantidadDisponible: Int = 0

    constructor()

    constructor(
        titulo: String,
        autor: String,
        isbn: String,
        numeroPaginas: Int,
        precio: Double,
        cantidadDisponible: Int
    ) {
        this.titulo = titulo
        this.autor = autor
        this.isbn = isbn
        this.numeroPaginas = numeroPaginas
        this.precio = precio
        this.cantidadDisponible = cantidadDisponible
    }

    fun prestarLibro(): Boolean{
        if (cantidadDisponible > 0){
            return true
        }else{
            return false
        }
    }

    fun devolverLibro(){
        cantidadDisponible ++
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', isbn='$isbn', numeroPaginas=$numeroPaginas, precio=$precio, cantidadDisponible=$cantidadDisponible)"
    }
}