package atividadescondicional;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0 && numero > 0) { 
		    System.out.println("O número é par e positivo.");
		    
		} else if (numero % 2 != 0 && numero < 0) {
		    System.out.println("O número é ímpar e negativo.");
		    
		} else if (numero % 2 == 0 && numero < 0) {
		    System.out.println("O número é par e negativo.");
		    
		} else if (numero % 2 != 0 && numero > 0) {
		    System.out.println("O número é ímpar e positivo.");
		}
		
		leia.close();
	}
}
