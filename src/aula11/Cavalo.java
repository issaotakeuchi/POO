package aula11;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "hinn in in";
    }
    public String correr() {
        return "cavalo correndo";
    }
}
