package Visual;

import Logica.Vuelo;
import static Visual.VentanaPilotos.seleccionarVuelo;
import javax.swing.JOptionPane;

public class VentanaAviones extends javax.swing.JFrame {

    public VentanaAviones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        BotonEliminarAvion = new javax.swing.JButton();
        BotonCrearAvion1 = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        TituloPilotos = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonEliminarAvion.setBackground(new java.awt.Color(51, 51, 51));
        BotonEliminarAvion.setFont(new java.awt.Font("Roboto Medium", 3, 18)); // NOI18N
        BotonEliminarAvion.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarAvion.setText("Eliminar Avion");
        BotonEliminarAvion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEliminarAvion.setFocusPainted(false);
        BotonEliminarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarAvionActionPerformed(evt);
            }
        });
        Bg.add(BotonEliminarAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 150, 30));

        BotonCrearAvion1.setBackground(new java.awt.Color(51, 51, 51));
        BotonCrearAvion1.setFont(new java.awt.Font("Roboto Medium", 3, 18)); // NOI18N
        BotonCrearAvion1.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrearAvion1.setText("Crear Avion");
        BotonCrearAvion1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCrearAvion1.setFocusPainted(false);
        BotonCrearAvion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearAvion1ActionPerformed(evt);
            }
        });
        Bg.add(BotonCrearAvion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 30));

        Atras.setBackground(new java.awt.Color(51, 51, 51));
        Atras.setFont(new java.awt.Font("Roboto Medium", 3, 18)); // NOI18N
        Atras.setForeground(new java.awt.Color(255, 255, 255));
        Atras.setText("Atras");
        Atras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Atras.setFocusPainted(false);
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        Bg.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 110, 30));

        TituloPilotos.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        TituloPilotos.setForeground(new java.awt.Color(255, 255, 255));
        TituloPilotos.setText("UTN Airlines");
        Bg.add(TituloPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dark-blue-and-black-banner-background-free-photo.jpg"))); // NOI18N
        Bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarAvionActionPerformed
        int id= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del vuelo", "Crear Vuelo", JOptionPane.INFORMATION_MESSAGE));
        Vuelo vueloAux = seleccionarVuelo(id);
        vueloAux.eliminarAvion();
    }//GEN-LAST:event_BotonEliminarAvionActionPerformed

    private void BotonCrearAvion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearAvion1ActionPerformed
        int id= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del vuelo", "Crear Vuelo", JOptionPane.INFORMATION_MESSAGE));
        Vuelo vueloAux = seleccionarVuelo(id);
        vueloAux.agregarAvion();
    }//GEN-LAST:event_BotonCrearAvion1ActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BotonCrearAvion1;
    private javax.swing.JButton BotonEliminarAvion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel TituloPilotos;
    // End of variables declaration//GEN-END:variables
}
