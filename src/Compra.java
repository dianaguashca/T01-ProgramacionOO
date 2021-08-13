package deber.pareja.metodos;

//esta es la instancia y ejecucion de la clase Auto
//echo por Diana Guashca
public class Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autos primerauto=new Autos();
		primerauto.comprar("Primer Auto Datos", 0);
		primerauto.color="Azul";
		primerauto.marca="Toyota";
	    primerauto.precio=20.000;
		primerauto.modelo="Suzuki";
	    System.out.println("Marca:  "+ primerauto.marca );
	    System.out.println("Color:  "+ primerauto.color );
	    System.out.println("Precio:  "+ primerauto.precio );
	    System.out.println("Modelo:  "+ primerauto.modelo );
	    
		Autos segundoauto=new Autos();
		segundoauto.comprar2("Segundo Auto Datos", 0);
		segundoauto.color="Rojo";
		segundoauto.marca="lexus";
		segundoauto.precio=20.000;
		segundoauto.modelo="Ford";
		System.out.println("Marca:  "+ segundoauto.marca );
	    System.out.println("Color:  "+ segundoauto.color );
	    System.out.println("Precio:  "+ segundoauto.precio );
	    System.out.println("Modelo:  "+ segundoauto.modelo );	
	}

}
