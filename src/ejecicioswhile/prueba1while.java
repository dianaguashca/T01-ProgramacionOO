package ejecicioswhile;

import java.util.Scanner;

public class prueba1while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		    int N=0;
			int Suma = 0;
			float E = 0;
			int P= 0;
			
				System.out.println("Ingrese un numero positivo diferente de 0: ");
				 N = lector.nextInt();
				 Suma=Suma+N;
				 while(N!= 0 ) {
					 System.out.println("Ingrese un numero positivo: ");
					 N = lector.nextInt();

				 
				 Suma = Suma+N;
					E++;
					P = (int) (Suma/E);
	           
				 }
			System.out.println("La suma es: " + Suma);
			System.out.println("El promedio es: " + P);
			System.out.println("La cantidad es: " + E);
			
	}
	
	}
