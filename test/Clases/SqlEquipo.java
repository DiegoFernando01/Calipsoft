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
    static PreparedStatement Declaracion;
    static String ConsultaSQL;
    //Fin creación de variables globales

    public static boolean VerificarEquipo(int SerialIngresado) { //Inicio método Verificar Equipo
        RegistroUsuarios ObjetoConRegistroUsuarios = new RegistroUsuarios();
        boolean ExisteEquipo = false;
        int EquipoBD = 0;
        ConsultaSQL = "SELECT * FROM equipo WHERE serial = ?";
        try { //Inicio capturador de errores
            Declaracion = ConexionBD.prepareStatement(ConsultaSQL);
            Declaracion.setInt(1, Integer.parseInt(RegistroEquipos.Jt_Serial.getText()));
            ResultSet rs = Declaracion.executeQuery();
            while (rs.next()) {
                EquipoBD = rs.getInt(1);
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
        int rsu = 0;
        ConsultaSQL = "DELETE FROM equipo WHERE serial = ?";
        try {
            Declaracion = ConexionBD.prepareStatement(ConsultaSQL);
            Declaracion.setInt(1, SerialTabla);
            rsu = Declaracion.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al borrar el usuario\nMensaje del error: " + ex);
        }
        return rsu;
    } //Fin método Eliminar Equipo

    public static void ListarEquipo(String Dato) { //Inicio método Listar Equipos
        DefaultTableModel ModeloTablaEquipos = (DefaultTableModel) Menu.JTable_Equipos.getModel();
        while (ModeloTablaEquipos.getRowCount() > 0) {
            ModeloTablaEquipos.removeRow(0);
        }
        if (Dato.equals("")) {
            ConsultaSQL = "SELECT * FROM equipo WHERE serial !=1 ORDER BY serial";
        } else {
            ConsultaSQL = "SELECT * FROM equipo WHERE (serial LIKE'" + Dato + "%' OR modelo LIKE'" + Dato + "%') AND serial!=1 ORDER BY serial";
        }
        String DatosBD[] = new String[7];
        try { //Inicio capturador de errores
            Statement st = ConexionBD.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while (rs.next()) {
                DatosBD[0] = rs.getString("serial");
                DatosBD[1] = rs.getString("id_tipo equipo");
                DatosBD[2] = rs.getString("id_ubicación");
                DatosBD[3] = rs.getString("id_marca");
                DatosBD[4] = rs.getString("modelo");
                DatosBD[5] = rs.getString("observaciones");
                DatosBD[6] = rs.getString("id_estados equipos");
                ModeloTablaEquipos.addRow(DatosBD);
            }
        } catch (SQLException ex) { //Capturador del error
            System.err.println("Error al listar equipos - Método ListarEquipo\nMensaje del error: " + ex);
        } //Fin capturador de  errores
    } //Fin método Listar Equipos

    public static int InsertarEquipo() { //Inicio método Insertar Equipos
        int rsu = 0;
        ConsultaSQL = "INSERT INTO `equipo`(`serial`, `id_tipo equipo`, `id_ubicación`, `id_marca`, `modelo`, `observaciones`, `id_estados equipos`) VALUES (?,?,?,?,?,?,?)";
        try { //Inicio capturador de errores
            Declaracion = ConexionBD.prepareStatement(ConsultaSQL);
            Declaracion.setInt(1, Integer.parseInt(RegistroEquipos.Jt_Serial.getText()));
            Declaracion.setInt(2, RegistroEquipos.JCombo_TipoEquipo.getSelectedIndex());
            Declaracion.setInt(3, RegistroEquipos.JCombo_Ubicacion.getSelectedIndex());
            Declaracion.setInt(4, RegistroEquipos.JCombo_Marca.getSelectedIndex());
            Declaracion.setString(5, RegistroEquipos.Jt_Modelo.getText());
            Declaracion.setString(6, RegistroEquipos.Jta_Observaciones.getText());
            Declaracion.setInt(7, RegistroEquipos.JCombo_Estado.getSelectedIndex());
            rsu = Declaracion.executeUpdate();
        } catch (SQLException e) { //Capturador del error producido
            System.err.println("Error al Insertar Equipo - Método InsertarEquipo\nMensaje del error: " + e);
        } //Fin capturador de errores
        return rsu;
    } //Fin método Insertar Equipos

    public static void BuscarEquipo() { //Inicio método Buscar Equipos
        try { //Inicio capturador de errores
            ConsultaSQL = "SELECT * FROM equipo WHERE serial=?";
            Declaracion = ConexionBD.prepareStatement(ConsultaSQL);
            Declaracion.setInt(1, Integer.parseInt(RegistroEquipos.Jt_Serial.getText()));
            ResultSet rs = Declaracion.executeQuery();
            while (rs.next()) { //Inicio ciclo de ingresa los datos a la ventana
                RegistroEquipos.Jt_Serial.setText(rs.getString("serial"));
                RegistroEquipos.JCombo_TipoEquipo.setSelectedIndex(Integer.parseInt(rs.getString("id_tipo equipo")));
                RegistroEquipos.JCombo_Ubicacion.setSelectedIndex(Integer.parseInt(rs.getString("id_ubicación")));
                RegistroEquipos.JCombo_Marca.setSelectedIndex(Integer.parseInt(rs.getString("id_marca")));
                RegistroEquipos.Jt_Modelo.setText(rs.getString("modelo"));
                RegistroEquipos.Jta_Observaciones.setText(rs.getString("observaciones"));
                RegistroEquipos.JCombo_Estado.setSelectedIndex(Integer.parseInt(rs.getString("id_estados equipos")));
            } //Fin ciclo que ingresa los datos a la ventana
        } catch (SQLException ex) { //Inicio capturador del error producido
            System.err.println("Error al buscar equipo - Método Buscar Equipo\nMensaje del error: " + ex);
        } //Fin capturador de errores
    } //Fin método Buscar Equipos

    public static int ModificarEquipo() { //Inicio método Modificar Equipos
        int rsu = 0;
        ConsultaSQL = "UPDATE `equipo` SET `serial`=? ,`id_tipo equipo`=?,`id_ubicación`=?,`id_marca`=?,`modelo`=200?,`observaciones`=?,`id_estados equipos`=? WHERE serial =?";
        try { //Inicio capturador de errores
            Declaracion = ConexionBD.prepareStatement(ConsultaSQL);
            Declaracion.setInt(1, Integer.parseInt(RegistroEquipos.Jt_Serial.getText()));
            Declaracion.setInt(2, RegistroEquipos.JCombo_TipoEquipo.getSelectedIndex());
            Declaracion.setInt(3, RegistroEquipos.JCombo_Ubicacion.getSelectedIndex());
            Declaracion.setInt(4, RegistroEquipos.JCombo_Marca.getSelectedIndex());
            Declaracion.setInt(5, Integer.parseInt(RegistroEquipos.Jt_Modelo.getText()));
            Declaracion.setString(6, RegistroEquipos.Jta_Observaciones.getText());
            Declaracion.setInt(7, RegistroEquipos.JCombo_Estado.getSelectedIndex());
            Declaracion.setString(8, RegistroEquipos.Jt_Serial.getText());
            rsu = Declaracion.executeUpdate();
        } catch (SQLException ex) { //Capturador del error producido
            System.err.println("Error al modificar equipo - Método ModificarEquipo\nError: " + ex);
        } //Fin capturador de errores
        return rsu;
    } //Fin método Modificar Equipos

    public static void ListarInventarioEquipo(String Dato, int TipoEquipo) { //Inicio método Listar Inventario Equipo
        DefaultTableModel ModeloTablaInventario = (DefaultTableModel) InventarioEquipos.JTable_InventarioEquipos.getModel();
        while (ModeloTablaInventario.getRowCount() > 0) {
            ModeloTablaInventario.removeRow(0);
        }
        if (Dato.equals("")) {
            ConsultaSQL = "SELECT * FROM equipo ORDER BY serial";
        } else {
            ConsultaSQL = "SELECT * FROM equipo WHERE (serial LIKE'" + Dato + "%' OR modelo LIKE'" + Dato + "%') ORDER BY serial";
        }
        if (TipoEquipo != 0) {
            ConsultaSQL = "SELECT * FROM equipo WHERE (id_tipo equipo = " + TipoEquipo + ") ORDER BY serial";
        }
        String DatoBD[] = new String[5];
        try {
            Statement st = ConexionBD.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
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
