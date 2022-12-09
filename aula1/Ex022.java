package aula1;



import java.util.Scanner;
import java.io.PrintStream;
public class Ex022 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("           CRIANÇA ESPERANÇA            ");
        System.out.println("=============================");
        System.out.println("Selecione uma das opções abaixo       ");
        System.out.println("[1] - doar R$10,00;                                ");
        System.out.println("[2] - doar R$25,00;                                ");
        System.out.println("[3] - doar R$50,00;                                ");
        System.out.println("[4] - doar outros valores;                       ");
        System.out.println("[5] - cancelar.                                        ");
        System.out.println("=============================");
        System.out.println("Qual opção você deseja escolher?       ");
        int escolha = read.nextInt();
        
        switch (escolha){
            case 1:
                System.out.print("Parabéns você acaba de doar 10R$!!");
                break;
            case 2:
                System.out.print("Parabéns você acaba de doar 25R$!!");
                break;
            case 3:
                System.out.print("Parabéns você acaba de doar 50R$!!");
                break;
            case 4:
                System.out.print("Digite um valor para doar: ");
                float valor = read.nextFloat();
                System.out.printf("Parabéns você acaba de doar %.2fR$!!! ", valor);
                break;
            case 5:
                System.out.println("Operação cancelada!!");
                break;
            default:
                System.out.print("Opção inválida");
        }

    }
    
}
