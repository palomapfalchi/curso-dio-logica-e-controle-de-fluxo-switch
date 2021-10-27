import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Criando variáveis e expressões para
        usar com if e switch */

        //exibir mês do ano de acordo com um número

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o mês desejado: ");
        int mes = scanner.nextInt();


        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Número inválido!");
        }

        switch (mes) {
            case 1:
            case 7:
            case 12:
                System.out.println("Estou de férias!");
                break;
            default:
        }

        switch(mes) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo!");
                break;
            case 4:
                System.out.println("Errado!");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }

    }
}
