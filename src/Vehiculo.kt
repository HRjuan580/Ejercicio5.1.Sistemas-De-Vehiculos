class Vehiculo(val marca: String, val modelo: String, var capacidadCombustible: Int = 50) {


    fun mostrarInfo(){
        println("Vehiculo(marca: $marca, modelo: $modelo, capacidad: $capacidadCombustible ")

    }

    fun calcularAutonomia() : Int {

        return capacidadCombustible + 10

    }

}