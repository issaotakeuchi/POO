package MesaAula20;

public interface Estado {
    void adicionaProduto(Produto produto);
    void cancelaCarrinho();
    void retornaPontoAnterior();
    void vaParaProximoEstado();


}
