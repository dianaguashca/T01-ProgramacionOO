package deber.ordenamiento;

import java.util.Arrays;

public class Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         EmpresaGPF empleado1 = new EmpresaGPF();
         empleado1.setNombre("Cristian");
         empleado1.setApellido("Sanchez");
         empleado1.setEdad(21);
         empleado1.setSalario(250);
         
         EmpresaGPF empleado2 = new EmpresaGPF();
         empleado2.setNombre("Adriana");
         empleado2.setApellido("Factos");
         empleado2.setEdad(23);
         empleado2.setSalario(450);
         
         EmpresaGPF empleado3 = new EmpresaGPF();
         empleado3.setNombre("Carlos");
         empleado3.setApellido("Pachacama");
         empleado3.setEdad(45);
         empleado3.setSalario(300);
         
         EmpresaGPF empleado4 = new EmpresaGPF();
         empleado4.setNombre("Jhoana");
         empleado4.setApellido("Macias");
         empleado4.setEdad(18);
         empleado4.setSalario(380);
         
         EmpresaGPF empleado5 = new EmpresaGPF();
         empleado5.setNombre("Maria");
         empleado5.setApellido("Orellana");
         empleado5.setEdad(33);
         empleado5.setSalario(600);
         
         EmpresaGPF empleado6 = new EmpresaGPF();
         empleado6.setNombre("Estefania");
         empleado6.setApellido("Allauca");
         empleado6.setEdad(52);
         empleado6.setSalario(890);
         
         EmpresaGPF empleado7 = new EmpresaGPF();
         empleado7.setNombre("Wendy");
         empleado7.setApellido("Loachamin");
         empleado7.setEdad(17);
         empleado7.setSalario(120);
         
         EmpresaGPF empleado8 = new EmpresaGPF();
         empleado8.setNombre("Estefania");
         empleado8.setApellido("Allauca");
         empleado8.setEdad(52);
         empleado8.setSalario(800);
         
         EmpresaGPF empleado9 = new EmpresaGPF();
         empleado9.setNombre("Fernando");
         empleado9.setApellido("Paucar");
         empleado9.setEdad(34);
         empleado9.setSalario(645);
         
         EmpresaGPF empleado10 = new EmpresaGPF();
         empleado10.setNombre("Roberto");
         empleado10.setApellido("Campana");
         empleado10.setEdad(52);
         empleado10.setSalario(210);
         
         System.out.println("Primer empleado con el salario de:"+empleado1.getSalario());
 		System.out.println("Segundo empleado con el salario de:"+empleado2.getSalario());
 		System.out.println("Tercer empleado con el salario de:"+empleado3.getSalario());
 		System.out.println("Cuarto empleado con el salario de:"+empleado4.getSalario());
 		System.out.println("Quinto empleado con el salario de:"+empleado5.getSalario());
 		System.out.println("Sexto empleado con el salario de:"+empleado6.getSalario());
 		System.out.println("Septimo empleado con el salario de:"+empleado7.getSalario());
 		System.out.println("Octavo empleado con el salario de:"+empleado8.getSalario());
 		System.out.println("Noveno empleado con el salario de:"+empleado9.getSalario());
 		System.out.println("Decimo empleado con el salario de:"+empleado10.getSalario());
	     //subiendo al github
 		EmpresaGPF salarioEmpleado[]=new EmpresaGPF[10];
 		salarioEmpleado[0]=empleado1;
 		salarioEmpleado[1]=empleado2;
 		salarioEmpleado[2]=empleado3;
 		salarioEmpleado[3]=empleado4;
 		salarioEmpleado[4]=empleado5;
 		salarioEmpleado[5]=empleado6;
 		salarioEmpleado[6]=empleado7;
 		salarioEmpleado[7]=empleado8;
 		salarioEmpleado[8]=empleado9;
 		salarioEmpleado[9]=empleado10;
 		
 		System.out.println("Antes de ordenar");
 		System.out.println();
		System.out.println(Arrays.toString(salarioEmpleado));
	   
		Arrays.sort(salarioEmpleado);
		System.out.println("Despues de ordenar");
		System.out.println();
		System.out.println(Arrays.toString(salarioEmpleado));
		
	}

}
