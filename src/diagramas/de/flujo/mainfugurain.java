package diagramas.de.flujo;

import java.util.Scanner;

public class mainfugurain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Voy a revisar el trabajo
		//Excelente trabajo
		 System.out.print("Ingrese el numero de filas: ");
		 Scanner lector=new Scanner(System.in);
		 int N = lector.nextInt();
		 //es el bucle grande 
		 for(int fila=1;fila<=N;fila++) { 
			 
			 //bucle chiquito dentro del bucle grande
			for(int ast=N;ast>=fila;ast--) {
				 System.out.print("*");
			}
			 
			 System.out.println();//salto de linea 
			 
		 }
	

	}

}
