package deber.modificador.acceso;

public class Jugueteria {
	
	 String NomJuguete;
	 int  precio;
	 String marca;
	 int codigo;
	   
	  void ventajuguetes() {
		   //estoy utilizando el default en mi misma clase 
		  Jugueteria primeJuguete=new Jugueteria();
		  primeJuguete.NomJuguete="carro control remoto";
		  primeJuguete.precio=20 ;
		  primeJuguete.marca="chino";
		  primeJuguete.codigo=1234;
		    
		  System.out.println("Primer juguete:"+NomJuguete);
		  System.out.println("Su precio es:"+precio); 
		  System.out.println("La marca del juguete es:"+marca);
		  System.out.println("El codigo:"+codigo);
	 }
	 void agotados() {
		 
	 }
}
