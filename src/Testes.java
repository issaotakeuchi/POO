import java.time.LocalDate;

public class Testes {

    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Issao", "ittakeuchi");
        UsuarioJogo usuario2 = new UsuarioJogo("Daniel", "dfontoura");

        usuario1.aumentarPontuacao();
        usuario1.aumentarPontuacao();
        usuario1.bonus(10);
        usuario1.subirNivel();

        usuario2.aumentarPontuacao();
        usuario2.aumentarPontuacao();
        usuario2.aumentarPontuacao();
        usuario2.aumentarPontuacao();
        usuario2.bonus(15);
        usuario2.subirNivel();
        usuario2.subirNivel();
        usuario2.subirNivel();


        System.out.println(usuario1.getNome() + " sua pontuacao é de: " + usuario1.getPontuacao() + " e seu nível é: " + usuario1.getNivel());
        System.out.println(usuario2.getNickname() + " sua pontuacao é de: " + usuario2.getPontuacao() + " e seu nível é: " + usuario2.getNivel());

        Cachorro stella = new Cachorro("Stella","SRD", 2021, 14.0, true, false);

        System.out.println(stella.aptoParaAdotar());
        System.out.println(stella.validar());
        System.out.println(stella.getNome() + " tem " + stella.idadeCachorro() + " ano(s) de idade");



    }







}

