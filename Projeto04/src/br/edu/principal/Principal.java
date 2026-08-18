package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana 1- 7: ");
		dia = sc.nextInt();
		
		System.out.println("Usando if-else");
		if (dia == 1) {
			System.out.println("Domingo");
		}
		else if (dia == 2) {
			System.out.println("Segunda");
		}
		else if (dia == 3) {
			System.out.println("terça");
		}
		else if (dia == 4) {
			System.out.println("quarta");
		}
		else if (dia == 5) {
			System.out.println("Quinta");
		}
		else if (dia == 6) {
			System.out.println("Sexta");
		}
		else if (dia == 7){
			System.out.println("Sabádo");
		}
		else {
			System.out.println("Dia da semana não existe");
		}
		
		System.out.println("Usando SWITCH PADRAO");
		switch(dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabádo");
				break;
			default:
				System.out.println("Dia da Semana não existe");
				
		}
	}

}
