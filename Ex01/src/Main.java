import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("======== SEJA BEM-VINDO ========\n");


        System.out.println("Insira o número do produto: ");
        int cod1 = sc.nextInt();

        System.out.println("Insira a quantidade de produtos: ");
        int qntd1 = sc.nextInt();

        System.out.println("Insira o preço do produto: ");
        double preco1 = sc.nextDouble();

        System.out.println("Insira o número do produto: ");
        int cod2 = sc.nextInt();

        System.out.println("Insira a quantidade de produtos: ");
        int qntd2 = sc.nextInt();

        System.out.println("Insira o preço do produto: ");
        double preco2 = sc.nextDouble();


        System.out.println("CALCULANDO PREÇO... ");


        double total = qntd1 * preco1 + qntd2 * preco2;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();


    }
}