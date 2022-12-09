package aula1;

import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int x = read.nextInt();
        int prox = x + 1;
        int ante = x - 1;
        System.out.printf("X = %d\n", x);
        System.out.printf("X + 1 = %d\n", prox);
        System.out.printf("X - 1 = %d\n", ante);
        
    }
    
}
