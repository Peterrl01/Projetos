package ProjetoControleDeEstoque;

import ProjetoControleDeEstoque.abstracoes.Item;
import ProjetoControleDeEstoque.inventario.Acessorio;
import ProjetoControleDeEstoque.inventario.RoupaPMG;
import ProjetoControleDeEstoque.inventario.RoupaTamahoUnico;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Aplicacao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] vet = new Item[5];
        vet[0] = new Acessorio("Camisa", 10, 2, 10);
        vet[1] = new Acessorio("saia", 10, 2, 10);
        vet[2] = new RoupaPMG(3, 4, 6, 3, 9);
        vet[3] = new RoupaTamahoUnico("Saia de praia", 3, 1, 10);
        vet[4] = new RoupaPMG(3, 4, 6, 3, 9);

        int opcao=0;
        while (opcao != 5){

            System.out.println("\n--- MENU DA LOJA ---");
            System.out.println("Escolha um produto para vender:");
            System.out.println("0 - Camisa");
            System.out.println("1 - Saia");
            System.out.println("2 - Roupa PMG 1");
            System.out.println("3 - Saída de praia");
            System.out.println("4 - Roupa PMG 2");
            System.out.println("5 - Sair do sistema");
            System.out.print("Digite sua opção: ");

            try {
                opcao = sc.nextInt();

                if (opcao >= 0 && opcao <= 4) {
                    vet[opcao].venda();

                    vet[opcao].reposicaoEstoque();

                    System.out.println("Venda processada!");
                    vet[opcao].mostrarEstoque();
                } else if (opcao < 0 || opcao > 5) {
                    System.out.println("Opção inválida! Escolha um número entre 0 e 5.");
                }
           }catch (InputMismatchException e){
               System.out.println("Erro: Digite apenas números válidos!");
               sc.nextLine();
           }
        }

        System.out.println("ESTOQUE FINAL");
        for (int i = 0; i < vet.length; i++) {
            vet[i].mostrarEstoque();
        }
    }
}
