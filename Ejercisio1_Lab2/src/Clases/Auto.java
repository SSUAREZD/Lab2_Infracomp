package Clases;

import java.util.Random;

public class Auto extends Thread {
	
	private Estacionamiento estacionamiento;
	public int idCarro;
	
	public Auto(int id, Estacionamiento estacionamiento) {
		this.idCarro=id;
		this.estacionamiento=estacionamiento;
	}
	
	public void run() {
            System.out.println("Auto #"+idCarro+" intentando estacionar");
			try {
            	while(!estacionamiento.entrar(idCarro)) {
            		//Espera activa
            		System.out.println("Auto #"+idCarro+"  intenta fallidamente entrar");
            		Thread.sleep(100);
            	} 
            	int randomNumber = new Random().nextInt(100001);
            	Thread.sleep(randomNumber);
            	estacionamiento.salir(idCarro); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                
            }
        }
    }
	
	

