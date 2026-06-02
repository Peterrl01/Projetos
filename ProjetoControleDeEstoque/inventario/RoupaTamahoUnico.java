package ProjetoControleDeEstoque.inventario;

import ProjetoControleDeEstoque.abstracoes.Item;
import ProjetoControleDeEstoque.abstracoes.Peca;

public  class RoupaTamahoUnico  extends Peca implements Item {
    private String tamanhoUnico;

    public RoupaTamahoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo, String tamanhoUnico) {
        this.tamanhoUnico = tamanhoUnico;
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda(){
        this.setQuantidade(this.quantidade--);
    }
}
