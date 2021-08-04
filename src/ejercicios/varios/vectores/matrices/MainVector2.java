package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //declare un vector X cuya loguitud de tipo int  y construya un programa que pida al usuario que
		//ingrese los valores para cada posicion
	//y finalmente que se imprima todos los valores ingresados 
		
		 Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese valor de la posicion:");
		int N=lector.nextInt();
		int B[]=new int [N];
		
		for(int i=0;i<N;i++) {
			
			System.out.println("Ingrese valor de la posicion:"+i);
			N=lector.nextInt();
			 B[i]= N;
			}
			
			//rrecoriendo el vector lleno 
			for(int i=0;i<N;i++) {
				System.out.println("El  valor de la posicion:"+i);
				System.out.println(B[i]);
		}
			
	}

}
