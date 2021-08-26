package deber.modificador.acceso;

public class Escuela {
    protected String Nombre;
    protected String Apellido;
    protected int cedula;
    protected String edad;
	 
	protected void HoraIngreso() {
		Escuela persona1=new Escuela();
		persona1.Nombre="Yaneth";
		persona1.Apellido="Sanchez";
		persona1.cedula=12345;
		persona1.edad="10 años";
		// estoy usando un atributo protected en mi misma clase
		System.out.println("Su nombre es:"+Nombre);
		System.out.println("Su apellido es:"+Apellido);
		System.out.println("Su cedula es:"+cedula);
		System.out.println("Su edad es:"+edad);
		
	}
    
    protected void horaSalida() {
    	
    }
}
