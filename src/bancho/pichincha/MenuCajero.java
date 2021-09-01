package bancho.pichincha;

import java.util.Scanner;

public class MenuCajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector= new Scanner(System.in);

		int opcion=0;
		do {
			System.out.println("Banco Pichincha Bienvenidos ");
			System.out.println("1.-Retirar dinero:");
			System.out.println("2.-Cambiar de clave: ");
			System.out.println("3.-Bloquear cuenta:");
			System.out.println("4.-Salir ");
			
			System.out.println("Seleccionar opcion");
			
			opcion=lector.nextInt();
			
			if (opcion==1) {
				System.out.println("Ingrese valor a retirar ");
				opcion=lector.nextInt();
				
				int valor= lector.nextInt();
				System.out.println("El valor a retirar es: "+valor);
				System.out.println();

			}else if (opcion==2) {
				System.out.println("ingrese su nueva clave:");
				
				String clave=lector.next();
				System.out.println("clave cambiada");
				System.out.println();
					
			}else if (opcion==3) {
				System.out.println("Su cuenta ha sido bloqueada");
				System.out.println();
				System.out.println();
				
			}else if(opcion>4) {
				System.out.println("opcion incorrecta intente nuevamente:");
				System.out.println();	
			}
		}while(opcion!=4) ;
			System.out.println("Gracias por preferirnos");
	}
}
