package MesaAula14;

import java.util.Set;
import java.util.TreeSet;

public class PortoDeBuenosAires {
    private Set<Conteiner> conteineres;
    public PortoDeBuenosAires(){
        this.conteineres = new TreeSet<>();
    }
    public void permitirEntrada(Conteiner conteiner) {
        conteineres.add(conteiner);
    }
    public Set<Conteiner> mostrarConteineresOrdenados() {
        return conteineres;
    }
    public int verQuantidadeConteineresPerigosos() {
        int conteinerPerigoso = 0;
        for (Conteiner conteiner: mostrarConteineresOrdenados()) {
            if (conteiner.isMarcaPerigo()) {
                conteinerPerigoso++;
            }
        }
        return conteinerPerigoso;
    }
}
