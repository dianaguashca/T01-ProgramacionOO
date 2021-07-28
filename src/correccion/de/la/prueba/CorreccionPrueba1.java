package correccion.de.la.prueba;

import java.util.Scanner;


public class CorreccionPrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S = 0;
		float P = 0;
		int C = 0;
		int i = 0;
		for (i = 1 ; i != 0 ; i++) {
			System.out.println("Ingrese un numero positivo: ");
			System.out.println("****************************");
			Scanner lector = new Scanner(System.in);
			int N = lector.nextInt();
			if (N == 0){
				i = -1;
				
			}else if (N > 0){
				S = S+N;
				P = S/i;
				C = C + 1;
				
			}
		}
		System.out.println("La suma es: " + S);
		System.out.println("El promedio es: " + P);
		System.out.println("La cantidad es: " + C);
	}

}
