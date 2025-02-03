package matriz;

public class Contadores extends Thread {
    private int[] fila;
    private int acumFila = 0;
    private static int hilos = 0;

    public Contadores(int[] fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        for (int i = 0; i < fila.length; i++) {
            acumFila += fila[i];
        }
        MatrizN.adicionarAcumFila(acumFila);
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        restarHilos();
        imprimir();
    }


    public static synchronized void imprimir() {
        int num = darHilos();
        if(num == 0){
            System.out.println("Total: " + MatrizN.darTotal());
        }
    }

    public static synchronized void adicionarHilos() {
        hilos++;
    }

    public static synchronized void restarHilos() {
        hilos--;
    }

    public static synchronized int darHilos() {
        return hilos;
    }
}
