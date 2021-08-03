package ejercicios.vectores;

public class MainVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.-declarar un mivector a[10] de tipo int 
        int miVector[]=new int[ 10];
        int A[]=new int [10];
        //2.-declarar un mivector1 a[5] de tipo char 
        char miVector1[]=new char[5]; 
         //3.-declarar un vector miVec [4] de tipo char y asiganamos la` A`a ala posicion 0 y 2  
       char miVec[]=new char[4];
       miVec[0]= 'A';
       miVec[2]= 'A';
       
     //4.-declarar un vector miVec1 [3] de tipo byte y asiganamos el numero 0 a ala posicion 0,1,2 y 3  
	
	byte miVec1[]=new byte [3];
	//miVec1[3]=0; Esta es una mala asigancion por que esta fuera de rango  la posicion 3
	miVec1[1]=0;
	miVec1[2]=0;
	miVec1[0]=0;
	
	//impresiones 
	//5.- declarar un vector miVec2 [3] de tipo char y asiganamos 
	//la letra (A) a ala posicion 0 y 1 y a la posicion ,2 la letra B  
	// finalmente imprimir las posiciones 0 y 2
	 char miVec2[]=new char[3];
	 miVec2[0]='A';
	 miVec2[1]='A';
	 miVec2[2]='B';
	 System.out.println("impresion 1:"+miVec2[0]);
	 miVec2[0]='Z';
	  System.out.println("impresion 2:"+miVec2[0]);
	  System.out.println("impresion 3:"+miVec2[2]);
	
	  
	  //System.out.println(miVec2);
	  
	  //Ejercicios de  vectores y matrices 
	  
	  
	}
	
	
	

}
