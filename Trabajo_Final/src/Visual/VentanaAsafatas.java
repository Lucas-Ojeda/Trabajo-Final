package Visual;

import Logica.Vuelo;
import static Visual.Ventana.listVuelo;
import static Visual.VentanaPilotos.seleccionarVuelo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaAsafatas extends javax.swing.JFrame {

    int xMouse,yMouse;
    
    public VentanaAsafatas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonAtras1 = new javax.swing.JButton();
        BotosAgregar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAsafatas = new javax.swing.JTable();
        FondoTabla = new javax.swing.JLabel();
        PanelSupTabla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonEliminar.setBackground(new java.awt.Color(51, 51, 51));
        BotonEliminar.setFont(new java.awt.Font("Roboto Black", 1, 40)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("-");
        BotonEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEliminar.setFocusPainted(false);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        Bg.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 40, 30));

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
        Bg.add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 170, 30));

        BotonAtras1.setBackground(new java.awt.Color(51, 51, 51));
        BotonAtras1.setFont(new java.awt.Font("Roboto Black", 2, 24)); // NOI18N
        BotonAtras1.setForeground(new java.awt.Color(255, 255, 255));
        BotonAtras1.setText("Atras");
        BotonAtras1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAtras1.setFocusPainted(false);
        BotonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtras1ActionPerformed(evt);
            }
        });
        Bg.add(BotonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 170, 30));

        BotosAgregar.setBackground(new java.awt.Color(51, 51, 51));
        BotosAgregar.setFont(new java.awt.Font("Roboto Black", 1, 40)); // NOI18N
        BotosAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotosAgregar.setText("+");
        BotosAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotosAgregar.setFocusPainted(false);
        BotosAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotosAgregarActionPerformed(evt);
            }
        });
        Bg.add(BotosAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 30));

        Titulo.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("UTN Airlines");
        Bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 270, 30));

        TablaAsafatas.setBackground(new java.awt.Color(51, 51, 51));
        TablaAsafatas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaAsafatas.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        TablaAsafatas.setForeground(new java.awt.Color(255, 255, 255));
        TablaAsafatas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Años de Experiencia", "Sueldo"
            }
        ));
        TablaAsafatas.setToolTipText("");
        jScrollPane1.setViewportView(TablaAsafatas);

        Bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 400));

        FondoTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Blue-Background-1.jpg"))); // NOI18N
        Bg.add(FondoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

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

    private void PanelSupTablaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupTablaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_PanelSupTablaMouseDragged

    private void PanelSupTablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSupTablaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_PanelSupTablaMousePressed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        //llenarTabla();
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtras1ActionPerformed
        VentanaAdministracion ventanita = new VentanaAdministracion();
        ventanita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtras1ActionPerformed

    private void BotosAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotosAgregarActionPerformed
        int id= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del vuelo", "Crear Vuelo", JOptionPane.INFORMATION_MESSAGE));
        Vuelo vueloAux = seleccionarVuelo(id);
        
        vueloAux.agregarAsafata();
    }//GEN-LAST:event_BotosAgregarActionPerformed

    
    /*public void llenarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] encabezados = {"Nombre","Apellido","DNI","Años de Experiencia","Sueldo"};
        modelo.setColumnIdentifiers(encabezados);
        Object[] fila;
        
        for(int i = 0;i<= listVuelo.size();i++){
            fila = new Object[5];
            
            fila[0] = listVuelo.get(i).getAsafatas().get(i).getNombre();
            fila[1] = listVuelo.get(i).getAsafatas().get(i).getApellido();
            fila[2] = listVuelo.get(i).getAsafatas().get(i).getDni();
            fila[3] = listVuelo.get(i).getAsafatas().get(i).getAñosExperiencia();
            fila[4] = listVuelo.get(i).getAsafatas().get(i).getSueldo();
            
            modelo.addRow(fila);
        }
        
        TablaAsafatas.setModel(modelo);
    }*/
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonAtras1;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotosAgregar;
    private javax.swing.JLabel FondoTabla;
    private javax.swing.JPanel PanelSupTabla;
    private javax.swing.JTable TablaAsafatas;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
