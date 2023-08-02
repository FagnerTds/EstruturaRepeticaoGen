package LacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite o número do Produto");
		int prod =sc.nextInt();
		System.out.println("Digite a quantidade de produtos");
		float qtd = sc.nextFloat();
		float preco=0,soma;
		
		
		switch(prod) {
		case 1: 
			System.out.println("Cachorro quente");
			preco=10;
			soma=preco*qtd;
			System.out.println("valor total: R$"+soma);
			break;
		case 2:
			System.out.println("X-Salda");
			preco=15;
			soma=preco*qtd;
			System.out.println("valor total: R$"+soma);
			break;
		case 3: 
			System.out.println("X-bacon");
			preco=18;
			soma=preco*qtd;
			System.out.println("valor total: R$"+soma);
			break;
		case 4: 
			System.out.println("Bauru");
			preco=12;
			soma=preco*qtd;
			System.out.println("valor total: R$"+soma);
			break;
		case 5: 
			System.out.println("Refrigerante");
			preco=8;
			soma=preco*qtd;
			System.out.println("valor total: R$"+soma);
			break;
		case 6: 
			System.out.println("Suco de Laranja");
			preco=13;
			soma=preco*qtd;
			System.out.println("valor total: R$"+soma);
			break;
		default: 
			System.out.println("Item inválido");
			
		}
		
		
		sc.close();
	}

}
