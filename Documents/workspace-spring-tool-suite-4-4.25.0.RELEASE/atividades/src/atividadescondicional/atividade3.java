package atividadescondicional;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("É a sua primeira doação? Sim = Digite TRUE / Não = Digite FALSE");
		doacao = leia.nextBoolean();
		
        if (idade >= 18 && idade <= 69) { 
            if (idade < 60 || (idade <= 69 && !doacao)) {
                System.out.println(nome + ", você está apto a doar sangue.");
            } else {
                System.out.println(nome + ", você não está apto a doar sangue.");
            }
        } else {
            System.out.println(nome + ", você não está apto a doar sangue.");    
        }

        leia.close();
    }
}