import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Aqui irei praticar o uso do switch-case

        // Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1= domingo,
        // 2 = segunda, e assim por diante). Escrever na tela o dia da semana correspondente.


        // Inicializa um Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário para digitar um número de 1 a 7
        System.out.println("Digite um numero: ");

        // Lê o número digitado e armazena na variável 'x'
        int x = sc.nextInt();

        // Declara uma variável 'dia' para armazenar o nome do dia da semana correspondente
        String dia;

        // Usa um bloco switch-case para determinar o dia da semana com base no valor de 'x'
        switch (x) {
            case 1:
                dia = "Domingo";
                break; // O "break" é obrigatório pois interrompe a execução após o "case", evitando a queda para os casos seguintes.
            case 2:
                dia = "Segunda-Feira";
                break;
            case 3:
                dia = "Terça-Feira";
                break;
            case 4:
                dia = "Quarta-Feira";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6:
                dia = "Sexta-Feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido."; // se o x não for de 1 a 7, é retornado a seguinte mensagem "Dia da semana: Valor inválido.
                break;
        }

        // Exibe o dia da semana correspondente na tela
        System.out.println("Dia da semana: " + dia);

        // Fecha o Scanner para liberar recursos
        sc.close();

    }
}