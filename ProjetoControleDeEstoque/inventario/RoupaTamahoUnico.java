package ProjetoControleDeEstoque.inventario;

import ProjetoControleDeEstoque.abstracoes.Item;
import ProjetoControleDeEstoque.abstracoes.Peca;

public  class RoupaTamahoUnico  extends Peca implements Item {


    public RoupaTamahoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda(){
        this.quantidade--;
    }
}
