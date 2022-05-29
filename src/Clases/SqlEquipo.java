package Clases;
//Hecho por: Diego Fernando Victoria López
//Grado: 11 - B
//Calipsoft - Proyecto de aula - 2019

//Inicio importación de clases necesarias
import Ventanas.InventarioEquipos;
import Ventanas.Menu;
import Ventanas.RegistroEquipos;
import Ventanas.RegistroUsuarios;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Fin importación de clases necesarias

public class SqlEquipo { //Inicio clase SqlEquipos

    //Inicio creación de variables globales
    static Conexion ConexionBDEquipos = new Conexion();
    static Connection ConexionBD = ConexionBDEquipos.getConexion();
    static PreparedStatement ConsultaPreparada;
    static String ConsultaSql;
    //Fin creación de variables globales

    public static boolean VerificarEquipo(int SerialIngresado) { //Inicio método Verificar Equipo
        RegistroUsuarios ObjetoConRegistroUsuarios = new RegistroUsuarios();
        boolean ExisteEquipo = false;
        int EquipoBD = 0;
        ConsultaSql = "SELECT * FROM equipo WHERE serial = ?";
        try { //Inicio capturador de errores
            ConsultaPreparada = ConexionBD.prepareStatement(ConsultaSql);
            ConsultaPreparada.setInt(1, Integer.parseInt(RegistroEquipos.Jt_Serial.getText()));
            ResultSet ResultadosConsulta = ConsultaPreparada.executeQuery();
            while (ResultadosConsulta.next()) {
                EquipoBD = ResultadosConsulta.getInt(1);
            }
            if (EquipoBD == SerialIngresado) {
                ExisteEquipo = true;
                JOptionPane.showMessageDialog(null, "El serial existe", "CALIPSOFT", JOptionPane.PLAIN_MESSAGE, ObjetoConRegistroUsuarios.IconoError);
            }
        } catch (SQLException e) { //Captura del error que se ha producido
            System.err.println("Error al Verificar Equipo - Método VerificarEquipo\nMensaje del error: " + e);
        } //Fin capturador de errores
        return ExisteEquipo;
    } //Fin método Verificar Equipo

    public static int EliminarEquipo(int SerialTabla) { //Inicio método Eliminar Equipo
        int EjecucionConsulta = 0;
        ConsultaSql = "DELETE FROM equipo WHERE serial = ?";
        try {
            ConsultaPreparada = ConexionBD.prepareStatement(ConsultaSql);
            ConsultaPreparada.setInt(1, SerialTabla);
            EjecucionConsulta = ConsultaPreparada.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al borrar el usuario\nMensaje del error: " + ex);
        }
        return EjecucionConsulta;
    } //Fin método Eliminar Equipo

    public static void ListarEquipo(String Dato) { //Inicio método Listar Equipos
        DefaultTableModel ModeloTablaEquipos = (DefaultTableModel) Menu.JTable_Equipos.getModel();
        while (ModeloTablaEquipos.getRowCount() > 0) {
            ModeloTablaEquipos.removeRow(0);
        }
        if (Dato.equals("")) {
            ConsultaSql = "SELECT * FROM equipo ORDER BY serial";
        } else {
            ConsultaSql = "SELECT * FROM equipo WHERE (serial LIKE'" + Dato + "%' OR modelo LIKE'" + Dato + "%') AND serial!=1 ORDER BY serial";
        }
        String DatosBD[] = new String[7];
        try { //Inicio capturador de errores
            Statement ConsultaBD = ConexionBD.createStatement();
            ResultSet ResultadosConsulta = ConsultaBD.executeQuery(ConsultaSql);
            while (ResultadosConsulta.next()) {
                DatosBD[0] = ResultadosConsulta.getString("serial");
                DatosBD[1] = ResultadosConsulta.getString("id_tipo equipo");
                DatosBD[2] = ResultadosConsulta.getString("id_ubicación");
                DatosBD[3] = ResultadosConsulta.getString("id_marca");
                DatosBD[4] = ResultadosConsulta.getString("modelo");
                DatosBD[5] = ResultadosConsulta.getString("observaciones");
                DatosBD[6] = ResultadosConsulta.getString("id_estados equipos");
                ModeloTablaEquipos.addRow(DatosBD);
            }
        } catch (SQLException ErrorListarEquipos) { //Capturador del error
            System.err.println("Se ha producido un error al listar los usuarios\nMensaje del error: " + ErrorListarEquipos);
        } //Fin capturador de  errores
    } //Fin método Listar Equipos

    public static int InsertarEquipo() { //Inicio método Insertar Equipos
        int ResultadosConsulta = 0;
        String sql = "INSERT INTO `equipo`(`serial`, `id_tipo equipo`, `id_ubicación`, `id_marca`, `modelo`, `observaciones`, `id_estados equipos`) VALUES (?,?,?,?,?,?,?)";
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
                RegistroEquipos.JCombo_TipoEquipo.setSelectedIndex(Integer.parseInt(rs.getString("id_tipo equipo")));
                RegistroEquipos.JCombo_Ubicacion.setSelectedIndex(Integer.parseInt(rs.getString("id_ubicación")));
                RegistroEquipos.JCombo_Marca.setSelectedIndex(Integer.parseInt(rs.getString("id_marca")));
                RegistroEquipos.Jt_Modelo.setText(rs.getString("modelo"));
                RegistroEquipos.Jta_Observaciones.setText(rs.getString("observaciones"));
                RegistroEquipos.JCombo_Estado.setSelectedIndex(Integer.parseInt(rs.getString("id_estados equipos")));
            }
        } catch (SQLException ex) { //Inicio capturador del error producido
            System.err.println("Se ha producido un error - Método Buscar Equipo\nMensaje del error: " + ex);
        } //Fin capturador de errores
    } //Fin método Buscar Equipos

    public static int ModificarEquipo() { //Inicio método Modificar Equipos
        int ResultadosConsulta = 0;
        ConsultaSql = "UPDATE `equipo` SET `serial`=? ,`id_tipo equipo`=?,`id_ubicación`=?,`id_marca`=?,`modelo`=200?,`observaciones`=?,`id_estados equipos`=? WHERE serial =?";
        try { //Inicio capturador de errores
            ConsultaPreparada = ConexionBD.prepareStatement(ConsultaSql);
            ConsultaPreparada.setInt(1, Integer.parseInt(RegistroEquipos.Jt_Serial.getText()));
            ConsultaPreparada.setInt(2, RegistroEquipos.JCombo_TipoEquipo.getSelectedIndex());
            ConsultaPreparada.setInt(3, RegistroEquipos.JCombo_Ubicacion.getSelectedIndex());
            ConsultaPreparada.setInt(4, RegistroEquipos.JCombo_Marca.getSelectedIndex());
            ConsultaPreparada.setInt(5, Integer.parseInt(RegistroEquipos.Jt_Modelo.getText()));
            ConsultaPreparada.setString(6, RegistroEquipos.Jta_Observaciones.getText());
            ConsultaPreparada.setInt(7, RegistroEquipos.JCombo_Estado.getSelectedIndex());
            ConsultaPreparada.setString(8, RegistroEquipos.Jt_Serial.getText());
            ResultadosConsulta = ConsultaPreparada.executeUpdate();
        } catch (SQLException ex) { //Capturador del error producido
            System.err.println("Error al modificar equipo - Método ModificarEquipo\nError: " + ex);
        } //Fin capturador de errores
        return ResultadosConsulta;
    } //Fin método Modificar Equipos

    public static void ListarInventarioEquipo(String Dato, int TipoEquipo) { //Inicio método Listar Inventario Equipo
        DefaultTableModel ModeloTablaInventario = (DefaultTableModel) InventarioEquipos.JTable_InventarioEquipos.getModel();
        while (ModeloTablaInventario.getRowCount() > 0) {
            ModeloTablaInventario.removeRow(0);
        }
        if (TipoEquipo == 0) {
            if (Dato.equals("")) {
                ConsultaSql = "SELECT * FROM equipo ORDER BY serial";
            } else {
                ConsultaSql = "SELECT * FROM equipo WHERE (serial LIKE'" + Dato + "%' OR modelo LIKE'" + Dato + "%') ORDER BY serial";
            }
        } else {
            ConsultaSql = "SELECT * FROM `equipo` WHERE ('id_tipo equipo' = " + TipoEquipo + ") ORDER BY serial";
        }
        String DatoBD[] = new String[5];
        try {
            Statement st = ConexionBD.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSql);
            while (rs.next()) {
                DatoBD[0] = rs.getString("serial");
                DatoBD[1] = rs.getString("id_tipo equipo");
                DatoBD[2] = rs.getString("id_ubicación");
                DatoBD[3] = rs.getString("id_marca");
                DatoBD[4] = rs.getString("modelo");
                ModeloTablaInventario.addRow(DatoBD);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar equipos del inventario - Método ListarInventarioEquipo\nMensaje del error: " + e);
        }
    } //Fin método Listar Inventario Equipo

} //Fin clase SqlEquipos
