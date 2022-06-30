package aula20;

public class Sede implements Estado {
    private Tamagochi tamagochi;
    public Sede(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void comer() {
        // nada acontece
    }

    @Override
    public void beber() {
        tamagochi.setEstado(new Feliz());
        // nada acontece

    }

    @Override
    public void carinho() {
        // nada acontece

    }
}
