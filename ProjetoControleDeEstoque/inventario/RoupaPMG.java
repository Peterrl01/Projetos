package ProjetoControleDeEstoque.inventario;

import ProjetoControleDeEstoque.abstracoes.Item;

import java.util.Scanner;

public class RoupaPMG implements Item {
    protected int quantidadeP;
    protected int quantidadeM;
    protected int quantidadeG;
    protected int estoqueMinimo;
    protected int estoqueMaximo;

    public RoupaPMG(int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void venda() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tamanho de roupa voce vai escolher?");
        System.out.println("1 - P\n2 - M\n3 - G");

        String tamanho = sc.nextLine().trim().toUpperCase();

        switch (tamanho) {
            case "P":
                    quantidadeP--;
            case "M":
                    quantidadeM--;
                break;
            case "G":
                    quantidadeG--;
                break;
            default:
                System.out.println("Tamanho inválido! A venda não foi processada.");
                break;
        }
    }

    public void reposicaoEstoque(){
        if (quantidadeP < estoqueMinimo ){
            quantidadeP = estoqueMaximo;
        }
        if (quantidadeM < estoqueMinimo ){
            quantidadeM = estoqueMaximo;
        }
        if (quantidadeG < estoqueMinimo ){
            quantidadeG = estoqueMaximo;
        }
    }

    public void mostrarEstoque() {
        System.out.println("Estoque PMG -> P: " + quantidadeP + " | M: " + quantidadeM + " | G: " + quantidadeG);
    }
}
