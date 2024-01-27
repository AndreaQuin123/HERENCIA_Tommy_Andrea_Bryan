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
public class tigoMain extends javax.swing.JFrame {
    
    
     private Tigo tigo;
     private ArrayList<Plan> planes;
    
    public tigoMain(Tigo Funcion, ArrayList<Plan> plan) {
        tigo = Funcion != null ? Funcion : new Tigo();
        planes = plan != null ? plan : new ArrayList<Plan>();
        initComponents();
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        listaPlanes = new javax.swing.JButton();
        agregarAmigo = new javax.swing.JButton();
        pagarPlan = new javax.swing.JButton();
        agregarPlan = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 330, 70));

        listaPlanes.setContentAreaFilled(false);
        listaPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPlanesActionPerformed(evt);
            }
        });
        getContentPane().add(listaPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 330, 70));

        agregarAmigo.setContentAreaFilled(false);
        agregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAmigoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 330, 70));

        pagarPlan.setContentAreaFilled(false);
        pagarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarPlanActionPerformed(evt);
            }
        });
        getContentPane().add(pagarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 330, 70));

        agregarPlan.setContentAreaFilled(false);
        agregarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPlanActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 330, 70));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mainMENU.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAmigoActionPerformed
        AgregarAmigoFORM pasar = new AgregarAmigoFORM(tigo, planes);
        pasar.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_agregarAmigoActionPerformed

    private void listaPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPlanesActionPerformed
        ListaFORM pasar = new ListaFORM(tigo, planes);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listaPlanesActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_salirActionPerformed

    private void agregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPlanActionPerformed
        AgregarFORM pasar = new AgregarFORM(tigo, planes);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agregarPlanActionPerformed

    private void pagarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarPlanActionPerformed

        PagoFORM pasar = new PagoFORM(tigo, planes);
        pasar.setVisible(true);
        this.setVisible(false);
                                  
    }//GEN-LAST:event_pagarPlanActionPerformed

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
            java.util.logging.Logger.getLogger(tigoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tigoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tigoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tigoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Tigo tigo=new Tigo();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tigoMain(new Tigo(), new ArrayList<>()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton agregarAmigo;
    private javax.swing.JButton agregarPlan;
    private javax.swing.JButton listaPlanes;
    private javax.swing.JButton pagarPlan;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
