import java.util.Scanner;

public class aula2ExercicioMesaDeTrabalho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número para verificar se ele é primo: ");
        int numero = scanner.nextInt();
        int quantidadeDeDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                quantidadeDeDivisores++;
            }
        }
        if (quantidadeDeDivisores == 2) {
            System.out.println("o número é primo");
        } else {
            System.out.println("o numero não é primo");
        }
    }
}
