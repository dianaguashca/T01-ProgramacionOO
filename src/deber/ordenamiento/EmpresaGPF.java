package deber.ordenamiento;

public class EmpresaGPF  implements Comparable <EmpresaGPF>{

	private String nombre;
    private String apellido;
    private int edad;
    private int salario;
    
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
    public int getEdad() {
    	return edad;
    }
    public void setEdad(int edad) {
    	this.edad=edad;
    }
    public int getSalario() {
    	return salario;
    }
    public void setSalario(int salario) {
    	this.salario=salario;
    }
	public int compareTo(EmpresaGPF o) {
		if(this.salario>o.getSalario()) {
			return 1;
		}else if(this.salario==o.getSalario()) {
			return 0;
		}else {
		return -1;
		}
		
	} 
	@Override
	public String toString() {
		return "EmpresaGPF [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", salario=" + salario
				+ "]";
	}
}
 