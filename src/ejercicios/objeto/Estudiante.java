package ejercicios.objeto;

public class Estudiante extends Persona  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Estudiante Estdiante1=new Estudiante ();
 Estdiante1.apellido="Teran";
 Estdiante1.nombre="Karolina";
 Estdiante1.edad=22;
 Estdiante1.cedula="1234567";
 Estdiante1.genero= 'F';
 Estdiante1.comer();
 Estdiante1.estudiar();
 Estdiante1.matricularse();
 
 
 System.out.println("Segunda Instancia ");
 
 Estudiante Estdiante2=new Estudiante ();
 Estdiante2.apellido="Pazmiño";
 Estdiante2.nombre="mario";
 Estdiante2.edad=22;
 Estdiante2.cedula="1234567";
 Estdiante2.genero= 'M';
 Estdiante2.comer();
 Estdiante2.estudiar();
 Estdiante2.matricularse();
 
	}

}
