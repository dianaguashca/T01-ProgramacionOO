package trabajo.en.grupo;

import java.util.Arrays;

public class MainVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int vector[]=new int[10];

   vector[0]=1;
   vector[1]=5;
   vector[2]=3;
   vector[3]=10;
   vector[4]=2;
   vector[5]=23;
   vector[6]=6;
   vector[7]=8;
   vector[8]=9;
   vector[9]=4;
    //syso Cntrl+espacio
   System.out.println("Ordenamiento de JAVA");
    System.out.println("el vector  antes de ordenar "+ Arrays.toString(vector));
  //aki ordeno mi vector
    
    Arrays.sort(vector);
   System.out.println("el vector  despues de ordenar "+ Arrays.toString(vector));
	}

}
