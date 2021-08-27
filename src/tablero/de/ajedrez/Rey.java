package tablero.de.ajedrez;

import java.util.Arrays;

public class Rey extends  PiezaDeAjedrez {
	
	public static void main(String[] args) {
		PiezaDeAjedrez rey1=new PiezaDeAjedrez ();
		rey1.setColor("negro");
		rey1.setValor(100);
		rey1.setMovimiento("un paso");
		
		PiezaDeAjedrez rey2=new PiezaDeAjedrez ();
		rey2.setColor("blanco");
		rey2.setValor(100);
		rey2.setMovimiento("un paso");
		
		System.out.println("El primer rey:"+rey1);
		
		System.out.println("El Segundo rey"+rey2);
		
		PiezaDeAjedrez posicionTablero[][]=new PiezaDeAjedrez[8][8];
		posicionTablero[0][3]=rey1;
		posicionTablero[7][3]=rey2;
		
		System.out.println(Arrays.toString(posicionTablero));
		
		
	}
}
