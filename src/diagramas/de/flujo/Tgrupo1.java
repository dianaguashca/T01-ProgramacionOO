package diagramas.de.flujo;

import java.util.Scanner;

public class Tgrupo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner lector=new Scanner(System.in);
		 int A�oA = 2021,A�oN;
		 int MesA = 7,MesN,mes=0;
		 int diaA = 12,diaN,dia=0; 
		 int edad=0;
		 int dias_mes_actual=0;
		 System.out.printf("fecha actual: %d/%d/%d ",A�oA,MesA,diaA);
		 System.out.println();
		 System.out.print("a�o Nacimiento:");
		 A�oN=lector.nextInt();
		 System.out.print("mes Nacimiento:");
		 MesN=lector.nextInt();
		 System.out.print("dia Nacimiento:");
		 diaN=lector.nextInt();

		 System.out.printf("fecha Nacimiento: %d/%d/%d ",A�oN,MesN,diaN);
		 System.out.println();

		 edad=A�oA-A�oN;

		 if(MesN>MesA) {
		 edad=edad-1; //edad
		 }else if(MesN==MesA) {
		 if(diaN>diaA) {
		 edad=edad-1;
		 }else {
		 edad=edad;
		 }
		 }


		 int dias_mes_nacimiento = 0;
		 if ((MesN == 1 || MesN == 3 || MesN == 5 || MesN == 7 || MesN == 8 || MesN == 10 || MesN == 12)||(MesA == 1 || MesA == 3 || MesA == 5 || MesA == 7 || MesA == 8 || MesA == 10 || MesA == 12)) {
		 dias_mes_nacimiento = 31;

		 }else if ((MesN == 4 || MesN == 6 || MesN == 9 || MesN == 11)||(MesA == 4 || MesA == 6 || MesA == 9 || MesA == 11)) {
		 dias_mes_nacimiento = 30;

		 }if (MesN == 2 && A�oN % 4 == 0) {
		 dias_mes_nacimiento = 29;
		 } else if (MesN == 2 && A�oN % 4 != 0) {
		 dias_mes_nacimiento = 28;
		 }


		 if(MesN==MesA) { //mes

		 mes=(MesA-MesN);

		 }else if(MesN>MesA) {
		 mes=12-(MesN-MesA);

		 }else if(MesN<MesA) {
		 mes=(MesA-MesN);
		 }


		 if(MesN==2 || MesA==2) { //dia
		 if(diaN<=28 || diaA<=28) {
		 if(diaN==diaA) {
		 dia=diaN-diaA;
		 }else if(diaN>diaA) {
		 dia=-diaN+(diaA+dias_mes_nacimiento);
		 }else if(diaN<diaA) {
		 dia=-(diaA-diaN)+dias_mes_nacimiento;
		 }
		 }else if(diaN==29 || diaA==29) {

		 if(diaN==diaA) {
		 dia=diaN-diaA;
		 }else if(diaN>diaA) {
		 dia=-diaN+(diaA+dias_mes_nacimiento);
		 }else if(diaN<diaA) {
		 dia=-(diaA-diaN)+dias_mes_nacimiento;
		 }
		 }
		 }else if(MesN!=2 && MesA!=2) {
		 if(diaN<=31 || diaA<=31) {
		 if(diaN==diaA) {
		 dia=diaN-diaA;
		 }else if(diaN>diaA) {
		 MesN=dias_mes_nacimiento;
		 dia=dias_mes_nacimiento-diaN+diaA;
		 }else if(diaN<diaA) {
		 dia=(diaA-diaN);
		 }

		 }
		 }
		 System.out.printf("Su edad es: %d a�os,%d meses ,%d dias",edad,mes,dia);

		 }
}
