package controle;

import dominio.VendaProduto;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ControleVenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        VendaProduto[] vendas = new VendaProduto[5];
        int qtd = 0;

        System.out.println("🛒 Bem-vindo ao Sistema de Vendas!");
        System.out.println("------------------------------------");

        int opcao;
        do {
            System.out.println("\n📋 MENU PRINCIPAL");
            System.out.println("1️⃣  Registrar nova venda");
            System.out.println("2️⃣  Listar todas as vendas");
            System.out.println("0️⃣  Sair do sistema");
            System.out.print("Sua escolha: ");

            while (!sc.hasNextInt()) { 
                System.out.print("Digite um número válido: ");
                sc.next();
            }
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (qtd >= vendas.length) {
                        System.out.println("⚠️ Você já cadastrou as 5 vendas permitidas.");
                        break;
                    }

                    System.out.println("\n📝 Cadastro de Venda #" + (qtd + 1));
                    System.out.print("Número da venda: ");
                    int numero = sc.nextInt();

                    System.out.print("Quantidade vendida: ");
                    int quantidade = sc.nextInt();

                    System.out.print("Valor unitário (R$): ");
                    double valorUnitario = sc.nextDouble();

                    vendas[qtd] = new VendaProduto(numero, quantidade, valorUnitario);
                    qtd++;
                    System.out.println("✅ Venda registrada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n📦 LISTA DE VENDAS");
                    if (qtd == 0) {
                        System.out.println("Nenhuma venda foi registrada ainda.");
                    } else {
                        double totalGeral = 0.0;
                        for (int i = 0; i < qtd; i++) {
                            VendaProduto v = vendas[i];
                            System.out.println("• " + v.toString());
                            totalGeral += v.valorPagar();
                        }
                        System.out.println("------------------------------------");
                        System.out.println("💰 Total geral vendido: R$ " + df.format(totalGeral));
                        System.out.println("📊 Média por venda: R$ " + df.format(totalGeral / qtd));
                    }
                    break;

                case 0:
                    System.out.println("\n👋 Obrigado por utilizar o sistema!");
                    break;

                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
