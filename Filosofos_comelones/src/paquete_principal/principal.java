package paquete_principal;

import Filosofo.Tenedores;
import java.awt.geom.AffineTransform;
import javax.swing.JLabel;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lopez
 */
public class principal extends javax.swing.JFrame {
    //Declarar arreglo
 
    JLabel tenedor[];
    //variables: 
    int pos_filo, lado_izq = 0, lado_der = 0;
    Tenedores tenedor2;

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        comida1.setVisible(false);
        comida2.setVisible(false);
        comida3.setVisible(false);
        comida4.setVisible(false);
        comida5.setVisible(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Tenedor1 = new javax.swing.JLabel();
        Tenedor2 = new javax.swing.JLabel();
        Tenedor3 = new javax.swing.JLabel();
        Tenedor4 = new javax.swing.JLabel();
        Tenedor5 = new javax.swing.JLabel();
        IniciarT = new javax.swing.JButton();
        filosofo1 = new javax.swing.JLabel();
        filosofo2 = new javax.swing.JLabel();
        filosofo3 = new javax.swing.JLabel();
        filosofo4 = new javax.swing.JLabel();
        filosofo5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comida1 = new javax.swing.JLabel();
        comida2 = new javax.swing.JLabel();
        comida3 = new javax.swing.JLabel();
        comida4 = new javax.swing.JLabel();
        comida5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tenedor1.setText("Tenedor 1");

        Tenedor2.setText("Tenedor 2");

        Tenedor3.setText("Tenedor 3");

        Tenedor4.setText("Tenedor 4");

        Tenedor5.setText("Tenedor 5");

        IniciarT.setText("Iniciar");
        IniciarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarTActionPerformed(evt);
            }
        });

        filosofo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HeracilitoPiensa.jpg"))); // NOI18N

        filosofo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PitagorasPiensa.jpg"))); // NOI18N

        filosofo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SocratesPiensa.jpg"))); // NOI18N

        filosofo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MiletoPiensa.jpg"))); // NOI18N

        filosofo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DemocritoPiensa.jpg"))); // NOI18N

        jLabel6.setText("Heráclito de Efeso");

        jLabel7.setText("Demócrito de Abdera");

        jLabel8.setText("Tales de Mileto");

        jLabel9.setText("Sócrates");

        jLabel10.setText("Pitágoras");

        comida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carne2.jpg"))); // NOI18N
        comida1.setName("Carne"); // NOI18N

        comida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ensalada2.jpg"))); // NOI18N

        comida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fideos2.jpg"))); // NOI18N

        comida4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papas2.jpg"))); // NOI18N

        comida5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ensalada2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tenedor5)
                                .addGap(151, 151, 151)
                                .addComponent(filosofo1))
                            .addComponent(jLabel6))
                        .addGap(335, 335, 335))))
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(comida1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(IniciarT)
                .addGap(368, 368, 368)
                .addComponent(Tenedor1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel8)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(filosofo5)
                                .addGap(46, 46, 46)
                                .addComponent(comida5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(Tenedor4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(filosofo4)
                                        .addGap(28, 28, 28)
                                        .addComponent(comida4)))))
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(comida2)
                                .addGap(18, 18, 18)
                                .addComponent(filosofo2)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(75, 75, 75))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(comida3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(Tenedor3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tenedor2)
                            .addComponent(filosofo3))
                        .addGap(0, 86, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tenedor1)
                            .addComponent(filosofo1))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filosofo2)
                            .addComponent(comida2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IniciarT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(comida1)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Tenedor5)
                                .addGap(83, 83, 83)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filosofo5)
                            .addComponent(comida5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tenedor4)
                    .addComponent(Tenedor2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comida4)
                            .addComponent(filosofo4))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tenedor3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(filosofo3)
                                .addComponent(comida3)))
                        .addGap(16, 16, 16)))
                .addComponent(jLabel8)
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        filosofo1.getAccessibleContext().setAccessibleName("filosofo1");
        filosofo2.getAccessibleContext().setAccessibleName("filosofo2");
        comida1.getAccessibleContext().setAccessibleName("Carne");
        comida2.getAccessibleContext().setAccessibleName("Ensalada");
        comida3.getAccessibleContext().setAccessibleName("Fideos");
        comida4.getAccessibleContext().setAccessibleName("Papas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarTActionPerformed
        IniciarT.setEnabled(false);//Esto para evitar que hayan mas de 5 hilos ejecutandose
        //Agregar arreglos de los filosofos 
        String[] comida = {"Fideos", "Carne", "Papas fritas", "Ensalada"};
        
     
      
        
        //Arreglo de Tenedores 
        tenedor = new JLabel[5];
        tenedor[0] = Tenedor1;
        tenedor[1] = Tenedor2;
        tenedor[2] = Tenedor3;
        tenedor[3] = Tenedor4;
        tenedor[4] = Tenedor5;
        //ver el que tenedor estamos utilizando
        for (pos_filo = 0; pos_filo < 5; pos_filo = pos_filo + 1) {
            // la posicion para el tenedor izquierdo seria la posicion del filosofo -1
            lado_izq = pos_filo - 1;
            //Cuando la posicion de filosofo es la primera
            if (lado_izq < 0) {
                //Seria la ultima posición de tenedores
                lado_izq = 4;
            }
            Random rand = new Random();
            int random = rand.nextInt(4);
            //en este caso la posicion de su tenedor es el que sigue (derecho)
            lado_der = pos_filo;
            //Mandamos la posicion, si esta en el lado derecho o izquierdo 
           tenedor2 = new Tenedores(pos_filo, tenedor[lado_izq], tenedor[lado_der], comida[random], filosofo1, filosofo2, filosofo3, filosofo4, filosofo5, comida1, comida2, comida3, comida4, comida5);
           // tenedor2 = new Tenedores(pos_filo, tenedor[lado_izq], tenedor[lado_der], filosofo[pos_filo]);

        }

    }//GEN-LAST:event_IniciarTActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarT;
    public javax.swing.JLabel Tenedor1;
    public javax.swing.JLabel Tenedor2;
    public javax.swing.JLabel Tenedor3;
    public javax.swing.JLabel Tenedor4;
    public javax.swing.JLabel Tenedor5;
    private javax.swing.JLabel comida1;
    private javax.swing.JLabel comida2;
    private javax.swing.JLabel comida3;
    private javax.swing.JLabel comida4;
    private javax.swing.JLabel comida5;
    private javax.swing.JLabel filosofo1;
    private javax.swing.JLabel filosofo2;
    private javax.swing.JLabel filosofo3;
    private javax.swing.JLabel filosofo4;
    private javax.swing.JLabel filosofo5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
