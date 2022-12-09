package aula1;

import java.util.Scanner;
public class Ex051 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int t = 1;
        
        System.out.print("Digite um valor: ");
        int n = read.nextInt();
        
        for(int i = 0;i <= 10;i++){
            System.out.print("\n"+i + " x " + n + " = " + i*n);
        }
    }
}
