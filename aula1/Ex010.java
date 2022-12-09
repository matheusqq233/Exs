package aula1;

import java.util.Scanner;
public class Ex010 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double f = read.nextDouble();
        
        double c = (f-32)*(5/9.0);
        
        System.out.printf("%.2f °F = %.2f °C", f,c);
    }
    
}
