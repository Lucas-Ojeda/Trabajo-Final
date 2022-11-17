package Visual;

import Logica.Vuelo;
import static Visual.Ventana.listVuelo;
import java.io.Serializable;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class VentanaTabla extends javax.swing.JFrame implements Serializable {

    int xMouse, yMouse;
    
    
    
    public VentanaTabla() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        FondoTabla = new javax.swing.JLabel();
        PanelSupTabla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BgTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ciudad de Salida", "Ciudad de Llegada"
            }
        ));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        BgTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 400));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UTN Airlines");
        BgTabla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 270, 30));

        BotonAtras.setBackground(new java.awt.Color(51, 51, 51));
        BotonAtras.setFont(new java.awt.Font("Roboto Black", 2, 24)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(255, 255, 255));
        BotonAtras.setText("Atras");
        BotonAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAtras.setFocusPainted(false);
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        BgTabla.add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 170, 30));

        BotonActualizar.setBackground(new java.awt.Color(51, 51, 51));
        BotonActualizar.setFont(new java.awt.Font("Roboto Black", 2, 24)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setText("Actualizar");
        BotonActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonActualizar.setFocusPainted(false);
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        BgTabla.add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 170, 30));

        FondoTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Blue-Background-1.jpg"))); // NOI18N
        BgTabla.add(FondoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        getContentPane().add(BgTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelSupTabla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelSupTablaMouseDragged(evt);
            }
        });
        PanelSupTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSupTablaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelSupTablaLayout = new javax.swing.GroupLayout(PanelSupTabla);
        PanelSupTabla.setLayout(PanelSupTablaLayout);
        PanelSupTablaLayout.setHorizontalGroup(
            PanelSupTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelSupTablaLayout.setVerticalGroup(
            PanelSupTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(PanelSupTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelSupTablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupTablaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_PanelSupTablaMousePressed

    private void PanelSupTablaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupTablaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_PanelSupTablaMouseDragged

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        Ventana ventanita = new Ventana();
        ventanita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        llenarTabla();
    }//GEN-LAST:event_BotonActualizarActionPerformed

    public void llenarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] encabezados = {"ID","Ciudad de Salida","Ciudad de Llegada"};
        modelo.setColumnIdentifiers(encabezados);
        Object[] fila;
        
        for(Vuelo vuelo: listVuelo){
            fila = new Object[3];
            
            fila[0] = vuelo.getId();
            fila[1] = vuelo.getCiudadDespegue();
            fila[2] = vuelo.getCiudadLlegada();
            
            modelo.addRow(fila);
        }
        
        jTable1.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgTabla;
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel FondoTabla;
    private javax.swing.JPanel PanelSupTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
