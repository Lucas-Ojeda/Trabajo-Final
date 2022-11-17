package Visual;

import Logica.Vuelo;
import static Visual.Ventana.listVuelo;
import java.io.Serializable;

public class VentanaAdministracion extends javax.swing.JFrame implements Serializable {
    
    int xMouse, yMouse;
    
    public VentanaAdministracion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Avion = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonAtras = new javax.swing.JButton();
        BotonPilotos = new javax.swing.JButton();
        BotonAsafatas = new javax.swing.JButton();
        BotonAvion = new javax.swing.JButton();
        BotonPasajeros = new javax.swing.JButton();
        PanelSupAdministracion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bg.setBackground(new java.awt.Color(0, 153, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Roboto Medium", 3, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("UTN Airlines");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        Avion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avion15.png"))); // NOI18N
        jPanel1.add(Avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Blue-Background-1.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAtras.setBackground(new java.awt.Color(0, 102, 255));
        BotonAtras.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(255, 255, 255));
        BotonAtras.setText("Atras");
        BotonAtras.setToolTipText("");
        BotonAtras.setFocusPainted(false);
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, -1));

        BotonPilotos.setBackground(new java.awt.Color(0, 102, 255));
        BotonPilotos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonPilotos.setForeground(new java.awt.Color(255, 255, 255));
        BotonPilotos.setText("Pilotos");
        BotonPilotos.setToolTipText("");
        BotonPilotos.setFocusPainted(false);
        BotonPilotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPilotosActionPerformed(evt);
            }
        });
        jPanel2.add(BotonPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, -1));

        BotonAsafatas.setBackground(new java.awt.Color(0, 102, 255));
        BotonAsafatas.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonAsafatas.setForeground(new java.awt.Color(255, 255, 255));
        BotonAsafatas.setText("Asafatas");
        BotonAsafatas.setToolTipText("");
        BotonAsafatas.setFocusPainted(false);
        BotonAsafatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsafatasActionPerformed(evt);
            }
        });
        jPanel2.add(BotonAsafatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        BotonAvion.setBackground(new java.awt.Color(0, 102, 255));
        BotonAvion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonAvion.setForeground(new java.awt.Color(255, 255, 255));
        BotonAvion.setText("Avion");
        BotonAvion.setToolTipText("");
        BotonAvion.setFocusPainted(false);
        BotonAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAvionActionPerformed(evt);
            }
        });
        jPanel2.add(BotonAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        BotonPasajeros.setBackground(new java.awt.Color(0, 102, 255));
        BotonPasajeros.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonPasajeros.setForeground(new java.awt.Color(255, 255, 255));
        BotonPasajeros.setText("Pasajeros");
        BotonPasajeros.setToolTipText("");
        BotonPasajeros.setFocusPainted(false);
        jPanel2.add(BotonPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, -1));

        Bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        PanelSupAdministracion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelSupAdministracionMouseDragged(evt);
            }
        });
        PanelSupAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSupAdministracionMousePressed(evt);
            }
        });
        Bg.add(PanelSupAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        Ventana ventanita = new Ventana();
        ventanita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void PanelSupAdministracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupAdministracionMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_PanelSupAdministracionMousePressed

    private void PanelSupAdministracionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupAdministracionMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_PanelSupAdministracionMouseDragged

    private void BotonPilotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPilotosActionPerformed
        VentanaPilotos ventanapilot = new VentanaPilotos();
        ventanapilot.setVisible(true);
        
    }//GEN-LAST:event_BotonPilotosActionPerformed

    private void BotonAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAvionActionPerformed
        VentanaAviones ventAvion = new VentanaAviones();
        ventAvion.setVisible(true);
    }//GEN-LAST:event_BotonAvionActionPerformed

    private void BotonAsafatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsafatasActionPerformed
        VentanaAsafatas ventAsafatas = new VentanaAsafatas();
        ventAsafatas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAsafatasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avion;
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BotonAsafatas;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonAvion;
    private javax.swing.JButton BotonPasajeros;
    private javax.swing.JButton BotonPilotos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelSupAdministracion;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
