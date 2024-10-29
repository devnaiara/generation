package atividadescondicional;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        int opcao, qtd;
        double preco = 0.0, total;
        String produto;

        Scanner leia = new Scanner(System.in);

        System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("--Digite 1 para Cachorro Quente");
        System.out.println("--Digite 2 para X-Salada");
        System.out.println("--Digite 3 para X-Bacon");
        System.out.println("--Digite 4 para Bauru");
        System.out.println("--Digite 5 para Refrigerante");
        System.out.println("--Digite 6 para Suco de laranja");

        System.out.print("Escolha o código do produto digitando o seu código: ");
        opcao = leia.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        qtd = leia.nextInt();

        switch (opcao) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;
            case 6:
                produto = "Suco de Laranja";
                preco = 13.00;
                break;
            default:
                System.out.println("Código inválido.");
                leia.close();
                return;
        }

        total = qtd * preco;

        System.out.printf("Produto: %s\n", produto);
        System.out.printf("Quantidade: %d\n", qtd);
        System.out.printf("Valor total: R$ %.2f\n", total);

        leia.close();
    }
}
       
