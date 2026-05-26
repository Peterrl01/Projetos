package ProjetoControleDeEstoque;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class  Acessorio extends Peca implements Item{
    protected int quantiadeVendida;

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    public void venda(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade Vendida : ");
       try {
           int quantidadeVendida = sc.nextInt();
           setQuantidade(getQuantidade() - quantidadeVendida); // despois testar this.quantiade - quantidadeVendida;
       }catch (InputMismatchException e){
           System.out.println("Erro: Digite apenas números válidos!");
           sc.nextLine();
       }
//        if (quantidadeVendida <= 0){
//            System.out.println("Quantidade Vendida invalida!");
//            return; //depois testar sem o return
//        }
    };
}
