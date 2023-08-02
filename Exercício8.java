package LacosRepeticao;

import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.print("Digite a operação");
		int operacao=sc.nextInt();
		float saldo=1000.00f,saque,novo, deposito;
		
		switch(operacao) {
		case 1:
			System.out.print("Operação - Saldo \n");
			System.out.println("Saldo Atual: R$"+saldo);
			break;
		case 2:
			System.out.print("Digite o valor do saque");
			saque=sc.nextFloat();
			if(saque>saldo) {
				System.out.println("Operação - Saque\n");
				System.out.println("Saldo insuficiente");
			}else if(saque<saldo) {
				novo=saldo-saque;
				System.out.println("Operação - Saque\n");
				System.out.println("Novo saldo: R$"+novo);
			}
			break;
		case 3:
			System.out.print("Digite o valor do depósito");
			deposito=sc.nextFloat();
			novo=saldo+deposito;
			System.out.println("\nOperação - Depósito\n");
			System.out.println("Novo saldo: R$"+novo);
			break;	
		default:
		System.out.println("Operação inválida");
		}	
		
		
		
		sc.close();
	}

}
