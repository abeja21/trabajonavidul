package entregable3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class tareas {
static int ID=0;
static  Hashtable tareas=new Hashtable();
		public static void añadir_tarea() {
			System.out.println("inserte la cantidad de tareas que desea añadir?");
			Scanner sc=new Scanner(System.in);
			int cantidad=sc.nextInt();
			 for (int i = 0; i < cantidad; i++) {
				 
				 System.out.println("cual es el titulo de la tarea:");
				 String titulo=sc.next();
				 tareas.put(ID, titulo);
				
			}
		}
		
	public static void ver_tareas() {
		try {
			File myObj = new File("D:\\Programacion\\Java\\eclipse-workspace\\to-do_App\\src\\entregable3\\to-do-app.txt");
				Scanner myReader=new Scanner(myObj);
				String[] elArray= new String[10];
				int i=0;
				while(myReader.hasNextLine()) {
					String data=myReader.nextLine();
					elArray[i++]=data;
				}
				for (int j = 0; j < elArray.length; j++) {
					System.out.println(elArray[j]);
				}
				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
