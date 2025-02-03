package matriz;

import java.util.Random;

public class MatrizN {
    private static int[][] matriz = new int[100][100];
    private static Random rdm = new Random();
    private static int acumFila = 0;

    public static void main(String[] args) {
        MatrizN.llenarMatriz();
        for(int i = 0; i < matriz.length; i++){
            Contadores cont = new Contadores(matriz[i]);
            Contadores.adicionarHilos();
            cont.start();
        }
        }
    
        public static synchronized void llenarMatriz() {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    //matriz[i][j] = rdm.nextInt(100);
                    matriz[i][j] = 20000;
                }
            }
        }

        public static synchronized void adicionarAcumFila(int num){
            acumFila += num;
        }

        public static synchronized int darTotal(){
            return acumFila;
        }
    }
