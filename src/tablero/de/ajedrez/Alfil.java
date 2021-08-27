package tablero.de.ajedrez;

public class Alfil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiezaDeAjedrez alfilNegro1 =new PiezaDeAjedrez();
		alfilNegro1.setColor("negro");
		alfilNegro1.setValor(13);
		alfilNegro1.setMovimiento("a cualquier casilla");

		PiezaDeAjedrez alfilNegro2 =new PiezaDeAjedrez();
		alfilNegro2.setColor("blanco");
		alfilNegro2.setValor(13);
		alfilNegro2.setMovimiento("a cualquier casilla");
		
		PiezaDeAjedrez alfilBlanco1 =new PiezaDeAjedrez();
		alfilBlanco1.setColor("negro");
		alfilBlanco1.setValor(13);
		alfilBlanco1.setMovimiento("a cualquier casilla");

		PiezaDeAjedrez alfilBlanco2 =new PiezaDeAjedrez();
		alfilBlanco2.setColor("blanco");
		alfilBlanco2.setValor(13);
		alfilBlanco2.setMovimiento("a cualquier casilla");
		
		System.out.println("El primer alfil :"+alfilNegro1);
		System.out.println("El segundo alfil :"+ alfilNegro2);
		
		System.out.println("El primer alfil :"+alfilBlanco1);
		System.out.println("El segundo alfil :"+ alfilBlanco2);
		
		
		
		PiezaDeAjedrez posicionTablero[][]=new PiezaDeAjedrez[8][8];
		posicionTablero[0][2]=alfilNegro1;
		posicionTablero[0][5]= alfilNegro2;
		posicionTablero[7][2]=alfilBlanco1;
		posicionTablero[7][5]= alfilBlanco2;
		
	}

}
