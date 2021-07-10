package diagramas.de.flujo;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner lector=new Scanner(System.in);
		 int n;
	        System.out.print("Introduce el número 7 : ");                                                         
	        n = lector.nextInt();
	        System.out.println("Tabla del " + n);
	        for(int i = 1; i<=12; i++){
	             System.out.println(n + " * " + i + " = " + n*i);                                                     
	        } 
	}
}