import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // nesse exercicio fizemos um programa que calcula a nota final do aluno.


        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        // aqui somamos as variaveis nota1 e nota2 e imprimimos o resultado com 1 casa decimal.
        double notaFinal = nota1 + nota2;
        System.out.printf("Nota final =  %.1f%n", notaFinal);

        // caso a nota final seja menor que 60.0 o aluno é reprovado.
        if (notaFinal < 60.0) {
            System.out.println("Reprovado");
        }
    }
}