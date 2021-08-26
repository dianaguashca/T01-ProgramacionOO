
public class Paciente {
public String nombre;//set y get
public  String apellido;//set y get
public  int edad;//set y get
 
 private void caminar() {
	 
 }
 private void correr() {
	 
 }
 //Metodos SET y GET
 //siempre son publicos 
 
 //nombre
  public void setNombre(String nombre) {
	  //el nombre igual al parametro 
	  this.nombre=nombre;
  }
  //el tipo de retorno del get es que es mi atributo
  public String  getNombre() {
	  return this.nombre;
  }
	//apellido  
  public void setApellido(String apellido) {
	  this.apellido=apellido;
  }
  public String getApellido() {
	  return this.apellido;
  }
  //edad
  public void setEdad(int edad1) {
	  this.edad=edad1;
  }
  public int getEdad() {
	  return this.edad;
  }
}
