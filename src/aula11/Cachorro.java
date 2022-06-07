package aula11;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Au au";
    }

    public String correr() {
        return "cachorro correndo";
    }
}
