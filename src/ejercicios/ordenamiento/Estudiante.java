package ejercicios.ordenamiento;

public class Estudiante implements Comparable<Estudiante> {
	private String nombre;
    private String apellido;
    private int numeroLista;
    private int edad;
    
    //constructores
    public Estudiante() {
    	
    }
 public Estudiante(String nombre) {
    	this.nombre=nombre;
    }
 public Estudiante(String nombre, String apellido) {
 	this.nombre=nombre;
 	this.apellido=apellido;
 }
 public Estudiante(String nombre, String apellido,int edad, int numeroLista) {
	 	this.nombre=nombre;
	 	this.apellido=apellido;
	 }
 //hasta aki
 
    public String getNombre() {
  	  return nombre;  
    }
    public void setNombre(String nombre) {
  	  this.nombre=nombre;  
    }
    public String getApellido() {
    	  return apellido;  
      }
      public void setApellido(String apellido) {
    	  this.apellido=apellido;  
      }
    public int getNumeroLista() {
  	  return numeroLista;
    }
    public void setNumeroLista(int numeroLista) {
  	  this.numeroLista=numeroLista;
    }
    public int getEdad() {
    	  return edad;  
      }
      public void setEdad(int edad) {
    	  this.edad=edad;  
      }
    
	public int compareTo(Estudiante o) {
		//tiene 3 posibles retornos 0
		// -1
		// 1
		if(this.numeroLista>o.getEdad()) {
			return 1;
		}else if(this.numeroLista==o.getEdad()) {
			return 0;
		}else {
		return -1;
		}
		
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numeroLista=" + numeroLista + ", edad="
				+ edad + "]";
	}
	
	}

