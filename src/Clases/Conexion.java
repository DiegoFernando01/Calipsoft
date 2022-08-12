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
import java.sql.*;

public class Conexion { //Inicio clase Conexión

    //Inicio creación de variables globales
    private final String base = "calipsoft";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection conn = null;
    //Fin creación de variables globales

    public Connection getConexion() { //Inicio método Connection
        try { //Inicio capturador de errores
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Conexión a BD realizada exitosamente");
        } catch (ClassNotFoundException | SQLException e) { //Capturador del error que se ha producido
            System.err.println("Problemas en la conexión\nDescripción del error: " + e);
        } //Fin capturador de errores
        return conn;
    } //Fin método Connection

} //Fin clase Conexión
