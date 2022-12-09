package aula1;


import java.util.Scanner;
public class Ex012 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = read.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double n2 = read.nextDouble();
        
        System.out.printf("%.2f", n1>n2 ? n1-n2:n1+n2 );
    }
}
