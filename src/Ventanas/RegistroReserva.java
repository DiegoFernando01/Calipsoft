package Ventanas;
/*
Calipsoft - Proyecto final bases de datos - Abril / Agosto de 2022
Hecho por: 
Jhon Alexander Valencia Hilamo - 202042426
Cristian Camilo Montaño Renteria - 202024223
Alejandro Zamorano - 201941088
Diego Fernando Victoria López - 202125877
*/

//Inicio importación de clases necesarias
import Animacion.Fade;
import static Ventanas.RegistroEquipos.ObjetoConRegistroUsuarios;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
//Fin importación de clases necesarias

public class RegistroReserva extends javax.swing.JFrame { //Inicio ventana RegistroReserva

    //Inicio definición de variables globales
    int XMouse, YMouse;
    static Menu ObjetoConMenu = new Menu();
    static Principal ObjetoConPrincipal = new Principal();
    //Fin definición de variables globales

    public RegistroReserva() { //Inicio constructor clase RegistroReserva
        initComponents();
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, FormaVentana);
        this.setLocationRelativeTo(null);
    } //Fin constructor clase RegistroReserva

    public static void FechaActual() {
        Date FechaActual = new Date();
        DateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Jt_FechaActual.setText(FormatoFecha.format(FechaActual));
    }

    //Inicio constructor de objetos
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Principal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Jb_Volver = new javax.swing.JButton();
        Jb_Minimizar = new javax.swing.JButton();
        Jb_Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jt_FechaActual = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JPanel_Principal.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Principal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(248, 38, 33)));
        JPanel_Principal.setForeground(new java.awt.Color(51, 51, 51));
        JPanel_Principal.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true), "Registro reserva de equipos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comfortaa", 2, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jb_Volver.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"))); // NOI18N
        Jb_Volver.setToolTipText("Volver a la ventana anterior");
        Jb_Volver.setBorder(null);
        Jb_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jb_Volver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVolverPresionado.png"))); // NOI18N
        Jb_Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVolverResaltado.png"))); // NOI18N
        Jb_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Jb_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        Jb_Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMinimizar.png"))); // NOI18N
        Jb_Minimizar.setToolTipText("Minimizar la aplicación");
        Jb_Minimizar.setBorder(null);
        Jb_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jb_Minimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMinimizarPresionado.png"))); // NOI18N
        Jb_Minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMinimizarResaltado.png"))); // NOI18N
        Jb_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_MinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(Jb_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        Jb_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCerrar.png"))); // NOI18N
        Jb_Cerrar.setToolTipText("Cierra la aplicación");
        Jb_Cerrar.setBorder(null);
        Jb_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jb_Cerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCerrarPresionado.png"))); // NOI18N
        Jb_Cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCerrarResaltado.png"))); // NOI18N
        Jb_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Jb_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fecha actual:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 19, 260, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha de reserva:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 260, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Código del usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 26));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 260, 26));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha de devolución:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 26));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hora préstamo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 260, 26));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Estado reserva:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 260, 26));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hora de devolución:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 26));

        Jt_FechaActual.setEditable(false);
        Jt_FechaActual.setBackground(new java.awt.Color(255, 255, 255));
        Jt_FechaActual.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_FechaActual.setForeground(new java.awt.Color(51, 51, 51));
        Jt_FechaActual.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        jPanel1.add(Jt_FechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 30));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 260, 30));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, 30));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 30));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 51, 51));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 260, 30));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 51, 51));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 260, 30));

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 51, 51));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 260, 30));

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(51, 51, 51));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 260, 30));

        jSeparator1.setForeground(new java.awt.Color(248, 38, 33));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 10, 260));

        javax.swing.GroupLayout JPanel_PrincipalLayout = new javax.swing.GroupLayout(JPanel_Principal);
        JPanel_Principal.setLayout(JPanel_PrincipalLayout);
        JPanel_PrincipalLayout.setHorizontalGroup(
            JPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel_PrincipalLayout.setVerticalGroup(
            JPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Fin constructor de objetos

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicio ventana RegistroReserva abierta
        for (double i = 0.0; i < 1.0; i += 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método ventana RegistroReserva abierta\nMensaje del error: " + e);
            }
        }
        //Fin ventana RegistroReserva abierta
    }//GEN-LAST:event_formWindowOpened

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        //Inicio mouse sobre la ventana
        XMouse = evt.getX();
        YMouse = evt.getY();
        //Fin mouse sobre la ventana
    }//GEN-LAST:event_formMouseMoved

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //Inicio mouse mueve la ventana
        setOpacity((float) 0.7);
        this.setLocation(this.getLocation().x + evt.getX() - XMouse, this.getLocation().y + evt.getY() - YMouse);
        //Fin mouse mueve la ventana
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        //Inicio mouse suelta la ventana
        setOpacity((float) 1);
        //Fin mouse suelta la ventana
    }//GEN-LAST:event_formMouseReleased

    private void Jb_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_VolverActionPerformed
        //Inicio click sobre botón Volver
        int Confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ObjetoConMenu.IconoRegresar);
        if (Confirmacion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Yendo a menú de registro", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConMenu.IconoConfirmacionAceptada);
            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
            ObjetoConMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Manteniendo en el registro de reservas", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConMenu.IconoConfirmacionAceptada);
        }
        //Fin click sobre botón Volver
    }//GEN-LAST:event_Jb_VolverActionPerformed

    private void Jb_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_MinimizarActionPerformed
        //Inicio click sobre botón Minimizar
        for (double i = 1.0; i >= 0.0; i -= 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método ventana Menú minimizada\nMensaje del error: " + e);
            }
        }
        this.setExtendedState(ICONIFIED);
        this.setOpacity(1);
        //Fin click sobre botón Minimizar
    }//GEN-LAST:event_Jb_MinimizarActionPerformed

    private void Jb_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_CerrarActionPerformed
        //Inicio click botón Cerrar
        int ConfirmacionSalir = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoAtencion);
        if (ConfirmacionSalir == JOptionPane.YES_OPTION) {
            ObjetoConPrincipal.SonidoCerrar.play();
            JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConPrincipal.ImagenFin);
            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.EXIT);
        } else {
            JOptionPane.showMessageDialog(null, "Regresando al menú", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoAtencion);
        }
        //Fin click botón Cerrar
    }//GEN-LAST:event_Jb_CerrarActionPerformed

    public static void main(String args[]) { //Inicio lanzador clase RegistroReserva
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroReserva().setVisible(true);
        });
    } //Fin lanzador clase RegistroReserva

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Principal;
    private javax.swing.JButton Jb_Cerrar;
    private javax.swing.JButton Jb_Minimizar;
    private javax.swing.JButton Jb_Volver;
    public static javax.swing.JTextField Jt_FechaActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

} //Fin ventana RegistroReserva
