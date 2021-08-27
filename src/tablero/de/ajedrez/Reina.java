package tablero.de.ajedrez;

public class Reina  extends PiezaDeAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PiezaDeAjedrez dama1 =new PiezaDeAjedrez();
		dama1.setColor("negro");
		dama1.setValor(27);
		dama1.setMovimiento("en vertical");

		PiezaDeAjedrez dama2 =new PiezaDeAjedrez();
		dama2.setColor("blanco");
		dama2.setValor(27);
		dama2.setMovimiento("en vertical");
		
		System.out.println("La primera reina :"+dama1);
		System.out.println("La segunda reina :"+ dama2);
		
		PiezaDeAjedrez posicionTablero[][]=new PiezaDeAjedrez[8][8];
		posicionTablero[0][4]=dama1;
		posicionTablero[7][4]= dama2;
		
	}

}
