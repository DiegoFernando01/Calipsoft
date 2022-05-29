package Clases;
//Hecho por: Diego Fernando Victoria López
//Grado: 11 - B
//Calipsoft - Proyecto de aula - 2019

//Inicio importación de clases necesarias
import Ventanas.Menu;
import Ventanas.Principal;
import Ventanas.RegistroUsuarios;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Fin importación de clases necesarias

public class SqlUsuarios { //Inicio clase SqlUsuarios

    //Inicio creación de variables globales
    static Conexion ConexionBDUsuarios = new Conexion();
    static Connection conn = ConexionBDUsuarios.getConexion();
    static PreparedStatement PreparacionConsultaSql;
    static String CodigoUsuarioBD = "", ContrasenaBD = "", PrimerNombreBD = "", SegundoNombreBD = "", PrimerApellidoBD = "", SegundoApellidoBD = "";
    static int TipoPerfilBD = 0, EstadoBD = 0;
    public static String CorreoBD = "";
    //Fin creación de variables globales

    public static boolean VerificarUsuario(int CodigoIngresado) { //Inicio método Verificar Usuario
        boolean ExisteUsuario = false;
        int UsuarioBD = 0;
        String ConsultaSQL = "SELECT * FROM usuarios WHERE Codigo = ?";
        try { //Inicio capturador de errores
            PreparacionConsultaSql = conn.prepareStatement(ConsultaSQL);
            PreparacionConsultaSql.setString(1, RegistroUsuarios.Jt_CodigoUsuario.getText());
            ResultSet rs = PreparacionConsultaSql.executeQuery();
            while (rs.next()) {
                UsuarioBD = rs.getInt(1);
            }
            if (UsuarioBD == CodigoIngresado) {
                ExisteUsuario = true;
                JOptionPane.showMessageDialog(null, "El código de usuario que intenta ingresar ya existe", "CALIPSOFT", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) { //Captura del error que se ha producido
            System.err.println("Se ha producido un error comprobando si existen usuarios\nMensaje del error: " + e);
        } //Fin capturador de errores
        return ExisteUsuario;
    } //Fin método Verificar Usuario

    public static int EliminarUsuario(int CodigoUsuario) { //Inicio método Eliminar Usuario
        int rsu = 0;
        String sql = "DELETE FROM usuarios WHERE Codigo = ?";
        try {
            PreparacionConsultaSql = conn.prepareStatement(sql);
            PreparacionConsultaSql.setInt(1, CodigoUsuario);
            rsu = PreparacionConsultaSql.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al borrar el usuario\nMensaje del error: " + ex);
        }
        return rsu;
    } //Fin método Eliminar Usuario

    public static void ListarUsuario(String Dato) { //Inicio método Listar Usuario
        DefaultTableModel modelo = (DefaultTableModel) Menu.JTable_Usuarios.getModel(); //Nombre ventana . Nombre tabla . getModel;
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql;
        if (Dato.equals("")) {
            sql = "SELECT * FROM usuarios WHERE codigo!=1 ORDER BY codigo";
        } else {
            sql = "SELECT * FROM usuarios WHERE (Codigo LIKE'" + Dato + "%' OR "
                    + "Primer_Nombre LIKE'" + Dato + "%' OR Primer_Apellido LIKE'" + Dato + "%' OR "
                    + "Id_Cargo LIKE'" + Dato + "%') AND Codigo!=1 "
                    + "ORDER BY codigo";
        }
        String datos[] = new String[13];
        try { //Inicio capturador de errores
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String perfil = "";
            while (rs.next()) {
                datos[0] = rs.getString("Codigo");
                datos[1] = rs.getString("Primer_Nombre");
                datos[2] = rs.getString("Segundo_Nombre");
                datos[3] = rs.getString("Primer_Apellido");
                datos[4] = rs.getString("Segundo_Apellido");
                datos[5] = rs.getString("Id_Sexo");
                datos[6] = rs.getString("Correo");
                datos[7] = rs.getString("Teléfono");
                datos[8] = rs.getString("Id_Tipo_Perfil");
                datos[9] = rs.getString("Id_Área");
                datos[10] = rs.getString("Contraseña");
                datos[11] = rs.getString("Id_Cargo");
                datos[12] = rs.getString("Id_Estado");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) { //Capturador del error
            System.err.println("Se ha producido un error al listar los usuarios\nMensaje del error: " + ex);
        } //Fin capturador de  errores
    } //Fin método Listar Usuario

    public static int InsertarUsuario() { //Inicio método Insertar Usuarios
        int rsu = 0;
        String sql = "INSERT INTO usuarios(Codigo, Primer_Nombre, Segundo_Nombre, Primer_Apellido, Segundo_Apellido, Id_Sexo, Correo, Teléfono, Id_Tipo_Perfil, Id_Área, Contraseña, Id_Cargo, Id_Estado) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try { //Inicio capturador de errores
            PreparacionConsultaSql = conn.prepareStatement(sql);
            PreparacionConsultaSql.setString(1, RegistroUsuarios.Jt_CodigoUsuario.getText());
            PreparacionConsultaSql.setString(2, RegistroUsuarios.Jt_PrimerNombre.getText());
            PreparacionConsultaSql.setString(3, RegistroUsuarios.Jt_SegundoNombre.getText());
            PreparacionConsultaSql.setString(4, RegistroUsuarios.Jt_PrimerApellido.getText());
            PreparacionConsultaSql.setString(5, RegistroUsuarios.Jt_SegundoApellido.getText());
            PreparacionConsultaSql.setInt(6, RegistroUsuarios.Sexo);
            PreparacionConsultaSql.setString(7, RegistroUsuarios.Jt_Correo.getText());
            PreparacionConsultaSql.setString(8, RegistroUsuarios.Jt_Telefono.getText());
            PreparacionConsultaSql.setInt(9, RegistroUsuarios.JCombo_TipoPerfil.getSelectedIndex());
            PreparacionConsultaSql.setInt(10, RegistroUsuarios.JCombo_Area.getSelectedIndex());
            PreparacionConsultaSql.setString(11, RegistroUsuarios.Jt_Contrasena.getText());
            PreparacionConsultaSql.setInt(12, RegistroUsuarios.JCombo_Cargo.getSelectedIndex());
            PreparacionConsultaSql.setInt(13, RegistroUsuarios.JCombo_Estado.getSelectedIndex());
            rsu = PreparacionConsultaSql.executeUpdate();
        } catch (SQLException e) { //Capturador del error producido
            System.err.println("Se ha producido un error al ingresar un nuevo usuario\nMensaje del error: " + e);
        } //Fin capturador de errores
        return rsu;
    } //Fin método Insertar Usuarios

    public static void BuscarUsuario() { //Inicio método Buscar Usuarios
        try { //Inicio capturador de errores
            String sql = "SELECT * FROM usuarios WHERE codigo=?";
            PreparacionConsultaSql = conn.prepareStatement(sql);
            PreparacionConsultaSql.setString(1, RegistroUsuarios.Jt_CodigoUsuario.getText());
            ResultSet rs = PreparacionConsultaSql.executeQuery();
            while (rs.next()) { //Inicio ciclo de ingresa los datos a la ventana
                RegistroUsuarios.Jt_CodigoUsuario.setText(rs.getString("Codigo"));
                RegistroUsuarios.Jt_PrimerNombre.setText(rs.getString("Primer_Nombre"));
                RegistroUsuarios.Jt_SegundoNombre.setText(rs.getString("Segundo_Nombre"));
                RegistroUsuarios.Jt_PrimerApellido.setText(rs.getString("Primer_Apellido"));
                RegistroUsuarios.Jt_SegundoApellido.setText(rs.getString("Segundo_Apellido"));
                RegistroUsuarios.Grupo_Sexo.clearSelection();
                if (Integer.parseInt(rs.getString("Id_Sexo")) == 1) {
                    RegistroUsuarios.JRb_Masculino.setSelected(true);
                } else {
                    if (Integer.parseInt(rs.getString("Id_Sexo")) == 2) {
                        RegistroUsuarios.JRb_Femenino.setSelected(true);
                    } else {
                        if (Integer.parseInt(rs.getString("Id_Sexo")) == 3) {
                            RegistroUsuarios.JRb_Indefinido.setSelected(true);
                        }
                    }
                }
                RegistroUsuarios.Jt_Correo.setText(rs.getString("Correo"));
                RegistroUsuarios.Jt_Telefono.setText(rs.getString("Teléfono"));
                RegistroUsuarios.JCombo_TipoPerfil.setSelectedIndex(Integer.parseInt(rs.getString("Id_Tipo_Perfil")));
                RegistroUsuarios.JCombo_Area.setSelectedIndex(Integer.parseInt(rs.getString("Id_Área")));
                RegistroUsuarios.Jt_Contrasena.setText(rs.getString("Contraseña"));
                RegistroUsuarios.JCombo_Cargo.setSelectedIndex(Integer.parseInt(rs.getString("Id_Cargo")));
                RegistroUsuarios.JCombo_Estado.setSelectedIndex(Integer.parseInt(rs.getString("Id_Estado")));
            } //Fin ciclo que ingresa los datos a la ventana
        } catch (SQLException ex) { //Inicio capturador del error producido
            System.err.println("Se ha producido un error - Método Buscar Usuario\nMensaje del error: " + ex);
        } //Fin capturador de errores
    } //Fin método Buscar Usuarios

    public static int ModificarUsuario() { //Inicio método Modificar Usuarios
        int rsu = 0;
        String sql = "UPDATE usuarios SET "
                + "Codigo=?, "
                + "Primer_Nombre=?, "
                + "Segundo_Nombre=?, "
                + "Primer_Apellido=?, "
                + "Segundo_Apellido=?, "
                + "Id_Sexo=?, "
                + "Correo=?, "
                + "Teléfono=?, "
                + "Id_Tipo_Perfil=?, "
                + "Id_Área=?, "
                + "Contraseña=?, "
                + "Id_Cargo=?, "
                + "Id_Estado=? "
                + "WHERE Codigo=?";
        try { //Inicio capturador de errores
            PreparacionConsultaSql = conn.prepareStatement(sql);
            PreparacionConsultaSql.setString(1, RegistroUsuarios.Jt_CodigoUsuario.getText());
            PreparacionConsultaSql.setString(2, RegistroUsuarios.Jt_PrimerNombre.getText());
            PreparacionConsultaSql.setString(3, RegistroUsuarios.Jt_SegundoNombre.getText());
            PreparacionConsultaSql.setString(4, RegistroUsuarios.Jt_PrimerApellido.getText());
            PreparacionConsultaSql.setString(5, RegistroUsuarios.Jt_SegundoApellido.getText());
            PreparacionConsultaSql.setInt(6, RegistroUsuarios.Sexo);
            PreparacionConsultaSql.setString(7, RegistroUsuarios.Jt_Correo.getText());
            PreparacionConsultaSql.setString(8, RegistroUsuarios.Jt_Telefono.getText());
            PreparacionConsultaSql.setInt(9, RegistroUsuarios.JCombo_TipoPerfil.getSelectedIndex());
            PreparacionConsultaSql.setInt(10, RegistroUsuarios.JCombo_Area.getSelectedIndex());
            PreparacionConsultaSql.setString(11, RegistroUsuarios.Jt_Contrasena.getText());
            PreparacionConsultaSql.setInt(12, RegistroUsuarios.JCombo_Cargo.getSelectedIndex());
            PreparacionConsultaSql.setInt(13, RegistroUsuarios.JCombo_Estado.getSelectedIndex());
            PreparacionConsultaSql.setString(14, RegistroUsuarios.Jt_CodigoUsuario.getText());
            rsu = PreparacionConsultaSql.executeUpdate();
        } catch (SQLException ex) { //Capturador del error producido
            System.err.println("Error al modificar usuario - Método ModificarUsuario\nError: " + ex);
        } //Fin capturador de errores
        return rsu;
    } //Fin método Modificar Usuarios

    public static void ValidarUsuario(String CodigoUsuario, String ContrasenaUsuario, JFrame VentanaPrincipal, int PosicionTipoDeUsuario) { //Inicio método Validar Usuario
        RegistroUsuarios TomaImagenRegistro = new RegistroUsuarios();
        Menu ObjetoConMenu = new Menu();
        Principal ObjetoConPrincipal = new Principal();
        try { //Inicio capturador de errores
            String sql = "SELECT * FROM usuarios WHERE codigo =?";
            PreparacionConsultaSql = conn.prepareStatement(sql);
            PreparacionConsultaSql.setString(1, CodigoUsuario);
            ResultSet rs = PreparacionConsultaSql.executeQuery();
            while (rs.next()) {
                CodigoUsuarioBD = rs.getString(1);
                PrimerNombreBD = rs.getString(2);
                SegundoNombreBD = rs.getString(3);
                PrimerApellidoBD = rs.getString(4);
                SegundoApellidoBD = rs.getString(5);
                ContrasenaBD = rs.getString(11);
                TipoPerfilBD = rs.getInt(9);
                EstadoBD = rs.getInt(13);
            }
            if ((CodigoUsuarioBD.equals(CodigoUsuario)) && (ContrasenaBD.equals(ContrasenaUsuario)) && (TipoPerfilBD == PosicionTipoDeUsuario) && (EstadoBD == 1)) {
                switch (TipoPerfilBD) {
                    case 1:
                        Menu.NombreBD = "Administrador: " + PrimerNombreBD + " " + SegundoNombreBD + " " + PrimerApellidoBD + " " + SegundoApellidoBD;
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema administrador\n" + Menu.NombreBD, "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, TomaImagenRegistro.IconoError);
                        ObjetoConPrincipal.dispose();
                        ObjetoConMenu.setVisible(true);
                        break;
                    case 2:
                        Menu.NombreBD = "Técnico: " + PrimerNombreBD + " " + SegundoNombreBD + " " + PrimerApellidoBD + " " + SegundoApellidoBD;
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema técnico\n" + Menu.NombreBD, "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, TomaImagenRegistro.IconoTecnico);
                        ObjetoConPrincipal.dispose();
                        ObjetoConMenu.setVisible(true);
                        Menu.Jb_Usuarios.setVisible(false);
                        break;
                    case 3:
                        Menu.NombreBD = "Usuario: " + PrimerNombreBD + " " + SegundoNombreBD + " " + PrimerApellidoBD + " " + SegundoApellidoBD;
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema usuario\n" + Menu.NombreBD, "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, TomaImagenRegistro.IconoUsuario);
                        ObjetoConPrincipal.dispose();
                        ObjetoConMenu.setVisible(true);
                        Menu.Jb_Usuarios.setVisible(false);
                        Menu.Jb_Equipos.setVisible(false);
                        break;
                }
            } else {
                if ((!CodigoUsuarioBD.equals(CodigoUsuario))) {
                    JOptionPane.showMessageDialog(null, "El usuario buscado no existe", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, TomaImagenRegistro.IconoAtencion);
                    Principal.Jl_Especificaciones.setText("Usuario no encontrado");
                } else {
                    if ((!ContrasenaBD.equals(ContrasenaUsuario))) {
                        JOptionPane.showMessageDialog(null, "La contraseña de usuario es incorrecta", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, TomaImagenRegistro.IconoAtencion);
                        Principal.Jl_Especificaciones.setText("Contraseña incorrecta");
                    } else {
                        if ((TipoPerfilBD != PosicionTipoDeUsuario)) {
                            JOptionPane.showMessageDialog(null, "Tipo de usuario incorrecto", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, TomaImagenRegistro.IconoAtencion);
                            Principal.Jl_Especificaciones.setText("Tipo de usuario incorrecto");
                        } else {
                            if ((EstadoBD == 2)) {
                                JOptionPane.showMessageDialog(null, "El usuario se encuentra inhabilitado", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, TomaImagenRegistro.IconoAtencion);
                                Principal.Jl_Especificaciones.setText("El usuario está inhabilitado");
                            }
                        }
                    }
                }
            }
        } catch (SQLException ex) { //Capturador del errores producidos
            System.err.print("Error al validar usuario - Método validar usuario\nError: " + ex);
        } //Fin capturador de errores producidos
    } //Fin método Validar Usuario

    public static void TomarCorreo(int CodigoUsuario) { //Inicio método TomarCorreos
        try {
            String Sql = "SELECT * FROM usuarios WHERE codigo =?";
            PreparacionConsultaSql = conn.prepareStatement(Sql);
            PreparacionConsultaSql.setInt(1, CodigoUsuario);
            ResultSet rs = PreparacionConsultaSql.executeQuery();
            while (rs.next()) {
                CorreoBD = rs.getString(7);
            }
        } catch (SQLException e) {
            System.err.println("Se ha producido un error en la toma del correo electrónico - Método TomarCorreo\nMensaje del error: " + e);
        }
    } //Fin método TomarCorreos

} //Fin clase SqlUsuarios
