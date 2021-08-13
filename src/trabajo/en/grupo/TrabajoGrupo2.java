package trabajo.en.grupo;

import java.util.Scanner;

public class TrabajoGrupo2 {
	public class ShellSort {
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 Scanner lector=new Scanner(System.in);
			System.out.println("Ingrese valor de la posicion:");
			int N=lector.nextInt();
			int B[]=new int [N];
			
			
			for(int i1=0;i1<N;i1++) {
				
				System.out.println("Ingrese valor de la posicion:"+i1);
				 int N2=lector.nextInt();
				 B[i1]= N2;
				}
			System.out.println("SALIDA DE DATOS ");
			//Llamar un metodo 
			shellSort (B);
			
				for(int i1=0;i1<N;i1++) {
					System.out.println("El  valor de la posicion:"+i1);
					System.out.println(B[i1]);
			}
	}
		  
		 public static void shellSort (int[] matrix) {
			 for (int incremento=matrix.length / 2; incremento > 0; incremento =
					 (incremento ==2)? 1:(int) Math.round(incremento / 2.2)) {
				for(int j=1; j>=incremento && matrix [j - incremento]
						 >matrix[j]; j-=incremento) {
					 int temp=matrix[j];
					 matrix[j]=matrix[j - incremento];
					 matrix[j - incremento]=temp;
					 
				 }
				 
			 }
		 }
		            }