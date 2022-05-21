import java.util.Scanner;

public class aula3Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("jogador 1 - escolha entre pedra (1), papel (2) e tesoura (3): ");
        int opcaoJogador1 = scanner.nextInt();
        System.out.println("jogador 2 - escolha entre pedra (1), papel (2) e tesoura (3): ");
        int opcaoJogador2 = scanner.nextInt();

        if (quemGanha(opcaoJogador1, opcaoJogador2) == 0) {
            System.out.println("empate");
        } else if (quemGanha(opcaoJogador1, opcaoJogador2) == 1) {
            System.out.println("jopgador 1 venceu");
        } else if (quemGanha(opcaoJogador1, opcaoJogador2) == 2) {
            System.out.println("jogador 2 venceu");
        }
    }

    private static int quemGanha ( int opcaoJogador1, int opcaoJogador2) {
        int vencedor = 0;
        if (opcaoJogador1 == 1 && opcaoJogador2 == 1){
            vencedor = 0;
        } else if (opcaoJogador1 == 1 && opcaoJogador2 == 2) {
            vencedor = 2;
        } else if (opcaoJogador1 == 1 && opcaoJogador2 == 3) {
            vencedor = 1;
        } else if (opcaoJogador1 == 2 && opcaoJogador2 == 2) {
            vencedor =  0;
        } else if (opcaoJogador1 == 2 && opcaoJogador2 == 1) {
            vencedor = 1;
        } else if (opcaoJogador1 == 2 && opcaoJogador2 == 3) {
            vencedor = 2;
        } else if (opcaoJogador1 == 3 && opcaoJogador2 == 3) {
            vencedor =  0;
        } else if (opcaoJogador1 == 3 && opcaoJogador2 == 1) {
            vencedor = 2;
        } else if (opcaoJogador1 == 3 && opcaoJogador2 == 2) {
            vencedor = 1;
        }
        return vencedor;
    }
}
