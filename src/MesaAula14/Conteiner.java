package MesaAula14;

import java.util.Objects;

public class Conteiner implements  Comparable<Conteiner> {
    private int id;
    private String descricao;
    private String paisOrigem;
    private boolean marcaPerigo;

    public Conteiner(int id, String descricao, String paisOrigem, boolean marcaPerigo) {
        this.id = id;
        this.descricao = descricao;
        this.paisOrigem = paisOrigem;
        this.marcaPerigo = marcaPerigo;
    }

    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public String getPaisOrigem() { return paisOrigem; }
    public boolean isMarcaPerigo() { return marcaPerigo; }

    @Override
    public String toString() {
        return "Conteiner número: " + id + ", descrição: " + descricao + " e país de origem: " + paisOrigem;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((Conteiner) obj).id && Objects.equals(paisOrigem, ((Conteiner) obj).paisOrigem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paisOrigem, id);
    }

    @Override
    public int compareTo(Conteiner conteiner) {
        if (id > conteiner.id) return 1;
        if (id < conteiner.id) return -1;
        return 0;
    }

}
