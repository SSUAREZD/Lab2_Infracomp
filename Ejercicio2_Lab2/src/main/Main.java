package main;

import Clases.Auto;
import Clases.Estacionamiento;

public class Main {
	 public static void main(String[] args) {
		 
		 Estacionamiento estacionamiento= new Estacionamiento(40);
		 
		 for(int i = 0;i<41;i++) {
			Auto auto = new Auto(i,estacionamiento); 
			auto.start();
		 }
		 
	 }
}
