package ProjetoControleDeEstoque.abstracoes;

public abstract class Peca {
    protected String decricao;
    protected int quantidade;
    protected int estoqueMinimo;
    protected int estoqueMaximo;

    public Peca(String decricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.decricao = decricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void mostrarEstoque() {
        System.out.println("Produto: " + decricao + " | Estoque atual: " + quantidade);
    }

    public abstract void venda();

    public void reposicaoEstoque(){
        if (this.quantidade < this.estoqueMinimo) {
            this.quantidade = this.estoqueMaximo;
        }
    }

    public String getDecricao() { return decricao; }
    public void setDecricao(String decricao) { this.decricao = decricao; }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }
    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }
    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }
}
