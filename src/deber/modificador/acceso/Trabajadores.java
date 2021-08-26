package deber.modificador.acceso;

public class Trabajadores extends TiendaDeRegalos {
	 public void TrabajadoresTienda() {
    	 
   	  Trabajadores 	datosDelTrabajador=new Trabajadores();
   	datosDelTrabajador.nombre="Sofia";
	datosDelTrabajador.correo="Sofia@123";
	datosDelTrabajador.Ncedula=987638;
	datosDelTrabajador.articulos="Vendi solo osos de peluche ";
   	  
   	   //usando un atributo publico en mi mismo Paquete
   	  System.out.println("BIENVENIDOS");
   	  System.out.println("Su nombre es"+nombre);
   	  System.out.println("Su correo es:"+correo);
   	  System.out.println("Numero de cedula"+Ncedula);
   	  System.out.println("Articulos que vendio:"+ articulos);
     }
}
