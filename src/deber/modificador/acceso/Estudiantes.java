package deber.modificador.acceso;

public class Estudiantes extends Escuela {

	protected void PrimerEstudiante() {
   	 
		Estudiantes  DatosEstudiante=new Estudiantes();
		DatosEstudiante=new Estudiantes();
		DatosEstudiante.Nombre="Sofia";
		DatosEstudiante.Apellido="Cruz";
		DatosEstudiante.cedula=987638;
		DatosEstudiante.edad=" 7 años ";
	   	   //usando un atributo protected en mi mismo Paquete
	   	  System.out.println("BIENVENIDOS");
	   	  System.out.println("Su nombre es"+Nombre);
	   	  System.out.println("Su apellido es:"+Apellido);
	   	  System.out.println("Numero de cedula"+cedula);
	   	  System.out.println("Tiene:"+ edad);
	     }
	}

	
