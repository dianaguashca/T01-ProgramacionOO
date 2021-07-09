package diagramaflujo;

import java.util.Scanner;

public class deber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese numero A: ");
		int A = lector.nextInt();
		System.out.println("Ingrese numero B: ");
		 int B=lector.nextInt();
	       
	   	if(B>1) { 
	   		double S=A/B;
		   	System.out.printf("La division es: %f",+S);
			
	}else {
		
		System.out.println("La division es imposible !!!");
		
	} 
	   	
	}

}
