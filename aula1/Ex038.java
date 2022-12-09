package aula1;

import java.util.Scanner;
public class Ex038 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int a = 0;
        System.out.print("Digite um número inteiro e positivo maior que zero: ");
        int b = read.nextInt();
        while(b<= 0 ){
            System.out.print("RESPOSTA INVÁLIDA!\n");
            System.out.print("Digite um número inteiro e positivo maior que zero: ");
            b = read.nextInt();
        }
        
        while(b>a){
            a++;
            System.out.print(a + " ");
            
        }
        System.out.println("\nACABOU!!");
    }
    
}