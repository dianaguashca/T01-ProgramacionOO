package deber.de.interfaces;

public class MatriculaEspe implements MatriculaInterfaz{

	public void pedirCedula() {
		System.out.println(" Su numero de cedula para realizar la matricula");
	}
	public void pedirLoguin() {
		System.out.println(" Su loguin para la matricula");
			
	}
	public void validarCupo() {
		System.out.println("Cupo validado para su carrera");
		
	}
	public void validarPaseMaterias() {
		System.out.println("Todas las materias han sido aprobadas");
		
	}
	public void validarDocente() {
		System.out.println("Sus docentes son se sabra al inicio de clases ");
		
	}
}
