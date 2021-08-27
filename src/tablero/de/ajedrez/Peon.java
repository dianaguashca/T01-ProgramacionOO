package tablero.de.ajedrez;

public class Peon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiezaDeAjedrez peonNegro1=new PiezaDeAjedrez ();
		peonNegro1.setColor("Negro");
		peonNegro1.setValor(2);
		peonNegro1.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonNegro2=new PiezaDeAjedrez ();
		peonNegro2.setColor("Negro");
		peonNegro2.setValor(2);
		peonNegro2.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonNegro3=new PiezaDeAjedrez ();
		peonNegro3.setColor("Negro");
		peonNegro3.setValor(2);
		peonNegro3.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonNegro4=new PiezaDeAjedrez ();
		peonNegro4.setColor("Negro");
		peonNegro4.setValor(2);
		peonNegro4.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonNegro5=new PiezaDeAjedrez ();
		peonNegro5.setColor("Negro");
		peonNegro5.setValor(2);
		peonNegro5.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonNegro6=new PiezaDeAjedrez ();
		peonNegro6.setColor("Negro");
		peonNegro6.setValor(2);
		peonNegro6.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonNegro7=new PiezaDeAjedrez ();
		peonNegro7.setColor("Negro");
		peonNegro7.setValor(2);
		peonNegro7.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonNegro8=new PiezaDeAjedrez ();
		peonNegro8.setColor("Negro");
		peonNegro8.setValor(2);
		peonNegro8.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonBlanco1=new PiezaDeAjedrez ();
		peonBlanco1.setColor("Blanco");
		peonBlanco1.setValor(2);
		peonBlanco1.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonBlanco2=new PiezaDeAjedrez ();
		peonBlanco2.setColor("Blanco");
		peonBlanco2.setValor(2);
		peonBlanco2.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonBlanco3=new PiezaDeAjedrez ();
		peonBlanco3.setColor("Blanco");
		peonBlanco3.setValor(2);
		peonBlanco3.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonBlanco4=new PiezaDeAjedrez ();
		peonBlanco4.setColor("Blanco");
		peonBlanco4.setValor(2);
		peonBlanco4.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonBlanco5=new PiezaDeAjedrez ();
		peonBlanco5.setColor("Blanco");
		peonBlanco5.setValor(2);
		peonBlanco5.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonBlanco6=new PiezaDeAjedrez ();
		peonBlanco6.setColor("Blanco");
		peonBlanco6.setValor(2);
		peonBlanco6.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonBlanco7=new PiezaDeAjedrez ();
		peonBlanco7.setColor("Blanco");
		peonBlanco7.setValor(2);
		peonBlanco7.setMovimiento("hacia adelante");
		
		PiezaDeAjedrez peonBlanco8=new PiezaDeAjedrez ();
		peonBlanco8.setColor("Blanco");
	    peonBlanco8.setValor(2);
		peonBlanco8.setMovimiento("hacia adelante");
		
		System.out.println("Peon 1:"+peonNegro1);
		System.out.println("Peon 2:"+ peonNegro2);
		System.out.println("Peon 3:"+peonNegro3);
		System.out.println("Peon 4:"+ peonNegro4);
		
		
		PiezaDeAjedrez posicionTablero[][]=new PiezaDeAjedrez[8][8];
		posicionTablero[1][0]=peonNegro1;
		posicionTablero[1][1]=peonNegro2;
		posicionTablero[1][2]=peonNegro3;
		posicionTablero[1][3]=peonNegro4;
		posicionTablero[1][4]=peonNegro5;
		posicionTablero[1][5]=peonNegro6;
		posicionTablero[1][6]=peonNegro7;
		posicionTablero[1][7]=peonNegro8;
		posicionTablero[6][0]=peonBlanco1;
		posicionTablero[6][1]=peonBlanco2;
		posicionTablero[6][2]=peonBlanco3;
		posicionTablero[6][3]=peonBlanco4;
		posicionTablero[6][4]=peonBlanco5;
		posicionTablero[6][5]=peonBlanco6;
		posicionTablero[6][6]=peonBlanco7;
		posicionTablero[6][7]=peonBlanco8;
		
		
		
	}

}
