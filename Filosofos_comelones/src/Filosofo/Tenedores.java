package Filosofo;

import javax.swing.JLabel;

public class Tenedores implements Runnable {

    int PosicionFiloso, res;
    Thread Hilo_tenedor;
    JLabel lado_der, lado_izq;

    public Tenedores(int PosicionFiloso, JLabel lado_izquierdo, JLabel lado_derecho) {
        this.PosicionFiloso = PosicionFiloso;
        this.lado_der = lado_derecho;
        this.lado_izq = lado_izquierdo;
        Hilo_tenedor = new Thread(this);
        Hilo_tenedor.start();

    }

    //Acá ocupa proceso de tenedor derecho e izquierdo
    public void Proceso1() {
        //Proceso1=COMER
        // Se cambia los estodos del tenedore derecho y del tenedor izquierdo
        lado_der.setText("Ocupado");
        lado_izq.setText("Ocupado");
        System.out.println("Posición:" + (PosicionFiloso + 1) + "Comiendo");
        //Interrumpe el proceso por una tiempo 
        //Tiempo en el que el filoso tarda comiendo
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        //Cuando dejan de comer ya estan disponibles los tenedores
        lado_der.setText("Disponible");
        lado_izq.setText("Disponible");
        System.out.println("Posición:" + (PosicionFiloso + 1) + "Pensando");
    }

    public void Proceso2() {
        //Proceso2 = PENSAR
        //Cuando piensa los tenedores estan libres
        lado_der.setText("Disponible");
        lado_izq.setText("Disponible");
        //Tiempo pensando
        try {
             Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
