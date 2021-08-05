package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //1.- Declare un matriz A [3,4] de tipo char y desarrolle un programa que vaya solicitando 
		//cada una de sus posiciones 
		
		System.out.println("Ingrese el valor fila:");
		Scanner lector=new Scanner(System.in);
		int Longuitudfila=lector.nextInt();
		
		System.out.println("Ingrese el valor de la columna :");
		int Longuitudcolumna=lector.nextInt();
		
		
		char A[][]=new char[Longuitudfila][Longuitudcolumna];
		for(int fila=0; fila<Longuitudfila; fila++) {
			for(int columna=0; columna<Longuitudcolumna;columna++) {
				
				System.out.println("Ingrese el valor fila:"+fila+"columna:"+columna);	
			//el usuario digita el valor de teclado
	           char N = lector.next().charAt(0);
				 A[fila][columna]=N;
				 
			}
		}
		System.out.println(" Iniciamos a imprimir la Matriz :");
		
		for(int fila=0; fila<Longuitudfila; fila++) {
			for(int columna=0; columna<Longuitudcolumna;columna++) {
				System.out.println( A[fila][columna]+"");
	}
			System.out.println();
	}}}
