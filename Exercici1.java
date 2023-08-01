package LacosRepeticao;

import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,soma;
		
		System.out.print("Digite o Numero 'A': ");
		a=sc.nextInt();
		System.out.print("Digite o Número 'B': ");
		b=sc.nextInt();
		System.out.print("Digite o Número 'C': ");
		c=sc.nextInt();
		
		soma=a+b;
		
		if(soma>c) {
			System.out.println("A soma de A+B é Maior que C");
		}
		else if(soma<c) {
			System.out.println("A soma de A+B é Menor que C");
		}
		else {
			System.out.println("A soma de A+B é Igual a C");
		}
		
		
		
		
		
		sc.close();
	}

}
