package Ventanas;
/*
Calipsoft - Proyecto final bases de datos - Abril / Agosto de 2022
Hecho por: 
Jhon Alexander Valencia Hilamo - 202042426
Cristian Camilo Montaño Renteria - 202024223
Alejandro Zamorano - 201941088
Diego Fernando Victoria López - 202125877
*/

//Inicio importación de clases
import Animacion.Fade;
import Clases.SqlEquipo;
import Clases.SqlUsuarios;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyShadowFade;
//Fin importación de clases

public class Menu extends javax.swing.JFrame { //Inicio clase Menú

    //Inicio definición de variables globales
    int X, Y, NoBorrar;
    public static String NombreBD = "";
    Principal ObjetoConPrincipal = new Principal();
    RegistroUsuarios ObjetoConRegistroUsuarios = new RegistroUsuarios();
    static RegistroEquipos ObjetoConRegistroEquipos = new RegistroEquipos();
    Icon IconoRegresar = new ImageIcon(getClass().getResource("/Imagenes/IconoRegresar.png"));
    Icon IconoConfirmacionAceptada = new ImageIcon(getClass().getResource("/Imagenes/IconoAceptado.png"));
    Icon IconoComputador = new ImageIcon("src/Imagenes/IconoComputador.png");
    Icon IconoContacto = new ImageIcon("src/Imagenes/IconoUsuarios.png");
    Icon IconoReporte = new ImageIcon("src/Imagenes/IconoReportes.png");
    Icon IconoMantenimiento = new ImageIcon("src/Imagenes/IconoMantenimiento.png");
    Icon IconoReserva = new ImageIcon("src/Imagenes/IconoReserva.png");
    Icon IconoMenu = new ImageIcon("src/Imagenes/IconoMenu.png");
    Icon ImagenConstruccion = new ImageIcon("src/Imagenes/Construccion.jpg");
    //Fin definición de variables globales

    public Menu() { //Inicio constructor clase Menú
        initComponents();
        Jl_TituloVentana.setText(null);
        Jl_TituloVentana.setToolTipText(null);
        Jl_AutenticacionUsuario.setText(NombreBD);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoCalipsoftPequeño.png")).getImage());
        this.setLocationRelativeTo(null);
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, FormaVentana);
    } //Fin constructor clase Menú

    //Inicio constructor de objetos clase Menu
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Principal = new javax.swing.JPanel();
        JPanel_Izquierdo = new javax.swing.JPanel();
        JSeparator_Titulo = new javax.swing.JSeparator();
        Jl_TituloCalipsoft = new javax.swing.JLabel();
        Jb_Usuarios = new javax.swing.JButton();
        Jb_Equipos = new javax.swing.JButton();
        Jb_Mantenimiento = new javax.swing.JButton();
        Jb_Reportes = new javax.swing.JButton();
        Jb_Reservas = new javax.swing.JButton();
        Jb_Menu = new javax.swing.JButton();
        JPanel_Superior = new javax.swing.JPanel();
        Jb_Volver = new javax.swing.JButton();
        Jb_Minimizar = new javax.swing.JButton();
        Jb_Cerrar = new javax.swing.JButton();
        Jl_LogoCalipsoft = new javax.swing.JLabel();
        Jl_AutenticacionUsuario = new javax.swing.JLabel();
        JPanel_Inferior = new javax.swing.JPanel();
        JPanel_Menu = new javax.swing.JPanel();
        Jl_Bienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JPanel_Reserva = new javax.swing.JPanel();
        Jb_AgregarReserva = new javax.swing.JButton();
        Jb_EliminarReserva = new javax.swing.JButton();
        Jt_BuscarReserva = new javax.swing.JTextField();
        Jl_BuscarReserva = new javax.swing.JLabel();
        JScroll_TablaReserva = new javax.swing.JScrollPane();
        JTable_Reserva = new javax.swing.JTable();
        JPanel_Mantenimiento = new javax.swing.JPanel();
        Jb_AgregarMantenimiento = new javax.swing.JButton();
        Jb_EliminarMantenimiento = new javax.swing.JButton();
        Jl_BuscarMantenimiento = new javax.swing.JLabel();
        Jt_BuscarMantenimiento = new javax.swing.JTextField();
        JScroll_TablaMantenimiento = new javax.swing.JScrollPane();
        JTable_Mantenimiento = new javax.swing.JTable();
        JPanel_Reportes = new javax.swing.JPanel();
        Jb_EliminarReporte = new javax.swing.JButton();
        Jb_AgregarReporte = new javax.swing.JButton();
        Jt_BuscarReporte = new javax.swing.JTextField();
        Jl_BuscarReporte = new javax.swing.JLabel();
        JScroll_TablaReportes = new javax.swing.JScrollPane();
        JTable_Reportes = new javax.swing.JTable();
        JPanel_Equipos = new javax.swing.JPanel();
        Jb_AgregarEquipo = new javax.swing.JButton();
        Jb_EliminarEquipo = new javax.swing.JButton();
        JScroll_TablaEquipos = new javax.swing.JScrollPane();
        JTable_Equipos = new javax.swing.JTable();
        Jl_BuscarEquipos = new javax.swing.JLabel();
        Jt_BuscarEquipo = new javax.swing.JTextField();
        JPanel_Usuarios = new javax.swing.JPanel();
        JScroll_TablaUsuarios = new javax.swing.JScrollPane();
        JTable_Usuarios = new javax.swing.JTable();
        Jb_EliminarUsuarios = new javax.swing.JButton();
        Jb_AgregarUsuarios = new javax.swing.JButton();
        Jt_BuscarUsuario = new javax.swing.JTextField();
        Jl_BuscarUsuario = new javax.swing.JLabel();
        JPanel_Titulo = new javax.swing.JPanel();
        Jl_TituloVentana = new javax.swing.JLabel();

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
        JPanel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel_Izquierdo.setBackground(new java.awt.Color(248, 38, 33));
        JPanel_Izquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JSeparator_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        JPanel_Izquierdo.add(JSeparator_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, 237, 10));

        Jl_TituloCalipsoft.setBackground(new java.awt.Color(218, 38, 33));
        Jl_TituloCalipsoft.setFont(new java.awt.Font("Varsity Regular", 0, 40)); // NOI18N
        Jl_TituloCalipsoft.setForeground(new java.awt.Color(255, 255, 255));
        Jl_TituloCalipsoft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_TituloCalipsoft.setText("CALIPSOFT");
        JPanel_Izquierdo.add(Jl_TituloCalipsoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 237, 56));

        Jb_Usuarios.setBackground(new java.awt.Color(248, 38, 33));
        Jb_Usuarios.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        Jb_Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        Jb_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoUsuarios.png"))); // NOI18N
        Jb_Usuarios.setText("Usuarios");
        Jb_Usuarios.setBorder(null);
        Jb_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Usuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_UsuariosMouseMoved(evt);
            }
        });
        Jb_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_UsuariosMouseExited(evt);
            }
        });
        Jb_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_UsuariosActionPerformed(evt);
            }
        });
        JPanel_Izquierdo.add(Jb_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 480, 260, 56));

        Jb_Equipos.setBackground(new java.awt.Color(248, 38, 33));
        Jb_Equipos.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        Jb_Equipos.setForeground(new java.awt.Color(255, 255, 255));
        Jb_Equipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoComputador.png"))); // NOI18N
        Jb_Equipos.setText("Equipos");
        Jb_Equipos.setBorder(null);
        Jb_Equipos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Equipos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_EquiposMouseMoved(evt);
            }
        });
        Jb_Equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_EquiposMouseExited(evt);
            }
        });
        Jb_Equipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_EquiposActionPerformed(evt);
            }
        });
        JPanel_Izquierdo.add(Jb_Equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 406, 260, 56));

        Jb_Mantenimiento.setBackground(new java.awt.Color(248, 38, 33));
        Jb_Mantenimiento.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        Jb_Mantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        Jb_Mantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMantenimiento.png"))); // NOI18N
        Jb_Mantenimiento.setText("Mantenimiento");
        Jb_Mantenimiento.setBorder(null);
        Jb_Mantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Mantenimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_MantenimientoMouseMoved(evt);
            }
        });
        Jb_Mantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_MantenimientoMouseExited(evt);
            }
        });
        Jb_Mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_MantenimientoActionPerformed(evt);
            }
        });
        JPanel_Izquierdo.add(Jb_Mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, 260, 56));

        Jb_Reportes.setBackground(new java.awt.Color(248, 38, 33));
        Jb_Reportes.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        Jb_Reportes.setForeground(new java.awt.Color(255, 255, 255));
        Jb_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoReportes.png"))); // NOI18N
        Jb_Reportes.setText("Reportes");
        Jb_Reportes.setBorder(null);
        Jb_Reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Reportes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_ReportesMouseMoved(evt);
            }
        });
        Jb_Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_ReportesMouseExited(evt);
            }
        });
        Jb_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_ReportesActionPerformed(evt);
            }
        });
        JPanel_Izquierdo.add(Jb_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 332, 260, 56));

        Jb_Reservas.setBackground(new java.awt.Color(248, 38, 33));
        Jb_Reservas.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        Jb_Reservas.setForeground(new java.awt.Color(255, 255, 255));
        Jb_Reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoReserva.png"))); // NOI18N
        Jb_Reservas.setText("Reserva");
        Jb_Reservas.setBorder(null);
        Jb_Reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Reservas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_ReservasMouseMoved(evt);
            }
        });
        Jb_Reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_ReservasMouseExited(evt);
            }
        });
        Jb_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_ReservasActionPerformed(evt);
            }
        });
        JPanel_Izquierdo.add(Jb_Reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 184, 260, 56));

        Jb_Menu.setBackground(new java.awt.Color(248, 38, 33));
        Jb_Menu.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        Jb_Menu.setForeground(new java.awt.Color(255, 255, 255));
        Jb_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMenu.png"))); // NOI18N
        Jb_Menu.setText("Menú");
        Jb_Menu.setBorder(null);
        Jb_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_MenuMouseMoved(evt);
            }
        });
        Jb_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_MenuMouseExited(evt);
            }
        });
        Jb_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_MenuActionPerformed(evt);
            }
        });
        JPanel_Izquierdo.add(Jb_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, 260, 56));

        JPanel_Principal.add(JPanel_Izquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 550));

        JPanel_Superior.setBackground(new java.awt.Color(255, 255, 255));

        Jb_Volver.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"))); // NOI18N
        Jb_Volver.setToolTipText("Volver a la ventana anterior");
        Jb_Volver.setBorder(null);
        Jb_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Volver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jb_Volver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVolverPresionado.png"))); // NOI18N
        Jb_Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVolverResaltado.png"))); // NOI18N
        Jb_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_VolverActionPerformed(evt);
            }
        });

        Jb_Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMinimizar.png"))); // NOI18N
        Jb_Minimizar.setToolTipText("Minimizar la aplicación");
        Jb_Minimizar.setBorder(null);
        Jb_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jb_Minimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMinimizarPresionado.png"))); // NOI18N
        Jb_Minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMinimizarResaltado.png"))); // NOI18N
        Jb_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_MinimizarActionPerformed(evt);
            }
        });

        Jb_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCerrar.png"))); // NOI18N
        Jb_Cerrar.setToolTipText("Cierra la aplicación");
        Jb_Cerrar.setBorder(null);
        Jb_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jb_Cerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCerrarPresionado.png"))); // NOI18N
        Jb_Cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCerrarResaltado.png"))); // NOI18N
        Jb_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_CerrarActionPerformed(evt);
            }
        });

        Jl_LogoCalipsoft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCalipsoftPequeño.png"))); // NOI18N
        Jl_LogoCalipsoft.setToolTipText("Calipsoft");

        Jl_AutenticacionUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Jl_AutenticacionUsuario.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_AutenticacionUsuario.setForeground(new java.awt.Color(51, 51, 51));
        Jl_AutenticacionUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout JPanel_SuperiorLayout = new javax.swing.GroupLayout(JPanel_Superior);
        JPanel_Superior.setLayout(JPanel_SuperiorLayout);
        JPanel_SuperiorLayout.setHorizontalGroup(
            JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jl_LogoCalipsoft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jl_AutenticacionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jb_Volver)
                .addGap(4, 4, 4)
                .addComponent(Jb_Minimizar)
                .addGap(4, 4, 4)
                .addComponent(Jb_Cerrar))
        );
        JPanel_SuperiorLayout.setVerticalGroup(
            JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_SuperiorLayout.createSequentialGroup()
                .addGroup(JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jb_Volver)
                    .addComponent(Jb_Minimizar)
                    .addComponent(Jb_Cerrar)
                    .addGroup(JPanel_SuperiorLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(JPanel_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jl_LogoCalipsoft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jl_AutenticacionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel_Principal.add(JPanel_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 820, 40));

        JPanel_Inferior.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Inferior.setLayout(new java.awt.CardLayout());

        JPanel_Menu.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Menu.setForeground(new java.awt.Color(51, 51, 51));

        Jl_Bienvenida.setBackground(new java.awt.Color(255, 153, 153));
        Jl_Bienvenida.setFont(new java.awt.Font("Comfortaa", 0, 26)); // NOI18N
        Jl_Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Jl_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Bienvenida.setText("Bienvenido a Calipsoft");
        Jl_Bienvenida.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(248, 38, 33)));
        Jl_Bienvenida.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Comfortaa", 2, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Módulo de reservas:");

        javax.swing.GroupLayout JPanel_MenuLayout = new javax.swing.GroupLayout(JPanel_Menu);
        JPanel_Menu.setLayout(JPanel_MenuLayout);
        JPanel_MenuLayout.setHorizontalGroup(
            JPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MenuLayout.createSequentialGroup()
                .addComponent(Jl_Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 390, Short.MAX_VALUE))
            .addGroup(JPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel_MenuLayout.setVerticalGroup(
            JPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jl_Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        JPanel_Inferior.add(JPanel_Menu, "card7");

        JPanel_Reserva.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Reserva.setForeground(new java.awt.Color(51, 51, 51));

        Jb_AgregarReserva.setBackground(new java.awt.Color(255, 255, 255));
        Jb_AgregarReserva.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_AgregarReserva.setForeground(new java.awt.Color(51, 51, 51));
        Jb_AgregarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregar.png"))); // NOI18N
        Jb_AgregarReserva.setText("Agregar reserva");
        Jb_AgregarReserva.setToolTipText("Presione para ingresar un mantenimiento");
        Jb_AgregarReserva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_AgregarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_AgregarReserva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregarResaltado.png"))); // NOI18N
        Jb_AgregarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_AgregarReservaActionPerformed(evt);
            }
        });

        Jb_EliminarReserva.setBackground(new java.awt.Color(255, 255, 255));
        Jb_EliminarReserva.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_EliminarReserva.setForeground(new java.awt.Color(51, 51, 51));
        Jb_EliminarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrar.png"))); // NOI18N
        Jb_EliminarReserva.setText("Eliminar reserva");
        Jb_EliminarReserva.setToolTipText("Seleccione en la tabla un mantenimiento y elimínelo presionando aquí");
        Jb_EliminarReserva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_EliminarReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_EliminarReserva.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarPresionado.png"))); // NOI18N
        Jb_EliminarReserva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarResaltado.png"))); // NOI18N
        Jb_EliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_EliminarReservaActionPerformed(evt);
            }
        });

        Jt_BuscarReserva.setBackground(new java.awt.Color(255, 255, 255));
        Jt_BuscarReserva.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_BuscarReserva.setForeground(new java.awt.Color(51, 51, 51));
        Jt_BuscarReserva.setText("Buscar...");
        Jt_BuscarReserva.setToolTipText("Buscar mantenimientos");
        Jt_BuscarReserva.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        Jt_BuscarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jt_BuscarReservaMouseClicked(evt);
            }
        });
        Jt_BuscarReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_BuscarReservaKeyTyped(evt);
            }
        });

        Jl_BuscarReserva.setBackground(new java.awt.Color(255, 255, 255));
        Jl_BuscarReserva.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jl_BuscarReserva.setForeground(new java.awt.Color(51, 51, 51));
        Jl_BuscarReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_BuscarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBusqueda.png"))); // NOI18N

        JTable_Reserva.setBackground(new java.awt.Color(255, 255, 255));
        JTable_Reserva.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JTable_Reserva.setForeground(new java.awt.Color(51, 51, 51));
        JTable_Reserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Fecha de reserva", "Fecha de devolución", "Hora del préstamo", "Hora de devolución", "Código del usuario", "Código de los equipos", "Estado", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Reserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTable_Reserva.setGridColor(new java.awt.Color(0, 93, 166));
        JTable_Reserva.setSelectionBackground(new java.awt.Color(0, 93, 166));
        JTable_Reserva.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JTable_Reserva.getTableHeader().setReorderingAllowed(false);
        JScroll_TablaReserva.setViewportView(JTable_Reserva);

        javax.swing.GroupLayout JPanel_ReservaLayout = new javax.swing.GroupLayout(JPanel_Reserva);
        JPanel_Reserva.setLayout(JPanel_ReservaLayout);
        JPanel_ReservaLayout.setHorizontalGroup(
            JPanel_ReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_ReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ReservaLayout.createSequentialGroup()
                        .addComponent(Jb_AgregarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jb_EliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jl_BuscarReserva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jt_BuscarReserva))
                    .addComponent(JScroll_TablaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanel_ReservaLayout.setVerticalGroup(
            JPanel_ReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_ReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jt_BuscarReserva)
                    .addComponent(Jl_BuscarReserva)
                    .addGroup(JPanel_ReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jb_AgregarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jb_EliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScroll_TablaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel_Inferior.add(JPanel_Reserva, "card6");

        JPanel_Mantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Mantenimiento.setForeground(new java.awt.Color(51, 51, 51));

        Jb_AgregarMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        Jb_AgregarMantenimiento.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_AgregarMantenimiento.setForeground(new java.awt.Color(51, 51, 51));
        Jb_AgregarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregar.png"))); // NOI18N
        Jb_AgregarMantenimiento.setText("Agregar mantenimiento");
        Jb_AgregarMantenimiento.setToolTipText("Presione para ingresar un mantenimiento");
        Jb_AgregarMantenimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_AgregarMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_AgregarMantenimiento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregarResaltado.png"))); // NOI18N
        Jb_AgregarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_AgregarMantenimientoActionPerformed(evt);
            }
        });

        Jb_EliminarMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        Jb_EliminarMantenimiento.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_EliminarMantenimiento.setForeground(new java.awt.Color(51, 51, 51));
        Jb_EliminarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrar.png"))); // NOI18N
        Jb_EliminarMantenimiento.setText("Eliminar mantenimiento");
        Jb_EliminarMantenimiento.setToolTipText("Seleccione en la tabla un mantenimiento y elimínelo presionando aquí");
        Jb_EliminarMantenimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_EliminarMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_EliminarMantenimiento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarPresionado.png"))); // NOI18N
        Jb_EliminarMantenimiento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarResaltado.png"))); // NOI18N
        Jb_EliminarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_EliminarMantenimientoActionPerformed(evt);
            }
        });

        Jl_BuscarMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        Jl_BuscarMantenimiento.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jl_BuscarMantenimiento.setForeground(new java.awt.Color(51, 51, 51));
        Jl_BuscarMantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_BuscarMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBusqueda.png"))); // NOI18N

        Jt_BuscarMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        Jt_BuscarMantenimiento.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_BuscarMantenimiento.setForeground(new java.awt.Color(51, 51, 51));
        Jt_BuscarMantenimiento.setText("Buscar...");
        Jt_BuscarMantenimiento.setToolTipText("Buscar mantenimientos");
        Jt_BuscarMantenimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        Jt_BuscarMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jt_BuscarMantenimientoMouseClicked(evt);
            }
        });
        Jt_BuscarMantenimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_BuscarMantenimientoKeyTyped(evt);
            }
        });

        JTable_Mantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        JTable_Mantenimiento.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JTable_Mantenimiento.setForeground(new java.awt.Color(51, 51, 51));
        JTable_Mantenimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Serial del equipo", "Código del usuario", "Tipo de falla", "Fecha", "Descripción", "Estado del equipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Mantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTable_Mantenimiento.setGridColor(new java.awt.Color(0, 93, 166));
        JTable_Mantenimiento.setSelectionBackground(new java.awt.Color(0, 93, 166));
        JTable_Mantenimiento.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JTable_Mantenimiento.getTableHeader().setReorderingAllowed(false);
        JScroll_TablaMantenimiento.setViewportView(JTable_Mantenimiento);

        javax.swing.GroupLayout JPanel_MantenimientoLayout = new javax.swing.GroupLayout(JPanel_Mantenimiento);
        JPanel_Mantenimiento.setLayout(JPanel_MantenimientoLayout);
        JPanel_MantenimientoLayout.setHorizontalGroup(
            JPanel_MantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_MantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_MantenimientoLayout.createSequentialGroup()
                        .addComponent(Jb_AgregarMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jb_EliminarMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jl_BuscarMantenimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jt_BuscarMantenimiento))
                    .addComponent(JScroll_TablaMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanel_MantenimientoLayout.setVerticalGroup(
            JPanel_MantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_MantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jt_BuscarMantenimiento)
                    .addComponent(Jl_BuscarMantenimiento)
                    .addGroup(JPanel_MantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jb_AgregarMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jb_EliminarMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScroll_TablaMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel_Inferior.add(JPanel_Mantenimiento, "card5");

        JPanel_Reportes.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Reportes.setForeground(new java.awt.Color(51, 51, 51));

        Jb_EliminarReporte.setBackground(new java.awt.Color(255, 255, 255));
        Jb_EliminarReporte.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_EliminarReporte.setForeground(new java.awt.Color(51, 51, 51));
        Jb_EliminarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrar.png"))); // NOI18N
        Jb_EliminarReporte.setText("Eliminar reporte");
        Jb_EliminarReporte.setToolTipText("Seleccione en la tabla un reporte y elimínelo presionando aquí");
        Jb_EliminarReporte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_EliminarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_EliminarReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarPresionado.png"))); // NOI18N
        Jb_EliminarReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarResaltado.png"))); // NOI18N
        Jb_EliminarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_EliminarReporteActionPerformed(evt);
            }
        });

        Jb_AgregarReporte.setBackground(new java.awt.Color(255, 255, 255));
        Jb_AgregarReporte.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_AgregarReporte.setForeground(new java.awt.Color(51, 51, 51));
        Jb_AgregarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregar.png"))); // NOI18N
        Jb_AgregarReporte.setText("Agregar reporte");
        Jb_AgregarReporte.setToolTipText("Presione para ingresar un reporte");
        Jb_AgregarReporte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_AgregarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_AgregarReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregarResaltado.png"))); // NOI18N
        Jb_AgregarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_AgregarReporteActionPerformed(evt);
            }
        });

        Jt_BuscarReporte.setBackground(new java.awt.Color(255, 255, 255));
        Jt_BuscarReporte.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_BuscarReporte.setForeground(new java.awt.Color(51, 51, 51));
        Jt_BuscarReporte.setText("Buscar...");
        Jt_BuscarReporte.setToolTipText("");
        Jt_BuscarReporte.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        Jt_BuscarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jt_BuscarReporteMouseClicked(evt);
            }
        });
        Jt_BuscarReporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_BuscarReporteKeyTyped(evt);
            }
        });

        Jl_BuscarReporte.setBackground(new java.awt.Color(255, 255, 255));
        Jl_BuscarReporte.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jl_BuscarReporte.setForeground(new java.awt.Color(51, 51, 51));
        Jl_BuscarReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_BuscarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBusqueda.png"))); // NOI18N
        Jl_BuscarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jl_BuscarReporteMouseClicked(evt);
            }
        });

        JTable_Reportes.setBackground(new java.awt.Color(255, 255, 255));
        JTable_Reportes.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JTable_Reportes.setForeground(new java.awt.Color(51, 51, 51));
        JTable_Reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTable_Reportes.setToolTipText("Tabla de reportes");
        JScroll_TablaReportes.setViewportView(JTable_Reportes);

        javax.swing.GroupLayout JPanel_ReportesLayout = new javax.swing.GroupLayout(JPanel_Reportes);
        JPanel_Reportes.setLayout(JPanel_ReportesLayout);
        JPanel_ReportesLayout.setHorizontalGroup(
            JPanel_ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScroll_TablaReportes)
                    .addGroup(JPanel_ReportesLayout.createSequentialGroup()
                        .addComponent(Jb_AgregarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jb_EliminarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jl_BuscarReporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jt_BuscarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanel_ReportesLayout.setVerticalGroup(
            JPanel_ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jt_BuscarReporte)
                    .addComponent(Jl_BuscarReporte)
                    .addGroup(JPanel_ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jb_AgregarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jb_EliminarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScroll_TablaReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanel_Inferior.add(JPanel_Reportes, "card4");

        JPanel_Equipos.setBackground(new java.awt.Color(255, 255, 255));

        Jb_AgregarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jb_AgregarEquipo.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_AgregarEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jb_AgregarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregar.png"))); // NOI18N
        Jb_AgregarEquipo.setText("Agregar equipos");
        Jb_AgregarEquipo.setToolTipText("Presione para ingresar un equipo");
        Jb_AgregarEquipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_AgregarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_AgregarEquipo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregarResaltado.png"))); // NOI18N
        Jb_AgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_AgregarEquipoActionPerformed(evt);
            }
        });

        Jb_EliminarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jb_EliminarEquipo.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_EliminarEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jb_EliminarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrar.png"))); // NOI18N
        Jb_EliminarEquipo.setText("Eliminar equipos");
        Jb_EliminarEquipo.setToolTipText("Seleccione en la tabla un equipo y elimínelo presionando aquí");
        Jb_EliminarEquipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_EliminarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_EliminarEquipo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarPresionado.png"))); // NOI18N
        Jb_EliminarEquipo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarResaltado.png"))); // NOI18N
        Jb_EliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_EliminarEquipoActionPerformed(evt);
            }
        });

        JTable_Equipos.setBackground(new java.awt.Color(255, 255, 255));
        JTable_Equipos.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JTable_Equipos.setForeground(new java.awt.Color(51, 51, 51));
        JTable_Equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial", "Tipo", "Ubicación", "Marca", "Modelo", "Observaciones", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Equipos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTable_Equipos.setGridColor(new java.awt.Color(0, 93, 166));
        JTable_Equipos.setSelectionBackground(new java.awt.Color(0, 93, 166));
        JTable_Equipos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JTable_Equipos.getTableHeader().setReorderingAllowed(false);
        JScroll_TablaEquipos.setViewportView(JTable_Equipos);

        Jl_BuscarEquipos.setBackground(new java.awt.Color(255, 255, 255));
        Jl_BuscarEquipos.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jl_BuscarEquipos.setForeground(new java.awt.Color(51, 51, 51));
        Jl_BuscarEquipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_BuscarEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBusqueda.png"))); // NOI18N
        Jl_BuscarEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jl_BuscarEquiposMouseClicked(evt);
            }
        });

        Jt_BuscarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jt_BuscarEquipo.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_BuscarEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jt_BuscarEquipo.setText("Buscar...");
        Jt_BuscarEquipo.setToolTipText("Ingrese un serial o modelo para buscar el equipo");
        Jt_BuscarEquipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        Jt_BuscarEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jt_BuscarEquipoMouseClicked(evt);
            }
        });
        Jt_BuscarEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_BuscarEquipoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout JPanel_EquiposLayout = new javax.swing.GroupLayout(JPanel_Equipos);
        JPanel_Equipos.setLayout(JPanel_EquiposLayout);
        JPanel_EquiposLayout.setHorizontalGroup(
            JPanel_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_EquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jb_AgregarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jb_EliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jl_BuscarEquipos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jt_BuscarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(JPanel_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanel_EquiposLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JScroll_TablaEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        JPanel_EquiposLayout.setVerticalGroup(
            JPanel_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_EquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jt_BuscarEquipo)
                    .addComponent(Jl_BuscarEquipos)
                    .addGroup(JPanel_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jb_AgregarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jb_EliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(393, Short.MAX_VALUE))
            .addGroup(JPanel_EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_EquiposLayout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(JScroll_TablaEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        JPanel_Inferior.add(JPanel_Equipos, "card3");

        JPanel_Usuarios.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Usuarios.setForeground(new java.awt.Color(51, 51, 51));
        JPanel_Usuarios.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N

        JTable_Usuarios.setBackground(new java.awt.Color(255, 255, 255));
        JTable_Usuarios.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JTable_Usuarios.setForeground(new java.awt.Color(51, 51, 51));
        JTable_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Primer nombre", "Segundo nombre", "Primer apellido", "Segundo apellido", "Sexo", "Correo", "Teléfono", "Tipo perfil", "Área", "Contraseña", "Cargo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTable_Usuarios.setGridColor(new java.awt.Color(0, 93, 166));
        JTable_Usuarios.setSelectionBackground(new java.awt.Color(0, 93, 166));
        JTable_Usuarios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JTable_Usuarios.getTableHeader().setReorderingAllowed(false);
        JScroll_TablaUsuarios.setViewportView(JTable_Usuarios);

        Jb_EliminarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        Jb_EliminarUsuarios.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_EliminarUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        Jb_EliminarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrar.png"))); // NOI18N
        Jb_EliminarUsuarios.setText("Eliminar usuarios");
        Jb_EliminarUsuarios.setToolTipText("Presione para eliminar usuarios");
        Jb_EliminarUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_EliminarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_EliminarUsuarios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarPresionado.png"))); // NOI18N
        Jb_EliminarUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBorrarResaltado.png"))); // NOI18N
        Jb_EliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_EliminarUsuariosActionPerformed(evt);
            }
        });

        Jb_AgregarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        Jb_AgregarUsuarios.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_AgregarUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        Jb_AgregarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregar.png"))); // NOI18N
        Jb_AgregarUsuarios.setText("Agregar usuarios");
        Jb_AgregarUsuarios.setToolTipText("Presione para agregar usuarios");
        Jb_AgregarUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_AgregarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jb_AgregarUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregarResaltado.png"))); // NOI18N
        Jb_AgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_AgregarUsuariosActionPerformed(evt);
            }
        });

        Jt_BuscarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Jt_BuscarUsuario.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_BuscarUsuario.setForeground(new java.awt.Color(51, 51, 51));
        Jt_BuscarUsuario.setText("Buscar...");
        Jt_BuscarUsuario.setToolTipText("Código, nombres u apellido del usuario");
        Jt_BuscarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(248, 38, 33)));
        Jt_BuscarUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Jt_BuscarUsuarioFocusGained(evt);
            }
        });
        Jt_BuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jt_BuscarUsuarioMouseClicked(evt);
            }
        });
        Jt_BuscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_BuscarUsuarioKeyTyped(evt);
            }
        });

        Jl_BuscarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Jl_BuscarUsuario.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jl_BuscarUsuario.setForeground(new java.awt.Color(51, 51, 51));
        Jl_BuscarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_BuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBusqueda.png"))); // NOI18N

        javax.swing.GroupLayout JPanel_UsuariosLayout = new javax.swing.GroupLayout(JPanel_Usuarios);
        JPanel_Usuarios.setLayout(JPanel_UsuariosLayout);
        JPanel_UsuariosLayout.setHorizontalGroup(
            JPanel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_UsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScroll_TablaUsuarios)
                    .addGroup(JPanel_UsuariosLayout.createSequentialGroup()
                        .addComponent(Jb_AgregarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jb_EliminarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jl_BuscarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jt_BuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanel_UsuariosLayout.setVerticalGroup(
            JPanel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_UsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_BuscarUsuario)
                    .addComponent(Jt_BuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(JPanel_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jb_AgregarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jb_EliminarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScroll_TablaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanel_Inferior.add(JPanel_Usuarios, "card2");

        JPanel_Principal.add(JPanel_Inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 820, 440));

        JPanel_Titulo.setBackground(new java.awt.Color(248, 38, 33));

        Jl_TituloVentana.setBackground(new java.awt.Color(248, 38, 31));
        Jl_TituloVentana.setFont(new java.awt.Font("Comfortaa", 0, 26)); // NOI18N
        Jl_TituloVentana.setForeground(new java.awt.Color(255, 255, 255));
        Jl_TituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_TituloVentana.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout JPanel_TituloLayout = new javax.swing.GroupLayout(JPanel_Titulo);
        JPanel_Titulo.setLayout(JPanel_TituloLayout);
        JPanel_TituloLayout.setHorizontalGroup(
            JPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jl_TituloVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel_TituloLayout.setVerticalGroup(
            JPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jl_TituloVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanel_Principal.add(JPanel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 820, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Fin constructor de objetos clase Menu

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

    private void Jb_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_VolverActionPerformed
        //Inicio click sobre botón Volver
        int Confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú de ingreso?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, IconoRegresar);
        if (Confirmacion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Yendo a menú de registro", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoConfirmacionAceptada);
            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
            ObjetoConPrincipal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Manteniendo en el menú principal", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoConfirmacionAceptada);
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

    private void Jb_UsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_UsuariosMouseMoved
        //Inicio mouse sobre botón Usuarios        
        Jb_Usuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 255, 255)));
        //Fin mouse sobre botón Usuarios
    }//GEN-LAST:event_Jb_UsuariosMouseMoved

    private void Jb_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_UsuariosActionPerformed
        //Inicio click sobre botón Usuarios
        Jb_Usuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 255, 255)));
        Jb_Equipos.setBorder(null);
        Jl_TituloVentana.setText("Administración de usuarios");
        Jl_TituloVentana.setIcon(IconoContacto);
        Jl_TituloVentana.setToolTipText("Genere, busque, borre o actualice usuarios registrados");
        JPanel_Inferior.removeAll();
        JPanel_Inferior.add(JPanel_Usuarios);
        JPanel_Inferior.repaint();
        JPanel_Inferior.revalidate();
        SqlUsuarios.ListarUsuario("");
        //Fin click sobre botón Usuarios
    }//GEN-LAST:event_Jb_UsuariosActionPerformed

    private void Jb_EquiposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_EquiposMouseMoved
        //Inicio mouse sobre botón Equipos
        Jb_Equipos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 255, 255)));
        //Fin mouse sobre botón Equipso
    }//GEN-LAST:event_Jb_EquiposMouseMoved

    private void Jb_EquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_EquiposActionPerformed
        //Inicio mouse click sobre botón Equipos
        Jb_Equipos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 255, 255)));
        Jb_Usuarios.setBorder(null);
        Jl_TituloVentana.setText("Administración equipos");
        Jl_TituloVentana.setIcon(IconoComputador);
        Jl_TituloVentana.setToolTipText("Genere, busque, borre o actualice equipos");
        JPanel_Inferior.removeAll();
        JPanel_Inferior.add(JPanel_Equipos);
        JPanel_Inferior.repaint();
        JPanel_Inferior.revalidate();
        SqlEquipo.ListarEquipo("");
        //Fin click sobre botón Equipos
    }//GEN-LAST:event_Jb_EquiposActionPerformed

    private void Jb_UsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_UsuariosMouseExited
        //Inicio mouse sale de botón Usuarios
        Jb_Usuarios.setBorder(null);
        //Fin mouse sale de botón Usuarios
    }//GEN-LAST:event_Jb_UsuariosMouseExited

    private void Jb_EquiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_EquiposMouseExited
        //Inicio mouse sale de botón Equipos
        Jb_Equipos.setBorder(null);
        //Fin mouse sale de botón Equipos
    }//GEN-LAST:event_Jb_EquiposMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicio ventana Menú abierta
        for (double i = 0.0; i < 1.0; i += 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método Ventana Menú abierta\nMensaje del error: " + e);
            }
        }
        //Fin ventana Menú abierta
    }//GEN-LAST:event_formWindowOpened

    private void Jb_AgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_AgregarUsuariosActionPerformed
        //Inicio click sobre botón Agregar Usuarios
        for (double i = 1.0; i >= 0.0; i -= 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método ventana Menú cerrada\nMensaje del error: " + e);
            }
        }
        this.setVisible(false);
        this.setOpacity(1);
        ObjetoConRegistroUsuarios.setVisible(true);
        //Fin click sobre botón Agregar Usuarios
    }//GEN-LAST:event_Jb_AgregarUsuariosActionPerformed

    private void Jb_EliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_EliminarUsuariosActionPerformed
        //Inicio click sobre botón Borrar Usuario
        if (JTable_Usuarios.getRowCount() < 1) {
            new rojerusan.RSNotifyShadowFade("La tabla no tiene registros", "No hay registros en la tabla\npara eliminar", 3, RSNotifyShadowFade.PositionNotify.TopRight, RSNotifyShadowFade.TypeNotify.WARNING).setVisible(true);
        } else {
            if (JTable_Usuarios.getSelectedRowCount() < 1) {
                new rojerusan.RSNotifyShadowFade("¡Seleccione un usuario a eliminar!", "Seleccione en la tabla el\nusuario a eliminar", 3, RSNotifyShadowFade.PositionNotify.TopRight, RSNotifyShadowFade.TypeNotify.WARNING).setVisible(true);
            } else {
                int FilaElegida = JTable_Usuarios.getSelectedRow();
                if (JTable_Usuarios.getValueAt(FilaElegida, 0).toString().equals("111111")) {
                    new rojerusan.RSNotifyShadowFade("No es posible eliminar el usuario", "No se pudo eliminar el usuario\nseleccionado", 3, RSNotifyShadowFade.PositionNotify.TopRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
                } else {
                    int ConfirmarBorrado = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el usuario?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if (ConfirmarBorrado == 0) {
                        int Eliminar = SqlUsuarios.EliminarUsuario(Integer.parseInt(JTable_Usuarios.getValueAt(FilaElegida, 0).toString()));
                        if (Eliminar != 0) {
                            new rojerusan.RSNotifyShadowFade("¡Usuario eliminado!", "El usuario seleccionado fue\neliminado correctamente", 3, RSNotifyShadowFade.PositionNotify.TopRight, RSNotifyShadowFade.TypeNotify.SUCCESS).setVisible(true);
                            SqlUsuarios.ListarUsuario("");
                        }
                    }
                }
            }
        }
        //Fin click sobre botón Borrar Usuario
    }//GEN-LAST:event_Jb_EliminarUsuariosActionPerformed

    private void Jb_EliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_EliminarEquipoActionPerformed
        //Inicio click sobre botón Borrar Equipo
        if (JTable_Equipos.getRowCount() < 1) {
            new rojerusan.RSNotifyShadowFade("La tabla no tiene registros", "No hay registros en la tabla\npara eliminar", 3, RSNotifyShadowFade.PositionNotify.TopRight, RSNotifyShadowFade.TypeNotify.WARNING).setVisible(true);
        } else {
            if (JTable_Equipos.getSelectedRowCount() < 1) {
                new rojerusan.RSNotifyShadowFade("Seleccione un equipo", "Seleccione el equipo que\ndesea eliminar", 3, RSNotifyShadowFade.PositionNotify.TopRight, RSNotifyShadowFade.TypeNotify.WARNING).setVisible(true);
            } else {
                int FilaElegida = JTable_Equipos.getSelectedRow();
                if (JTable_Equipos.getValueAt(FilaElegida, 0).toString().equals("111111")) {
                    new rojerusan.RSNotifyShadowFade("No es posible eliminar el equipo", "No se pudo eliminar el equipo\nseleccionado", 3, RSNotifyShadowFade.PositionNotify.TopRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
                } else {
                    int ConfirmarBorrado = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el equipo?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoAtencion);
                    if (ConfirmarBorrado == 0) {
                        int Eliminar = SqlEquipo.EliminarEquipo(Integer.parseInt(JTable_Equipos.getValueAt(FilaElegida, 0).toString()));
                        if (Eliminar != 0) {
                            new rojerusan.RSNotifyShadowFade("!Equipo eliminado¡", "El equipo seleccionado fue\neliminado correctamente", 3, RSNotifyShadowFade.PositionNotify.TopRight, RSNotifyShadowFade.TypeNotify.SUCCESS).setVisible(true);
                            SqlEquipo.ListarEquipo("");
                        }
                    }
                }
            }
        }
        //Fin click sobre botón Borrar Equipo
    }//GEN-LAST:event_Jb_EliminarEquipoActionPerformed

    private void Jb_MantenimientoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_MantenimientoMouseMoved
        //Inicio mouse sobre botón Matenimiento
        Jb_Mantenimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 255, 255)));
        //Fin click sobre botón Mantenitenimiento
    }//GEN-LAST:event_Jb_MantenimientoMouseMoved

    private void Jb_MantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_MantenimientoMouseExited
        //Inicio mouse sale de botón Matenimiento
        Jb_Mantenimiento.setBorder(null);
        //Fin click mouse sale de botón Mantenimiento
    }//GEN-LAST:event_Jb_MantenimientoMouseExited

    private void Jb_MantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_MantenimientoActionPerformed
        //Inicio click sobre botón Mantenimiento
        Jl_TituloVentana.setText("Mantenimiento de equipos");
        Jl_TituloVentana.setIcon(IconoMantenimiento);
        Jl_TituloVentana.setToolTipText("Genere, busque, borre o actualice la lista de equipos en mantenimiento");
        JPanel_Inferior.removeAll();
        JPanel_Inferior.add(JPanel_Mantenimiento);
        JPanel_Inferior.repaint();
        JPanel_Inferior.revalidate();
        //Fin click sobre botón Mantenimiento
    }//GEN-LAST:event_Jb_MantenimientoActionPerformed

    private void Jb_ReportesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_ReportesMouseMoved
        //Inicio mouse sobre botón Reportes
        Jb_Reportes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 255, 255)));
        //Fin mouse sobre botón Reportes
    }//GEN-LAST:event_Jb_ReportesMouseMoved

    private void Jb_ReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_ReportesMouseExited
        //Inicio mouse sale de botón Reportes
        Jb_Reportes.setBorder(null);
        //Fin mouse sale de botón Reportes
    }//GEN-LAST:event_Jb_ReportesMouseExited

    private void Jb_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_ReportesActionPerformed
        //Inicio click sobre botón Reportes
        Jl_TituloVentana.setText("Reportes de equipos");
        Jl_TituloVentana.setIcon(IconoReporte);
        Jl_TituloVentana.setToolTipText("Genere, busque, borre o actualice reportes de equipos");
        JPanel_Inferior.removeAll();
        JPanel_Inferior.add(JPanel_Reportes);
        JPanel_Inferior.repaint();
        JPanel_Inferior.revalidate();
        //Fin click sobre botón Reportes
    }//GEN-LAST:event_Jb_ReportesActionPerformed

    private void Jb_ReservasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_ReservasMouseMoved
        //Inicio mouse sobre botón Reservas
        Jb_Reservas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 255, 255)));
        //Fin mouse sobre botón Reservas
    }//GEN-LAST:event_Jb_ReservasMouseMoved

    private void Jb_ReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_ReservasMouseExited
        //Inicio mouse sale del botón Reservas
        Jb_Reservas.setBorder(null);
        //Fin mouse sale del botón Reservas
    }//GEN-LAST:event_Jb_ReservasMouseExited

    private void Jb_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_ReservasActionPerformed
        //Inicio click sobre botón Reservas
        Jl_TituloVentana.setText("Reserva de equipos");
        Jl_TituloVentana.setIcon(IconoReserva);
        Jl_TituloVentana.setToolTipText("Genere, busque, borre o actualice la lista de equipos reservados");
        JPanel_Inferior.removeAll();
        JPanel_Inferior.add(JPanel_Reserva);
        JPanel_Inferior.repaint();
        JPanel_Inferior.revalidate();
        //Fin click sobre botón Reservas
    }//GEN-LAST:event_Jb_ReservasActionPerformed

    private void Jb_MenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_MenuMouseMoved
        //Inicio mouse sobre botón Menú
        Jb_Menu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 255, 255)));
        //Fin click sobre botón Menú
    }//GEN-LAST:event_Jb_MenuMouseMoved

    private void Jb_MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_MenuMouseExited
        //Inicio mouse sale de botón Menú
        Jb_Menu.setBorder(null);
        //Fin mouse sale de botón Menú
    }//GEN-LAST:event_Jb_MenuMouseExited

    private void Jb_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_MenuActionPerformed
        //Inicio click sobre botón Menú
        Jl_TituloVentana.setText("Menú principal");
        Jl_TituloVentana.setIcon(IconoMenu);
        Jl_TituloVentana.setToolTipText("Conozca el funcionamiento y algunos detalles sobre la aplicación");
        JPanel_Inferior.removeAll();
        JPanel_Inferior.add(JPanel_Menu);
        JPanel_Inferior.repaint();
        JPanel_Inferior.revalidate();
        //Fin click sobre botón Menú
    }//GEN-LAST:event_Jb_MenuActionPerformed

    private void Jt_BuscarUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_BuscarUsuarioKeyTyped
        //Inicio ingreso de letra o número en campo BuscarUsuario
        SqlUsuarios.ListarUsuario(Jt_BuscarUsuario.getText());
        //Fin ingreso de letra o número en campo BuscarUsuario
    }//GEN-LAST:event_Jt_BuscarUsuarioKeyTyped

    private void Jt_BuscarUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jt_BuscarUsuarioFocusGained
        //Inicio click sobre campo Buscar Usuario
        Jt_BuscarUsuario.setText(null);
        //Fin click sobre campo Buscar Usuario
    }//GEN-LAST:event_Jt_BuscarUsuarioFocusGained

    private void Jt_BuscarEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_BuscarEquipoKeyTyped
        //Inicio ingreso de letra en campo Buscar Equipo
        SqlEquipo.ListarEquipo(Jt_BuscarEquipo.getText());
        //Fin ingreso de letra en campo Buscar Equipo
    }//GEN-LAST:event_Jt_BuscarEquipoKeyTyped

    private void Jt_BuscarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jt_BuscarUsuarioMouseClicked
        //Inicio click sobre campo Buscar Usuario
        if ((Jt_BuscarUsuario.getText()).equals("Buscar...")) {
            Jt_BuscarUsuario.setText(null);
        }
        //Fin click sobre campo Buscar Usuario
    }//GEN-LAST:event_Jt_BuscarUsuarioMouseClicked

    private void Jt_BuscarEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jt_BuscarEquipoMouseClicked
        //Inicio click sobre campo Buscar Equipo
        if ((Jt_BuscarEquipo.getText()).equals("Buscar...")) {
            Jt_BuscarEquipo.setText(null);
        }
        //Fin click sobre campo Buscar Equipo
    }//GEN-LAST:event_Jt_BuscarEquipoMouseClicked

    private void Jb_AgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_AgregarEquipoActionPerformed
        //Inicio click sobre botón Agregar Equipo
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            System.err.println("Error en cronómetro - Método click en botón AgregarEquipo\nMensaje del error: " + ex);
        }
        ObjetoConRegistroEquipos.setVisible(true);
        //Fin click sobre botón Agregar Equipo
    }//GEN-LAST:event_Jb_AgregarEquipoActionPerformed

    private void Jb_EliminarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_EliminarReporteActionPerformed
        //Inicio click sobre botón Eliminar Reporte
        JOptionPane.showMessageDialog(null, "", "Módulo en construcción - CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ImagenConstruccion);
        ///Fin click sobre botón Eliminar Reporte
    }//GEN-LAST:event_Jb_EliminarReporteActionPerformed

    private void Jb_AgregarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_AgregarReporteActionPerformed
        //Inicio click sobre botón Agregar Reporte
        JOptionPane.showMessageDialog(null, "", "Módulo en construcción - CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ImagenConstruccion);
        //Fin click sobre botón Agregar Reporte
    }//GEN-LAST:event_Jb_AgregarReporteActionPerformed

    private void Jt_BuscarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jt_BuscarReporteMouseClicked
        ///Inicio click sobre campo Buscar Equipo
        if ((Jt_BuscarReporte.getText()).equals("Buscar...")) {
            Jt_BuscarReporte.setText(null);
        }
        //Fin click sobre campo Buscar Equipo
    }//GEN-LAST:event_Jt_BuscarReporteMouseClicked

    private void Jt_BuscarReporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_BuscarReporteKeyTyped
        //Inicio letra ingresada en campo Buscar Reporte
        
        //Fin letra ingresada en campo Buscar Reporte
    }//GEN-LAST:event_Jt_BuscarReporteKeyTyped

    private void Jb_AgregarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_AgregarMantenimientoActionPerformed
        //Inicio click sobre botón agregar Mantenimiento
        JOptionPane.showMessageDialog(null, "", "Módulo en construcción - CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ImagenConstruccion);
        //Fin click sobre botón agregar Mantenimiento
    }//GEN-LAST:event_Jb_AgregarMantenimientoActionPerformed

    private void Jb_EliminarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_EliminarMantenimientoActionPerformed
        //Inicio click sobre botón Eliminar Mantenimiento
        JOptionPane.showMessageDialog(null, "", "Módulo en construcción - CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ImagenConstruccion);
        //Fin click sobre botón Eliminar Mantenimiento
    }//GEN-LAST:event_Jb_EliminarMantenimientoActionPerformed

    private void Jt_BuscarMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jt_BuscarMantenimientoMouseClicked
        //Inicio click sobre campo Buscar Mantenimiento
        if ((Jt_BuscarMantenimiento.getText()).equals("Buscar...")) {
            Jt_BuscarMantenimiento.setText(null);
        }
        //Fin click sobre campo Buscar Mantenimiento
    }//GEN-LAST:event_Jt_BuscarMantenimientoMouseClicked

    private void Jt_BuscarMantenimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_BuscarMantenimientoKeyTyped
        //Inicio letra ingresada en campo Buscar Mantenimiento

        //Fin letra ingresada en campo Buscar Mantenimiento
    }//GEN-LAST:event_Jt_BuscarMantenimientoKeyTyped

    private void Jb_AgregarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_AgregarReservaActionPerformed
        //Inicio click en botón Agregar Reserva
        JOptionPane.showMessageDialog(null, "", "Módulo en construcción - CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ImagenConstruccion);
        //Fin click en botón Agregar Reserva
    }//GEN-LAST:event_Jb_AgregarReservaActionPerformed

    private void Jb_EliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_EliminarReservaActionPerformed
        //Inicio click en botón Eliminar Reserva
        JOptionPane.showMessageDialog(null, "", "Módulo en construcción - CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ImagenConstruccion);
        //Fin click en botón Eliminar Reserva
    }//GEN-LAST:event_Jb_EliminarReservaActionPerformed

    private void Jt_BuscarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jt_BuscarReservaMouseClicked
        //Inicio click en campo de texto Buscar Reserva
        if ((Jt_BuscarReserva.getText()).equals("Buscar...")) {
            Jt_BuscarReserva.setText(null);
        }
        //Fin click en campo de texto Buscar Reserva
    }//GEN-LAST:event_Jt_BuscarReservaMouseClicked

    private void Jt_BuscarReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_BuscarReservaKeyTyped
        //Inicio letra ingresada en campo de texto Buscar Reserva

        //Fin letra ingresada en campo de texto Buscar Reserva
    }//GEN-LAST:event_Jt_BuscarReservaKeyTyped

    private void Jl_BuscarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jl_BuscarReporteMouseClicked
        
    }//GEN-LAST:event_Jl_BuscarReporteMouseClicked

    private void Jl_BuscarEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jl_BuscarEquiposMouseClicked
        //Inicio click en imagen inventario equipos
        InventarioEquipos ObjetoInventario = new InventarioEquipos();
        ObjetoInventario.setVisible(true);
        //Fin click en imagen inventario equipos
    }//GEN-LAST:event_Jl_BuscarEquiposMouseClicked

    public static void main(String args[]) { //Inicio lanzador clase Menú
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    } //Fin lanzador clase Menú

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Equipos;
    private javax.swing.JPanel JPanel_Inferior;
    private javax.swing.JPanel JPanel_Izquierdo;
    private javax.swing.JPanel JPanel_Mantenimiento;
    private javax.swing.JPanel JPanel_Menu;
    private javax.swing.JPanel JPanel_Principal;
    private javax.swing.JPanel JPanel_Reportes;
    private javax.swing.JPanel JPanel_Reserva;
    private javax.swing.JPanel JPanel_Superior;
    private javax.swing.JPanel JPanel_Titulo;
    private javax.swing.JPanel JPanel_Usuarios;
    private javax.swing.JScrollPane JScroll_TablaEquipos;
    private javax.swing.JScrollPane JScroll_TablaMantenimiento;
    private javax.swing.JScrollPane JScroll_TablaReportes;
    private javax.swing.JScrollPane JScroll_TablaReserva;
    private javax.swing.JScrollPane JScroll_TablaUsuarios;
    private javax.swing.JSeparator JSeparator_Titulo;
    public static javax.swing.JTable JTable_Equipos;
    public static javax.swing.JTable JTable_Mantenimiento;
    private javax.swing.JTable JTable_Reportes;
    public static javax.swing.JTable JTable_Reserva;
    public static javax.swing.JTable JTable_Usuarios;
    private javax.swing.JButton Jb_AgregarEquipo;
    private javax.swing.JButton Jb_AgregarMantenimiento;
    private javax.swing.JButton Jb_AgregarReporte;
    private javax.swing.JButton Jb_AgregarReserva;
    private javax.swing.JButton Jb_AgregarUsuarios;
    private javax.swing.JButton Jb_Cerrar;
    private javax.swing.JButton Jb_EliminarEquipo;
    private javax.swing.JButton Jb_EliminarMantenimiento;
    private javax.swing.JButton Jb_EliminarReporte;
    private javax.swing.JButton Jb_EliminarReserva;
    private javax.swing.JButton Jb_EliminarUsuarios;
    public static javax.swing.JButton Jb_Equipos;
    private javax.swing.JButton Jb_Mantenimiento;
    private javax.swing.JButton Jb_Menu;
    private javax.swing.JButton Jb_Minimizar;
    private javax.swing.JButton Jb_Reportes;
    private javax.swing.JButton Jb_Reservas;
    public static javax.swing.JButton Jb_Usuarios;
    private javax.swing.JButton Jb_Volver;
    public static javax.swing.JLabel Jl_AutenticacionUsuario;
    private javax.swing.JLabel Jl_Bienvenida;
    private javax.swing.JLabel Jl_BuscarEquipos;
    private javax.swing.JLabel Jl_BuscarMantenimiento;
    private javax.swing.JLabel Jl_BuscarReporte;
    private javax.swing.JLabel Jl_BuscarReserva;
    private javax.swing.JLabel Jl_BuscarUsuario;
    private javax.swing.JLabel Jl_LogoCalipsoft;
    private javax.swing.JLabel Jl_TituloCalipsoft;
    private javax.swing.JLabel Jl_TituloVentana;
    private javax.swing.JTextField Jt_BuscarEquipo;
    private javax.swing.JTextField Jt_BuscarMantenimiento;
    private javax.swing.JTextField Jt_BuscarReporte;
    private javax.swing.JTextField Jt_BuscarReserva;
    private javax.swing.JTextField Jt_BuscarUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

} //Fin clase Menú
