package ejerciciodowhile;

import java.util.Scanner;

public class Prueba2DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int N=0;
		int SP = 0;
		int SI = 0;
		int CI = 0;
		float PI = 0;
		
        do {
			System.out.println("INGRESE UN NUMERO POSITIVO: ");
			System.out.println("**************************** ");
			N = lector.nextInt();
			
			
			if (N%2==0){
				 
				SP = SP + N;
				
			}else{
				

				SI = SI+N;
				CI = CI+1;
				PI = SI/CI;
				
			}
		}
		while(N!=-1);
        
		System.out.println("La suma de pares es: " + SP);
		System.out.println("El promedio de impares es: " + PI);
	}
}

