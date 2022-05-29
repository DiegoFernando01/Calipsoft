package Ventanas;
//Hecho por: Diego Fernando Victoria López
//Grado: 11 - B
//Calipsoft - Proyecto de aula - 2019

//Inicio importación de clases necesarias
import Animacion.Fade;
import Clases.SqlEquipo;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
//Fin importación de clases necesarias

public class RegistroEquipos extends javax.swing.JFrame { //Inicio clase RegistroEquipos

    //Inicio creación de variables globales
    int X, Y;
    Principal ObjetoConPrincipal = new Principal();
    static RegistroUsuarios ObjetoConRegistroUsuarios = new RegistroUsuarios();
    static Menu ObjetoConMenu = new Menu();
    int SerialAleatorio;
    //Fin creación de variables globales

    public RegistroEquipos() { //Inicio constructor clase RegistroEquipos
        initComponents();
        this.setLocationRelativeTo(null);
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, FormaVentana);
    } //Fin constructor clase RegistroEquipos

    //Inicio constructor de objetos clase RegistroEquipos
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Izquierdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JPanel_Derecho = new javax.swing.JPanel();
        Jb_Cerrar = new javax.swing.JButton();
        Jb_Minimizar = new javax.swing.JButton();
        Jl_Titulo = new javax.swing.JLabel();
        Jl_SolicitudSerial = new javax.swing.JLabel();
        Jt_Serial = new javax.swing.JTextField();
        Jl_SolicitudTipoEquipo = new javax.swing.JLabel();
        JCombo_TipoEquipo = new javax.swing.JComboBox<>();
        Jl_SolicitudUbicacion = new javax.swing.JLabel();
        JCombo_Ubicacion = new javax.swing.JComboBox<>();
        Jl_SolicitudMarca = new javax.swing.JLabel();
        JCombo_Marca = new javax.swing.JComboBox<>();
        Jl_SolicitudModelo = new javax.swing.JLabel();
        Jt_Modelo = new javax.swing.JTextField();
        Jl_SolicitudEstadoEquipo = new javax.swing.JLabel();
        JCombo_Estado = new javax.swing.JComboBox<>();
        Jl_SolicitudObservaciones = new javax.swing.JLabel();
        JScroll_Observaciones = new javax.swing.JScrollPane();
        Jta_Observaciones = new javax.swing.JTextArea();
        Jb_AgregarEquipo = new javax.swing.JButton();
        Jb_LimpiarCampos = new javax.swing.JButton();
        Jb_BuscarEquipo = new javax.swing.JButton();
        Jb_SerialAleatorio = new javax.swing.JButton();
        Jb_Volver = new javax.swing.JButton();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel_Izquierdo.setBackground(new java.awt.Color(248, 38, 33));
        JPanel_Izquierdo.setForeground(new java.awt.Color(255, 255, 255));
        JPanel_Izquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(248, 38, 33));
        jLabel1.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMonitor.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 100, 100));

        jLabel2.setBackground(new java.awt.Color(248, 38, 33));
        jLabel2.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVideoBeam.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 288, 100, 100));

        jLabel3.setBackground(new java.awt.Color(248, 38, 33));
        jLabel3.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoPortatil.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 100, 100));

        jLabel4.setBackground(new java.awt.Color(248, 38, 33));
        jLabel4.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoTablet.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel5.setBackground(new java.awt.Color(248, 38, 33));
        jLabel5.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoOrdenador.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(248, 38, 33));
        jLabel6.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoTeclado.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel7.setBackground(new java.awt.Color(248, 38, 33));
        jLabel7.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoRaton.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel8.setBackground(new java.awt.Color(248, 38, 33));
        jLabel8.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAltavoz.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel9.setBackground(new java.awt.Color(248, 38, 33));
        jLabel9.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoTelevisor.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Izquierdo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        getContentPane().add(JPanel_Izquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        JPanel_Derecho.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Derecho.setForeground(new java.awt.Color(51, 51, 51));
        JPanel_Derecho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        JPanel_Derecho.add(Jb_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

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
        JPanel_Derecho.add(Jb_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        Jl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_Titulo.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        Jl_Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Titulo.setText("Registro equipos Calipsoft");
        JPanel_Derecho.add(Jl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 280, 26));

        Jl_SolicitudSerial.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudSerial.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudSerial.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudSerial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudSerial.setText("Serial:");
        JPanel_Derecho.add(Jl_SolicitudSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 44, 107, 24));

        Jt_Serial.setBackground(new java.awt.Color(255, 255, 255));
        Jt_Serial.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_Serial.setForeground(new java.awt.Color(51, 51, 51));
        Jt_Serial.setToolTipText("Código único del equipo");
        Jt_Serial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_Serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_SerialKeyTyped(evt);
            }
        });
        JPanel_Derecho.add(Jt_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 44, 150, 24));

        Jl_SolicitudTipoEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudTipoEquipo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudTipoEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudTipoEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudTipoEquipo.setText("Tipo de equipo:");
        JPanel_Derecho.add(Jl_SolicitudTipoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, -1, 23));

        JCombo_TipoEquipo.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_TipoEquipo.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JCombo_TipoEquipo.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_TipoEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Pc de escritorio", "PC portátil", "Video Beam", "Parlante", "Tv Normal", "Tv Smart", "Tablet", "Monitor", "Teclado", "Mouse" }));
        JCombo_TipoEquipo.setToolTipText("Seleccione el tipo de equipo");
        JCombo_TipoEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Derecho.add(JCombo_TipoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 80, 251, -1));

        Jl_SolicitudUbicacion.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudUbicacion.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudUbicacion.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudUbicacion.setText("Ubicación:");
        JPanel_Derecho.add(Jl_SolicitudUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 121, 107, 23));

        JCombo_Ubicacion.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_Ubicacion.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JCombo_Ubicacion.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_Ubicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Sala de informática 1", "Sala de informática 2", "Salón de inglés", "Almacén", "Laboratorio", "Otra área" }));
        JCombo_Ubicacion.setToolTipText("Seleccione la ubicación del equipo");
        JCombo_Ubicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Derecho.add(JCombo_Ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 121, 251, -1));

        Jl_SolicitudMarca.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudMarca.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudMarca.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudMarca.setText("Marca:");
        JPanel_Derecho.add(Jl_SolicitudMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 162, 107, 23));

        JCombo_Marca.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_Marca.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JCombo_Marca.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_Marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "HP", "Dell", "Lenovo", "Lg", "Sony", "Samsung", "Otra marca" }));
        JCombo_Marca.setToolTipText("Seleccione la marca del equipo");
        JCombo_Marca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Derecho.add(JCombo_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 162, 251, -1));

        Jl_SolicitudModelo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudModelo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudModelo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudModelo.setText("Modelo:");
        JPanel_Derecho.add(Jl_SolicitudModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 203, 107, 24));

        Jt_Modelo.setBackground(new java.awt.Color(255, 255, 255));
        Jt_Modelo.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jt_Modelo.setForeground(new java.awt.Color(51, 51, 51));
        Jt_Modelo.setToolTipText("Ingrese el año de fabricación del equipo");
        Jt_Modelo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_Modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_ModeloKeyTyped(evt);
            }
        });
        JPanel_Derecho.add(Jt_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 203, 251, 24));

        Jl_SolicitudEstadoEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudEstadoEquipo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudEstadoEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudEstadoEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudEstadoEquipo.setText("Estado:");
        JPanel_Derecho.add(Jl_SolicitudEstadoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 239, 107, 23));

        JCombo_Estado.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_Estado.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        JCombo_Estado.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Operativo", "No operativo" }));
        JCombo_Estado.setToolTipText("Seleccione el estado de funcionamiento del equipo");
        JCombo_Estado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel_Derecho.add(JCombo_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 239, 251, -1));

        Jl_SolicitudObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudObservaciones.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jl_SolicitudObservaciones.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudObservaciones.setText("Observaciones:");
        JPanel_Derecho.add(Jl_SolicitudObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 274, 376, -1));

        Jta_Observaciones.setBackground(new java.awt.Color(255, 255, 255));
        Jta_Observaciones.setColumns(20);
        Jta_Observaciones.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jta_Observaciones.setForeground(new java.awt.Color(51, 51, 51));
        Jta_Observaciones.setRows(5);
        Jta_Observaciones.setToolTipText("Ingrese aquí cualquier problema que presente con el equipo");
        Jta_Observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jta_ObservacionesKeyTyped(evt);
            }
        });
        JScroll_Observaciones.setViewportView(Jta_Observaciones);

        JPanel_Derecho.add(JScroll_Observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 295, 376, 55));

        Jb_AgregarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jb_AgregarEquipo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jb_AgregarEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jb_AgregarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregar.png"))); // NOI18N
        Jb_AgregarEquipo.setText("Agregar equipo");
        Jb_AgregarEquipo.setToolTipText("Presione para agregar un equipo");
        Jb_AgregarEquipo.setBorder(null);
        Jb_AgregarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_AgregarEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_AgregarEquipoMouseMoved(evt);
            }
        });
        Jb_AgregarEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_AgregarEquipoMouseExited(evt);
            }
        });
        Jb_AgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_AgregarEquipoActionPerformed(evt);
            }
        });
        JPanel_Derecho.add(Jb_AgregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 362, 170, 30));

        Jb_LimpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        Jb_LimpiarCampos.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jb_LimpiarCampos.setForeground(new java.awt.Color(51, 51, 51));
        Jb_LimpiarCampos.setText("Limpiar campos");
        Jb_LimpiarCampos.setToolTipText("Presione para borrar datos ingresados");
        Jb_LimpiarCampos.setBorder(null);
        Jb_LimpiarCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_LimpiarCampos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_LimpiarCamposMouseMoved(evt);
            }
        });
        Jb_LimpiarCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_LimpiarCamposMouseExited(evt);
            }
        });
        Jb_LimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_LimpiarCamposActionPerformed(evt);
            }
        });
        JPanel_Derecho.add(Jb_LimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 362, 130, 30));

        Jb_BuscarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        Jb_BuscarEquipo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jb_BuscarEquipo.setForeground(new java.awt.Color(51, 51, 51));
        Jb_BuscarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLupa.png"))); // NOI18N
        Jb_BuscarEquipo.setToolTipText("Presione para buscar un equipo a partir de su serial");
        Jb_BuscarEquipo.setBorder(null);
        Jb_BuscarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_BuscarEquipo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLupaPresionado.png"))); // NOI18N
        Jb_BuscarEquipo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLupaResaltado.png"))); // NOI18N
        Jb_BuscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_BuscarEquipoActionPerformed(evt);
            }
        });
        JPanel_Derecho.add(Jb_BuscarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 362, -1, -1));

        Jb_SerialAleatorio.setBackground(new java.awt.Color(255, 255, 255));
        Jb_SerialAleatorio.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jb_SerialAleatorio.setForeground(new java.awt.Color(0, 93, 166));
        Jb_SerialAleatorio.setText("Serial aleatorio");
        Jb_SerialAleatorio.setToolTipText("Generar serial de equipo aleatorio");
        Jb_SerialAleatorio.setBorder(null);
        Jb_SerialAleatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_SerialAleatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jb_SerialAleatorio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_SerialAleatorioMouseMoved(evt);
            }
        });
        Jb_SerialAleatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_SerialAleatorioMouseExited(evt);
            }
        });
        Jb_SerialAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_SerialAleatorioActionPerformed(evt);
            }
        });
        JPanel_Derecho.add(Jb_SerialAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        Jb_Volver.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Volver.setFont(new java.awt.Font("Comfortaa", 0, 11)); // NOI18N
        Jb_Volver.setForeground(new java.awt.Color(51, 51, 51));
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
        JPanel_Derecho.add(Jb_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        getContentPane().add(JPanel_Derecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Fin constructor de objetos clase RegistroEquipos

    private void Jb_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_CerrarActionPerformed
        //Inicio click botón Cerrar
        int ConfirmacionSalir = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoAtencion);
        if (ConfirmacionSalir == JOptionPane.YES_OPTION) {
            ObjetoConPrincipal.SonidoCerrar.play();
            JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConPrincipal.ImagenFin);
            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.EXIT);
        } else {
            JOptionPane.showMessageDialog(null, "Regresando al registro de equipos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoAtencion);
        }
        //Fin click botón Cerrar
    }//GEN-LAST:event_Jb_CerrarActionPerformed

    private void Jb_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_MinimizarActionPerformed
        //Inicio click sobre botón Minimizar
        for (double i = 1.0; i >= 0.0; i -= 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método ventana Registro Equipos minimizada\nMensaje del error: " + e);
            }
        }
        this.setExtendedState(ICONIFIED);
        this.setOpacity(1);
        //Fin click sobre botón Minimizar
    }//GEN-LAST:event_Jb_MinimizarActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        //Inicio mouse suelta la ventana RegistroEquipos
        setOpacity((float) 1);
        //Fin mouse suelta la ventana RegistroEquipos
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //Inicio mouse mueve la ventana RegistroEquipos
        setOpacity((float) 0.7);
        this.setLocation(this.getLocation().x + evt.getX() - X, this.getLocation().y + evt.getY() - Y);
        //Fin mouse mueve la ventana RegistroEquipos
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        //Inicio mouse sobre ventana RegistroEquipos
        X = evt.getX();
        Y = evt.getY();
        //Fin mouse sobre ventana RegistroEquipos
    }//GEN-LAST:event_formMouseMoved

    private void Jb_AgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_AgregarEquipoActionPerformed
        //Inicio click sobre botón Agregar Equipo
        if (Jt_Serial.getText().length() != 0) {
            if (JCombo_TipoEquipo.getSelectedIndex() != 0) {
                if (JCombo_Ubicacion.getSelectedIndex() != 0) {
                    if (JCombo_Marca.getSelectedIndex() != 0) {
                        if (JCombo_Estado.getSelectedIndex() != 0) {
                            JOptionPane.showMessageDialog(null, "Todos los campos completados correctamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoVerificacion);
                            if (Jb_AgregarEquipo.getText().equals("Agregar equipo")) {
                                if (!SqlEquipo.VerificarEquipo(Integer.parseInt(Jt_Serial.getText()))) {
                                    int Opcion = SqlEquipo.InsertarEquipo();
                                    if (Opcion > 0) {
                                        JOptionPane.showMessageDialog(null, "Registro hecho exitosamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoConfirmacion);
                                        LimpiarCamposEquipos();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error al registrar el equipo/nIntente nuevamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoConfirmacion);
                                        LimpiarCamposEquipos();
                                    }
                                }
                            } else {
                                int opcion = SqlEquipo.ModificarEquipo();
                                if (opcion > 0) {
                                    JOptionPane.showMessageDialog(null, "Registro actualizado correctamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoConfirmacion);
                                    LimpiarCamposEquipos();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al actualizar el registro", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
                                    LimpiarCamposEquipos();
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El estado del equipo es obligatorio\nSeleccione uno para continuar", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoVerificacion);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La marca del equipo es obligatorio\nSeleccione una para continuar", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoVerificacion);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La ubicación del equipo es obligatoria\nSeleccione una para continuar", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoVerificacion);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El tipo de equipo es obligatorio\nSeleccione uno para continuar", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoVerificacion);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El serial del equipo es obligatorio\nComplételo para continuar", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoVerificacion);
        }
        //Fin click sobre botón Agregar Equipo
    }//GEN-LAST:event_Jb_AgregarEquipoActionPerformed

    private void Jb_AgregarEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_AgregarEquipoMouseMoved
        //Inicio mouse sobre botón Agregar Equipos
        Jb_AgregarEquipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new Color(248, 38, 33)));
        //Fin mouse sobre botón Agregar Equipos
    }//GEN-LAST:event_Jb_AgregarEquipoMouseMoved

    private void Jb_AgregarEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_AgregarEquipoMouseExited
        //Inicio mouse sale de botón Agregar Equipos
        Jb_AgregarEquipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
        //Fin mouse sale de botón Agregar Equipos
    }//GEN-LAST:event_Jb_AgregarEquipoMouseExited

    private void Jb_LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_LimpiarCamposActionPerformed
        //Inicio click sobre botón Limpiar Campos
        int Confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea borrar los datos ingresados?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoConfirmacion);
        if (Confirmacion == JOptionPane.YES_OPTION) {
            LimpiarCamposEquipos();
            JOptionPane.showMessageDialog(null, "Datos ingresados borrados exitosamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoConfirmacion);
        } else {
            JOptionPane.showMessageDialog(null, "Manteniendo los datos ingresados", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoConfirmacion);
        }
        //Fin click sobre botón Limpiar Campos
    }//GEN-LAST:event_Jb_LimpiarCamposActionPerformed

    private void Jb_LimpiarCamposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_LimpiarCamposMouseExited
        //Inicio mouse sale de botón Limpiar Campos
        Jb_LimpiarCampos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
        //Fin mouse sale de botón Limpiar Campos
    }//GEN-LAST:event_Jb_LimpiarCamposMouseExited

    private void Jb_LimpiarCamposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_LimpiarCamposMouseMoved
        //Inicio mouse sobre botón Limpiar campos
        Jb_LimpiarCampos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new Color(248, 38, 33)));
        //Fin mouse sobre botón Limpiar campos
    }//GEN-LAST:event_Jb_LimpiarCamposMouseMoved

    private void Jb_BuscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_BuscarEquipoActionPerformed
        //Inicio click sobre botón Buscar Equipos
        if (Jt_Serial.getText().length() != 0) {
            if (SqlEquipo.VerificarEquipo(Integer.parseInt(Jt_Serial.getText()))) {
                SqlEquipo.BuscarEquipo();
                Jb_AgregarEquipo.setText("Modificar equipo");
                Jb_SerialAleatorio.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Datos de equipo tomados exitosamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoUsuarioEncontrado);
            } else {
                JOptionPane.showMessageDialog(null, "El equipo buscado no existe", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese primero un serial", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
        }
        //Fin click sobre botón Buscar Equipos
    }//GEN-LAST:event_Jb_BuscarEquipoActionPerformed

    private void Jt_SerialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_SerialKeyTyped
        //Inicio ingreso de letras sobre campo Serial
        char Caracter = evt.getKeyChar();
        if (Character.isLetter(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El serial sólo debe estar compuesto por números", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
        }
        if (Jt_Serial.getText().length() >= 6) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El serial debe tener un máximo de 6 dígitos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
        }
        //Fin ingreso de letras sobre campo Serial
    }//GEN-LAST:event_Jt_SerialKeyTyped

    private void Jt_ModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_ModeloKeyTyped
        //Inicio ingreso de letras sobre campo Modelo
        char Caracter = evt.getKeyChar();
        if (Character.isLetter(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El modelo sólo debe estar compuesto por números", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
        }
        if (Jt_Modelo.getText().length() >= 4) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El modelo debe tener un máximo de 4 dígitos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
        }
        //Fin ingreso de letras sobre campo Modelo
    }//GEN-LAST:event_Jt_ModeloKeyTyped

    private void Jta_ObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jta_ObservacionesKeyTyped
        //Inicio ingreso de carácteres sobre campo Observaciones
        if (Jt_Modelo.getText().length() >= 500) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "La obsevación debe tener un máximo de 500 dígitos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
        }
        //Fin ingreso de carácteres sobre campo Observaciones
    }//GEN-LAST:event_Jta_ObservacionesKeyTyped

    private void Jb_SerialAleatorioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_SerialAleatorioMouseMoved
        //Inicio mouse sobre botón Código Aleatorio
        Jb_SerialAleatorio.setForeground(new Color(51, 51, 51));
        //Fin mouse sobre botón Código Aleatorio
    }//GEN-LAST:event_Jb_SerialAleatorioMouseMoved

    private void Jb_SerialAleatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_SerialAleatorioMouseExited
        //Inicio mouse sale del botón Código Aleatorio
        Jb_SerialAleatorio.setForeground(new Color(0, 93, 166));
        //Fin mouse sale del botón Código Aleatorio
    }//GEN-LAST:event_Jb_SerialAleatorioMouseExited

    private void Jb_SerialAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_SerialAleatorioActionPerformed
        //Inicio click sobre botón Código Aleatorio
        SerialAleatorio = (int) (Math.random() * 999999) + 1;
        Jt_Serial.setText(SerialAleatorio + "");
        //Fin click sobre botón Código Aleatorio
    }//GEN-LAST:event_Jb_SerialAleatorioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicio ventana RegistroEquipo abierta
        for (double i = 0.0; i < 1.0; i += 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método Ventana RegistroEquipos abierta\nMensaje del error: " + e);
            }
        }
        //Fin ventana RegistroEquipo abierta
    }//GEN-LAST:event_formWindowOpened

    private void Jb_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_VolverActionPerformed
        //Inicio click sobre botón Volver
        int Confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú de ingreso?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ObjetoConMenu.IconoRegresar);
        if (Confirmacion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Yendo al menú principal", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConMenu.IconoConfirmacionAceptada);
            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
            ObjetoConMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Manteniendo en el registro de equipos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConMenu.IconoConfirmacionAceptada);
        }
        //Fin click sobre botón Volver
    }//GEN-LAST:event_Jb_VolverActionPerformed

    public void LimpiarCamposEquipos() { //Inicio método Limpiar Campos de Registro Equipos
        Jt_Serial.setText(null);
        JCombo_TipoEquipo.setSelectedIndex(0);
        JCombo_Ubicacion.setSelectedIndex(0);
        JCombo_Marca.setSelectedIndex(0);
        Jt_Modelo.setText(null);
        JCombo_Estado.setSelectedIndex(0);
        Jta_Observaciones.setText(null);
    } //Fin método Limpiar Campos de Registro Equipos

    public static void main(String args[]) { //Inicio lanzador clase RegistroEquipos
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroEquipos().setVisible(true);
        });
    } //Fin lanzador clase RegistroEquipos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> JCombo_Estado;
    public static javax.swing.JComboBox<String> JCombo_Marca;
    public static javax.swing.JComboBox<String> JCombo_TipoEquipo;
    public static javax.swing.JComboBox<String> JCombo_Ubicacion;
    private javax.swing.JPanel JPanel_Derecho;
    private javax.swing.JPanel JPanel_Izquierdo;
    private javax.swing.JScrollPane JScroll_Observaciones;
    private javax.swing.JButton Jb_AgregarEquipo;
    private javax.swing.JButton Jb_BuscarEquipo;
    private javax.swing.JButton Jb_Cerrar;
    private javax.swing.JButton Jb_LimpiarCampos;
    private javax.swing.JButton Jb_Minimizar;
    private javax.swing.JButton Jb_SerialAleatorio;
    private javax.swing.JButton Jb_Volver;
    private javax.swing.JLabel Jl_SolicitudEstadoEquipo;
    private javax.swing.JLabel Jl_SolicitudMarca;
    private javax.swing.JLabel Jl_SolicitudModelo;
    private javax.swing.JLabel Jl_SolicitudObservaciones;
    private javax.swing.JLabel Jl_SolicitudSerial;
    private javax.swing.JLabel Jl_SolicitudTipoEquipo;
    private javax.swing.JLabel Jl_SolicitudUbicacion;
    private javax.swing.JLabel Jl_Titulo;
    public static javax.swing.JTextField Jt_Modelo;
    public static javax.swing.JTextField Jt_Serial;
    public static javax.swing.JTextArea Jta_Observaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

} //Fin clase RegistroEquipos
