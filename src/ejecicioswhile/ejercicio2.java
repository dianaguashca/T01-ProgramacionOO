package ejecicioswhile;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese un numero  ");   
		Scanner lector=new Scanner(System.in);                                                      
	       int  n = lector.nextInt();
	      int i=1;
	        while(i<=n) {
	        int	R = i*2;
	        System.out.print("Numero "+R); 
	 	     n = lector.nextInt();
	 	     i=i+1;
	 	     
	        	
	        }
	}

}
