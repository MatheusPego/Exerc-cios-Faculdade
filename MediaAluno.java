import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno: " + nome);
        System.out.println("A média da sua nota é: " + media);

        sc.close();
    }
}
