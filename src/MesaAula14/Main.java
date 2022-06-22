package MesaAula14;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Conteiner primeiro = new Conteiner(1,"xpto", "filipinas", false);
        Conteiner segundo = new Conteiner(2,"xwyz", "brasil", false);
        Conteiner terceiro = new Conteiner(3,"vxyz", "japão", true);
        Conteiner quarto = new Conteiner(4,"abcd", "grécia", true);

        PortoDeBuenosAires porto = new PortoDeBuenosAires();

        porto.permitirEntrada(primeiro);
        porto.permitirEntrada(segundo);
        porto.permitirEntrada(terceiro);
        porto.permitirEntrada(quarto);

        System.out.println("a quantidade de conteineres com marca de perigo é: " + porto.verQuantidadeConteineresPerigosos());

        Iterator<Conteiner> conteinerIterator = porto.mostrarConteineresOrdenados().iterator();

        for (Conteiner c: porto.mostrarConteineresOrdenados()) {
            System.out.println(c);
        }
    }
}
