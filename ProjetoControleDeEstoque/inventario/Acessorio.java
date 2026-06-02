package ProjetoControleDeEstoque.inventario;

import ProjetoControleDeEstoque.abstracoes.Item;
import ProjetoControleDeEstoque.abstracoes.Peca;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class  Acessorio extends Peca implements Item {
    protected int quantidadeVendida;

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade Vendida : ");

        try {
           int quantidadeVendida = sc.nextInt();

           while (this.getEstoqueMaximo() < this.quantidadeVendida){
               System.out.println("Erro: você inseriu uma quantidade maior que o estoque atual! Insira a quantidade vendida novamente.");

               System.out.print("Quantidade Vendida : ");
               quantidadeVendida = sc.nextInt();
           }

           setQuantidade(this.getEstoqueMaximo() - quantidadeVendida);

        } catch (InputMismatchException e){

           System.out.println("Erro: Digite apenas números válidos!");
           sc.nextLine();
        }
    }

    @Override
    public void mostrarEstoque() {
        System.out.println("Produto: " + this.getDecricao() + " | Estoque atual: " + this.getQuantidade());
    }
}
