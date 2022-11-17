package Visual;

import Logica.Pilotos;
import Logica.Vuelo;
import static Visual.Ventana.listVuelo;
import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class VentanaPilotos extends javax.swing.JFrame implements Serializable{

    int xMouse,yMouse;
    Pilotos p1;
    public VentanaPilotos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Atras = new javax.swing.JButton();
        BotonCrearPilotos1 = new javax.swing.JButton();
        BotonEliminarPilotos = new javax.swing.JButton();
        TituloPilotos = new javax.swing.JLabel();
        FondoPilotos = new javax.swing.JLabel();
        PanelSupPilotos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 110, 30));

        BotonCrearPilotos1.setBackground(new java.awt.Color(51, 51, 51));
        BotonCrearPilotos1.setFont(new java.awt.Font("Roboto Medium", 3, 18)); // NOI18N
        BotonCrearPilotos1.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrearPilotos1.setText("Crear Pilotos");
        BotonCrearPilotos1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCrearPilotos1.setFocusPainted(false);
        BotonCrearPilotos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearPilotos1ActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCrearPilotos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 30));

        BotonEliminarPilotos.setBackground(new java.awt.Color(51, 51, 51));
        BotonEliminarPilotos.setFont(new java.awt.Font("Roboto Medium", 3, 18)); // NOI18N
        BotonEliminarPilotos.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarPilotos.setText("Eliminar Pilotos");
        BotonEliminarPilotos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEliminarPilotos.setFocusPainted(false);
        BotonEliminarPilotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarPilotosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEliminarPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 150, 30));

        TituloPilotos.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        TituloPilotos.setForeground(new java.awt.Color(255, 255, 255));
        TituloPilotos.setText("UTN Airlines");
        jPanel1.add(TituloPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        FondoPilotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dark-blue-and-black-banner-background-free-photo.jpg"))); // NOI18N
        jPanel1.add(FondoPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 110));

        PanelSupPilotos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelSupPilotosMouseDragged(evt);
            }
        });
        PanelSupPilotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSupPilotosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelSupPilotosLayout = new javax.swing.GroupLayout(PanelSupPilotos);
        PanelSupPilotos.setLayout(PanelSupPilotosLayout);
        PanelSupPilotosLayout.setHorizontalGroup(
            PanelSupPilotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        PanelSupPilotosLayout.setVerticalGroup(
            PanelSupPilotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(PanelSupPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarPilotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarPilotosActionPerformed
        int id= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del vuelo", "Crear Vuelo", JOptionPane.INFORMATION_MESSAGE));
        Vuelo vueloAux = seleccionarVuelo(id);
        vueloAux.eliminarPiloto1();
        vueloAux.eliminarPiloto2();
    }//GEN-LAST:event_BotonEliminarPilotosActionPerformed

    private void BotonCrearPilotos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearPilotos1ActionPerformed
        
        int id= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del vuelo", "Crear Vuelo", JOptionPane.INFORMATION_MESSAGE));
        Vuelo vueloAux = seleccionarVuelo(id);
        vueloAux.agregarPiloto1();
        vueloAux.agregarPiloto2();
    }//GEN-LAST:event_BotonCrearPilotos1ActionPerformed

    private void PanelSupPilotosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupPilotosMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_PanelSupPilotosMousePressed

    private void PanelSupPilotosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupPilotosMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_PanelSupPilotosMouseDragged

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    public void agregarPiloto1(){
        String nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre del Piloto", "Crear Piloto", JOptionPane.INFORMATION_MESSAGE);        
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del Piloto", "Crear Piloto", JOptionPane.INFORMATION_MESSAGE);        
        int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el DNI del Piloto", "Crear Piloto", JOptionPane.INFORMATION_MESSAGE));        
        int años=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los años de experiencia del Piloto", "Crear Piloto", JOptionPane.INFORMATION_MESSAGE));
        double sueldo=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el sueldo del Piloto", "Crear Piloto", JOptionPane.INFORMATION_MESSAGE));
        Pilotos piloto=new Pilotos(nombre,apellido,dni,años,sueldo);
        this.p1=piloto;
    }
    public void eliminarPiloto1(){
        this.p1=null;
    }
    
    static Vuelo seleccionarVuelo(int id){
        for(Vuelo vuelo1: listVuelo){
            if(vuelo1.getId()==id){
                return vuelo1;
            }
        }
        return null;
    }
    static void devolver(Vuelo v1, int id){
            for(Vuelo vuelo:listVuelo){
                if(vuelo.getId()==id){
                    vuelo=v1;
                }
            }
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton BotonCrearPilotos1;
    private javax.swing.JButton BotonEliminarPilotos;
    private javax.swing.JLabel FondoPilotos;
    private javax.swing.JPanel PanelSupPilotos;
    private javax.swing.JLabel TituloPilotos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
