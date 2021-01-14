package entregable3;
import pratica3.tarea;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class tareas {
static int ID=1;
static  Hashtable<Integer,tarea> tareas=new Hashtable();


public static void añadir_tarea() {
			
			Scanner sc=new Scanner(System.in);
			
			 
				
				 System.out.println("cual es el titulo de la tarea:");
				 
				 String titulo=sc.nextLine();
				
				 tarea tarea1=new tarea(titulo,new Date(),false);
				 tareas.put(ID, tarea1);
				ID++;
				
			
		}
		
	public static void ver_tareas() {
		for (int i = 1; i <= ID-1; i++) {
			System.out.println(i+"-"+tareas.get(i));
		System.out.println();
		}
	}
	public static void completar_tarea() {
		
		Scanner sc=new Scanner(System.in);
		ver_pendientes();
		System.out.println("que tarea deseas completar");
		int completar=sc.nextInt();
		tareas.get(completar).SetPendiente(true);
		
	}
	public static void ver_pendientes() {
		for (int i = 1; i < ID; i++) {
			if(tareas.get(i).GetPendiente()==false) {
				System.out.println(i+"-"+tareas.get(i));
				System.out.println("");
			}
		}
	}
	public static void ver_completadas() {
		for (int i = 1; i < ID; i++) {
			if(tareas.get(i).GetPendiente()==true) {
				System.out.println(tareas.get(i));
			}else {
				System.out.println("no hay tareas completadas");
				break;
			}
	}
	}
	public static void revisiontxt() {
		try {
		      File myObj = new File("src\\entregable3\\to-do-app.txt");
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String div[ ]=data.split("_");
				String titulo=div[0];
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				Date fechaDate=formatter.parse(div[1]);
				boolean estado=Boolean.parseBoolean(div[2]);
				tarea tarea1=new tarea(titulo,fechaDate,estado);
				 tareas.put(ID, tarea1);
				ID++;
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
	}
	public static void guardar() {
		try {
			FileWriter fichero = new FileWriter("src\\entregable3\\to-do-app.txt");
	        PrintWriter pw = new PrintWriter(fichero);
	        for (int i = 1; i < ID; i++) {
	        	pw.println(tareas.get(i));
		        
			}
	        
	        pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}