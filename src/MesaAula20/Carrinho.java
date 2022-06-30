package MesaAula20;


import java.util.ArrayList;
import java.util.List;

public class Carrinho {
        private Estado estado;
        private List<Produto> produtos;

        public Carrinho() {
            this.estado = new Vazio(this);
            this.produtos = new ArrayList<>();
        }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
    public void adicionaProduto(Produto produto) {estado.adicionaProduto(produto);};
    public void cancelaCarrinho() {estado.cancelaCarrinho();};
    public void retornaPontoAnterior() {estado.retornaPontoAnterior();};
    public void vaParaProximoEstado() {estado.vaParaProximoEstado();};

    public List<Produto> getProdutos() {
        return produtos;
    }
    public void addProduto(Produto produto) {produtos.add(produto);}

    @Override
    public String toString() {
        return "Carrinho{" +
                "estado=" + estado +
                ", produtos=" + produtos +
                '}';
    }
}



