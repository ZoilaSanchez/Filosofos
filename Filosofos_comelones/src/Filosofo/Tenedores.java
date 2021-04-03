package Filosofo;

import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//hilo para los tenedores
public class Tenedores implements Runnable {

    //declaramos las variables, del hijo y de los lados a los que 
    //se toma el tenedor
    int PosicionFiloso, res;
    Thread Hilo_tenedor;
    JLabel lado_der, lado_izq;
    String plato;
    JLabel filosofo1, filosofo2, filosofo3, filosofo4, filosofo5, comida1, comida2, comida3, comida4, comida5;

    //Controlador de la region ya que 2 filosofos podran comer se podran 
    //ejecutar 2 procesos.
    private static Semaphore mutex = new Semaphore(2, true);

    public int getPosicionFiloso() {
        return PosicionFiloso;
    }

    public void setPosicionFiloso(int PosicionFiloso) {
        this.PosicionFiloso = PosicionFiloso;
    }

    //Metodo contructor, recibira los lados a los que corresconpode ya sea derecho o izquierdo 
    //asi como la posicion del filosofo
    public Tenedores(int PosicionFiloso, JLabel lado_izquierdo, JLabel lado_derecho, String plato, JLabel filosofo1, JLabel filosofo2, JLabel filosofo3, JLabel filosofo4, JLabel filosofo5, JLabel comida1, JLabel comida2, JLabel comida3, JLabel comida4, JLabel comida5) {
//         public Tenedores(int PosicionFiloso, JLabel lado_izquierdo, JLabel lado_derecho,JButton filosofo) {

        //Las asignaciones:
        //posicion del filosofo o a cual esta comiendo o pensando 
        this.PosicionFiloso = PosicionFiloso;
        //los lados de los tenedores
        this.lado_der = lado_derecho;
        this.lado_izq = lado_izquierdo;
        
        //asignación de filosofos
        this.filosofo1 = filosofo1;
        this.filosofo2 = filosofo2;
        this.filosofo3 = filosofo3;
        this.filosofo4 = filosofo4;
        this.filosofo5 = filosofo5;
        //Asignación de comida
        this.comida1 = comida1;
        this.comida2 = comida2;
        this.comida3 = comida3;
        this.comida4 = comida4;
        this.comida5 = comida5;
        //declaracion de los hilos       
        Hilo_tenedor = new Thread(this);
        Hilo_tenedor.start();
        this.plato = plato;
    }

    //Acá ocupa proceso de tenedor derecho e izquierdo
    public void Proceso1() {
        Icon icono1,icono2;
         icono1 = new ImageIcon(getClass().getResource("/Imagenes/4no.png"));
        lado_der.setIcon(icono1);
        icono1 = new ImageIcon(getClass().getResource("/Imagenes/4no.png"));
        lado_izq.setIcon(icono1);
        //Entrando en la region critica: Esto par que ver si los tenedores estan 
        //disponibles y no haya confictos
        try {
            mutex.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tenedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Proceso1=COMER
        // Se cambia los estodos del tenedore derecho y del tenedor izquierdo
        lado_der.setText("Ocupado");
        lado_der.setForeground(Color.blue);
        lado_der.setFont(Font.decode("Yaahowu"));
        lado_izq.setText("Ocupado");
        lado_izq.setForeground(Color.blue);
        lado_izq.setFont(Font.decode("Yaahowu"));
       
        System.out.println("Filosofo : " + (PosicionFiloso + 1) + " Comiendo");
        
       if (PosicionFiloso == 0) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/Heracilito1.jpg"));
            filosofo1.setIcon(icono1);
            comidainicio(plato, comida1);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            for (int i = 0; i <= 4; i++) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Heracilito2.jpg"));
                filosofo1.setIcon(icono1);
                comidaproceso(plato, comida1, i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Heracilito3.jpg"));
                filosofo1.setIcon(icono1);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
            }

        } else if (PosicionFiloso == 1) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/Pitagoras1.jpg"));
            filosofo2.setIcon(icono1);
            comidainicio(plato, comida2);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            for (int i = 0; i <= 4; i++) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Pitagoras2.jpg"));
                filosofo2.setIcon(icono1);
                comidaproceso(plato, comida2, i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Pitagoras3.jpg"));
                filosofo2.setIcon(icono1);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
            }

        } else if (PosicionFiloso == 2) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/Socrates1.jpg"));
            filosofo3.setIcon(icono1);
            comidainicio(plato, comida3);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            for (int i = 0; i <= 4; i++) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Socrates2.jpg"));
                filosofo3.setIcon(icono1);
                comidaproceso(plato, comida3, i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Socrates3.jpg"));
                filosofo3.setIcon(icono1);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
            }
        } else if (PosicionFiloso == 3) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/Mileto1.jpg"));
            filosofo4.setIcon(icono1);
            comidainicio(plato, comida4);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            for (int i = 0; i <= 4; i++) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Mileto2.jpg"));
                filosofo4.setIcon(icono1);
                comidaproceso(plato, comida4, i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Mileto3.jpg"));
                filosofo4.setIcon(icono1);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
            }

        } else if (PosicionFiloso == 4) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/Democrito1.jpg"));
            filosofo5.setIcon(icono1);
            comidainicio(plato, comida5);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            for (int i = 0; i <= 4; i++) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Democrito2.jpg"));
                filosofo5.setIcon(icono1);
                comidaproceso(plato, comida5, i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
                
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/Democrito3.jpg"));
                filosofo5.setIcon(icono1);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
            }
        }
        //Interrumpe el proceso por una tiempo 
        //Tiempo en el que el filoso tarda comiendo
       try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        //Cuando dejan de comer ya estan disponibles los tenedores
         icono1 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
        lado_der.setIcon(icono1);
        lado_der.setText("Disponible");
        lado_der.setForeground(Color.red);
        lado_der.setFont(Font.decode("yaahowu"));
        icono1 = new ImageIcon(getClass().getResource("/Imagenes/4.png"));
        lado_izq.setIcon(icono1);
        lado_izq.setText("Disponible");
        lado_izq.setForeground(Color.red);
        lado_izq.setFont(Font.decode("yaahowu"));
         System.out.println("Filosofo : " + (PosicionFiloso + 1) + " Pensando");
         System.out.println("");
        if (PosicionFiloso == 0) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/HeracilitoPiensa.jpg"));
            filosofo1.setIcon(icono1);
            comida1.setVisible(false);

        } else if (PosicionFiloso == 1) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/PitagorasPiensa.jpg"));
            filosofo2.setIcon(icono1);
            comida2.setVisible(false);
        } else if (PosicionFiloso == 2) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/SocratesPiensa.jpg"));
            filosofo3.setIcon(icono1);
            comida3.setVisible(false);
        } else if (PosicionFiloso == 3) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/MiletoPiensa.jpg"));
            filosofo4.setIcon(icono1);
            comida4.setVisible(false);
        } else if (PosicionFiloso == 4) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/DemocritoPiensa.jpg"));
            filosofo5.setIcon(icono1);
            comida5.setVisible(false);
        }
        //saliendo de region critica
       mutex.release();
    }

    public void Proceso2() {
        //Proceso2 = PENSAR
        //Cuando piensa los tenedores estan libres
        
        lado_der.setText("Disponible");
        //lado_der.setBackground(Color.green);
        lado_der.setForeground(Color.red);
        lado_der.setFont(Font.decode("yaahowu"));
        lado_izq.setText("Disponible");
        lado_izq.setForeground(Color.red);
        lado_izq.setFont(Font.decode("yaahowu"));
        //Tiempo pensando       
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }

    //hilo en donde se va a ir verificando cual lado se esta utilizando 
    @Override
    public void run() {
        for (int cont = 0; cont < 4; cont++) {

            //verifica si su tenedor izquierdo esta siendo utilizado para poder utiizar el derecho 
            synchronized (this.lado_izq) {
                //verifica si el tenedor derecho esta siendo utilizado 
                synchronized (this.lado_der) {
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

    public void comidainicio(String comida, JLabel comiendo) {
        Icon icono1;
        if (comida.equals("Fideos")) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/fideos2.jpg"));
            comiendo.setIcon(icono1);
            comiendo.setVisible(true);
        } else if (comida.equals("Carne")) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/carne2.jpg"));
            comiendo.setIcon(icono1);
            comiendo.setVisible(true);
        } else if (comida.equals("Papas fritas")) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/papas2.jpg"));
            comiendo.setIcon(icono1);
            comiendo.setVisible(true);
        } else if (comida.equals("Ensalada")) {
            icono1 = new ImageIcon(getClass().getResource("/Imagenes/ensalada2.jpg"));
            comiendo.setIcon(icono1);
            comiendo.setVisible(true);
        }
    }

    public void comidaproceso(String comida, JLabel comiendo, int paso) {
        Icon icono1;
        if (comida.equals("Fideos")) {
            if (paso == 0) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/fideos3.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 1) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/fideos4.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 2) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/fideos5.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 3) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/fideos6.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 4) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/fideos1.jpg"));
                comiendo.setIcon(icono1);
            }

        } else if (comida.equals("Carne")) {
            if (paso == 0) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/carne3.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 1) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/carne4.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 2) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/carne5.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 3) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/carne6.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 4) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/carne1.jpg"));
                comiendo.setIcon(icono1);
            }

        } else if (comida.equals("Papas fritas")) {
            if (paso == 0) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/papas3.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 1) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/papas4.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 2) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/papas5.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 3) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/papas6.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 4) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/papas1.jpg"));
                comiendo.setIcon(icono1);
            }

        } else if (comida.equals("Ensalada")) {
            if (paso == 0) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/ensalada3.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 1) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/ensalada4.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 2) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/ensalada5.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 3) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/ensalada6.jpg"));
                comiendo.setIcon(icono1);
            } else if (paso == 4) {
                icono1 = new ImageIcon(getClass().getResource("/Imagenes/ensalada1.jpg"));
                comiendo.setIcon(icono1);
            }

        }
    }
}
