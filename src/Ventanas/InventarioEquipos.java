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
import Clases.SqlEquipo;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//Fin importación de clases necesarias

public class InventarioEquipos extends javax.swing.JFrame { //Inicio ventana InventarioEquipo

    //Inicio definición de variables globales
    int XMouse, YMouse;
    static RegistroReserva ObjetoConReserva = new RegistroReserva();
    static Principal ObjetoConPrincipal = new Principal();
    static RegistroUsuarios ObjetoConRegistroUsuarios = new RegistroUsuarios();
    Icon IconoAtencion = new ImageIcon(getClass().getResource("/Imagenes/IconoAtencion.png"));
    //Fin definición de variables globales

    public InventarioEquipos() { //Inicio constructor clase InventarioEquipos
        initComponents();
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, FormaVentana);
        SqlEquipo.ListarInventarioEquipo("", 0);
        this.setLocationRelativeTo(null);
    } //Fin constructor clase InventarioEquipos

    //Inicio constructor de objetos
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Principal = new javax.swing.JPanel();
        JPanel_Superior = new javax.swing.JPanel();
        Jb_Volver = new javax.swing.JButton();
        Jb_Minimizar = new javax.swing.JButton();
        Jb_Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JPanel_Inferior = new javax.swing.JPanel();
        JScroll_TablaEquipos = new javax.swing.JScrollPane();
        JTable_InventarioEquipos = new javax.swing.JTable();
        Jl_Bd = new javax.swing.JLabel();
        Jl_Portatil = new javax.swing.JLabel();
        Jl_SolicitudCodigoEquipo = new javax.swing.JLabel();
        Jt_SerialEquipo = new javax.swing.JTextField();
        Jl_SolicitudTipoEquipo = new javax.swing.JLabel();
        JCbx_TipoEquipo = new javax.swing.JComboBox<>();
        Jb_BuscarEquipo = new javax.swing.JButton();

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
        JPanel_Principal.setForeground(new java.awt.Color(51, 51, 51));
        JPanel_Principal.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JPanel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel_Superior.setBackground(new java.awt.Color(248, 38, 33));
        JPanel_Superior.setForeground(new java.awt.Color(51, 51, 51));
        JPanel_Superior.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N

        Jb_Volver.setBackground(new java.awt.Color(248, 38, 33));
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

        Jb_Minimizar.setBackground(new java.awt.Color(248, 38, 33));
        Jb_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMinimizarBlanco.png"))); // NOI18N
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

        Jb_Cerrar.setBackground(new java.awt.Color(248, 38, 33));
        Jb_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCerrarBlanco.png"))); // NOI18N
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

        jLabel1.setBackground(new java.awt.Color(248, 38, 33));
        jLabel1.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventario de equipos - Calipsoft");
        jLabel1.setToolTipText("Selecciona los equipos a reservar");

        javax.swing.GroupLayout JPanel_SuperiorLayout = new javax.swing.GroupLayout(JPanel_Superior);
        JPanel_Superior.setLayout(JPanel_SuperiorLayout);
        JPanel_SuperiorLayout.setHorizontalGroup(
            JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jb_Volver)
                .addGap(4, 4, 4)
                .addComponent(Jb_Minimizar)
                .addGap(4, 4, 4)
                .addComponent(Jb_Cerrar)
                .addContainerGap())
        );
        JPanel_SuperiorLayout.setVerticalGroup(
            JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_SuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_Minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JPanel_Principal.add(JPanel_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JPanel_Inferior.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Inferior.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true), "Búsqueda de equipos en BD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comfortaa", 2, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        JPanel_Inferior.setForeground(new java.awt.Color(51, 51, 51));
        JPanel_Inferior.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N

        JTable_InventarioEquipos.setBackground(new java.awt.Color(255, 255, 255));
        JTable_InventarioEquipos.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JTable_InventarioEquipos.setForeground(new java.awt.Color(51, 51, 51));
        JTable_InventarioEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Serial", "Tipo equipo", "Ubicación", "Marca", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_InventarioEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTable_InventarioEquipos.setGridColor(new java.awt.Color(0, 93, 166));
        JTable_InventarioEquipos.setSelectionBackground(new java.awt.Color(0, 93, 166));
        JTable_InventarioEquipos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JTable_InventarioEquipos.getTableHeader().setResizingAllowed(false);
        JTable_InventarioEquipos.getTableHeader().setReorderingAllowed(false);
        JScroll_TablaEquipos.setViewportView(JTable_InventarioEquipos);

        Jl_Bd.setBackground(new java.awt.Color(255, 255, 255));
        Jl_Bd.setFont(new java.awt.Font("Comfortaa", 0, 11)); // NOI18N
        Jl_Bd.setForeground(new java.awt.Color(51, 51, 51));
        Jl_Bd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBD.png"))); // NOI18N

        Jl_Portatil.setBackground(new java.awt.Color(255, 255, 255));
        Jl_Portatil.setFont(new java.awt.Font("Comfortaa", 0, 11)); // NOI18N
        Jl_Portatil.setForeground(new java.awt.Color(51, 51, 51));
        Jl_Portatil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Portatil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoPortatil.png"))); // NOI18N

        Jl_SolicitudCodigoEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudCodigoEquipo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudCodigoEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudCodigoEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudCodigoEquipo.setText("Código del equipo:");

        Jt_SerialEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jt_SerialEquipo.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_SerialEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jt_SerialEquipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jt_SerialEquipo.setToolTipText("Código del equipo que desea buscar...");
        Jt_SerialEquipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        Jt_SerialEquipo.setCaretColor(new java.awt.Color(0, 0, 0));
        Jt_SerialEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Jt_SerialEquipo.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        Jt_SerialEquipo.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_SerialEquipo.setSelectionColor(new java.awt.Color(248, 38, 33));
        Jt_SerialEquipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Jt_SerialEquipoFocusGained(evt);
            }
        });
        Jt_SerialEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_SerialEquipoKeyTyped(evt);
            }
        });

        Jl_SolicitudTipoEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudTipoEquipo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudTipoEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudTipoEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudTipoEquipo.setText("Tipo de equipo:");
        Jl_SolicitudTipoEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JCbx_TipoEquipo.setBackground(new java.awt.Color(255, 255, 255));
        JCbx_TipoEquipo.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JCbx_TipoEquipo.setForeground(new java.awt.Color(51, 51, 51));
        JCbx_TipoEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Pc de escritorio", "Pc portátil", "Video beam", "Parlante", "Tv normal", "Tv smart", "Tableta", "Monitor", "Teclado", "Mouse" }));
        JCbx_TipoEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCbx_TipoEquipo.setPreferredSize(new java.awt.Dimension(102, 30));
        JCbx_TipoEquipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JCbx_TipoEquipoFocusGained(evt);
            }
        });

        Jb_BuscarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jb_BuscarEquipo.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jb_BuscarEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jb_BuscarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBusqueda.png"))); // NOI18N
        Jb_BuscarEquipo.setToolTipText("Presione para filtrar los equipos a partir de su tipo...");
        Jb_BuscarEquipo.setBorder(null);
        Jb_BuscarEquipo.setContentAreaFilled(false);
        Jb_BuscarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_BuscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_BuscarEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel_InferiorLayout = new javax.swing.GroupLayout(JPanel_Inferior);
        JPanel_Inferior.setLayout(JPanel_InferiorLayout);
        JPanel_InferiorLayout.setHorizontalGroup(
            JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScroll_TablaEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(JPanel_InferiorLayout.createSequentialGroup()
                        .addComponent(Jl_Bd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCbx_TipoEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jl_SolicitudCodigoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jt_SerialEquipo)
                            .addComponent(Jl_SolicitudTipoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jl_Portatil)
                            .addComponent(Jb_BuscarEquipo))))
                .addContainerGap())
        );
        JPanel_InferiorLayout.setVerticalGroup(
            JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_Portatil)
                    .addComponent(Jl_Bd)
                    .addGroup(JPanel_InferiorLayout.createSequentialGroup()
                        .addComponent(Jl_SolicitudCodigoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jt_SerialEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jl_SolicitudTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel_InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jb_BuscarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JCbx_TipoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScroll_TablaEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanel_Principal.add(JPanel_Inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 580, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Fin constructor de objetos

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //Inicio mouse mueve la ventana
        setOpacity((float) 0.7);
        this.setLocation(this.getLocation().x + evt.getX() - XMouse, this.getLocation().y + evt.getY() - YMouse);
        //Fin mouse mueve la ventana
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        //Inicio mouse sobre la ventana
        XMouse = evt.getX();
        YMouse = evt.getY();
        //Fin mouse sobre la ventana
    }//GEN-LAST:event_formMouseMoved

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        //Inicio mouse suelta la ventana
        setOpacity((float) 1);
        //Fin mouse suelta la ventana
    }//GEN-LAST:event_formMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicio ventana InventarioEquipo abierta
        for (double i = 0.0; i < 1.0; i += 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método Ventana Registro abierta\nMensaje del error: " + e);
            }
        }
        //Fin ventana InventarioEquipo abierta
    }//GEN-LAST:event_formWindowOpened

    private void Jb_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_VolverActionPerformed
        //Inicio click sobre botón Volver
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
        ObjetoConReserva.setVisible(true);
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
                System.err.println("Error en cronómetro - Método ventana Registro Usuarios minimizada\nMensaje del error: " + e);
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
            JOptionPane.showMessageDialog(null, "Regresando al inventario de equipos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoAtencion);
        }
        //Fin click botón Cerrar
    }//GEN-LAST:event_Jb_CerrarActionPerformed

    private void Jt_SerialEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_SerialEquipoKeyTyped
        //Inicio ingreso de letras sobre campo Serial
        char Caracter = evt.getKeyChar();
        if (Character.isLetter(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El serial sólo debe estar compuesto por números", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
        }
        if (Jt_SerialEquipo.getText().length() >= 6) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El serial debe tener un máximo de 6 dígitos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
        }
        SqlEquipo.ListarInventarioEquipo(Jt_SerialEquipo.getText(), 0);
        //Fin ingreso de letras sobre campo Serial
    }//GEN-LAST:event_Jt_SerialEquipoKeyTyped

    private void Jt_SerialEquipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jt_SerialEquipoFocusGained
        //Inicio SerialEquipo gana el foco
        JCbx_TipoEquipo.setSelectedIndex(0);
        //Fin SerialEquipo gana el foco
    }//GEN-LAST:event_Jt_SerialEquipoFocusGained

    private void JCbx_TipoEquipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JCbx_TipoEquipoFocusGained
        Jt_SerialEquipo.setText(null);
    }//GEN-LAST:event_JCbx_TipoEquipoFocusGained

    private void Jb_BuscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_BuscarEquipoActionPerformed
        //Inicio click sobre botón BuscarEquipo
        if (JCbx_TipoEquipo.getSelectedIndex() != 0) {
            SqlEquipo.ListarInventarioEquipo("", JCbx_TipoEquipo.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de equipo para filtrarlo", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoAtencion);
        }
        //Fin click sobre botón BuscarEquipo
    }//GEN-LAST:event_Jb_BuscarEquipoActionPerformed

    public static void main(String args[]) { //Inicio lanzador clase InventarioEquipo
        java.awt.EventQueue.invokeLater(() -> {
            new InventarioEquipos().setVisible(true);
        });
    } //Fin lanzador clase InventarioEquipo

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCbx_TipoEquipo;
    private javax.swing.JPanel JPanel_Inferior;
    private javax.swing.JPanel JPanel_Principal;
    private javax.swing.JPanel JPanel_Superior;
    private javax.swing.JScrollPane JScroll_TablaEquipos;
    public static javax.swing.JTable JTable_InventarioEquipos;
    private javax.swing.JButton Jb_BuscarEquipo;
    private javax.swing.JButton Jb_Cerrar;
    private javax.swing.JButton Jb_Minimizar;
    private javax.swing.JButton Jb_Volver;
    private javax.swing.JLabel Jl_Bd;
    private javax.swing.JLabel Jl_Portatil;
    private javax.swing.JLabel Jl_SolicitudCodigoEquipo;
    private javax.swing.JLabel Jl_SolicitudTipoEquipo;
    private javax.swing.JTextField Jt_SerialEquipo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

} //Fin InventarioEquipo
