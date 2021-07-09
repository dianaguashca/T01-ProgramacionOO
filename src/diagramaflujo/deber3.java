package diagramaflujo;

import java.util.Scanner;

public class deber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el valor del sueldo ");
		 Scanner lector=new Scanner(System.in);
		 int S = lector.nextInt();
	    int B=100;
	    int B2=75;
	    int B3=50;
	    int t1=S+B;
	    int t2=S+B2;
	    int t3=S+B3;
			if(S<300) { 
		   		
			   	System.out.println("su bonificacion es de 100 $ ");
			   	System.out.println("El sueldo total es: "+t1);
				
				
		}else if(S>300 && S<400) {
			
			
			System.out.println(" Su bonificacion es de 75$");
		   	System.out.println("El sueldo total es: "+t2);
			
		
	}else if(S>400) {
		
		System.out.println(" Su bonificacion es de 50$");
	   	System.out.println("El sueldo total es: "+t3);
		
	} 
			
		 
	}

}
