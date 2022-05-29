package Ventanas;
//Hecho por: Diego Fernando Victoria López
//Grado: 11 - B
//Calipsoft - Proyecto de aula - 2019

//Inicio importación de clases necesarias
import Animacion.Fade;
import Clases.SqlUsuarios;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//Fin importación de clases necesarias

public class RegistroUsuarios extends javax.swing.JFrame { //Inicio clase Registro

    //Inicio definición de variables globales
    static Principal ObjetoConPrincipal = new Principal();
    int X, Y, CodigoAleatorio;
    public static int Sexo;
    public Icon IconoConfirmacion = new ImageIcon(getClass().getResource("/Imagenes/IconoBasura.png"));
    public Icon IconoError = new ImageIcon(getClass().getResource("/Imagenes/IconoError.png"));
    public Icon IconoVerificacion = new ImageIcon(getClass().getResource("/Imagenes/IconoVerificacion.png"));
    public Icon IconoUsuarioEncontrado = new ImageIcon(getClass().getResource("/Imagenes/IconoUsuarioEncontrado.png"));
    public Icon IconoAtencion = new ImageIcon(getClass().getResource("/Imagenes/IconoAtencion.png"));
    public Icon IconoAdministrador = new ImageIcon(getClass().getResource("/Imagenes/IconoAdministrador.png"));
    public Icon IconoUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoUsuario.png"));
    public Icon IconoTecnico = new ImageIcon(getClass().getResource("/Imagenes/IconoTecnico.png"));
    //Fin definción de variables globales

    public RegistroUsuarios() { //Inicio contructor clase RegistroUsuarios
        initComponents();
        this.setLocationRelativeTo(null);
        Jt_CodigoUsuario.requestFocus();
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, FormaVentana);
    } //Fin constructor clase RegistroUsuarios

    //Inicio constructor de objetos clase RegistroUsuarios
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_Sexo = new javax.swing.ButtonGroup();
        JPanel_Principal = new javax.swing.JPanel();
        JPanel_Registro = new javax.swing.JPanel();
        Jl_TituloVentana = new javax.swing.JLabel();
        Jl_SolicitudCodigo = new javax.swing.JLabel();
        Jt_CodigoUsuario = new javax.swing.JTextField();
        Jb_CodigoAleatorio = new javax.swing.JButton();
        Jl_SolicitudPrimerNombre = new javax.swing.JLabel();
        Jl_SolicitudPrimerApellido = new javax.swing.JLabel();
        Jt_PrimerNombre = new javax.swing.JTextField();
        Jl_SolicitudSegundoNombre = new javax.swing.JLabel();
        Jl_SolicitudSegundoApellido = new javax.swing.JLabel();
        Jt_SegundoNombre = new javax.swing.JTextField();
        Jt_PrimerApellido = new javax.swing.JTextField();
        Jt_SegundoApellido = new javax.swing.JTextField();
        Jl_SolicitudSexo = new javax.swing.JLabel();
        JRb_Masculino = new javax.swing.JRadioButton();
        JRb_Femenino = new javax.swing.JRadioButton();
        JRb_Indefinido = new javax.swing.JRadioButton();
        J_SolicitudCorreo = new javax.swing.JLabel();
        Jt_Correo = new javax.swing.JTextField();
        Jl_SolicitudTelefono = new javax.swing.JLabel();
        Jt_Telefono = new javax.swing.JTextField();
        Jl_SolicitudPerfil = new javax.swing.JLabel();
        Jl_Area = new javax.swing.JLabel();
        JSeparador_1 = new javax.swing.JSeparator();
        JCombo_Area = new javax.swing.JComboBox<>();
        JCombo_TipoPerfil = new javax.swing.JComboBox<>();
        Jl_SolicitudCargo = new javax.swing.JLabel();
        Jl_SolicitudEstado = new javax.swing.JLabel();
        JCombo_Cargo = new javax.swing.JComboBox<>();
        JCombo_Estado = new javax.swing.JComboBox<>();
        Jl_SolicitudContrasena = new javax.swing.JLabel();
        Jt_Contrasena = new javax.swing.JTextField();
        Jb_RegistrarUsuario = new javax.swing.JButton();
        Jb_LimpiarCampos = new javax.swing.JButton();
        Jb_BuscarUsuario = new javax.swing.JButton();
        Jb_Minimizar = new javax.swing.JButton();
        Jb_Cerrar = new javax.swing.JButton();
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

        JPanel_Principal.setBackground(new java.awt.Color(248, 38, 33));
        JPanel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel_Registro.setBackground(new java.awt.Color(255, 255, 255));

        Jl_TituloVentana.setBackground(new java.awt.Color(255, 255, 255));
        Jl_TituloVentana.setFont(new java.awt.Font("Varsity Regular", 0, 38)); // NOI18N
        Jl_TituloVentana.setForeground(new java.awt.Color(51, 51, 51));
        Jl_TituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_TituloVentana.setText("REGISTRAR USUARIO");
        Jl_TituloVentana.setToolTipText("");
        Jl_TituloVentana.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));

        Jl_SolicitudCodigo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudCodigo.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudCodigo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudCodigo.setText("Código de usuario:");

        Jt_CodigoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Jt_CodigoUsuario.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_CodigoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        Jt_CodigoUsuario.setToolTipText("Ingresa un código de usuario");
        Jt_CodigoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_CodigoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Jt_CodigoUsuario.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_CodigoUsuario.setSelectionColor(new java.awt.Color(248, 38, 33));
        Jt_CodigoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_CodigoUsuarioKeyTyped(evt);
            }
        });

        Jb_CodigoAleatorio.setBackground(new java.awt.Color(255, 255, 255));
        Jb_CodigoAleatorio.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jb_CodigoAleatorio.setForeground(new java.awt.Color(0, 93, 166));
        Jb_CodigoAleatorio.setText("Código aleatorio");
        Jb_CodigoAleatorio.setToolTipText("Generar código de usuario aleatorio");
        Jb_CodigoAleatorio.setBorder(null);
        Jb_CodigoAleatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_CodigoAleatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jb_CodigoAleatorio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_CodigoAleatorioMouseMoved(evt);
            }
        });
        Jb_CodigoAleatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_CodigoAleatorioMouseExited(evt);
            }
        });
        Jb_CodigoAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_CodigoAleatorioActionPerformed(evt);
            }
        });

        Jl_SolicitudPrimerNombre.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudPrimerNombre.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudPrimerNombre.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudPrimerNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudPrimerNombre.setText("Primer nombre:");

        Jl_SolicitudPrimerApellido.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudPrimerApellido.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudPrimerApellido.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudPrimerApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudPrimerApellido.setText("Primer apellido:");

        Jt_PrimerNombre.setBackground(new java.awt.Color(255, 255, 255));
        Jt_PrimerNombre.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_PrimerNombre.setForeground(new java.awt.Color(51, 51, 51));
        Jt_PrimerNombre.setToolTipText("Ingrese su primer nombre");
        Jt_PrimerNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_PrimerNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Jt_PrimerNombre.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_PrimerNombre.setSelectionColor(new java.awt.Color(248, 38, 33));
        Jt_PrimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_PrimerNombreKeyTyped(evt);
            }
        });

        Jl_SolicitudSegundoNombre.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudSegundoNombre.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudSegundoNombre.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudSegundoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudSegundoNombre.setText("Segundo nombre:");
        Jl_SolicitudSegundoNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Jl_SolicitudSegundoApellido.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudSegundoApellido.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudSegundoApellido.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudSegundoApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudSegundoApellido.setText("Segundo apellido:");
        Jl_SolicitudSegundoApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Jt_SegundoNombre.setBackground(new java.awt.Color(255, 255, 255));
        Jt_SegundoNombre.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_SegundoNombre.setForeground(new java.awt.Color(51, 51, 51));
        Jt_SegundoNombre.setToolTipText("Ingrese su segundo nombre");
        Jt_SegundoNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_SegundoNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Jt_SegundoNombre.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_SegundoNombre.setSelectionColor(new java.awt.Color(248, 38, 33));
        Jt_SegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_SegundoNombreKeyTyped(evt);
            }
        });

        Jt_PrimerApellido.setBackground(new java.awt.Color(255, 255, 255));
        Jt_PrimerApellido.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_PrimerApellido.setForeground(new java.awt.Color(51, 51, 51));
        Jt_PrimerApellido.setToolTipText("Ingrese su primer apellido");
        Jt_PrimerApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_PrimerApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Jt_PrimerApellido.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_PrimerApellido.setSelectionColor(new java.awt.Color(248, 38, 33));
        Jt_PrimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_PrimerApellidoKeyTyped(evt);
            }
        });

        Jt_SegundoApellido.setBackground(new java.awt.Color(255, 255, 255));
        Jt_SegundoApellido.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_SegundoApellido.setForeground(new java.awt.Color(51, 51, 51));
        Jt_SegundoApellido.setToolTipText("Ingrese su segundo apellido");
        Jt_SegundoApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_SegundoApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Jt_SegundoApellido.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_SegundoApellido.setSelectionColor(new java.awt.Color(248, 38, 33));
        Jt_SegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_SegundoApellidoKeyTyped(evt);
            }
        });

        Jl_SolicitudSexo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudSexo.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudSexo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudSexo.setText("Sexo:");

        JRb_Masculino.setBackground(new java.awt.Color(255, 255, 255));
        Grupo_Sexo.add(JRb_Masculino);
        JRb_Masculino.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        JRb_Masculino.setForeground(new java.awt.Color(51, 51, 51));
        JRb_Masculino.setText("Masculino");
        JRb_Masculino.setToolTipText("Sexo masculino");
        JRb_Masculino.setBorder(null);
        JRb_Masculino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JRb_Masculino.setOpaque(false);
        JRb_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRb_MasculinoActionPerformed(evt);
            }
        });

        JRb_Femenino.setBackground(new java.awt.Color(255, 255, 255));
        Grupo_Sexo.add(JRb_Femenino);
        JRb_Femenino.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        JRb_Femenino.setForeground(new java.awt.Color(51, 51, 51));
        JRb_Femenino.setText("Femenino");
        JRb_Femenino.setToolTipText("Sexo femenino");
        JRb_Femenino.setBorder(null);
        JRb_Femenino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JRb_Femenino.setOpaque(false);
        JRb_Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRb_FemeninoActionPerformed(evt);
            }
        });

        JRb_Indefinido.setBackground(new java.awt.Color(255, 255, 255));
        Grupo_Sexo.add(JRb_Indefinido);
        JRb_Indefinido.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        JRb_Indefinido.setForeground(new java.awt.Color(51, 51, 51));
        JRb_Indefinido.setText("Indefinido");
        JRb_Indefinido.setToolTipText("Sexo indefinido");
        JRb_Indefinido.setBorder(null);
        JRb_Indefinido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JRb_Indefinido.setOpaque(false);
        JRb_Indefinido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRb_IndefinidoActionPerformed(evt);
            }
        });

        J_SolicitudCorreo.setBackground(new java.awt.Color(255, 255, 255));
        J_SolicitudCorreo.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        J_SolicitudCorreo.setForeground(new java.awt.Color(51, 51, 51));
        J_SolicitudCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_SolicitudCorreo.setText("Correo:");
        J_SolicitudCorreo.setToolTipText("Correo electrónico real");

        Jt_Correo.setBackground(new java.awt.Color(255, 255, 255));
        Jt_Correo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_Correo.setForeground(new java.awt.Color(51, 51, 51));
        Jt_Correo.setToolTipText("Correo electrónico real");
        Jt_Correo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_Correo.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_Correo.setSelectionColor(new java.awt.Color(248, 38, 33));

        Jl_SolicitudTelefono.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudTelefono.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudTelefono.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudTelefono.setText("Teléfono:");

        Jt_Telefono.setBackground(new java.awt.Color(255, 255, 255));
        Jt_Telefono.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_Telefono.setForeground(new java.awt.Color(51, 51, 51));
        Jt_Telefono.setToolTipText("Teléfono del usuario");
        Jt_Telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_Telefono.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_Telefono.setSelectionColor(new java.awt.Color(248, 38, 33));
        Jt_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_TelefonoKeyTyped(evt);
            }
        });

        Jl_SolicitudPerfil.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudPerfil.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudPerfil.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudPerfil.setText("Tipo de perfil:");

        Jl_Area.setBackground(new java.awt.Color(255, 255, 255));
        Jl_Area.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_Area.setForeground(new java.awt.Color(51, 51, 51));
        Jl_Area.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Area.setText("Área:");

        JSeparador_1.setBackground(new java.awt.Color(255, 255, 255));
        JSeparador_1.setForeground(new java.awt.Color(0, 93, 166));
        JSeparador_1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JCombo_Area.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_Area.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        JCombo_Area.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_Area.setMaximumRowCount(10);
        JCombo_Area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Informática", "Inglés", "Lenguaje", "Matemáticas", "Química", "Física", "Administrativa", "No aplica", "Otra..." }));
        JCombo_Area.setToolTipText("Selecciones su área de trabajo");
        JCombo_Area.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCombo_Area.setOpaque(false);

        JCombo_TipoPerfil.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_TipoPerfil.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        JCombo_TipoPerfil.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_TipoPerfil.setMaximumRowCount(10);
        JCombo_TipoPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Administrador", "Técnico", "Usuario" }));
        JCombo_TipoPerfil.setToolTipText("Seleccione el tipo de perfil");
        JCombo_TipoPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCombo_TipoPerfil.setOpaque(false);

        Jl_SolicitudCargo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudCargo.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudCargo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudCargo.setText("Cargo:");

        Jl_SolicitudEstado.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudEstado.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudEstado.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudEstado.setText("Estado del usuario:");

        JCombo_Cargo.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_Cargo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        JCombo_Cargo.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_Cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Director", "Coordinador", "Psicóloga", "Secretaria", "Docente", "Auxiliar", "Seguridad" }));
        JCombo_Cargo.setToolTipText("Cargo que desempeña el usuario");
        JCombo_Cargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JCombo_Estado.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_Estado.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        JCombo_Estado.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Activo", "Inactivo" }));
        JCombo_Estado.setToolTipText("Estado en que estaá el usuario");
        JCombo_Estado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Jl_SolicitudContrasena.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudContrasena.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudContrasena.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudContrasena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_SolicitudContrasena.setText("Contraseña:");
        Jl_SolicitudContrasena.setToolTipText("");

        Jt_Contrasena.setBackground(new java.awt.Color(255, 255, 255));
        Jt_Contrasena.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_Contrasena.setForeground(new java.awt.Color(51, 51, 51));
        Jt_Contrasena.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));

        Jb_RegistrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Jb_RegistrarUsuario.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_RegistrarUsuario.setForeground(new java.awt.Color(51, 51, 51));
        Jb_RegistrarUsuario.setText("Registrar usuario");
        Jb_RegistrarUsuario.setToolTipText("Presione para ingresar un nuevo usuario al sistema");
        Jb_RegistrarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
        Jb_RegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_RegistrarUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_RegistrarUsuarioMouseMoved(evt);
            }
        });
        Jb_RegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_RegistrarUsuarioMouseExited(evt);
            }
        });
        Jb_RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_RegistrarUsuarioActionPerformed(evt);
            }
        });

        Jb_LimpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        Jb_LimpiarCampos.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_LimpiarCampos.setForeground(new java.awt.Color(51, 51, 51));
        Jb_LimpiarCampos.setText("Limpiar campos");
        Jb_LimpiarCampos.setToolTipText("Presione para borrar los datos ingresados");
        Jb_LimpiarCampos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 2, true));
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

        Jb_BuscarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Jb_BuscarUsuario.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jb_BuscarUsuario.setForeground(new java.awt.Color(51, 51, 51));
        Jb_BuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLupa.png"))); // NOI18N
        Jb_BuscarUsuario.setToolTipText("Buscar usuario - Ingrese primero el código del usuario");
        Jb_BuscarUsuario.setBorder(null);
        Jb_BuscarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_BuscarUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLupaPresionado.png"))); // NOI18N
        Jb_BuscarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoLupaResaltado.png"))); // NOI18N
        Jb_BuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_BuscarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel_RegistroLayout = new javax.swing.GroupLayout(JPanel_Registro);
        JPanel_Registro.setLayout(JPanel_RegistroLayout);
        JPanel_RegistroLayout.setHorizontalGroup(
            JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                        .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(Jl_SolicitudContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(Jb_RegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jb_LimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jb_BuscarUsuario)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                        .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jl_TituloVentana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(Jl_SolicitudSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Jt_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(Jl_SolicitudPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Jt_PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(Jl_SolicitudSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Jt_SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(Jl_SolicitudSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(JRb_Masculino)
                                .addGap(6, 6, 6)
                                .addComponent(JRb_Femenino)
                                .addGap(6, 6, 6)
                                .addComponent(JRb_Indefinido))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(J_SolicitudCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Jt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                                .addComponent(Jl_SolicitudTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Jl_SolicitudPrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jl_SolicitudCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                                        .addComponent(Jt_CodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Jb_CodigoAleatorio))
                                    .addComponent(Jt_PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_RegistroLayout.createSequentialGroup()
                                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jl_SolicitudPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCombo_TipoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jl_SolicitudCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCombo_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JSeparador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(Jl_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JCombo_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCombo_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jl_SolicitudEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPanel_RegistroLayout.setVerticalGroup(
            JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Jl_TituloVentana)
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_SolicitudCodigo)
                    .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jt_CodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jb_CodigoAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_SolicitudPrimerNombre)
                    .addComponent(Jt_PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_SolicitudSegundoNombre)
                    .addComponent(Jt_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_SolicitudPrimerApellido)
                    .addComponent(Jt_PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_SolicitudSegundoApellido)
                    .addComponent(Jt_SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_SolicitudSexo)
                    .addComponent(JRb_Masculino)
                    .addComponent(JRb_Femenino)
                    .addComponent(JRb_Indefinido))
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J_SolicitudCorreo)
                    .addComponent(Jt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_SolicitudTelefono)
                    .addComponent(Jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JSeparador_1)
                    .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                        .addComponent(Jl_Area)
                        .addGap(6, 6, 6)
                        .addComponent(JCombo_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Jl_SolicitudEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JCombo_Estado))
                    .addGroup(JPanel_RegistroLayout.createSequentialGroup()
                        .addComponent(Jl_SolicitudPerfil)
                        .addGap(6, 6, 6)
                        .addComponent(JCombo_TipoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Jl_SolicitudCargo)
                        .addGap(12, 12, 12)
                        .addComponent(JCombo_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl_SolicitudContrasena)
                    .addComponent(Jt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(JPanel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jb_RegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_LimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_BuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JPanel_Principal.add(JPanel_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 440, 540));

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
        JPanel_Principal.add(Jb_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

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
        JPanel_Principal.add(Jb_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

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
        JPanel_Principal.add(Jb_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        getContentPane().add(JPanel_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Fin constructor de objetos clase RegistroUsuarios

    private void Jb_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_CerrarActionPerformed
        //Inicio click botón Cerrar
        int ConfirmacionSalir = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, IconoAtencion);
        if (ConfirmacionSalir == JOptionPane.YES_OPTION) {
            ObjetoConPrincipal.SonidoCerrar.play();
            JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConPrincipal.ImagenFin);
            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.EXIT);
        } else {
            JOptionPane.showMessageDialog(null, "Regresando al registro de usuarios", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoAtencion);
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
                System.err.println("Error en cronómetro - Método ventana Registro Usuarios minimizada\nMensaje del error: " + e);
            }
        }
        this.setExtendedState(ICONIFIED);
        this.setOpacity(1);
        //Fin click sobre botón Minimizar
    }//GEN-LAST:event_Jb_MinimizarActionPerformed

    private void Jb_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_VolverActionPerformed
        //Inicio click sobre botón Volver
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
        ObjetoConPrincipal.setVisible(true);
        //Fin click sobre botón Volver
    }//GEN-LAST:event_Jb_VolverActionPerformed

    private void Jb_CodigoAleatorioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_CodigoAleatorioMouseMoved
        //Inicio mouse sobre botón Código Aleatorio
        Jb_CodigoAleatorio.setForeground(new Color(51, 51, 51));
        //Fin mouse sobre botón Código Aleatorio
    }//GEN-LAST:event_Jb_CodigoAleatorioMouseMoved

    private void Jb_CodigoAleatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_CodigoAleatorioMouseExited
        //Inicio mouse sale del botón Código Aleatorio
        Jb_CodigoAleatorio.setForeground(new Color(0, 93, 166));
        //Fin mouse sale del botón Código Aleatorio
    }//GEN-LAST:event_Jb_CodigoAleatorioMouseExited

    private void Jb_CodigoAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_CodigoAleatorioActionPerformed
        //Inicio click sobre botón Código Aleatorio
        CodigoAleatorio = (int) (Math.random() * 999999) + 1;
        Jt_CodigoUsuario.setText(CodigoAleatorio + "");
        //Fin click sobre botón Código Aleatorio
    }//GEN-LAST:event_Jb_CodigoAleatorioActionPerformed

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

    private void Jb_RegistrarUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_RegistrarUsuarioMouseMoved
        //Inicio mouse sobre botón Registrar Usuario
        Jb_RegistrarUsuario.setBackground(new Color(248, 38, 33));
        //Fin mouse sobre botón Registrar Usuario
    }//GEN-LAST:event_Jb_RegistrarUsuarioMouseMoved

    private void Jb_RegistrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_RegistrarUsuarioMouseExited
        //Inicio mouse sale de botón Registrar Usuario
        Jb_RegistrarUsuario.setBackground(new Color(255, 255, 255));
        //Fin mouse sale de botón Registrar Usuario
    }//GEN-LAST:event_Jb_RegistrarUsuarioMouseExited

    private void Jb_LimpiarCamposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_LimpiarCamposMouseMoved
        //Inicio mouse sobre botón Limpiar Campos
        Jb_LimpiarCampos.setBackground(new Color(248, 38, 33));
        //Fin mouse sobre botón Limpiar Campos
    }//GEN-LAST:event_Jb_LimpiarCamposMouseMoved

    private void Jb_RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_RegistrarUsuarioActionPerformed
        //Inicio click sobre botón Registrar Usuario
        if (Jb_RegistrarUsuario.getText().equals("Registrar usuario")) { //En caso de registrar un usuario
            if (Jt_CodigoUsuario.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "El campo código de usuario está vacío\nIngrese ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
            } else {
                if (Jt_PrimerNombre.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "El campo primer nombre está vacío\nIngrese ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                } else {
                    if (Jt_PrimerApellido.getText().length() == 0) {
                        JOptionPane.showMessageDialog(null, "El campo primer apellido está vacío\nIngrese ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                    } else {
                        if (Jt_Telefono.getText().length() == 0) {
                            JOptionPane.showMessageDialog(null, "El campo teléfono está vacío\nIngrese ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                        } else {
                            if (JCombo_TipoPerfil.getSelectedIndex() == 0) {
                                JOptionPane.showMessageDialog(null, "El campo tipo de perfil está sin seleccionar\nSeleccione ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                            } else {
                                if (JCombo_Area.getSelectedIndex() == 0) {
                                    JOptionPane.showMessageDialog(null, "El campo área está sin seleccionar\nSeleccione ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                                } else {
                                    if (Jt_Contrasena.getText().length() == 0) {
                                        JOptionPane.showMessageDialog(null, "El campo contraseña está sin modificar\nIngrese ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                                    } else {
                                        if (JCombo_Cargo.getSelectedIndex() == 0) {
                                            JOptionPane.showMessageDialog(null, "El campo cargo está sin seleccionar\nSeleccione ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                                        } else {
                                            if (JCombo_Estado.getSelectedIndex() == 0) {
                                                JOptionPane.showMessageDialog(null, "El campo estado está sin seleccionar\nSeleccione ese campo para seguir", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Todos los campos diligenciados correctamente\nProcediendo con el registro", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoVerificacion);
                                                if (!SqlUsuarios.VerificarUsuario(Integer.parseInt(Jt_CodigoUsuario.getText()))) {
                                                    int Opcion = SqlUsuarios.InsertarUsuario();
                                                    if (Opcion > 0) {
                                                        JOptionPane.showMessageDialog(null, "Registro hecho exitosamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoConfirmacion);
                                                        LimpiarCamposUsuarios();
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Error al registrar el usuario/nIntente nuevamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoConfirmacion);
                                                        LimpiarCamposUsuarios();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else { //En caso de modificar un usuario
            int opcion = SqlUsuarios.ModificarUsuario();
            if (opcion > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoConfirmacion);
                LimpiarCamposUsuarios();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el registro", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
                LimpiarCamposUsuarios();
            }
        }
        //Fin click sobre botón Registrar Usuarios
    }//GEN-LAST:event_Jb_RegistrarUsuarioActionPerformed

    private void Jb_LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_LimpiarCamposActionPerformed
        //Inicio click en botón Limpiar Campos
        int Confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea borrar los datos ingresados?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, IconoConfirmacion);
        if (Confirmacion == JOptionPane.YES_OPTION) {
            LimpiarCamposUsuarios();
            JOptionPane.showMessageDialog(null, "Datos ingresados borrados exitosamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoConfirmacion);
        } else {
            JOptionPane.showMessageDialog(null, "Manteniendo los datos ingresados", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoConfirmacion);
        }
        //Fin click en botón Limpiar Campos
    }//GEN-LAST:event_Jb_LimpiarCamposActionPerformed

    private void Jb_BuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_BuscarUsuarioActionPerformed
        //Inicio click sobre botón Buscar Usuario
        Jt_PrimerNombre.setText(null);
        SqlUsuarios.BuscarUsuario();
        if (Jt_PrimerNombre.getText().length() != 0) {
            Jb_RegistrarUsuario.setText("Modificar usuario");
            Jb_CodigoAleatorio.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Datos de usuario tomados exitosamente", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoUsuarioEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningún usuario asociado a éste código", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        //Fin click sobre botón Buscar Usuario
    }//GEN-LAST:event_Jb_BuscarUsuarioActionPerformed

    private void Jt_CodigoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_CodigoUsuarioKeyTyped
        //Inicio ingreso de una letra en campo para Código
        char Caracter = evt.getKeyChar();
        if (Character.isLetter(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El código sólo debe estar compuesto por números", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        if (Jt_CodigoUsuario.getText().length() == 6) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El código debe tener un máximo de 6 dígitos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        //Fin ingreso de una letra en campo para Código
    }//GEN-LAST:event_Jt_CodigoUsuarioKeyTyped

    private void Jb_LimpiarCamposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_LimpiarCamposMouseExited
        //Inicio mouse sale de botón Limpiar Campos
        Jb_LimpiarCampos.setBackground(new Color(255, 255, 255));
        //Fin mouse sale de botón Limpiar Campos
    }//GEN-LAST:event_Jb_LimpiarCamposMouseExited

    private void Jt_PrimerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_PrimerNombreKeyTyped
        //Inicio ingreso de un número para campo Primer Nombre
        char Caracter = evt.getKeyChar();
        if (Character.isDigit(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El nombre sólo debe estar compuesto por letras", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        //Fin ingreso de un número para campo Primer Nombre
    }//GEN-LAST:event_Jt_PrimerNombreKeyTyped

    private void Jt_SegundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_SegundoNombreKeyTyped
        //Inicio ingreso de un número para campo Segundo Nombre
        char Caracter = evt.getKeyChar();
        if (Character.isDigit(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El nombre sólo debe estar compuesto por letras", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        //Fin ingreso de un número para campo Segundo Nombre
    }//GEN-LAST:event_Jt_SegundoNombreKeyTyped

    private void Jt_PrimerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_PrimerApellidoKeyTyped
        //Inicio ingreso de un número para campo Primer Apellido
        char Caracter = evt.getKeyChar();
        if (Character.isDigit(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El apellido sólo debe estar compuesto por letras", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        //Fin ingreso de un número para campo Primer Apellido
    }//GEN-LAST:event_Jt_PrimerApellidoKeyTyped

    private void Jt_SegundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_SegundoApellidoKeyTyped
        //Inicio ingreso de un número para campo Segundo Apellido
        char Caracter = evt.getKeyChar();
        if (Character.isDigit(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El apellido sólo debe estar compuesto por letras", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        //Fin ingreso de un número para campo Segundo Apellido
    }//GEN-LAST:event_Jt_SegundoApellidoKeyTyped

    private void Jt_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_TelefonoKeyTyped
        //Inicio ingreso letras en campo para Teléfono
        char Caracter = evt.getKeyChar();
        if (Character.isLetter(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El teléfono sólo debe estar compuesto por números", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        if (Jt_Telefono.getText().length() == 10) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El teléfono debe tener un máximo de 10 dígitos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, IconoError);
        }
        //Fin ingreso letras en campos para Teléfono
    }//GEN-LAST:event_Jt_TelefonoKeyTyped

    private void JRb_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRb_MasculinoActionPerformed
        //Inicio click sobre radio botón Masculino
        Sexo = 1;
        //Fin click sobre radio botón Masculino
    }//GEN-LAST:event_JRb_MasculinoActionPerformed

    private void JRb_FemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRb_FemeninoActionPerformed
        //Inicio click sobre radio botón Femenino
        Sexo = 2;
        //Fin click sobre radio botón Femenino
    }//GEN-LAST:event_JRb_FemeninoActionPerformed

    private void JRb_IndefinidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRb_IndefinidoActionPerformed
        //Inicio click sobre radio botón Indefinido
        Sexo = 3;
        //Fin click sobre radio botón Indefinido
    }//GEN-LAST:event_JRb_IndefinidoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicio ventana Registro abierta
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
        //Fin ventana Registro abierta
    }//GEN-LAST:event_formWindowOpened

    public void LimpiarCamposUsuarios() { //Inicio método Limpiar Datos ingresados
        Jt_CodigoUsuario.setText(null);
        Jt_PrimerNombre.setText(null);
        Jt_SegundoNombre.setText(null);
        Jt_PrimerApellido.setText(null);
        Jt_SegundoApellido.setText(null);
        Grupo_Sexo.clearSelection();
        Jt_Correo.setText(null);
        Jt_Telefono.setText(null);
        JCombo_TipoPerfil.setSelectedIndex(0);
        JCombo_Area.setSelectedIndex(0);
        JCombo_Cargo.setSelectedIndex(0);
        JCombo_Estado.setSelectedIndex(0);
        Jt_Contrasena.setText(null);
    } //Fin método Limpiar Datos ingresados

    public static void main(String args[]) { //Inicio lanzador clase Registro
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroUsuarios().setVisible(true);
        });
    } //Fin lanzador clase Registro

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Grupo_Sexo;
    public static javax.swing.JComboBox<String> JCombo_Area;
    public static javax.swing.JComboBox<String> JCombo_Cargo;
    public static javax.swing.JComboBox<String> JCombo_Estado;
    public static javax.swing.JComboBox<String> JCombo_TipoPerfil;
    private javax.swing.JPanel JPanel_Principal;
    private javax.swing.JPanel JPanel_Registro;
    public static javax.swing.JRadioButton JRb_Femenino;
    public static javax.swing.JRadioButton JRb_Indefinido;
    public static javax.swing.JRadioButton JRb_Masculino;
    private javax.swing.JSeparator JSeparador_1;
    private javax.swing.JLabel J_SolicitudCorreo;
    private javax.swing.JButton Jb_BuscarUsuario;
    private javax.swing.JButton Jb_Cerrar;
    private javax.swing.JButton Jb_CodigoAleatorio;
    private javax.swing.JButton Jb_LimpiarCampos;
    private javax.swing.JButton Jb_Minimizar;
    private javax.swing.JButton Jb_RegistrarUsuario;
    private javax.swing.JButton Jb_Volver;
    private javax.swing.JLabel Jl_Area;
    private javax.swing.JLabel Jl_SolicitudCargo;
    private javax.swing.JLabel Jl_SolicitudCodigo;
    private javax.swing.JLabel Jl_SolicitudContrasena;
    private javax.swing.JLabel Jl_SolicitudEstado;
    private javax.swing.JLabel Jl_SolicitudPerfil;
    private javax.swing.JLabel Jl_SolicitudPrimerApellido;
    private javax.swing.JLabel Jl_SolicitudPrimerNombre;
    private javax.swing.JLabel Jl_SolicitudSegundoApellido;
    private javax.swing.JLabel Jl_SolicitudSegundoNombre;
    private javax.swing.JLabel Jl_SolicitudSexo;
    private javax.swing.JLabel Jl_SolicitudTelefono;
    private javax.swing.JLabel Jl_TituloVentana;
    public static javax.swing.JTextField Jt_CodigoUsuario;
    public static javax.swing.JTextField Jt_Contrasena;
    public static javax.swing.JTextField Jt_Correo;
    public static javax.swing.JTextField Jt_PrimerApellido;
    public static javax.swing.JTextField Jt_PrimerNombre;
    public static javax.swing.JTextField Jt_SegundoApellido;
    public static javax.swing.JTextField Jt_SegundoNombre;
    public static javax.swing.JTextField Jt_Telefono;
    // End of variables declaration//GEN-END:variables
} //Fin clase Registro
