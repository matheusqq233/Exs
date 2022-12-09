package aula1;


import java.util.Scanner;
public class Ex015 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.print("Digite um numero entre 1 e 5: ");
        int n1 = read.nextInt();
        
        double aleatorio = 1+ Math.random()*(5-1);
        int n = (int)aleatorio;
        
        System.out.printf("Seu número: %s\n ", n1);
        System.out.printf("Número da máquina: %s\n", n);
        
        System.out.printf("%s", n1==n ? "Você acertou":"Você errou" );
    }
    
}
