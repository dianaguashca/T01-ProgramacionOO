package deber.modificador.acceso;

public class TiendaDeRegalos {
          public String nombre;
          public String correo;
          public int Ncedula;
          public String articulos;
 
          public void Cliente() {
        	 
        	  TiendaDeRegalos datoscliente=new TiendaDeRegalos();
        	  datoscliente.nombre="Valeria";
        	  datoscliente.correo="Valeria@123";
        	  datoscliente.Ncedula=12345;
        	  datoscliente.articulos="solo osos de peluches ";
        	  
        	   //usando un atributo publico en mi misma clase
        	  System.out.println("BIENVENIDOS");
        	  System.out.println("Su nombre es"+nombre);
        	  System.out.println("Su correo es:"+correo);
        	  System.out.println("Numero de cedula"+Ncedula);
        	  System.out.println("Articulos que va a llevar:"+ articulos);
          }
}
