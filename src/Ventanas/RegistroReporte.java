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
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
//Fin importación de clases necesarias

public class RegistroReporte extends javax.swing.JFrame { //Inicio ventana RegistroReporte

    //Inicio definición de variables globales
    int XMouse, YMouse;
    //Fin definición de variables globales

    public RegistroReporte() { //Inicio constructor clase RegistroReporte
        initComponents();
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, FormaVentana);
        this.setLocationRelativeTo(null);
    } //Fin constructor clase RegistroReporte

    //Inicio constructor de objetos clase RegistroReporte
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Registro Reportes"); // NOI18N
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
        JPanel_Principal.setForeground(new java.awt.Color(51, 51, 51));
        JPanel_Principal.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N

        javax.swing.GroupLayout JPanel_PrincipalLayout = new javax.swing.GroupLayout(JPanel_Principal);
        JPanel_Principal.setLayout(JPanel_PrincipalLayout);
        JPanel_PrincipalLayout.setHorizontalGroup(
            JPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JPanel_PrincipalLayout.setVerticalGroup(
            JPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
    //Fin constructor de objetos clase RegistroReporte

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicio ventana RegistroReporte abierta
        for (double i = 0.0; i < 1.0; i += 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método ventana RegistroReporte abierta\nMensaje del error: " + e);
            }
        }
        //Fin ventana RegistroReporte abierta
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

    public static void main(String args[]) { //Inicio lanzador clase RegistroReporte
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroReporte().setVisible(true);
        });
    } //Fin lanzador clase RegistroReporte

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Principal;
    // End of variables declaration//GEN-END:variables

} //Fin ventana RegistroReporte
