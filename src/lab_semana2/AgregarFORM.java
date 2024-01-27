/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab_semana2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tommy Lee Pon
 */
public class AgregarFORM extends javax.swing.JFrame {
    
    private Tigo tigo;
    private String opcionSeleccionada = null;
    private ArrayList<Plan> planes;
    
    public AgregarFORM(Tigo Funcion, ArrayList<Plan> plan) {
        tigo = Funcion != null ? Funcion : new Tigo();
        planes = plan != null ? plan : new ArrayList<Plan>();

        initComponents();


        while (opcionSeleccionada == null) {
            String[] opciones = {"SAMSUNG", "IPHONE"};
            opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "QUE TIPO DE CELULAR DESEA?", "TIPO DE CELULAR", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (null == opcionSeleccionada) {
                JOptionPane.showMessageDialog(null, "Por favor, elija una opción válida.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {
                switch (opcionSeleccionada) {
                    case "SAMSUNG":
                        EXTRAlabel.setText("Pin: ");
                        break;
                    case "IPHONE":
                        EXTRAlabel.setText("Email: ");
                        break;
                    default:
                        break;
                }
            }
        }
        
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        EXTRAlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Extra = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(50, 50, 150));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 140, 50));

        EXTRAlabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EXTRAlabel.setForeground(new java.awt.Color(0, 0, 0));
        EXTRAlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EXTRAlabel.setText("Extra");
        getContentPane().add(EXTRAlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Numero Tel:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 130, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, 40));

        Extra.setBackground(new java.awt.Color(255, 255, 255));
        Extra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(Extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 420, 50));

        Numero.setBackground(new java.awt.Color(255, 255, 255));
        Numero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 440, 50));

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 420, 50));

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 320, 70));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BG_AgregarTigo.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {
            String numero = Numero.getText();
            int num = Integer.parseInt(numero);

            String nombre = Nombre.getText();
            String extra = Extra.getText();

            tigo.agregarPlan(num, nombre, extra, opcionSeleccionada);
            
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor elija un valor numérico válido.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tigoMain pasar = new tigoMain(tigo, planes);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AgregarFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarFORM(new Tigo(), new ArrayList<>()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EXTRAlabel;
    private javax.swing.JTextField Extra;
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Numero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
