package deber.de.interfaces;

public interface BibliotecaInterfaz {
	
	public void consutarLibros(String tipoLibro);
	
	public void recibirLibros();
	
	public void ofrecerLibros(String nomLibro);
	
	public void prestamoLibros(int codigo);
	
	public void reservarLibros();
}
