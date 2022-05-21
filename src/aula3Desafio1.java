import java.util.Scanner;

public class aula3Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite quantos números primos deseja visualizar (em ordem crescente): ");
        int valor = scanner.nextInt();

        int primos = 0;
        int numeroContador = 2;

        do {
            if (valor < 1){
                System.out.println("digite uma quantidade a partir de 1");
            }
            else if (ehPrimo(numeroContador)) {
                System.out.println(numeroContador);
                primos++;
                numeroContador++;
            } else {
                numeroContador++;
            }
        } while (primos < valor);
    }

    private static boolean ehPrimo (int valor) {
        boolean primo = true;
        for (int i = 2; i<valor; i++) {
            if (valor % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

}