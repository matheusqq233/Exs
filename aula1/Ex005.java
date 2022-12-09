package aula1;

import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("N1 = ");
        int N1 = read.nextInt();
        System.out.print("N2= ");
        int N2 = read.nextInt();
        
        System.out.printf("N1 + N2 = %d\n", N1+N2);  
        System.out.printf("N1 - N2 = %d\n", N1-N2);  
        System.out.printf("N1 * N2 = %d\n", N1*N2);  
        System.out.printf("N1 / N2 = %d\n", N1/N2); 
        
    }
    
}
