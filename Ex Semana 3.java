import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU DE EXERCÍCIOS COM ARRAYS =====");
            System.out.println("1) Contar Pares e Ímpares");
            System.out.println("2) Procurar número no array");
            System.out.println("3) Remover nome");
            System.out.println("4) Contar repetições de números");
            System.out.println("5) Ordenar com Bubble Sort");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                ex1();
            } else if (opcao == 2) {
                ex2();
            } else if (opcao == 3) {
                ex3();
            } else if (opcao == 4) {
                ex4();
            } else if (opcao == 5) {
                ex5();
            } else if (opcao == 0) {
                System.out.println("Encerrando programa...");
            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    // Exercício 1
    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int pares = 0, impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }

    // Exercício 2
    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean achou = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o número a procurar: ");
        int busca = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                System.out.println("Número encontrado na posição " + i);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Número não encontrado!");
        }
    }

    // Exercício 3
    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("Digite o nome a remover: ");
        String remover = sc.nextLine();

        boolean removido = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(remover)) {
                nomes[i] = "---";
                removido = true;
            }
        }

        if (removido) System.out.println("Nome removido!");
        else System.out.println("Nome não encontrado!");

        System.out.println("\nLista final de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    // Exercício 4
    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nOcorrências de cada número:");
        for (int i = 0; i < numeros.length; i++) {
            int cont = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) cont++;
            }
            System.out.println("Número " + numeros[i] + " aparece " + cont + " vez(es).");
        }
    }

    // Exercício 5
    public static void ex5() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }

        System.out.println("\nArray ordenado:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
