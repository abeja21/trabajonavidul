package entregable3;

import java.sql.SQLException;
import java.util.Scanner;

public class menu {

    public static void menu() throws SQLException {
        boolean aplicacion=true;
        Scanner sc=new Scanner(System.in);
        tareas.revisiontxt();
        while(aplicacion) {
            System.out.println();
            System.out.println("-----TO-DO_APP-----");
            System.out.println("que desea hacer:");
            System.out.println("1--añadir tarea.");
            System.out.println("2--ver las tareas pendientes.");
            System.out.println("3--completar una tarea.");
            System.out.println("4-- ver tareas completadas.");
            System.out.println("5-- ver todas las tareas(completas y pendientes).");
            System.out.println("6--salir.");
            System.out.println();
            int a= sc.nextInt();
            System.out.println();
            switch (a) {
                case 1 -> funciones.añadir_tarea();
                case 2 -> funciones.ver_pendientes();
                case 3 -> funciones.completar();
                case 4 -> funciones.ver_completadas();
                case 5 -> funciones.ver_tareas();
                case 6 -> {
                    aplicacion = false;
                    System.out.println("Adios :D");
                    bd.desconectar_bd();
                }
            }

        }
    }
}
