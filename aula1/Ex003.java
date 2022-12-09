package aula1;

import java.util.Scanner;
public class Ex003 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        float N1 = read.nextFloat();
        
        System.out.print("Digite o segundo valor: ");
        float N2 = read.nextFloat();
        
        float M = (N1 + N2)/2;
        
        System.out.printf("A média entre %.2f e %.2f é %.2f",N1,N2,M);
    }
}
