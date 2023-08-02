package LacosRepeticao;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 'vertebrado' ou 'invetebrado': ");
		String a= sc.nextLine();
		System.out.println("Digite a classificação: ");
		String b= sc.nextLine();
		System.out.println("Digite a classificação: ");
		String c= sc.nextLine();
		
		if (a.equalsIgnoreCase("vertebrado")) {
			if(b.equalsIgnoreCase("AVE")) {
				if(c.equalsIgnoreCase("carnivoro")) {
					System.out.println("ÁGUIA");
				}else {
					System.out.println("POMBA");
				}
			}else if(b.equalsIgnoreCase("mamifero")) {
				if(c.equalsIgnoreCase("onivoro")) {
					System.out.println("HOMEM");
				}else {
					System.out.println("VACA");
				}
			}	
		}else if (a.equalsIgnoreCase("Invertebrado")){
			if(b.equalsIgnoreCase("inseto")) {
				if(c.equalsIgnoreCase("hematofago")) {
					System.out.println("PULGA");
				}else {
					System.out.println("LAGARTA");
				}
			}else if(b.equalsIgnoreCase("anelideo")) {
				if(c.equalsIgnoreCase("hematofago")) {
					System.out.println("SANGUESSUGA");
				}else {
					System.out.println("MINHOCA");
				}
			}
		}
		
		sc.close();
	}

}
