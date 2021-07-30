package ejecicioswhile;

import java.util.Scanner;

public class prueba1while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
			int S = 0;
			float P = 0;
			int C = 0;
			int i = 0;
				System.out.println("Ingrese un numero positivo: ");
				int N = lector.nextInt();
				 while(N!= 0 ) {
					 System.out.println("Ingrese un numero positivo: ");
					 N = lector.nextInt();
		      S = S+N;
			P = S/i;
			C = C + 1;
	           
	}
			System.out.println("La suma es: " + S);
			System.out.println("El promedio es: " + P);
			System.out.println("La cantidad es: " + C);
			
	}
	
	}
