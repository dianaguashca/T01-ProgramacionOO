package ejercicios.interfaces;

public class JardineroVecino extends Persona implements JardineroInterfaz{

	public void regar() {
		// TODO Auto-generated method stub
		System.out.println("abre la llaves");
		System.out.println("toma la maguera");
		System.out.println("riega el Cesped");
	}
	public void cortar() {
		// TODO Auto-generated method stub
		System.out.println("prender la maquina");
		System.out.println("poner en el cesped");
		System.out.println("cortar la primera linea");
	}
	public void abonar() {
		// TODO Auto-generated method stub
		System.out.println("bajar del carro el abono");
		System.out.println("mesclar el abono");
		System.out.println("regar el  abono por partes");
	}
	public void fertilizar() {
		// TODO Auto-generated method stub
		
	}
	public void limpiar() {
		
	}
}
