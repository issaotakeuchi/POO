package MesaAula12;

import aula12.Secretaria;

public class Teste {

    public static void main(String[] args) {
        Administrativo fulanoDeTal = new Administrativo("fulano", 1000.00, "noturno", 100.00);
        Tecnico ciclano = new Tecnico("ciclano", 2000.00, 5000.00);
        Assistente beltrana = new Assistente("Beltrana", 1000.00, "123");


        System.out.println("ganho anual de " + fulanoDeTal.getNome() + " é de " + fulanoDeTal.ganhoAnual());
        System.out.println("ganho anual de " + ciclano.getNome() + " é de " + ciclano.ganhoAnual());
        beltrana.exibeDados();



    }
}
