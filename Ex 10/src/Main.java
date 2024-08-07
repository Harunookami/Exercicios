import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        // incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        // impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        Scanner sc = new Scanner(System.in);

        int senha = 0;

        // Loop que continua solicitando a senha até que a senha correta seja inserida
        while (senha != 2002) {
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();

            // Verifica se a senha inserida é diferente da senha correta
            if ( senha != 2002 ) {
                System.out.println("Acesso inválido. Por favor, tente novamente.");
            }
        }

        System.out.println("Acesso permitido. Seja bem-vindo!");
        sc.close();
    }
}