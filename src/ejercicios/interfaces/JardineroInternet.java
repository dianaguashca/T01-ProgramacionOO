package ejercicios.interfaces;

public class JardineroInternet extends Persona  implements JardineroInterfaz{


	public void regar() {
		System.out.println("abre la llaves");
		System.out.println("toma la maguera");
		System.out.println("cloro al agua ");
		System.out.println("moja el cesped");
		
	}

	public void cortar() {
		System.out.println("prender la maquina");
		System.out.println("poner en el cesped");
		System.out.println("cortar por la mitad");
		
	}

	
	public void abonar() {
		System.out.println("bajar del carro el abono");
		System.out.println("regar por partes");
		
	}
	public void fertilizar() {
		// TODO Auto-generated method stub
		
	}

}
