package Clases;
//Hecho por: Diego Fernando Victoria López
//Grado: 11 - B
//Calipsoft - Proyecto de aula - 2019

//Inicio importación de clases necesarias
import java.sql.*;
//Fin importación de clases necesarias

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
