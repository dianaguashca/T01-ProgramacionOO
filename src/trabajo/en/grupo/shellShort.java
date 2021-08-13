package trabajo.en.grupo;

import java.util.Arrays;
import java.util.Scanner;

public class shellShort {

	public static void main(String[] args) {
		// TODO Auto-generated method studio
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el valor de la posicion: ");
		int N = lector.nextInt();
		int A[] = new int [N];
		System.out.println("Ingrese los valores: ");
		for (int i = 0; i<N ;i++) {
			A[i] = lector.nextInt();
		
		}
		shell(A);
		System.out.println("......SALIDA DEL VECTOR ......");
		for (int i=0; i<N; i++) {
			System.out.println("El valor de la posicion: " + i);
			System.out.println(A[i]);}
		}
		private static void shell(int[] a) {
		int salto = 0;
	   int temp = 0;
	   int i=0;
		boolean cambio;
		for (salto = a.length/2; salto!= 0; salto /=2) {
			cambio= true;
			while (cambio) {
				cambio=false; 
				for(i=salto; i<a.length;i++) {
					if (a[i-salto]>a[i]) {
						temp = a[i];
					    a [i]=a[i-salto];
					    a [i-salto]=temp;
					    		cambio=true;
					    		
					    		 System.out.println("Ordenamiento de JAVA");
					    		 Arrays.sort(a);
					    		    System.out.println("el vector  antes de ordenar "+ Arrays.toString(a));
					    		  //aki ordeno mi vector
					    		    
					    		   
					    		   System.out.println("el vector  despues de ordenar "+ Arrays.toString(a));		
					}
					
				}
				
			}
		}
	}
	
	}