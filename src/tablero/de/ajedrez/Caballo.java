package tablero.de.ajedrez;

public class Caballo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiezaDeAjedrez caballoNegro1 =new PiezaDeAjedrez();
		caballoNegro1 .setColor("negro");
		caballoNegro1.setValor(8);
		caballoNegro1.setMovimiento("se mueve el L");

		PiezaDeAjedrez caballoNegro2 =new PiezaDeAjedrez();
		caballoNegro2.setColor("negro");
		caballoNegro2.setValor(8);
		caballoNegro2.setMovimiento("se mueve el L");
		
		PiezaDeAjedrez caballoBlanco1 =new PiezaDeAjedrez();
		caballoBlanco1 .setColor("negro");
		caballoBlanco1.setValor(8);
		caballoBlanco1.setMovimiento("se mueve el L");

		PiezaDeAjedrez caballoBlanco2 =new PiezaDeAjedrez();
		caballoBlanco2.setColor("blanco");
		caballoBlanco2.setValor(8);
		caballoBlanco2.setMovimiento("se mueve el L");
		
		System.out.println("El primer caballo :"+caballoNegro1);
		System.out.println("el segundo caballo :"+ caballoNegro2);
		
		System.out.println("El primer caballo :"+caballoBlanco1);
		System.out.println("el segundo caballo :"+ caballoBlanco2);
		
		PiezaDeAjedrez posicionTablero[][]=new PiezaDeAjedrez[8][8];
		posicionTablero[0][1]=caballoNegro1 ;
		posicionTablero[0][6]= caballoNegro2;
		posicionTablero[7][1]=caballoBlanco1 ;
		posicionTablero[7][6]= caballoBlanco2;
	}

}
