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

    @Override
    public void venda() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tamanho de roupa voce vai escolher?");
        System.out.println("1 - P\n2 - M\n3 - G");

        String tamanho = sc.nextLine().trim().toUpperCase();

        switch (tamanho) {
            case "1":
                this.quantidadeP--;
                break;
            case "2":
                this.quantidadeM--;
                break;
            case "3":
                this.quantidadeG--;
                break;
            default:
                System.out.println("Tamanho inválido! A venda não foi processada.");
                break;
        }
    }

    @Override
    public void reposicaoEstoque(){
        if (this.quantidadeP < this.estoqueMinimo ){
            this.quantidadeP = this.estoqueMaximo;
        }
        if (this.quantidadeM < this.estoqueMinimo ){
            this.quantidadeM = this.estoqueMaximo;
        }
        if (this.quantidadeG < this.estoqueMinimo ){
            this.quantidadeG = this.estoqueMaximo;
        }
    }

    @Override
    public void mostrarEstoque() {
        System.out.println("Estoque PMG -> P: " + this.quantidadeP + " | M: " + this.quantidadeM + " | G: " + this.quantidadeG);
    }
}
