import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Seu Nome");
        String nome = scanner.next();

        System.out.println("Digite Seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite Sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite Sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("tenho  " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
