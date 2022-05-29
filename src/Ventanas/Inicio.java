package Ventanas;
//Hecho por: Diego Fernando Victoria López
//Grado: 11 - B
//Calipsoft - Proyecto de aula - 2019

//Inicio importación de clases necesarias
import Animacion.Fade;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
//Fin importación de clases necesarias

public class Inicio extends javax.swing.JFrame implements Runnable { //Inicio clase Inicio

    //Inicio definición de variables globales
    private Thread Tiempo = null;
    int X, Y;
    //Fin declaración de variables globales

    public Inicio() { //Inicio constructor clase Inicio
        initComponents();
        this.setLocationRelativeTo(null);
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, FormaVentana);
        Tiempo = new Thread(this);
        Tiempo.start();
    } //Fin constructor clase Inicio

    //Inicio constructor de objetos clase Inicio
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanell_Principal = new javax.swing.JPanel();
        Jl_Cargando = new javax.swing.JLabel();
        Jl_Calipsoft = new javax.swing.JLabel();
        JSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        JPanell_Principal.setBackground(new java.awt.Color(255, 255, 255));
        JPanell_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jl_Cargando.setBackground(new java.awt.Color(255, 255, 255));
        Jl_Cargando.setForeground(new java.awt.Color(51, 51, 51));
        Jl_Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GifCarga.gif"))); // NOI18N
        Jl_Cargando.setToolTipText("Cargando");
        JPanell_Principal.add(Jl_Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 400, 80));

        Jl_Calipsoft.setBackground(new java.awt.Color(255, 255, 255));
        Jl_Calipsoft.setForeground(new java.awt.Color(51, 51, 51));
        Jl_Calipsoft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Calipsoft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCalipsoft.png"))); // NOI18N
        Jl_Calipsoft.setToolTipText("CALIPSOFT");
        JPanell_Principal.add(Jl_Calipsoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 252));

        JSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        JSeparator1.setForeground(new java.awt.Color(0, 93, 166));
        JPanell_Principal.add(JSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 380, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanell_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanell_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Fin constructor de objetos clase Inicio

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        //Inicio mouse sobre la ventana
        X = evt.getX();
        Y = evt.getY();
        //Fin mouse sobre la ventana
    }//GEN-LAST:event_formMouseMoved

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //Inicio mouse mueve la ventana
        setOpacity((float) 0.7);
        this.setLocation(this.getLocation().x + evt.getX() - X, this.getLocation().y + evt.getY() - Y);
        //Fin mouse mueve la ventana
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        //Inicio mouse suelta la ventana
        setOpacity((float) 1);
        //Fin mouse suelta la ventana
    }//GEN-LAST:event_formMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicio ventana Inicio abierta
        for (double i = 0.0; i < 1.0; i += 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método Ventana Inicio abierta\nMensaje del error: " + e);
            }
        }
        //Fin ventana Inicio abierta
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanell_Principal;
    private javax.swing.JSeparator JSeparator1;
    private javax.swing.JLabel Jl_Calipsoft;
    private javax.swing.JLabel Jl_Cargando;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() { //Inicio método cronómetro
        while (Tiempo != null) {
            try {
                Thread.sleep(6000);
                Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
                new Principal().setVisible(true);
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.err.println("Error en cronómetro - Método Run\nMensaje del error: " + ex);
            }
            Tiempo = null;
        }
    } //Fin método cronómetro

} //Fin clase Inicio
