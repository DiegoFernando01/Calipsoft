package Clases;
/*
Calipsoft - Proyecto final bases de datos - Abril / Agosto de 2022
Hecho por: 
Jhon Alexander Valencia Hilamo - 202042426
Cristian Camilo Montaño Renteria - 202024223
Alejandro Zamorano - 201941088
Diego Fernando Victoria López - 202125877
*/

import static Clases.SqlUsuarios.conn;
import Ventanas.RegistroUsuarios;
import java.sql.*;
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

    public static void ListarReservas(int Dato) { //Inicio método ListarReserva

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
