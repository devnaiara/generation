package atividadescondicional;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {

        float saldo = 1000, saque, deposito, novoSaldo;
        int opcao;

        Scanner leia = new Scanner(System.in);

        System.out.println("Conta Bancária");

        System.out.println("--Digite 1 para Saldo");
        System.out.println("--Digite 2 para Saque");
        System.out.println("--Digite 3 para Depósito");
        opcao = leia.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.printf("Consulta saldo: %.2f%n", saldo);
                break;
            case 2:
                System.out.printf("O seu saldo é: %.2f%n", saldo);
                System.out.println("Digite o valor para saque: ");
                saque = leia.nextFloat();
                	if (saque > saldo) {
                        System.out.println("Saldo Insuficiente.");
                    } else { novoSaldo = saldo - saque;
                System.out.printf("Seu novo saldo é: %.2f%n", novoSaldo);
                    }
                break;

            case 3:
                System.out.println("Digite o valor para depósito: ");
                deposito = leia.nextFloat();

                novoSaldo = saldo - deposito;
                System.out.printf("Seu novo saldo é: %.2f%n", novoSaldo);
                break;

            default:
                System.out.println("Operação Inválida.");

        	}
        leia.close();
    }
}