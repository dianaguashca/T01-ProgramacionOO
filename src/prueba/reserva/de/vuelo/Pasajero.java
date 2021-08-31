package prueba.reserva.de.vuelo;

import java.util.Scanner;

public class Pasajero {

	public static void main(String[] args) {
		ReservaVuelo pasajero1=new ReservaVuelo();	
		pasajero1.setNombre("Andres");
		pasajero1.setApellido("Veloz");
		pasajero1.setEdad(20);
		
		ReservaVuelo pasajero2=new ReservaVuelo();	
		pasajero2.setNombre("Andy");
		pasajero2.setApellido("Veloz");
		pasajero2.setEdad(23);
		
		ReservaVuelo pasajero3=new ReservaVuelo();	
		pasajero3.setNombre("Andres");
		pasajero3.setApellido("Veloz");
		pasajero3.setEdad(20);
		
		ReservaVuelo pasajero4=new ReservaVuelo();	
		pasajero4.setNombre("Andres");
		pasajero4.setApellido("Veloz");
		pasajero4.setEdad(20);
		
		ReservaVuelo pasajero5=new ReservaVuelo();	
		pasajero5.setNombre("Andres");
		pasajero5.setApellido("Veloz");
		pasajero5.setEdad(20);
		
		ReservaVuelo pasajero6=new ReservaVuelo();	
		pasajero6.setNombre("Andres");
		pasajero6.setApellido("Veloz");
		pasajero6.setEdad(20);
		
		ReservaVuelo pasajero7=new ReservaVuelo();	
		pasajero7.setNombre("Andres");
		pasajero7.setApellido("Veloz");
		pasajero7.setEdad(20);
		
		ReservaVuelo pasajero8=new ReservaVuelo();	
		pasajero8.setNombre("Andres");
		pasajero8.setApellido("Veloz");
		pasajero8.setEdad(20);
		
		ReservaVuelo pasajero9=new ReservaVuelo();	
		pasajero9.setNombre("Andres");
		pasajero9.setApellido("Veloz");
		pasajero9.setEdad(20);
		
		ReservaVuelo pasajero10=new ReservaVuelo();	
		pasajero10.setNombre("Andres");
		pasajero10.setApellido("Veloz");
		pasajero10.setEdad(20);
		
		ReservaVuelo pasajero11=new ReservaVuelo();	
		pasajero11.setNombre("Andres");
		pasajero11.setApellido("Veloz");
		pasajero11.setEdad(20);
		
		ReservaVuelo pasajero12=new ReservaVuelo();	
		pasajero12.setNombre("Andres");
		pasajero12.setApellido("Veloz");
		pasajero12.setEdad(20);
		
		ReservaVuelo pasajero13=new ReservaVuelo();	
		pasajero13.setNombre("Andres");
		pasajero13.setApellido("Veloz");
		pasajero13.setEdad(20);
		
		ReservaVuelo pasajero14=new ReservaVuelo();	
		pasajero14.setNombre("Andres");
		pasajero14.setApellido("Veloz");
		pasajero14.setEdad(20);
		
		int [][]asiento=new int[4][5];
		 Scanner teclado = new Scanner(System.in);
	        Avion avion = new Avion();
	        String condicion;
	        char letra;
	        int clase;
	        int i = 1;
	        do {
	            System.out.println("Bienvenido cliente " + i);
	            do {
	                System.out.println("Desea viajar en Primera  o en clase Economica");
	                clase = teclado.nextInt();
	                if (clase == 1) {
	                    avion.AsientoPrimera();
	                } else if (clase == 2) {
	                    avion.AsientoEconomico();
	                } else {
	                    System.out.println("disponible  Primera clase o clase Económica");
	                }
	            } while (clase != 1 && clase != 2);
	            i++;
	        } while (!avion.avionLleno());
	        System.out.println("avión esta lleno.");
	    }
	
}
