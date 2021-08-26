import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int opcion;
		do{
		System.out.println("Menu de hospital");
		System.out.println("1. ECO");
		System.out.println("2.Radiografis");
		System.out.println("3.Cetificado");
		System.out.println("4.Salir");
		System.out.println("Elija opcion");
		Scanner lector=new Scanner(System.in);
		opcion=lector.nextInt();
	}while(opcion !=4);
		System.out.println("FIN");
		
	}

}
