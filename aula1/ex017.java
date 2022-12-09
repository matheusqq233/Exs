package aula1;

import java.util.Scanner;
public class ex017 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o ano em que você nasceu: ");
        int ano = read.nextInt();
        
        int idade = 2022 - ano;
        
        System.out.printf("você tem %d anos\n", idade);
        if (idade>=18) {
            System.out.println("Maior de idade! ");
        } 
        else {
            System.out.println("Menor de idade! ");
        
       
            
        }
    }
    
}