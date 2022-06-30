package MesaAula20;

public class Fechado implements Estado {
    private Carrinho carrinho;
    public Fechado(Carrinho carrinho) {
        this.carrinho = carrinho;
//        System.out.println("fechado");
    }

    @Override
    public void adicionaProduto(Produto produto) {
        throw new IllegalStateException("não aceita mais a inclusão de produtos");
    }

    @Override
    public void cancelaCarrinho() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("esta vazio");
    }

    @Override
    public void retornaPontoAnterior() {
        throw new IllegalStateException("não é possível. A compra já está fechada");
    }

    @Override
    public void vaParaProximoEstado() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("indo para vazio");
    }
}
