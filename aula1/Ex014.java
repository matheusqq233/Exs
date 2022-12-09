package aula1;


import java.util.Scanner;
public class Ex014 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o ano em que você nasceu: ");
        int ano = read.nextInt();
        
        int idade = 2022 - ano;
        
        System.out.printf("você tem %d anos\n", idade);
        System.out.printf("%s", idade >= 16 && idade < 18 || (idade >= 70)? "OPCIONAL":"OBRIGATORIO");
    }
    
}
