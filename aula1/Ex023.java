package aula1;


import java.util.Scanner;
public class Ex023 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = read.nextInt();
        System.out.print("Digite outro valor: ");
        int n2 = read.nextInt();
        
        if(n>n2){
            System.out.println("Primeiro valor é maior!");
        }
        if(n<n2){
            System.out.println("O segundo valor é maior!!");
        }
            if(n==n2){
                System.out.println("Não exite valor maior, os dois são iguais!!");
            }
                
            
        
        
    }
    
}
