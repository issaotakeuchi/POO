package MesaAula20;

public class Pagando implements Estado {
    private Carrinho carrinho;
    public Pagando(Carrinho carrinho) {

        this.carrinho = carrinho;
//        System.out.println("pagando");
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
        carrinho.setEstado(new Carregando(carrinho));
        System.out.println("retorna para carregando");
    }

    @Override
    public void vaParaProximoEstado() {
        carrinho.setEstado(new Fechado(carrinho));
        System.out.println("indo para fechamento");
    }
}
