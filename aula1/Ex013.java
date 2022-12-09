package aula1;

import java.util.Scanner;
public class Ex013 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o ano em que você nasceu: ");
        int ano = read.nextInt();
        int idade = 2022 - ano;
        
        System.out.printf("você tem %d anos\n", idade);
        System.out.printf("%s", idade >= 18 ? "MAIOR DE IDADE":"MENOR DE IDADE");
       
    }
    
}
