package Ventanas;
//Hecho por: Diego Fernando Victoria López
//Grado: 11 - B
//Calipsoft - Proyecto de aula - 2019

//Inicio importación de clases
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import Animacion.Fade;
import Clases.SqlUsuarios;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.Icon;
//Fin importación de clases

public class Principal extends javax.swing.JFrame { //Inicio clase Principal

    //Inicio definición de variables globales
    int X, Y;
    public AudioClip SonidoCerrar = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/AudioCerrar.wav"));
    Icon ImagenLimpieza = new ImageIcon(getClass().getResource("/Imagenes/IconoCamposLimpiados.png"));
    Icon ImagenFin = new ImageIcon(getClass().getResource("/Imagenes/IconoFinPrograma.png"));
    RegistroUsuarios ObjetoConRegistro = new RegistroUsuarios();
    //Fin definición de variables globales

    public Principal() { //Inicio constructor clase Principal
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoCalipsoftPequeño.png")).getImage());
        this.setLocationRelativeTo(null);
        Shape FormaVentana = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, FormaVentana);
    } //Fin constructor clase Principal

    //Inicio constructor de objetos clase Principal
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Principal = new javax.swing.JPanel();
        JPanel_IngresoDatos = new javax.swing.JPanel();
        Jl_IngresarDatos = new javax.swing.JLabel();
        Jl_SolicitudCodigo = new javax.swing.JLabel();
        Jt_Codigo = new javax.swing.JTextField();
        Jl_SolicitudContrasena = new javax.swing.JLabel();
        Jp_ContrasenaUsuario = new javax.swing.JPasswordField();
        Jl_SolicitudTipoUsuario = new javax.swing.JLabel();
        JCombo_TipoUsuario = new javax.swing.JComboBox<>();
        Jb_Ingresar = new javax.swing.JButton();
        Jb_Registrarse = new javax.swing.JButton();
        Jb_BorrarDatos = new javax.swing.JButton();
        Jb_PasswordOlvidada = new javax.swing.JButton();
        Jl_Especificaciones = new javax.swing.JLabel();
        JPanel_Superior = new javax.swing.JPanel();
        Jl_Titulo = new javax.swing.JLabel();
        Jl_SubTitulo = new javax.swing.JLabel();
        Jb_Minimizar = new javax.swing.JButton();
        Jb_Cerrar = new javax.swing.JButton();
        Jl_LogoCalipsoft = new javax.swing.JLabel();
        JPanel_Inferior = new javax.swing.JPanel();
        Jl_IconoLaceSoft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calipsoft");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setName("Ventana Principal"); // NOI18N
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
        JPanel_Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanel_Principal.setName("Panel Principal"); // NOI18N
        JPanel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel_IngresoDatos.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_IngresoDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 38, 33), 3, true));

        Jl_IngresarDatos.setFont(new java.awt.Font("Varsity Regular", 0, 24)); // NOI18N
        Jl_IngresarDatos.setForeground(new java.awt.Color(51, 51, 51));
        Jl_IngresarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_IngresarDatos.setText("INGRESAR DATOS");

        Jl_SolicitudCodigo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudCodigo.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudCodigo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudCodigo.setText("Código de usuario:");

        Jt_Codigo.setBackground(new java.awt.Color(255, 255, 255));
        Jt_Codigo.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jt_Codigo.setForeground(new java.awt.Color(51, 51, 51));
        Jt_Codigo.setToolTipText("Ingrese su código de usuario");
        Jt_Codigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jt_Codigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Jt_Codigo.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jt_Codigo.setSelectionColor(new java.awt.Color(248, 38, 33));
        Jt_Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jt_CodigoKeyTyped(evt);
            }
        });

        Jl_SolicitudContrasena.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudContrasena.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudContrasena.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudContrasena.setText("Contraseña:");

        Jp_ContrasenaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Jp_ContrasenaUsuario.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jp_ContrasenaUsuario.setForeground(new java.awt.Color(51, 51, 51));
        Jp_ContrasenaUsuario.setToolTipText("Contraseña del usuario");
        Jp_ContrasenaUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(248, 38, 33)));
        Jp_ContrasenaUsuario.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        Jp_ContrasenaUsuario.setSelectionColor(new java.awt.Color(248, 38, 33));

        Jl_SolicitudTipoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SolicitudTipoUsuario.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        Jl_SolicitudTipoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SolicitudTipoUsuario.setText("Tipo de usuario:");

        JCombo_TipoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_TipoUsuario.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        JCombo_TipoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_TipoUsuario.setMaximumRowCount(5);
        JCombo_TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Administrador", "Técnico", "Usuario" }));
        JCombo_TipoUsuario.setToolTipText("Tipo de usuario asociado a la cuenta");
        JCombo_TipoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Jb_Ingresar.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Ingresar.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jb_Ingresar.setForeground(new java.awt.Color(51, 51, 51));
        Jb_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoIngresar.png"))); // NOI18N
        Jb_Ingresar.setText("Ingresar");
        Jb_Ingresar.setToolTipText("Presione para ingresar al sistema");
        Jb_Ingresar.setBorder(null);
        Jb_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_Ingresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_IngresarMouseMoved(evt);
            }
        });
        Jb_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_IngresarMouseExited(evt);
            }
        });
        Jb_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_IngresarActionPerformed(evt);
            }
        });

        Jb_Registrarse.setBackground(new java.awt.Color(255, 255, 255));
        Jb_Registrarse.setFont(new java.awt.Font("Comfortaa", 0, 13)); // NOI18N
        Jb_Registrarse.setForeground(new java.awt.Color(51, 51, 51));
        Jb_Registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAgregarUsuario.png"))); // NOI18N
        Jb_Registrarse.setText("Registrarse");
        Jb_Registrarse.setToolTipText("Presione para registrar un nuevo usuario");
        Jb_Registrarse.setBorder(null);
        Jb_Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_Registrarse.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_RegistrarseMouseMoved(evt);
            }
        });
        Jb_Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_RegistrarseMouseExited(evt);
            }
        });
        Jb_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_RegistrarseActionPerformed(evt);
            }
        });

        Jb_BorrarDatos.setBackground(new java.awt.Color(255, 255, 255));
        Jb_BorrarDatos.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jb_BorrarDatos.setForeground(new java.awt.Color(0, 93, 166));
        Jb_BorrarDatos.setText("Borrar datos ingresados");
        Jb_BorrarDatos.setToolTipText("Borra los datos ingresados en los campos");
        Jb_BorrarDatos.setBorder(null);
        Jb_BorrarDatos.setBorderPainted(false);
        Jb_BorrarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_BorrarDatos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_BorrarDatosMouseMoved(evt);
            }
        });
        Jb_BorrarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_BorrarDatosMouseExited(evt);
            }
        });
        Jb_BorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_BorrarDatosActionPerformed(evt);
            }
        });

        Jb_PasswordOlvidada.setBackground(new java.awt.Color(255, 255, 255));
        Jb_PasswordOlvidada.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        Jb_PasswordOlvidada.setForeground(new java.awt.Color(0, 93, 166));
        Jb_PasswordOlvidada.setText("¿Olvidó su contraseña?");
        Jb_PasswordOlvidada.setToolTipText("En caso de haber olvidado su contraseña");
        Jb_PasswordOlvidada.setBorder(null);
        Jb_PasswordOlvidada.setBorderPainted(false);
        Jb_PasswordOlvidada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jb_PasswordOlvidada.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Jb_PasswordOlvidadaMouseMoved(evt);
            }
        });
        Jb_PasswordOlvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jb_PasswordOlvidadaMouseExited(evt);
            }
        });
        Jb_PasswordOlvidada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_PasswordOlvidadaActionPerformed(evt);
            }
        });

        Jl_Especificaciones.setBackground(new java.awt.Color(255, 255, 255));
        Jl_Especificaciones.setFont(new java.awt.Font("Comfortaa", 0, 11)); // NOI18N
        Jl_Especificaciones.setForeground(new java.awt.Color(51, 51, 51));
        Jl_Especificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Especificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout JPanel_IngresoDatosLayout = new javax.swing.GroupLayout(JPanel_IngresoDatos);
        JPanel_IngresoDatos.setLayout(JPanel_IngresoDatosLayout);
        JPanel_IngresoDatosLayout.setHorizontalGroup(
            JPanel_IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_IngresoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jl_Especificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jp_ContrasenaUsuario)
                    .addComponent(Jl_IngresarDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(Jt_Codigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCombo_TipoUsuario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_Registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_BorrarDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jb_PasswordOlvidada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_IngresoDatosLayout.createSequentialGroup()
                        .addGroup(JPanel_IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jl_SolicitudCodigo)
                            .addComponent(Jl_SolicitudContrasena)
                            .addComponent(Jl_SolicitudTipoUsuario))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanel_IngresoDatosLayout.setVerticalGroup(
            JPanel_IngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_IngresoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jl_IngresarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jl_SolicitudCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jl_SolicitudContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jp_ContrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jl_SolicitudTipoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCombo_TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jb_BorrarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jb_PasswordOlvidada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jl_Especificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jb_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jb_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPanel_Principal.add(JPanel_IngresoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 280, 370));

        JPanel_Superior.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_Titulo.setFont(new java.awt.Font("Varsity Regular", 2, 70)); // NOI18N
        Jl_Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_Titulo.setText("CALIPSOFT");
        Jl_Titulo.setToolTipText("");
        Jl_Titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Jl_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JPanel_Superior.add(Jl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, 90));

        Jl_SubTitulo.setBackground(new java.awt.Color(255, 255, 255));
        Jl_SubTitulo.setFont(new java.awt.Font("Comfortaa", 2, 24)); // NOI18N
        Jl_SubTitulo.setForeground(new java.awt.Color(51, 51, 51));
        Jl_SubTitulo.setText("Gestión de equipos");
        JPanel_Superior.add(Jl_SubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, -1));

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
        JPanel_Superior.add(Jb_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

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
        JPanel_Superior.add(Jb_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        Jl_LogoCalipsoft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCalipsoftPequeño.png"))); // NOI18N
        Jl_LogoCalipsoft.setToolTipText("Calipsoft");
        JPanel_Superior.add(Jl_LogoCalipsoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        JPanel_Principal.add(JPanel_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 200));

        JPanel_Inferior.setBackground(new java.awt.Color(248, 38, 33));
        JPanel_Inferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jl_IconoLaceSoft.setBackground(new java.awt.Color(248, 38, 33));
        Jl_IconoLaceSoft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoComputadorLaceSoft.png"))); // NOI18N
        Jl_IconoLaceSoft.setToolTipText("Diego Fernando Victoria");
        JPanel_Inferior.add(Jl_IconoLaceSoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        JPanel_Principal.add(JPanel_Inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 800, 250));

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
    //Fin constructor de objetos clase Principal

    private void Jb_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_CerrarActionPerformed
        //Inicio click botón Cerrar
        int ConfirmacionSalir = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "CALIPSOFT", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ObjetoConRegistro.IconoAtencion);
        if (ConfirmacionSalir == JOptionPane.YES_OPTION) {
            SonidoCerrar.play();
            JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ImagenFin);
            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.EXIT);
        } else {
            JOptionPane.showMessageDialog(null, "Regresando al menú principal", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistro.IconoAtencion);
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
                System.err.println("Error en cronómetro - Método ventana Principal minimizada\nMensaje del error: " + e);
            }
        }
        this.setExtendedState(ICONIFIED);
        this.setOpacity(1);
        //Fin click sobre botón Minimizar
    }//GEN-LAST:event_Jb_MinimizarActionPerformed

    private void Jb_IngresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_IngresarMouseMoved
        //Inicio movimiento del mouse sobre botón Ingresar
        Jb_Ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 38, 33), 1, true));
        //Fin movimiento del mouse sobre botón Ingresar
    }//GEN-LAST:event_Jb_IngresarMouseMoved

    private void Jb_IngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_IngresarMouseExited
        //Inicio mouse sale de la superficie del botón Ingresar
        Jb_Ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1, true));
        //Fin mouse sale de la superficie del botón Ingresar
    }//GEN-LAST:event_Jb_IngresarMouseExited

    private void Jb_RegistrarseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_RegistrarseMouseMoved
        //Inicio movimiento del mouse sobre botón Registrarse
        Jb_Registrarse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 38, 33), 1, true));
        //Fin movimiento del mouse sobre botón Registrarse
    }//GEN-LAST:event_Jb_RegistrarseMouseMoved

    private void Jb_RegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_RegistrarseMouseExited
        //Inicio mouse sale de la superficie del botón Registrarse
        Jb_Registrarse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1, true));
        //Fin mouse sale de la superficie del botón Registrarse
    }//GEN-LAST:event_Jb_RegistrarseMouseExited

    private void Jb_BorrarDatosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_BorrarDatosMouseMoved
        //Inicio movimiento del mouse sobre botón Borrar Datos
        Jb_BorrarDatos.setForeground(new Color(51, 51, 51));
        //Fin movimiento del mouse sobre botón Borrar Datos
    }//GEN-LAST:event_Jb_BorrarDatosMouseMoved

    private void Jb_BorrarDatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_BorrarDatosMouseExited
        //Inicio mouse sale del botón Borrar Datos
        Jb_BorrarDatos.setForeground(new Color(0, 93, 166));
        //Fin mouse sale del botón Borrar Datos
    }//GEN-LAST:event_Jb_BorrarDatosMouseExited

    private void Jb_PasswordOlvidadaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_PasswordOlvidadaMouseMoved
        //Inicio movimiento del mouse sobre botón Olvidó su contraseña
        Jb_PasswordOlvidada.setForeground(new Color(51, 51, 51));
        //Fin movimiento del mouse sobre botón Olvidó su contraseña
    }//GEN-LAST:event_Jb_PasswordOlvidadaMouseMoved

    private void Jb_PasswordOlvidadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_PasswordOlvidadaMouseExited
        //Inicio mouse sale del botón Olvidó su contraseña
        Jb_PasswordOlvidada.setForeground(new Color(0, 93, 166));
        //Fin mouse sale del botón Olvidó su contraseña
    }//GEN-LAST:event_Jb_PasswordOlvidadaMouseExited

    private void Jb_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_RegistrarseActionPerformed
        //Inicio click sobre botón Registrarse
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
        ObjetoConRegistro.setVisible(true);
        //Fin click sobre botón Registrarse
    }//GEN-LAST:event_Jb_RegistrarseActionPerformed

    private void Jb_BorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_BorrarDatosActionPerformed
        //Inicio click sobre botón Borrar Datos
        Jt_Codigo.setText(null);
        Jp_ContrasenaUsuario.setText(null);
        JCombo_TipoUsuario.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, "Campos de texto limpiados", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ImagenLimpieza);
        //Fin click sobre botón Borrar Datos
    }//GEN-LAST:event_Jb_BorrarDatosActionPerformed

    private void Jb_PasswordOlvidadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_PasswordOlvidadaActionPerformed
        try {
            //Inicio click sobre botón ¿Olvidó su contraseña?
            Properties Propiedades = new Properties();
            Propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
            Propiedades.setProperty("mail.smtp.starttls.enable", "true");
            Propiedades.setProperty("mail.smtp.port", "587");
            Propiedades.setProperty("mail.smtp.auth", "true");
            Session Ingreso = Session.getDefaultInstance(Propiedades);
            String CorreoSalida = ""; //CalipsoftApp@gmail.com
            String PassSalida = ""; //Calipsoft2019
            SqlUsuarios.TomarCorreo(Integer.parseInt(Jt_Codigo.getText()));
            String CorreoLlegada = SqlUsuarios.CorreoBD;
            String AsuntoCorreo = "Solicitud de contraseña - Código de usuario: " + Jt_Codigo.getText();
            String MensajeCorreo = "";
            MimeMessage message = new MimeMessage(Ingreso);
            message.setFrom(new InternetAddress(CorreoSalida));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(CorreoLlegada));
            message.setSubject(AsuntoCorreo);
            message.setText(MensajeCorreo);
            Transport t = Ingreso.getTransport("smtp");
            t.connect(CorreoSalida, PassSalida);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            JOptionPane.showMessageDialog(null, "Correo electrónico con contraseña enviado", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistro.IconoVerificacion);
        } catch (AddressException ex) {
            System.err.println("Se ha producido un error en el envío del mensaje");
        } catch (MessagingException ex) {
            System.err.println("Se ha producido un error en el envío del mensaje");
        }
        //Fin click sobre botón ¿Olvidó su contraseña?
    }//GEN-LAST:event_Jb_PasswordOlvidadaActionPerformed

    private void Jb_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_IngresarActionPerformed
        //Inicio click sobre botón Ingresar
        String CodigoUsuarioPrincipal = Jt_Codigo.getText();
        String ClaveUsuarioPrincipal = new String(Jp_ContrasenaUsuario.getPassword());
        int PosicionTipoUsuario = JCombo_TipoUsuario.getSelectedIndex();
        if (CodigoUsuarioPrincipal.isEmpty()) {
            Jl_Especificaciones.setText("¡Ingresar usuario!");
            Jt_Codigo.requestFocus();
        } else {
            if (ClaveUsuarioPrincipal.isEmpty()) {
                Jl_Especificaciones.setText("¡Ingresar contraseña!");
                Jp_ContrasenaUsuario.requestFocus();
            } else {
                if (JCombo_TipoUsuario.getSelectedIndex() == 0) {
                    Jl_Especificaciones.setText("¡Seleccionar tipo de usuario!");
                    JCombo_TipoUsuario.requestFocus();
                } else {
                    Jl_Especificaciones.setText("Datos completos");
                    SqlUsuarios.ValidarUsuario(CodigoUsuarioPrincipal, ClaveUsuarioPrincipal, this, PosicionTipoUsuario);
                }
            }
        }
        //Fin click sobre botón Ingresar
    }//GEN-LAST:event_Jb_IngresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicio ventana Principal abierta
        for (double i = 0.0; i < 1.0; i += 0.1) {
            String Valor = i + "";
            float ValorFloat = Float.valueOf(Valor);
            this.setOpacity(ValorFloat);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en cronómetro - Método Ventana Principal abierta\nMensaje del error: " + e);
            }
        }
        //Fin ventana Principal abierta
    }//GEN-LAST:event_formWindowOpened

    private void Jt_CodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jt_CodigoKeyTyped
        //Inicio ingreso de una letra en campo para Código
        char Caracter = evt.getKeyChar();
        if (Character.isLetter(Caracter)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El código sólo debe estar compuesto por números", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistro.IconoError);
        }
        if (Jt_Codigo.getText().length() == 6) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "El código debe tener un máximo de 6 dígitos", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistro.IconoError);
        }
        //Fin ingreso de una letra en campo para Código
    }//GEN-LAST:event_Jt_CodigoKeyTyped

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        //Inicio mouse suelta la ventana
        setOpacity((float) 1);
        //Fin mouse suelta la ventana
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //Inicio mouse mueve la ventana
        setOpacity((float) 0.7);
        this.setLocation(this.getLocation().x + evt.getX() - X, this.getLocation().y + evt.getY() - Y);
        //Fin mouse suelta la ventana
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        //Inicio mouse sobre la ventana
        X = evt.getX();
        Y = evt.getY();
        //Fin mouse sobre la ventana
    }//GEN-LAST:event_formMouseMoved

    public static void main(String args[]) { //Inicio lanzador clase Principal
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    } //Fin lanzador clase Principal

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCombo_TipoUsuario;
    private javax.swing.JPanel JPanel_Inferior;
    private javax.swing.JPanel JPanel_IngresoDatos;
    private javax.swing.JPanel JPanel_Principal;
    private javax.swing.JPanel JPanel_Superior;
    private javax.swing.JButton Jb_BorrarDatos;
    private javax.swing.JButton Jb_Cerrar;
    private javax.swing.JButton Jb_Ingresar;
    private javax.swing.JButton Jb_Minimizar;
    private javax.swing.JButton Jb_PasswordOlvidada;
    private javax.swing.JButton Jb_Registrarse;
    public static javax.swing.JLabel Jl_Especificaciones;
    private javax.swing.JLabel Jl_IconoLaceSoft;
    private javax.swing.JLabel Jl_IngresarDatos;
    private javax.swing.JLabel Jl_LogoCalipsoft;
    private javax.swing.JLabel Jl_SolicitudCodigo;
    private javax.swing.JLabel Jl_SolicitudContrasena;
    private javax.swing.JLabel Jl_SolicitudTipoUsuario;
    private javax.swing.JLabel Jl_SubTitulo;
    private javax.swing.JLabel Jl_Titulo;
    private javax.swing.JPasswordField Jp_ContrasenaUsuario;
    private javax.swing.JTextField Jt_Codigo;
    // End of variables declaration//GEN-END:variables

} //Fin clase Principal
