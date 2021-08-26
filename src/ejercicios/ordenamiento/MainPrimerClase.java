package ejercicios.ordenamiento;

import java.util.Arrays;

public class MainPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante danilo=new Estudiante("Danilo","Alvarracin");
	
		
		danilo.setNumeroLista(1);
		danilo.setEdad(20);
		//se cambia de nombre a danilo y se cambia a pepito 
		//ya que con el set podenos cambiar el nombre
		//danilo.setNombre("Pepito");
		
		
		
		Estudiante andres=new Estudiante();
		andres.setNombre("Andres");
		andres.setApellido("Arcos");
		andres.setNumeroLista(2);
		andres.setEdad(21);
		
		Estudiante alex=new Estudiante();
		alex.setNombre("Alex");
		alex.setApellido("pacheco");
		alex.setNumeroLista(22);
		alex.setEdad(23);
		
		Estudiante stefany=new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setApellido("cruz");
		stefany.setNumeroLista(10);
		stefany.setEdad(32);
		
		Estudiante jonny=new Estudiante();
		jonny.setNombre("jhony");
		jonny.setApellido("ninabanda");
		jonny.setNumeroLista(21);
		jonny.setEdad(22);
		
		//ALex dame tu numero de lista
		System.out.println("Ing soy el"+alex.getEdad());
		System.out.println("inge soy el:"+jonny.getEdad());
		
		
	
		
		Estudiante listaEstudiantes[]=new Estudiante[5];
		listaEstudiantes[0]=danilo;
		listaEstudiantes[1]=andres;
		listaEstudiantes[2]=alex;
		listaEstudiantes[3]=stefany;
		listaEstudiantes[4]=jonny;
		
		//vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
	    //aqui ordeno lista
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
		
	}

}
