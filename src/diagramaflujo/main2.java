package diagramaflujo;

import java.util.Scanner;

public class main2 {
	//isimos imprecion
	//lectura
	//condicion 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//el rombo se lo representa con if()
		System.out.println("Ingrese un numero: ");
		 Scanner lector=new Scanner(System.in);// Teclado
	       int A = lector.nextInt();
	     
		
		if(A>7) {
			//va el camino del(si) 
			System.out.println("numero correcto ");
			
		}else {
			//va el camino del( no)
			System.out.println(" numero incorrecto ");
			System.out.println("el numero ingresado es :"+A);
		}
	}

}
