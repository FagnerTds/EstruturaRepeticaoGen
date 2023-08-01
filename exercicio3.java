package LacosRepeticao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean pv;
		
		System.out.println("Digite o nome do doador: ");
		nome=sc.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade=sc.nextInt();
		System.out.println("Primeira vez que doa sangue? ");
		pv=sc.nextBoolean();
		
		if(idade>=18 && idade<60) {
			System.out.println(nome+" está apto(a) para doar sangue");
		}
		else if(idade>=60 && idade<=69 && pv==false) {
			System.out.println(nome+" está apto(a) para doar sangue");
		}
		else if(idade>=60 && idade<=69 && pv==true) {
			System.out.println(nome+" NÃO está apto(a) para doar sangue");
		}
		else {
			System.out.println(nome+" NÃO está apto(a) para doar sangue");
		}
		
		sc.close();
	}

}
