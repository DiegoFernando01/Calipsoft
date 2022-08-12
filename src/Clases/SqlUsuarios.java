package Clases;
/*
Calipsoft - Proyecto final bases de datos - Abril / Agosto de 2022
Hecho por: 
Jhon Alexander Valencia Hilamo - 202042426
Cristian Camilo Montaño Renteria - 202024223
Alejandro Zamorano - 201941088
Diego Fernando Victoria López - 202125877
*/

//Inicio importación de clases necesarias
import Ventanas.Menu;
import Ventanas.Principal;
import Ventanas.RegistroUsuarios;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.*;
//Fin importación de clases necesarias

public class SqlUsuarios { //Inicio clase SqlUsuarios

    //Inicio creación de variables globales
    static Conexion ConexionBDUsuarios = new Conexion();
    static Connection conn = ConexionBDUsuarios.getConexion();
    static PreparedStatement PreparacionConsultaSql;
    static String CodigoUsuarioBD = "", ContrasenaBD = "", PrimerNombreBD = "", SegundoNombreBD = "", PrimerApellidoBD = "", SegundoApellidoBD = "";
    static int TipoPerfilBD = 0, EstadoBD = 0;
    public static String CorreoBD = "";
    static String ConsultaSql;
    //Fin creación de variables globales

    public static boolean VerificarUsuario(int CodigoIngresado) { //Inicio método Verificar Usuario
        boolean ExisteUsuario = false;
        int UsuarioBD = 0;
        ConsultaSql = "SELECT * FROM usuarios WHERE Codigo = ?";
        try { //Inicio capturador de errores
            PreparacionConsultaSql = conn.prepareStatement(ConsultaSql);
            PreparacionConsultaSql.setString(1, RegistroUsuarios.Jt_CodigoUsuario.getText());
            ResultSet ResultadosConsulta = PreparacionConsultaSql.executeQuery();
            while (ResultadosConsulta.next()) {
                UsuarioBD = ResultadosConsulta.getInt(1);
            }
            if (UsuarioBD == CodigoIngresado) {
                ExisteUsuario = true;
                new rojerusan.RSNotifyFade("¡El código ingresado ya existe!", "Ingrese un nuevo código para proceder con el registro", 3, RSNotifyFade.PositionNotify.TopRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
            }
        } catch (SQLException ErrorValidarUsuario) { //Captura del error que se ha producido
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al verificar usuario - Método VerificarUsuario", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método VerificarUsuario:\n" + ErrorValidarUsuario);
        } //Fin capturador de errores
        return ExisteUsuario;
    } //Fin método Verificar Usuario

    public static int EliminarUsuario(int CodigoUsuario) { //Inicio método Eliminar Usuario
        int ResultadosConsulta = 0;
        ConsultaSql = "DELETE FROM usuarios WHERE Codigo = ?";
        try {
            PreparacionConsultaSql = conn.prepareStatement(ConsultaSql);
            PreparacionConsultaSql.setInt(1, CodigoUsuario);
            ResultadosConsulta = PreparacionConsultaSql.executeUpdate();
        } catch (SQLException ErrorEliminarUsuario) {
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al eliminar usuario - Método EliminarUsuario", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método EliminarUsuario:\n" + ErrorEliminarUsuario);
        }
        return ResultadosConsulta;
    } //Fin método Eliminar Usuario

    public static void ListarUsuario(String Dato) { //Inicio método Listar Usuario
        DefaultTableModel ModeloTablaUsuarios = (DefaultTableModel) Menu.JTable_Usuarios.getModel();
        while (ModeloTablaUsuarios.getRowCount() > 0) {
            ModeloTablaUsuarios.removeRow(0);
        }
        if (Dato.equals("")) {
            ConsultaSql = "SELECT Codigo, Primer_Nombre, Segundo_Nombre, Primer_Apellido, Segundo_Apellido, sexo, Correo, Teléfono, perfil, Área, Contraseña, Cargo, estado "
                    + "FROM usuarios INNER JOIN sexos USING (Id_Sexo) "
                    + "INNER JOIN tipo_perfiles USING (Id_Tipo_Perfil) "
                    + "INNER JOIN áreas USING (Id_Área) "
                    + "INNER JOIN cargos USING (Id_Cargo) "
                    + "INNER JOIN estados USING (Id_Estado) ORDER BY Codigo";
        } else {
            ConsultaSql = "SELECT * FROM usuarios WHERE (Codigo LIKE'" + Dato + "%' OR Primer_Nombre LIKE'" + Dato + "%' OR Primer_Apellido LIKE'" + Dato + "%' OR Id_Cargo LIKE'" + Dato + "%') ORDER BY Codigo";
        }
        String DatosBD[] = new String[13];
        try { //Inicio capturador de errores
            Statement Declaracion = conn.createStatement();
            ResultSet ResultadosConsulta = Declaracion.executeQuery(ConsultaSql);
            while (ResultadosConsulta.next()) {
                DatosBD[0] = ResultadosConsulta.getString("Codigo");
                DatosBD[1] = ResultadosConsulta.getString("Primer_Nombre");
                DatosBD[2] = ResultadosConsulta.getString("Segundo_Nombre");
                DatosBD[3] = ResultadosConsulta.getString("Primer_Apellido");
                DatosBD[4] = ResultadosConsulta.getString("Segundo_Apellido");
                DatosBD[5] = ResultadosConsulta.getString("sexo");
                DatosBD[6] = ResultadosConsulta.getString("Correo");
                DatosBD[7] = ResultadosConsulta.getString("Teléfono");
                DatosBD[8] = ResultadosConsulta.getString("perfil");
                DatosBD[9] = ResultadosConsulta.getString("Área");
                DatosBD[10] = ResultadosConsulta.getString("Contraseña");
                DatosBD[11] = ResultadosConsulta.getString("Cargo");
                DatosBD[12] = ResultadosConsulta.getString("estado");
                ModeloTablaUsuarios.addRow(DatosBD);
            }
        } catch (SQLException ErrorListarUsuarios) { //Capturador del error
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al listar usuarios - Método ListarUsuarios", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método ListarUsuarios:\n" + ErrorListarUsuarios);
        } //Fin capturador de  errores
    } //Fin método Listar Usuario

    public static int InsertarUsuario() { //Inicio método Insertar Usuarios
        int ResultadosConsulta = 0;
        ConsultaSql = "INSERT INTO usuarios (Codigo, Primer_Nombre, Segundo_Nombre, Primer_Apellido, Segundo_Apellido, Id_Sexo, Correo, Teléfono, Id_Tipo_Perfil, Id_Área, Contraseña, Id_Cargo, Id_Estado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try { //Inicio capturador de errores
            PreparacionConsultaSql = conn.prepareStatement(ConsultaSql);
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
            ResultadosConsulta = PreparacionConsultaSql.executeUpdate();
        } catch (SQLException ErrorInsertarUsuarios) { //Capturador del error producido
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al insertar usuario - Método InsertarUsuario", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método InsertarUsuarios:\n" + ErrorInsertarUsuarios);
        } //Fin capturador de errores
        return ResultadosConsulta;
    } //Fin método Insertar Usuarios

    public static void BuscarUsuario() { //Inicio método Buscar Usuarios
        try { //Inicio capturador de errores
            ConsultaSql = "SELECT * FROM usuarios WHERE codigo=?";
            PreparacionConsultaSql = conn.prepareStatement(ConsultaSql);
            PreparacionConsultaSql.setString(1, RegistroUsuarios.Jt_CodigoUsuario.getText());
            ResultSet ResultadosConsulta = PreparacionConsultaSql.executeQuery();
            while (ResultadosConsulta.next()) { //Inicio ciclo de ingresa los datos a la ventana
                RegistroUsuarios.Jt_CodigoUsuario.setText(ResultadosConsulta.getString("Codigo"));
                RegistroUsuarios.Jt_PrimerNombre.setText(ResultadosConsulta.getString("Primer_Nombre"));
                RegistroUsuarios.Jt_SegundoNombre.setText(ResultadosConsulta.getString("Segundo_Nombre"));
                RegistroUsuarios.Jt_PrimerApellido.setText(ResultadosConsulta.getString("Primer_Apellido"));
                RegistroUsuarios.Jt_SegundoApellido.setText(ResultadosConsulta.getString("Segundo_Apellido"));
                RegistroUsuarios.Grupo_Sexo.clearSelection();
                if (Integer.parseInt(ResultadosConsulta.getString("Id_Sexo")) == 1) {
                    RegistroUsuarios.JRb_Masculino.setSelected(true);
                } else {
                    if (Integer.parseInt(ResultadosConsulta.getString("Id_Sexo")) == 2) {
                        RegistroUsuarios.JRb_Femenino.setSelected(true);
                    } else {
                        if (Integer.parseInt(ResultadosConsulta.getString("Id_Sexo")) == 3) {
                            RegistroUsuarios.JRb_Indefinido.setSelected(true);
                        }
                    }
                }
                RegistroUsuarios.Jt_Correo.setText(ResultadosConsulta.getString("Correo"));
                RegistroUsuarios.Jt_Telefono.setText(ResultadosConsulta.getString("Teléfono"));
                RegistroUsuarios.JCombo_TipoPerfil.setSelectedIndex(Integer.parseInt(ResultadosConsulta.getString("Id_Tipo_Perfil")));
                RegistroUsuarios.JCombo_Area.setSelectedIndex(Integer.parseInt(ResultadosConsulta.getString("Id_Área")));
                RegistroUsuarios.Jt_Contrasena.setText(ResultadosConsulta.getString("Contraseña"));
                RegistroUsuarios.JCombo_Cargo.setSelectedIndex(Integer.parseInt(ResultadosConsulta.getString("Id_Cargo")));
                RegistroUsuarios.JCombo_Estado.setSelectedIndex(Integer.parseInt(ResultadosConsulta.getString("Id_Estado")));
            } //Fin ciclo que ingresa los datos a la ventana
        } catch (SQLException ErrorBuscarUsuarios) { //Inicio capturador del error producido
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al buscar usuarios - Método BuscarUsuarios", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método BuscarUsuarios:\n" + ErrorBuscarUsuarios);
        } //Fin capturador de errores
    } //Fin método Buscar Usuarios

    public static int ModificarUsuario() { //Inicio método Modificar Usuarios
        int ResultadosConsulta = 0;
        ConsultaSql = "UPDATE usuarios SET Codigo=?, Primer_Nombre=?, Segundo_Nombre=?, Primer_Apellido=?, Segundo_Apellido=?, Id_Sexo=?, Correo=?, Teléfono=?, Id_Tipo_Perfil=?, Id_Área=?, Contraseña=?, Id_Cargo=?, Id_Estado=? WHERE Codigo=?";
        try { //Inicio capturador de errores
            PreparacionConsultaSql = conn.prepareStatement(ConsultaSql);
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
            ResultadosConsulta = PreparacionConsultaSql.executeUpdate();
        } catch (SQLException ErrorModificarUsuarios) { //Capturador del error producido
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al modificar usuario - Método ModificarUsuaurios", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método ModificarUsuarios:\n" + ErrorModificarUsuarios);
        } //Fin capturador de errores
        return ResultadosConsulta;
    } //Fin método Modificar Usuarios

    public static void ValidarUsuario(String CodigoUsuario, String ContrasenaUsuario, JFrame VentanaPrincipal, int PosicionTipoDeUsuario) { //Inicio método Validar Usuario
        RegistroUsuarios TomaImagenRegistro = new RegistroUsuarios();
        Menu ObjetoConMenu = new Menu();
        Principal ObjetoConPrincipal = new Principal();
        try { //Inicio capturador de errores
            ConsultaSql = "SELECT * FROM usuarios WHERE codigo = ?";
            PreparacionConsultaSql = conn.prepareStatement(ConsultaSql);
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
        } catch (SQLException ErrorValidarUsuario) { //Capturador del errores producidos
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al validar usuario - Método ValidarUsuario", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método ValidarUsuarios:\n" + ErrorValidarUsuario);
        } //Fin capturador de errores producidos
    } //Fin método Validar Usuario

    public static void TomarCorreo(int CodigoUsuario) { //Inicio método TomarCorreos
        try { //Inicio capturador de errores
            ConsultaSql = "SELECT * FROM usuarios WHERE Codigo = ?";
            PreparacionConsultaSql = conn.prepareStatement(ConsultaSql);
            PreparacionConsultaSql.setInt(1, CodigoUsuario);
            ResultSet ResultadosConsulta = PreparacionConsultaSql.executeQuery();
            while (ResultadosConsulta.next()) {
                CorreoBD = ResultadosConsulta.getString(7);
            }
        } catch (SQLException ErrorTomarCorreo) { //Capturador del error producido
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al tomar correo usuario - Método TomarCorreo", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método TomarCorreo:\n" + ErrorTomarCorreo);
        } //Fin capturador del error producido
    } //Fin método TomarCorreos

} //Fin clase SqlUsuarios
