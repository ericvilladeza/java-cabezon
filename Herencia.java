package herencia.polimorfismo;

public class Herencia {

	public static void main(String[] args) {
		Vehiculo[] vehiculos = {new Barco(), new Barco(), new Avion(), new Automovil()};
		
		for (Vehiculo vehiculo : vehiculos) {
			vehiculo.identificarse();
			if(vehiculo instanceof Barco) {
				((Barco)vehiculo).flotar();
			} else {
				vehiculo.moverse();
			}	
			
			if(vehiculo instanceof Rodable) {
				((Rodable) vehiculo).rodar();
			}
			
			System.out.println(vehiculo);
			System.out.println("------------------");
		}
		
	}

}
