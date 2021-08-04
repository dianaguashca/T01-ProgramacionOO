package deber.vectores;

public class MainDeberVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Deber de vectores
		//1.-Declarar un vector x (8)
		int X[]=new int [8];
		
		
	   //2.- Declarar un vector Y(3) y asignar  ala posicion 2 el valor de A
		char Y[]=new char [3];
		Y[2]= 'A'; 
		
		//3.-Declarar  un vector A(5) asignar a la posicion 0 el valor de 25 
		// a la posicion 3 el valor de 49, y ala posicion  2 el valor de la posicion 0
		
		int A[]=new int[5];
		A[0]=25;
		A[3]=49;
		A[2]=25;
		
		//4.-Declara un vector B(10) a al posicion B(0) asignele el valor del vector A(3) del ejercicio anterior 
		
		int B[]=new int [10];
		B[0]= 49;
		
		//5.-Declarar Z(12) y asiganr a todas sus posiciones valores que inician desde 1  y son secuenciales 
		
		int Z[]=new int [12];
		Z[0]=1;
		Z[1]=2;
		Z[2]=3;
		Z[3]=4;
		Z[4]=5;
		Z[5]=6;
		Z[6]=7;
		Z[7]=8;
		Z[8]=9;
		Z[9]=10;
		Z[10]=11;
		Z[11]=12;
		
		//6.-Declarar Z2(10) y asiganr a todas sus posiciones valores impares  que inician desde 1  y son secuenciales 
		
		int Z2[]=new int [10];
		Z2[0]=1;
		Z2[1]=3;
		Z2[2]=5;
		Z2[3]=7;
		Z2[4]=9;
		Z2[5]=11;
		Z2[6]=13;
		Z2[7]=15;
		Z2[8]=17;
		Z2[9]=19;
		
		//7.-Declara un vector H(10) y asignar solo a las posiciones imapares
		//letras que inicien desde la A secuencialmente 
		
		char H[]=new char [10]; 
		H[1]= 'A';
		H[3]= 'B';
		H[5]= 'C';
		H[7]= 'D';
		H[9]= 'E';
		
		//8.-Declarar un vector F(10) y en base a la ejercicio anterior signar los valores de la siguiente manera :
		//F(0)=H(3);
		//F(3)=H(2);
		//F(4)=H(6);
		//F(7)=H(0);
		//F(8)=H(1);
		//F(9)=H(9);
		char F[]=new char [10]; 
		F[0]= 'B';
		F[7]= 'D';
		F[8]= 'A';
		F[9]= 'E';

		//F(3)=H(2);  ESTOS DOS QUEDAN VACIOS 
		//F(4)=H(6);
		
		//9.-Declarar un vector L(15) y asiganar valores en vase a los siguinete ;
//		L(0)=promedio de 3,5,7,9)
//		L(4)=la suma de ,5,7,8 y 15)
//		L(7)=(la miltiplicacion de 6,7y 3)
//		L(10)= (la division de 10/2)
		
		int L[]=new int [15];
		L[0]=6;
		L[4]= 35;
		L[7]= 126;
        L[10]= 5;
        
        //10.-Declara vector N(12) y realizar las siguientes asiganaciones 
//              N(0)=(promedio de 3,10y9)
//        		N(4)=(la suma de 7,8y10)
//        		N(12)=(la multiplicacion   de 5,7y3)
//        		N(20)=(la suma de 7,-3y8)
//        		en la ultima posicion el valor de 20/4
        int N[]=new int [12];
		N[0]=(int) 7.33;
		N[4]= 25;
		N[12]= 126; //Esta linea va a dar error 
        N[20]= 5;   //Esta linea va a dar error
        
	}

}
