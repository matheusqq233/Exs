package aula1;

import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor da esfera: ");
        double esf = read.nextDouble();
        
        double r = Math.cbrt((3*esf)/(4*Math.PI));
        
        System.out.printf("raio = %.2f", r);
    }
    
}
