import java.util.Scanner;

public class aula2ExercicioMesaDeTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("maior numero entre 3 - digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("maior numero entre 3 - digite um número: ");
        int numero2 = scanner.nextInt();

        System.out.println("maior numero entre 3 - digite um número: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número é o " + numero1);
        }
        else if (numero2 > numero3) {
            System.out.println("O maior número é o " + numero2);
        } else {
            System.out.println("O maior número é o " + numero3);
        }
    }
}
