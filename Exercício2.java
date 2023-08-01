package LacosRepeticao;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num;
		num=sc.nextInt();
		
		if(num%2==0 && num>0) {
			System.out.println("O Número "+ num+" é par e positivo!");
		}
		else if(num%2==1 && num>0) {
			System.out.println("O Número "+ num+" é impar e positivo!");
		}
		
		else if(num%2==0 && num<0) {
			System.out.println("O Número "+ num+" é par e Negativo!");
		}
		else {
			System.out.println("O Número "+ num+" é impar e Negativo!");
		}
		
		
		sc.close();
	}

}
