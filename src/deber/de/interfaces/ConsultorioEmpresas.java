package deber.de.interfaces;

public class ConsultorioEmpresas implements ConsultorioInterfaz {

	public void obtenerTurno() {
		System.out.println("Desea obtener un turno en el consultorio");
		
	}
	public void realizarChequeo() {
		System.out.println("Se realizara el chequeo correspondiente ");
		
	}
	public void realizarDiagnostico() {
		System.out.println(" Su diagnostico salio correctamente");
		
	}
	public void generarRadiografia() {
       System.out.println("Se realizara una radiografia en la pierna  ");
       
       
	}
	public void entregarMedicacion() {
		System.out.println(" Con la medicacion sanara pronto");
		
		System.out.println("Espero que se recupere pronto ");
	}

}
