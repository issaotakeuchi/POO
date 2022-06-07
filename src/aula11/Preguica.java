package aula11;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "xpto";
    }
    public String subirEmArvore() {
        return "bicho preguiça subindo";
    }
}
