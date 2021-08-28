package tablero.de.ajedrez;

import java.awt.GridLayout;

public  abstract class PiezaDeAjedrez  {
	
	public String color;
	public int valor;
	public String movimiento;
	
	
	public String getColor() {
		return color;
	}
	public void setColor( String color) {
			this.color=color;   	
    }
	public int getValor() {
		return valor;
	}
	public void setValor( int valor) {
			this.valor=valor;
			
	}
	public String getMovimiento() {
		return color;
	}
	public void setMovimiento( String movimiento) {
			this.movimiento=movimiento;	
	
	}
	@Override
	public String toString() {
		return "PiezaDeAjedrez [color=" + color 
				+ ", valor=" + valor + ", movimiento="
				+ movimiento + "]";
	}
		
	} 
