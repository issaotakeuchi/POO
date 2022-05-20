import java.util.Scanner;

public class aula3Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informar a quantidade de numeros primos que deseja visualizar (de forma crescente): ");
        int valor = scanner.nextInt();

        for (int i = 1; i <= valor; i++){
       //     for (int primos = 0; primos = valor; primos++){
                if (ehPrimo(valor)){
                    System.out.println(valor);
                }
            }
        }

    //}

    private static boolean ehPrimo(int valor) {
        boolean primo = true;
        for (int i=2; i<valor; i++) {
            if (valor % i == 0) {
                primo = false;
                break;
            }

        }
        return primo;


    }

}

