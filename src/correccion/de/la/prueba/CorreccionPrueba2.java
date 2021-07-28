package correccion.de.la.prueba;

import java.util.Scanner;

public class CorreccionPrueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SP = 0;
		int SI = 0;
		int CI = 0;
		float PI = 0;
		
		for (int i = 1 ; i != -1 ; i++) {
			
			System.out.println("INGRESE UN NUMERO POSITIVO: ");
			System.out.println("**************************** ");
			Scanner lector = new Scanner(System.in);
			int N = lector.nextInt();
			
			
			if (N == -1){
				 
				i = -2;
				
			}else if (N%2==0){
				
				SP = SP + N;
					
			}else if (N%2!=0){
				SI = SI+N;
				CI = CI+1;
				PI = SI/CI;
				
			}
		}
		
		System.out.println("La suma pares es: " + SP);
		System.out.println("El promedio  impares es: " + PI);
		
	}

}
