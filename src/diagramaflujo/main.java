package diagramaflujo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("ingrese dos numero ");
       Scanner lector=new Scanner(System.in);// Teclado
       int A = lector.nextInt();
      // System.out.println("Numero ingresado: "+A);
       int B=lector.nextInt();
       //System.out.println("Numero ingresado 2: "+B);
       
       int S=A+B;
       int R=A-B;
       int P=A*B;
       System.out.println("la suma es : "+S);
       System.out.println("la resta es : "+R);
       System.out.println("el producto  es : "+P);
	}

}
