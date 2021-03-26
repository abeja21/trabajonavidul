package entregable3;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class funciones {
static Scanner sc= new Scanner(System.in);
    static String estado;


        public static void ver_completadas() throws SQLException {
            Statement  stmt= main.conn.createStatement();
            String sql="select * from tarea WHERE estado=1";
            PreparedStatement prpStatement= main.conn.prepareStatement(sql);
            ResultSet rs= prpStatement.executeQuery();
            if (!rs.next()){
                System.out.println("no hay tareas completadas");
            }else{
                rs.beforeFirst();
                while (rs.next()){
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3));
                }
            }
        }

    public static void ver_pendientes() throws SQLException {
        Statement  stmt= main.conn.createStatement();
        String sql="select * from tarea WHERE estado=0";
        PreparedStatement prpStatement= main.conn.prepareStatement(sql);
        ResultSet rs= prpStatement.executeQuery();
        if (!rs.next()){
            System.out.println("no hay tareas pendientes");
        }else{
        rs.beforeFirst();
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3));
        }}
    }

    public static void añadir_tarea() throws SQLException {
        System.out.println("¿cual es el titulo de la tarea?");
        String titulo=sc.nextLine();


        Statement stmt=null;
        stmt=main.conn.createStatement();
        String consulta="INSERT INTO tarea( titulo, estado) VALUES(?, ?)";
        PreparedStatement prpStateent= main.conn.prepareStatement(consulta);
        prpStateent.setString(1,titulo);

        try {
            prpStateent.setInt(2,0);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        ResultSet rs= prpStateent.executeQuery();
    }
    public static void completar() throws SQLException {
        ver_pendientes();
        System.out.println("");
        System.out.println("introduce el numero de la tarea que deseas completar");
        int id=sc.nextInt();
        Statement  stmt= main.conn.createStatement();
        String sql="UPDATE tarea SET estado=1 WHERE ID="+id;
        PreparedStatement prpStatement= main.conn.prepareStatement(sql);
        ResultSet rs= prpStatement.executeQuery();
        System.out.println("la tarea se ha completado correctamente");
    }

    public static void ver_tareas() throws SQLException {
        Statement  stmt= main.conn.createStatement();
        String sql="select * from tarea";
        PreparedStatement prpStatement= main.conn.prepareStatement(sql);
        ResultSet rs= prpStatement.executeQuery();
        if (!rs.next()){
            System.out.println("no hay tareas ");
        }else{
            rs.beforeFirst();
            while (rs.next()){
                if (rs.getInt(4)==0){
                     estado="pendiente";
                }else {
                    estado="completada";
                }
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3)+" "+estado);
            }}
    }
}
