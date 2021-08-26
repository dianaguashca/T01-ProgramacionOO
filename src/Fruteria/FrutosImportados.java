package Fruteria;

public class FrutosImportados {
        private String NombreFruto;
        private int cantidad;
        private String Npaquetes;
        private String precio;
        
        private void frutoImpotado() {
        	FrutosImportados primeraEntrega=new FrutosImportados();
        	primeraEntrega.NombreFruto="manzanas";
          primeraEntrega.cantidad=20;
          primeraEntrega.Npaquetes="5 cajas de a 20";
          primeraEntrega.precio="25 $ cada caja";
          //estoy usando un atributo private en mi misma clase
          
          System.out.println("Primer Fruto:"+	NombreFruto);
		  System.out.println("La cantidad es :"+precio); 
		  System.out.println(" El numero de paquetes entregados:"+Npaquetes);
		  System.out.println("Su precio es:"+precio);
        }
        private void futoMalEstado() {
        	
        }
}
