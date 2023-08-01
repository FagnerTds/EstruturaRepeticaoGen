package LacosRepeticao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		float a = sc.nextFloat();
		System.out.println("Digite o segundo número");
		float b = sc.nextFloat();
		System.out.println("Digite 1 para(Soma), 2 para(Subtração), 3 para (Multiplicação) e 4 para (Divisão)");
		int operacao = sc.nextInt();
		
		switch(operacao) {
		case 1:
			float c = a+b;
			System.out.println(a+" + "+b+" = "+c);
			break;
		case 2:
			float c1 = a-b;
			System.out.println(a+" - "+b+" = "+c1);
			break;
		case 3:
			float c2 = a*b;
			System.out.println(a+" x "+b+" = "+c2);
			break;
		case 4:
			float c3 = a/b;
			System.out.println(a+" / "+b+" = "+c3);
			break;
		default: 
			System.out.println("Operaçõ inválida");
			
		}
		
		
		
		sc.close();
	}

}
