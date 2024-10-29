package atividadescondicional;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		
		int A, B, C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B:  ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		if ((A + B) > C ) {
		System.out.println("A Soma de A + B é Maior que C.");
		
		}if ((A + B) < C ) {
		System.out.println("A Soma de A + B é Menor que C.");
		
		} if ((A + B) == C ) {
		System.out.println("A Soma de A + B é igual a C.");
		
		leia.close();
		}
	}
}
