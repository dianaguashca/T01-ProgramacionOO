package diagramaflujo;

import java.util.Scanner;

public class deber2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese numero A: ");
		int A1= lector.nextInt();
		System.out.println("Ingrese numero B: ");
		 int B1=lector.nextInt();
		 int mul;	
		 mul= A1%B1;
		 if (mul==0) {
		
		System.out.println( A1+" no es multiplo"+B1 );
		}else {
			 
			System.out.println(A1+" Es múltiplo de "+B1);
		}
		
	  
	}

}
