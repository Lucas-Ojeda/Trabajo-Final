
package Visual;

import Logica.Vuelo;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
    static List<Vuelo>listVuelo=new LinkedList<>();
    int xMouse, yMouse;
    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        ImagenAvion = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JButton();
        BotonVerVuelos = new javax.swing.JButton();
        BotonAdministrar = new javax.swing.JButton();
        BotonCrearVuelos = new javax.swing.JButton();
        BotonEliminarVuelo = new javax.swing.JButton();
        BotonDatosVuelo = new javax.swing.JButton();
        PanelSup = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Roboto Medium", 3, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("UTN Airlines");
        Panel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        ImagenAvion.setBackground(new java.awt.Color(255, 255, 255));
        ImagenAvion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/png-transparent-computer-icons-airplane-travel-text-airplane-transport.png"))); // NOI18N
        Panel1.add(ImagenAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 70, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Blue-Background-1.jpg"))); // NOI18N
        Panel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Bg.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 500));

        Panel2.setBackground(new java.awt.Color(51, 51, 51));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(0, 102, 255));
        BotonSalir.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
        });
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        Panel2.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 180, 30));

        BotonVerVuelos.setBackground(new java.awt.Color(0, 102, 255));
        BotonVerVuelos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonVerVuelos.setForeground(new java.awt.Color(255, 255, 255));
        BotonVerVuelos.setText("Ver Vuelo");
        BotonVerVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerVuelosActionPerformed(evt);
            }
        });
        Panel2.add(BotonVerVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 30));

        BotonAdministrar.setBackground(new java.awt.Color(0, 102, 255));
        BotonAdministrar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonAdministrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAdministrar.setText("Administrar Vuelo");
        BotonAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdministrarActionPerformed(evt);
            }
        });
        Panel2.add(BotonAdministrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 30));

        BotonCrearVuelos.setBackground(new java.awt.Color(0, 102, 255));
        BotonCrearVuelos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonCrearVuelos.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrearVuelos.setText("Crear Vuelo");
        BotonCrearVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearVuelosActionPerformed(evt);
            }
        });
        Panel2.add(BotonCrearVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, 30));

        BotonEliminarVuelo.setBackground(new java.awt.Color(0, 102, 255));
        BotonEliminarVuelo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonEliminarVuelo.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarVuelo.setText("Eliminar Vuelo");
        BotonEliminarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarVueloActionPerformed(evt);
            }
        });
        Panel2.add(BotonEliminarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 180, 30));

        BotonDatosVuelo.setBackground(new java.awt.Color(0, 102, 255));
        BotonDatosVuelo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonDatosVuelo.setForeground(new java.awt.Color(255, 255, 255));
        BotonDatosVuelo.setText("Datos de Vuelo");
        BotonDatosVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDatosVueloActionPerformed(evt);
            }
        });
        Panel2.add(BotonDatosVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, 30));

        Bg.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 500));

        PanelSup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelSupMouseDragged(evt);
            }
        });
        PanelSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSupMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelSupLayout = new javax.swing.GroupLayout(PanelSup);
        PanelSup.setLayout(PanelSupLayout);
        PanelSupLayout.setHorizontalGroup(
            PanelSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelSupLayout.setVerticalGroup(
            PanelSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Bg.add(PanelSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonEliminarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarVueloActionPerformed
        eliminarVuelo();
    }//GEN-LAST:event_BotonEliminarVueloActionPerformed

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void PanelSupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_PanelSupMousePressed

    private void PanelSupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_PanelSupMouseDragged

    private void BotonVerVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerVuelosActionPerformed
        buscarVuelo();
    }//GEN-LAST:event_BotonVerVuelosActionPerformed

    private void BotonDatosVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDatosVueloActionPerformed
        
    }//GEN-LAST:event_BotonDatosVueloActionPerformed

    private void BotonAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdministrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAdministrarActionPerformed

    private void BotonCrearVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearVuelosActionPerformed
        agregarVuelo();
    }//GEN-LAST:event_BotonCrearVuelosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    static void agregarVuelo(){
        System.out.println("ID DE VUELO: ");
        int id= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del vuelo", "Crear Vuelo", JOptionPane.INFORMATION_MESSAGE));
        String despegue = JOptionPane.showInputDialog(null, "Ingrese la ciudad de salida del vuelo", "Crear Vuelo", JOptionPane.INFORMATION_MESSAGE);
        String destino= JOptionPane.showInputDialog(null, "Ingrese la ciudad de llegada del vuelo", "Crear Vuelo", JOptionPane.INFORMATION_MESSAGE);
        Vuelo vuelo=new Vuelo(id, despegue, destino);
        listVuelo.add(vuelo);
    }
    
    static void listarVuelos(){
        for(Vuelo vuelo:listVuelo){
            System.out.println(vuelo.imprimir());
            JOptionPane.showMessageDialog(null, vuelo.imprimir());
            vuelo.listarAsafatas();
            vuelo.listarPasajeros();
        }
    }
    
    static void buscarVuelo(){
        System.out.println("ID de vuelo: ");
        int id= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del vuelo", "Buscar Vuelo", JOptionPane.INFORMATION_MESSAGE));
        for (Vuelo vuelo1:listVuelo ) {
            if(vuelo1.getId()==id){
                JOptionPane.showMessageDialog(null,vuelo1.imprimir());
                vuelo1.listarAsafatas();
                vuelo1.listarPasajeros();
                break;
            }
        }
    }
    
    static void eliminarVuelo(){
        System.out.println("ID de Vuelo: ");
        int id= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del vuelo", "Eliminar Vuelo", JOptionPane.INFORMATION_MESSAGE));
        for(Vuelo vuelo1:listVuelo){
            if(vuelo1.getId()==id){
                listVuelo.remove(vuelo1);

                break;
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BotonAdministrar;
    private javax.swing.JButton BotonCrearVuelos;
    private javax.swing.JButton BotonDatosVuelo;
    private javax.swing.JButton BotonEliminarVuelo;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVerVuelos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenAvion;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel PanelSup;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
