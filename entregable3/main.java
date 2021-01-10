package entregable3;
import java.util.*;
import entregable3.tareas;
public class main {
static boolean aplicacion=true;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(aplicacion==true) {
	System.out.println("-----TO-DO_APP-----");
	System.out.println("que desea hacer:");
	System.out.println("1--añadir tareas.");
	System.out.println("2--ver datos de las tareas pendientes.");
	System.out.println("3--completar una tarea.");
	System.out.println("4-- ver tareas completadas.");
	System.out.println("5-- ver todas las tareas(completas y pendientes).");
	System.out.println("6--salir.");
	int a= sc.nextInt();
	switch (a) {
	case 1:tareas.añadir_tarea();
	break;
	case 2:
	case 3:
	case 4:
	case 5:tareas.ver_tareas();
		break;
	case 6:aplicacion=false;
	System.out.println("Adios :D");
		break;
		}

	}
		
	}
	

}
