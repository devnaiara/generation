package atividadescondicional;

import java.util.Scanner;

public class atividade6 {
	
    public static void main(String[] args) {
    	
    	String nome, cargo;
        int opcao;
        double salario, novosalario, reajuste;

        Scanner leia = new Scanner(System.in);
        
        System.out.print("Qual o nome do colaborador? ");
        nome = leia.nextLine();
        
        System.out.print("Qual seu salario: ");
        salario = leia.nextDouble();

        System.out.println("--Digite 1 para Gerente");
        System.out.println("--Digite 2 para Vendedor");
        System.out.println("--Digite 3 para Supervisor");
        System.out.println("--Digite 4 para Motorista");
        System.out.println("--Digite 5 para Estoquista");
        System.out.println("--Digite 6 para Técnico em TI");

        System.out.print("Escolha o cargo desejado: ");
        opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                cargo = "Gerente";
                reajuste = 0.10;
                break;
            case 2:
                cargo = "Vendedor";
                reajuste = 0.07;
                break;
            case 3:
                cargo = "Supervisor";
                reajuste = 0.09;
                break;
            case 4:
                cargo = "Motorista";
                reajuste = 0.06;
                break;
            case 5:
                cargo = "Estoquista";
                reajuste = 0.05;
                break;
            case 6:
                cargo = "Técnico de TI";
                reajuste = 0.08;
                break;
            default:
                System.out.println("Código inválido.");
                leia.close();
                return;
        }

        novosalario = salario + (reajuste * salario);

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Cargo: %s\n", cargo);
        System.out.printf("Salário anterior: R$ %.2f\n", salario);
        System.out.printf("Reajuste: %.0f%%\n", reajuste * 100);
        System.out.printf("Novo Salário: R$ %.2f\n", novosalario);

        leia.close();
    }
}

