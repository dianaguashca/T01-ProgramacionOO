package deber.de.interfaces;

public class BibliotecaUniversidad implements BibliotecaInterfaz {

	public void consutarLibros(String tipoLibro) {
		tipoLibro="Matematico";
	System.out.println("Estudiante realizara una consulta de un libro de tipo"+tipoLibro);
		
	}
	public void recibirLibros() {
	System.out.println("Estudiente entrega su libro en buen estado");
	
	}
	public void ofrecerLibros(String nomLibro) {
		nomLibro="Casa del Libro";
   System.out.println("Se ofrece excelentes libros de refuerzos "
   		               + "para estudinates Universitarios"+nomLibro);
		
	}
	public void prestamoLibros(int codigo) {
		codigo=5678378;
		System.out.println("Estudiante realizo un presta de un Libro con el codigo:"+codigo);
		
	}
	public void reservarLibros() {
		System.out.println("Los libros reservados son los Cientificos y Matematicos");
		System.out.println("Gracias Por Utilizar La Biblicoteca Univeristaria");
		
	}
}
