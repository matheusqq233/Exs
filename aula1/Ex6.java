package aula1;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        double R = read.nextFloat();
        double C = 2*Math.PI * R;
        double A = Math.PI + Math.pow(R, 2);
        System.out.printf("C = %.2f ", C);
        System.out.printf("A = %.2f", A);
        
    }
    
}
