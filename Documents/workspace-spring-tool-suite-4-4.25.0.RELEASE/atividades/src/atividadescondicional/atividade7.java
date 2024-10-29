package atividadescondicional;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
    	
    	float num1, num2, resultado =0;
        int opcao;

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Vamos fazer uma operação matemática, escolha dois números!");
        
        System.out.printf("Digite o número 1: ");
        num1 = leia.nextFloat();
        
        System.out.printf("Digite o número 2: ");
        num2 = leia.nextFloat();
        
        System.out.println("--Digite 1 para Soma");
        System.out.println("--Digite 2 para Substração");
        System.out.println("--Digite 3 para Multiplicação");
        System.out.println("--Digite 4 para Divisão");
        opcao = leia.nextInt();
        
        switch (opcao) {
        case 1:
            resultado = num1 + num2;
            break;
        case 2:
            resultado = num1 - num2;
            break;
        case 3:
            resultado = num1 * num2;
            break;
        case 4:
        	if (num2 != 0) {
        		resultado = num1 / num2;	
        	} else {
        		System.out.println("Erro: divisão por zero não é permitido.");
        	}
            break;
        default:
            System.out.println("Código inválido.");
            }
        
        System.out.println("O resultado da operação é: " + resultado);
        
        leia.close();
    }
}
