package entregable3;
import java.util.*;

public class main {
static boolean aplicacion=true;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		tareas.revisiontxt();
		while(aplicacion==true) {
			System.out.println("");
	System.out.println("-----TO-DO_APP-----");
	System.out.println("que desea hacer:");
	System.out.println("1--añadir tarea.");
	System.out.println("2--ver las tareas pendientes.");
	System.out.println("3--completar una tarea.");
	System.out.println("4-- ver tareas completadas.");
	System.out.println("5-- ver todas las tareas(completas y pendientes).");
	System.out.println("6--salir.");
	System.out.println("");
	int a= sc.nextInt();
	System.out.println();
	switch (a) {
	case 1:tareas.añadir_tarea();
	break;
	case 2:tareas.ver_pendientes();
	break;
	case 3:tareas.completar_tarea();
	break;
	case 4:tareas.ver_completadas();
	break;
	case 5:tareas.ver_tareas();
		break;
	case 6:aplicacion=false;
	System.out.println("Adios :D");
	tareas.guardar();
		break;
		}

	}
		
	}
	
}
