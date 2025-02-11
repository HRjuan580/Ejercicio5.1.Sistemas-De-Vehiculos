class Motocicleta(marca: String,
                  modelo: String,
                  capacidadCombustible: Int = 50,
                  val cilindrada: Int){

    override fun calcularAutonomia() : Int {
        return super.calcularAutonomia() + 100
    }
}