import java.util.Scanner;

public class aula3Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite quantos números primos deseja visualizar (em ordem crescente): ");
        int valor = scanner.nextInt();

        int primos = 0;
        int naoPrimos = 0;
        int todosOsNumeros = 0;

        for (int numeroContador = 2; (todosOsNumeros - naoPrimos) < valor; numeroContador++){
            if (ehPrimo(numeroContador)) {
                System.out.println(numeroContador);
                primos++;
                naoPrimos = naoPrimos;
                todosOsNumeros = primos + naoPrimos;
            } else {
                naoPrimos++;
                primos = primos;
                todosOsNumeros = primos + naoPrimos;
            }
        }

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




