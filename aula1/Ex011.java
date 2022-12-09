package aula1;

import java.util.Scanner;
public class Ex011 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = read.nextInt();
        
        System.out.print("Digite outro numero: ");
        int n2 = read.nextInt();
        
        System.out.printf("o maior valor é %d", n1>n2 ? n1:n2);
    }
    
}
