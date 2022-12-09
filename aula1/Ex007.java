package aula1;

import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Cateto adjacente =  ");
        double CA = read.nextDouble();
        System.out.print("Cateto oposto = ");
        double CO = read.nextDouble();
        
        double H = Math.sqrt(Math.pow(CA, 2) + Math.pow(CO, 2));
        System.out.printf("Hipotenusa = %.2f", H);
        
    }
}
