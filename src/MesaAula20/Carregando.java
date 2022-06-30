package MesaAula20;

public class Carregando implements Estado {
    private Carrinho carrinho;
    public Carregando(Carrinho carrinho) {
        this.carrinho = carrinho;
//        System.out.println("carregando");
    }

    @Override
    public void adicionaProduto(Produto produto) {
        carrinho.addProduto(produto);
        System.out.println("adicionando produtos");
    }

    @Override
    public void cancelaCarrinho() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("esta vazio");
    }

    @Override
    public void retornaPontoAnterior() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("retorna para vazio");
    }

    @Override
    public void vaParaProximoEstado() {
        carrinho.setEstado(new Pagando(carrinho));
        System.out.println("indo para pagamento");
    }
}
