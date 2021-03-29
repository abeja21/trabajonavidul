package entregable3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class bd {
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://127.0.0.1:3306/dam";
    static final String User = "root";
    static final String Pass = "";
    static Connection conn = null;
    static Statement stmt = null;

    public static void crear_tabla() {


        try {

            stmt = conn.createStatement();

            String sql = "CREATE TABLE if not exists Tarea "
                    + "(ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "titulo VARCHAR(255), "
                    + "fecha DATETIME, "
                    + "estado BOOLEAN) ";
            stmt.executeUpdate(sql);
            System.out.println("created table in given database...");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection conexion_bd() {

        try {
            Class.forName(bd.JDBC_DRIVER);
            conn = DriverManager.getConnection(bd.DB_URL, bd.User, bd.Pass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static void desconectar_bd() {
        try {
            if (stmt != null) {
                conn.close();
            }
        } catch (SQLException se) {
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
        }
    }

}

