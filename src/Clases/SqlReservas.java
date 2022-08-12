package Clases;

/*
Calipsoft - Proyecto final bases de datos - Abril / Agosto de 2022
Hecho por: 
Jhon Alexander Valencia Hilamo - 202042426
Cristian Camilo Montaño Renteria - 202024223
Alejandro Zamorano - 201941088
Diego Fernando Victoria López - 202125877
 */

import static Clases.SqlEquipo.ConexionBD;
import static Clases.SqlEquipo.ConsultaPreparada;
import static Clases.SqlUsuarios.conn;
import Ventanas.Menu;
import Ventanas.RegistroEquipos;
import Ventanas.RegistroUsuarios;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;
import rojerusan.RSNotifyShadowFade;

//Calipsoft - Proyecto de aula - 2019
public class SqlReservas { //Inicio clase SqlReservas

    static String ConsultaSql;
    static PreparedStatement PreparacionConsultaSql;

    public static boolean VerificarReserva(int CodigoReserva) { //Inicio método VerificarReserva
        boolean ExisteReserva = false;
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
            if (UsuarioBD == CodigoReserva) {
                ExisteUsuario = true;
                new rojerusan.RSNotifyFade("¡El código ingresado ya existe!", "Ingrese un nuevo código para proceder con el registro", 3, RSNotifyFade.PositionNotify.TopRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
            }
        } catch (SQLException ErrorValidarUsuario) { //Captura del error que se ha producido
            new rojerusan.RSNotifyShadowFade("¡Se ha producido un error!", "Error al verificar usuario - Método VerificarUsuario", 3, RSNotifyShadowFade.PositionNotify.BottomRight, RSNotifyShadowFade.TypeNotify.ERROR).setVisible(true);
            System.err.println("Error - Método VerificarUsuario:\n" + ErrorValidarUsuario);
        } //Fin capturador de errores
        return ExisteUsuario;
    } //Fin método VerificarReserva

    public static int EliminarReserva(int CodigoReserva) { //Inicio método EliminarReserva
        int rsu = 0;

        return rsu;
    } //Fin método EliminarReserva

    public static void ListarReservas(String Dato) { //Inicio método ListarReserva
        DefaultTableModel ModeloTablaReservas = (DefaultTableModel) Menu.JTable_Reserva.getModel();
        while (ModeloTablaReservas.getRowCount() > 0) {
            ModeloTablaReservas.removeRow(0);
        }
        if (Dato.equals("")) {
            ConsultaSql = "SELECT * FROM reserva";
        } else {
            ConsultaSql = "SELECT * FROM reserva WHERE (codigo LIKE'" + Dato + "%' OR código_Usuario LIKE'" + Dato + "%') AND codigo!=1 ORDER BY codigo";
        }
        String DatosBD[] = new String[9];
        try { //Inicio capturador de errores
            Statement ConsultaBD = ConexionBD.createStatement();
            ResultSet ResultadosConsulta = ConsultaBD.executeQuery(ConsultaSql);
            while (ResultadosConsulta.next()) {
                DatosBD[0] = ResultadosConsulta.getString("codigo");
                DatosBD[1] = ResultadosConsulta.getString("fecha_Actual");
                DatosBD[2] = ResultadosConsulta.getString("fecha_Reserva");
                DatosBD[3] = ResultadosConsulta.getString("fecha_Devolución");
                DatosBD[4] = ResultadosConsulta.getString("hora_Prestamo");
                DatosBD[5] = ResultadosConsulta.getString("hora_Devolución");
                DatosBD[6] = ResultadosConsulta.getString("código_Usuario");
                DatosBD[7] = ResultadosConsulta.getString("código_Equipo");
                DatosBD[8] = ResultadosConsulta.getString("estado_reserva");
                DatosBD[9] = ResultadosConsulta.getString("descripción");
                ModeloTablaReservas.addRow(DatosBD);
            }
        } catch (SQLException ErrorListarEquipos) { //Capturador del error
            System.err.println("Se ha producido un error al listar las reservas\nMensaje del error: " + ErrorListarEquipos);
        } //Fin capturador de  errores
    } //Fin método Listar Equipos

    public static int InsertarEquipo() { //Inicio método Insertar Equipos
        int ResultadosConsulta = 0;
        String sql = "INSERT INTO `equipo`(`serial`, `id_tipo_equipo`, `id_ubicación`, `id_marca`, `modelo`, `observaciones`, `id_estados_equipos`) VALUES (?,?,?,?,?,?,?)";
        try { //Inicio capturador de errores
            ConsultaPreparada = ConexionBD.prepareStatement(sql);
            ConsultaPreparada.setInt(1, Integer.parseInt(RegistroEquipos.Jt_Serial.getText()));
            ConsultaPreparada.setInt(2, RegistroEquipos.JCombo_TipoEquipo.getSelectedIndex());
            ConsultaPreparada.setInt(3, RegistroEquipos.JCombo_Ubicacion.getSelectedIndex());
            ConsultaPreparada.setInt(4, RegistroEquipos.JCombo_Marca.getSelectedIndex());
            ConsultaPreparada.setString(5, RegistroEquipos.Jt_Modelo.getText());
            ConsultaPreparada.setString(6, RegistroEquipos.Jta_Observaciones.getText());
            ConsultaPreparada.setInt(7, RegistroEquipos.JCombo_Estado.getSelectedIndex());
            ResultadosConsulta = ConsultaPreparada.executeUpdate();
        } catch (SQLException ErrorInsertarEquipo) { //Capturador del error producido
            System.err.println("Error al Insertar Equipo - Método InsertarEquipo\nMensaje del error: " + ErrorInsertarEquipo);
        } //Fin capturador de errores
        return ResultadosConsulta;
    } //Fin método Insertar Equipos

    public static void BuscarEquipo() { //Inicio método Buscar Equipos
        try { //Inicio capturador de errores
            ConsultaSql = "SELECT * FROM equipo WHERE serial=?";
            ConsultaPreparada = ConexionBD.prepareStatement(ConsultaSql);
            ConsultaPreparada.setInt(1, Integer.parseInt(RegistroEquipos.Jt_Serial.getText()));
            ResultSet rs = ConsultaPreparada.executeQuery();
            while (rs.next()) {
                RegistroEquipos.Jt_Serial.setText(rs.getString("serial"));
                RegistroEquipos.JCombo_TipoEquipo.setSelectedIndex(Integer.parseInt(rs.getString("id_tipo_equipo")));
                RegistroEquipos.JCombo_Ubicacion.setSelectedIndex(Integer.parseInt(rs.getString("id_ubicación")));
                RegistroEquipos.JCombo_Marca.setSelectedIndex(Integer.parseInt(rs.getString("id_marca")));
                RegistroEquipos.Jt_Modelo.setText(rs.getString("modelo"));
                RegistroEquipos.Jta_Observaciones.setText(rs.getString("observaciones"));
                RegistroEquipos.JCombo_Estado.setSelectedIndex(Integer.parseInt(rs.getString("id_estados_equipos")));
            }
        } catch (SQLException ex) { //Inicio capturador del error producido
            System.err.println("Se ha producido un error - Método Buscar Equipo\nMensaje del error: " + ex);
        } //Fin capturador de errores
    } //Fin método ListarReservas

    public static int InsertarReserva() { //Inicio método InsertarReserva
        int rsu = 0;

        return rsu;
    } //Fin método InsertarReserva

    public static void BuscarReserva() { //Inicio método BuscarReserva

    } //Fin método BuscarReserva

    public static int ModificarReserva() { //Inicio método ModificarReserva
        int rsu = 0;

        return rsu;
    } //Fin método ModificarReserva

} //Fin clase SqlReservas
