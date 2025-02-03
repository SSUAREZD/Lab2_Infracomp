package Clases;

public class Estacionamiento {

	public  int capacidad;
	public  int parqueaderosOcupados;
	
	public Estacionamiento(int capacidad) {
		this.capacidad=capacidad;
	}
	
	public synchronized boolean  entrar(int id) {
		if(parqueaderosOcupados<capacidad) {
			parqueaderosOcupados+=1;
			System.out.println("Auto #"+id+"  estacionado exitosamente");
			return true;
		}
		else{
			return false;
		}
	}
	 public synchronized void salir(int id) {
	        if (parqueaderosOcupados > 0) {
	            parqueaderosOcupados -= 1;
	            System.out.println("Auto #" + id + " salió del estacionamiento ");             
	        } else {
	            System.out.println(" No hay autos en el estacionamiento para salir.");
	        }
	    }
	
}
