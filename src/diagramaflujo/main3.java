package diagramaflujo;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el valor del sueldo ");
		 Scanner lector=new Scanner(System.in);// Teclado
	       int S = lector.nextInt();
	       int B;
		if(S<300) {
				//va el camino del(si) 
	    	   B=40;
				System.out.println("su Bonificacion es: 40");
				
				
			}else {
				//va el camino del( no)
				B=0;
				System.out.println("Bonificacion de: 40");
				System.out.println("Su saldo es  :"+S);
				
			}
	     
	}

}
