package main;

import Clases.Auto;
import Clases.Estacionamiento;

public class Main {
	 public static void main(String[] args) {
		 
		 Estacionamiento estacionamiento= new Estacionamiento(10);
		 
		 for(int i = 0;i<41;i++) {
			Auto auto = new Auto(i,estacionamiento); 
			auto.start();
		 }
		 
	 }
}

// Diferencias implementación 1 vs. implementación 2. 
    // En la implementación 1, los autos intentan entrar activamente y pueden generar un alto uso de CPU, gracias a la espera activa.
    // En la implementación 2, cuando usamos yield(), los autos que no pueden entrar ceden el uso de CPU, lo que puede resultar en un uso más eficiente de los recursos y menos congestión del sistema.