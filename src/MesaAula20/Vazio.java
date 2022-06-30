package MesaAula20;

public class Vazio implements Estado {
    private Carrinho carrinho;
    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
//        System.out.println("carrinho vazio");
    }

    @Override
    public void adicionaProduto(Produto produto) {
        throw new IllegalStateException("vá para o próximo passo para começar a comprar");
    }

    @Override
    public void cancelaCarrinho() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("esta vazio");
    }

    @Override
    public void retornaPontoAnterior() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("volta/mantem vazio");
    }

    @Override
    public void vaParaProximoEstado() {
        carrinho.setEstado(new Carregando(carrinho));
        System.out.println("vai para carregando carrinho");
    }
}
