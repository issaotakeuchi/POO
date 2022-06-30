package MesaAula20;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho(); //vazio
//        carrinho.adicionaProduto(new Produto("agua", 10)); //erro
        carrinho.vaParaProximoEstado(); //carregando
        carrinho.retornaPontoAnterior(); //vazio
        carrinho.cancelaCarrinho(); //vazio
        carrinho.vaParaProximoEstado();
        carrinho.adicionaProduto(new Produto("agua", 10)); //add produto
        carrinho.adicionaProduto(new Produto("carne", 50)); //add produto
        System.out.println(carrinho.getProdutos());
//        carrinho.cancelaCarrinho(); //vazio
//        carrinho.retornaPontoAnterior(); //vazio
        carrinho.vaParaProximoEstado(); //pagando
//        carrinho.retornaPontoAnterior(); //carregando
//        carrinho.cancelaCarrinho(); //vazio
//        carrinho.adicionaProduto(new Produto("bolacha", 5.00)); //erro
        carrinho.vaParaProximoEstado(); //fechamento
//        carrinho.adicionaProduto(new Produto("miojo", 5)); //erro
//        carrinho.retornaPontoAnterior(); //erro
        carrinho.vaParaProximoEstado();


    }
}
