package deber.de.interfaces;

public class ConsultoriosMetropolitanos implements ConsultorioInterfaz{

	public void obtenerTurno() {
	System.out.println("Turno para las 6 de la tarde ");	
		
	}
	public void realizarChequeo() {
	System.out.println("una revision rapida del paciente");	
		
	}
	public void realizarDiagnostico() {
		System.out.println("sus resultado salieron conn exito");
		
	}
	public void generarRadiografia() {
    System.out.println(" Se le realizara una radiografia de los dientes");
		
	}
	public void entregarMedicacion() {
		System.out.println("Con esta medicacion sanara mu pronto ");
		System.out.println(" Espero que su recuperacion sea exitosa");
	}
}
