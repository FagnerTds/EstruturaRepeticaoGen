package LacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador(a)");
		String nome=sc.nextLine();
		System.out.println("Digite o Número do cargo");
		int cargo=sc.nextInt();
		System.out.println("Digite o sálario atual");
		float salario=sc.nextFloat(),soma;
		
		switch(cargo) {
		case 1:
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: Gerente");
			soma=salario+(0.1f*salario);
			System.out.println("Novo Salário: "+soma);
			break;
		case 2:
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: Vendedor");
			soma=salario+(0.07f*salario);
			System.out.println("Novo Salário: "+soma);
			break;
		case 3:
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: Supervisor");
			soma=salario+(0.09f*salario);
			System.out.println("Novo Salário: "+soma);
			break;
		case 4:
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: Motorista");
			soma=salario+(0.06f*salario);
			System.out.println("Novo Salário: "+soma);
			break;
		case 5:
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: Estoquista");
			soma=salario+(0.05f*salario);
			System.out.println("Novo Salário: "+soma);
			break;
		case 6:
			System.out.println("Nome do colaborador: "+nome);
			System.out.println("Cargo: Técnico de TI");
			soma=salario+(0.08f*salario);
			System.out.println("Novo Salário: "+soma);
			break;
		
			
		}
		
		
		sc.close();
	}

}
