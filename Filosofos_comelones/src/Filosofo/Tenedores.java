package Filosofo;
import javax.swing.JLabel;


public class Tenedores implements Runnable{  
int PosicionFiloso,res;  
Thread Hilo_tenedor;  
JLabel lado_der,lado_izq;
String proceso;

public Tenedores(int PosicionFiloso,JLabel lado_izquierdo, JLabel lado_derecho){  
    this.PosicionFiloso = PosicionFiloso;  
    this.lado_der = lado_derecho;  
    this.lado_izq = lado_izquierdo;  
    Hilo_tenedor = new Thread(this);
    Hilo_tenedor.start();  
    
}

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
