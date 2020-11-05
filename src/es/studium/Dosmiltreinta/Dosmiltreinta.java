package es.studium.Dosmiltreinta;

import java.util.Scanner;

public class Dosmiltreinta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre;
		int ano;
		System.out.println("Dime tu nombre ");
		nombre = teclado.next();
		System.out.println("Dime tu año de nacimeinto");
		ano = teclado.nextInt();
		teclado.close();
		ano = 2030 - ano;
		System.out.println("Hola " + nombre + " en el año 2030 tendrás " + ano + " años");
	}

}
