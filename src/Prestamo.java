package deber.pareja.metodos;
//esta es la instancia y ejecucion de la clase Auto
	//echo por Nathan Velez
public class Prestamo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca Primerprestamo=new Biblioteca();
		Primerprestamo.prestamo1("Primer libro", 20);
		Primerprestamo.libros="Literatura y lingüísticos.";
		Primerprestamo.autores="Agatha Christie (736)";
		Primerprestamo.lectores=" Sofia Cardenas";
		Primerprestamo.Ncedula=345678;
		Primerprestamo.codigoLibro=1234; 
	    System.out.println("Nombre del libro:"+ Primerprestamo.libros  );
	    System.out.println("El autor del libro:  "+Primerprestamo.autores  );
	    System.out.println("Nombre del que realiza el Prestamo:  "+Primerprestamo.lectores  );
	    System.out.println("Codigo del libro:  "+ Primerprestamo.codigoLibro );
	    System.out.println(); 
	     
		Biblioteca Segundoprestamo=new Biblioteca();
		Segundoprestamo.prestamo2("Segundo libro", 0);
		Segundoprestamo.libros="Científicos"; 
		Segundoprestamo.autores="Benito Pérez Galdós (402)";
		Segundoprestamo.lectores=" Sofia Cardenas";
		Segundoprestamo.Ncedula=345678;
		Segundoprestamo.codigoLibro=2345;
		System.out.println("Nombre del libro:"+ Segundoprestamo.libros  );
		System.out.println("El autor del libro:  "+Segundoprestamo.autores  );
		System.out.println("Nombre del que realiza el Prestamo:  "+Segundoprestamo.lectores  );
		System.out.println("Codigo del libro:  "+ Segundoprestamo.codigoLibro );	
	}

}
