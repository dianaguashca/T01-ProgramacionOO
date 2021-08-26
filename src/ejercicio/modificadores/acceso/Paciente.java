package ejercicio.modificadores.acceso;

public class Paciente {
     public String nombre;
     public String apellido;
     protected String diagnostico;
     private int cedula;
     private String medicacion;
     
     public void obtenerTurno() {
    	 //usando un atributo publico en mi misma clase
    	 System.out.println("el nombre es:"+nombre);
    	 
     }
     private void obtenerClaveCajero() {
    	 
     }
     protected void realizarDiagnostico() {
    	 
     }
}
