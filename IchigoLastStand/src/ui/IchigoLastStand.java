package ui;

import java.util.Scanner;

public class IchigoLastStand {
	
	static Scanner lector = new Scanner(System.in);
	static int Resultados[] = new int[3];
	static int NumSeciones=0;
	public static void main(String[] args) {
		System.out.println("Bienvenido al entreno");
		int Entrenamiento = 0;
		while (Entrenamiento != 4){
			NumSeciones++;
			System.out.println("1: Shinkai, 2: Bankai, 3: Kido, 4: Salir");
			Entrenamiento = lector.nextInt();
			if (Entrenamiento==1){
				Shinkai();
			}
				else if (Entrenamiento==2){
					Bankai();
				}
					else if (Entrenamiento==3){
						Kido();
					}else{
						System.out.println("");
						}
	//int Shinkai=Shinkai();
	//int Bankai=Bankai();
	//int Kido=Kido();
	Resultados();
	}
	}

	public static void Shinkai(){
		System.out.println("digite el numero de horas de Shinkai");
		int ShinkaiEntrenamiento = lector.nextInt();
		Resultados[0]+=ShinkaiEntrenamiento;
	}
	
	
	public static void Bankai(){

		System.out.println("digite el numero de horas de Bankai");
		int BankaiEntrenamiento = lector.nextInt();
		Resultados[1]+=BankaiEntrenamiento;
	}

	public static void Kido(){
		System.out.println("digite el numero de horas de Kido ");
		int KidoEntrenamiento = lector.nextInt();
		Resultados[2]+=KidoEntrenamiento;
	}
	
	
	public static void Resultados(){
		System.out.println("el total de Shinkai es "+Resultados[0]);
		if (Resultados[0] < 500){
			System.out.println("le faltan a Shinkai "+(500-Resultados[0]));
		} else {
			System.out.println("Se alcanzo el minimo");
		}
		System.out.println("el total de Bankai es"+Resultados[1]);
	if (Resultados[1] < 300){
		System.out.println("le faltan a Bankai "+(300-Resultados[1]));
		} else {
		System.out.println("Se alcanzo el minimo");
		}
		System.out.println("el total de Kido es "+Resultados[2]);
		if (Resultados[2] < 200){
		System.out.println("le faltan Kido "+(200-Resultados[2]));
		} else {	
		System.out.println("Se alcanzo el minimo");
		}
	System.out.println("El numero de Seciones que llevas es de "+NumSeciones);
	}
}