package tablero.de.ajedrez;

public class Torre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiezaDeAjedrez torreNegra1 =new PiezaDeAjedrez();
		torreNegra1 .setColor("negro");
		torreNegra1 .setValor(14);
		torreNegra1.setMovimiento("horizontal o vetical");

		PiezaDeAjedrez torreNegra2 =new PiezaDeAjedrez();
		torreNegra2.setColor("negro");
		torreNegra2.setValor(14);
		torreNegra2.setMovimiento("horizontal o vetical");
		
		PiezaDeAjedrez torreBlanca1 =new PiezaDeAjedrez();
		torreBlanca1 .setColor("blanco");
		torreBlanca1 .setValor(14);
		torreBlanca1.setMovimiento("horizontal o vetical");

		PiezaDeAjedrez torreBlanca2 =new PiezaDeAjedrez();
		torreBlanca2.setColor("blanco");
		torreBlanca2.setValor(14);
		torreBlanca2.setMovimiento("horizontal o vetical");
		
		System.out.println("primera torre :"+torreNegra1 );
		System.out.println("segunda torre :"+ torreNegra2);
		
		System.out.println("primera torre :"+torreBlanca1 );
		System.out.println("segunda torre :"+ torreBlanca2);
		
		PiezaDeAjedrez posicionTablero[][]=new PiezaDeAjedrez[8][8];
		posicionTablero[0][0]=torreNegra1 ;
		posicionTablero[0][7]= torreNegra2;
		posicionTablero[7][0]=torreBlanca1 ;
		posicionTablero[7][7]= torreBlanca2;
	}

}
