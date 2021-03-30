package Filosofo;

import java.awt.Color;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

//hilo para los tenedores
public class Tenedores implements Runnable {
    //declaramos las variables, del hijo y de los lados a los que 
    //se toma el tenedor
    int PosicionFiloso, res;
    Thread Hilo_tenedor;
    JLabel lado_der, lado_izq;
    String plato;
    //Controlador de la region ya que 2 filosofos podran comer se podran 
    //ejecutar 2 procesos.
    private static Semaphore mutex = new Semaphore(2, true);

    //Metodo contructor, recibira los lados a los que corresconpode ya sea derecho o izquierdo 
    //asi como la posicion del filosofo
    public Tenedores(int PosicionFiloso, JLabel lado_izquierdo, JLabel lado_derecho, String plato) {
        //Las asignaciones:
        //posicion del filosofo o a cual esta comiendo o pensando 
        this.PosicionFiloso = PosicionFiloso;
        //los lados de los tenedores
        this.lado_der = lado_derecho;
        this.lado_izq = lado_izquierdo;
        //declaracion de los hilos
        Hilo_tenedor = new Thread(this);
        Hilo_tenedor.start();
        this.plato = plato;

    }

    //Acá ocupa proceso de tenedor derecho e izquierdo
    public void Proceso1() {
        //Entrando en la region critica: Esto par que ver si los tenedores estan 
        //disponibles y no haya confictos
        try {
                mutex.acquire();
        } catch (InterruptedException ex) {
                Logger.getLogger(Tenedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Proceso1=COMER
        // Se cambia los estodos del tenedore derecho y del tenedor izquierdo
        lado_der.setOpaque(true);
        lado_izq.setOpaque(true);
        lado_der.setBackground(Color.red);
        lado_izq.setBackground(Color.red);
        lado_der.setText("Ocupado");
        lado_izq.setText("Ocupado");
        System.out.println("Posición:" + (PosicionFiloso + 1) + "Comiendo");
        System.out.println("El plato es "+ plato);
        //Interrumpe el proceso por una tiempo 
        //Tiempo en el que el filoso tarda comiendo
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        //Cuando dejan de comer ya estan disponibles los tenedores
        lado_der.setText("Disponible");
        lado_izq.setText("Disponible");
        lado_der.setBackground(Color.green);
        lado_izq.setBackground(Color.green);
        System.out.println("Posición:" + (PosicionFiloso + 1) + "Pensando");
        //saliendo de region critica
        mutex.release();
    }

    public void Proceso2() {
        //Proceso2 = PENSAR
        //Cuando piensa los tenedores estan libres
        lado_der.setBackground(Color.green);
        lado_izq.setBackground(Color.green);
        lado_der.setText("Disponible");
        lado_izq.setText("Disponible");
        //Tiempo pensando
        try {
             Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
    //hilo en donde se va a ir verificando cual lado se esta utilizando 
    @Override
    public void run() {
        for(int cont =0; cont<4; cont++){
            
            //verifica si su tenedor izquierdo esta siendo utilizado para poder utiizar el derecho 
            synchronized(this.lado_izq){  
                //verifica si el tenedor derecho esta siendo utilizado 
                synchronized(this.lado_der){
                    //si los dos estan disponible en este caso se activa el proceso 1 
                    //que le permite comer
                    Proceso1();
                }
            }
        // de lo contrario se activa el proceso dos en donde el filosofo no tiene  
        //tenedor para comer por lo tanto piensa
        Proceso2();
            
        }
    }

}
