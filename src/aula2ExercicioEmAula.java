import java.util.Scanner;

public class aula2ExercicioEmAula {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("digite o seu nome: ");
            String nome = scanner.next();
            System.out.println("digite o seu sobrenome: ");
            String sobrenome = scanner.next();
            String iniciais = "" + nome.charAt(0) + sobrenome.charAt(0);
            //aspas duplas é um artificio tecnico que converterá char concatenados em string
            System.out.println("digite o dia do seu nascimento: ");
            int dia = scanner.nextInt();
            System.out.println("digite o mês do seu nascimento: ");
            int mes = scanner.nextInt();
            System.out.println("digite o ano do seu nascimento: ");
            int ano = scanner.nextInt();

            System.out.println("seu nome é: " + nome + " " + iniciais + " " + sobrenome);
            System.out.println("minha data de nascimento: " + dia + "/" + mes + "/" + ano);

        }
}
