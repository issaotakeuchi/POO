package aula11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        ImpressoraEpson impressoraCanon = new ImpressoraEpson("cm1020", "usb", LocalDate.now(), 10, 100);

//        System.out.println(impressoraCanon.imprimeEpson());

        Cachorro stella = new Cachorro("Stella", 1);
        Cavalo campolina = new Cavalo("Campolina", 5);
        Preguica preguica = new Preguica("Preguiça", 2);

        System.out.println("a Stella faz " + stella.emitirSom());
        System.out.println(stella.correr());

        System.out.println("Campolina faz " + campolina.emitirSom());
        System.out.println(campolina.correr());

        System.out.println("preguiça faz " + preguica.emitirSom());
        System.out.println(preguica.subirEmArvore());


        //grupo 1: Arthur Campolina, Breno Sabino, Cristian Fernandes, Issao Takeuchi, Thiago Vilela, Victor Leao




    }
}
