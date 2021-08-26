package deber.de.interfaces;

public class BibliotecaMunicipal  implements BibliotecaInterfaz{

	public void consutarLibros(String tipoLibro) {
		tipoLibro="Cientifico";
		System.out.println("Que tipo de libro desea consultar" + tipoLibro);
	}
	public void recibirLibros() {
		
		System.out.println("Los libros recibidos se encuentran en buen estado");		
	}
	public void ofrecerLibros(String nomLibro) {
		
	    nomLibro="Los cuentos de Canterbury";
		
		System.out.println("Libros que ofrece la Blibiotaca Municipal"+nomLibro);
		
	}
	public void prestamoLibros(int codigo) {
		
		codigo=1243;
		System.out.println("El libro sera prestado con su siguiente codigo" + codigo);
		
	}
	public void reservarLibros() {
	     System.out.println("Los libros  reservados en la Blibioteca son:");
	     
	     System.out.println("Gracias Por visitar nuestra Biblioteca Municipal");
	}
}