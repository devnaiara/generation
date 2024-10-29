package atividadescondicional;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira característica (Vertebrado/Invertebrado): ");
        String caracteristica1 = leia.nextLine();

        System.out.println("Digite a segunda característica (Ave/Mamifero/Inseto/Anelideo): ");
        String caracteristica2 = leia.nextLine();

        System.out.println("Digite a terceira característica (Carnivoro/Onivoro/Herbivoro/Hematofago): ");
        String caracteristica3 = leia.nextLine();

        if (caracteristica1.equalsIgnoreCase("Vertebrado")) {
            if (caracteristica2.equalsIgnoreCase("Ave")) {
                if (caracteristica3.equalsIgnoreCase("Carnivoro")) {
                    System.out.println("O animal é uma Águia.");
                } else if (caracteristica3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("O animal é uma Pomba.");
                } else {
                    System.out.println("Característica não encontrada para Ave vertebrada.");
                }
            } else if (caracteristica2.equalsIgnoreCase("Mamifero")) {
                if (caracteristica3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("O animal é um Homem.");
                } else if (caracteristica3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("O animal é uma Vaca.");
                } else {
                    System.out.println("Característica não encontrada para Mamífero vertebrado.");
                }
            } else {
                System.out.println("Característica não encontrada para vertebrado.");
            }
        } else if (caracteristica1.equalsIgnoreCase("Invertebrado")) {
            if (caracteristica2.equalsIgnoreCase("Inseto")) {
                if (caracteristica3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("O animal é uma Pulga.");
                } else if (caracteristica3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("O animal é uma Lagarta.");
                } else {
                    System.out.println("Característica não encontrada para Inseto invertebrado.");
                }
            } else if (caracteristica2.equalsIgnoreCase("Anelideo")) {
                if (caracteristica3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("O animal é uma Sanguessuga.");
                } else if (caracteristica3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("O animal é uma Minhoca.");
                } else {
                    System.out.println("Característica não encontrada para Anelídeo invertebrado.");
                }
            } else {
                System.out.println("Característica não encontrada para invertebrado.");
            }
        } else {
            System.out.println("Característica não encontrada.");
        }

        leia.close();
    }
}