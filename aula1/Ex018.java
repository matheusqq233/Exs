package aula1;


import java.util.Scanner;
public class Ex018 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = read.nextInt();
        
        if(n %2==0) {
            System.out.println("Par!");
        }
        else{
            System.out.println("Impar!");
        }
    }
    
}
