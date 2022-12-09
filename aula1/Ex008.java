package aula1;

import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o cateto: ");
        double c = read.nextDouble();
        System.out.print("Digite a hipotenusa: ");
        double h = read.nextDouble();
        
        double p = Math.sqrt(Math.pow(h, 2) - Math.pow(c, 2));
        
        double co = Math.sqrt(p);
        
        System.out.printf("Cateto = %.2f ", co);
    }
    
}
