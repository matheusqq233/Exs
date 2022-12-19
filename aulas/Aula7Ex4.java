package aulas;

import java.util.Scanner;
public class Aula7Ex4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = read.nextInt();
        
        for (int i = 0;i<=valor;i++){
            System.out.print(i + " ");
        }
        System.out.print("\nAcabou!!\n");
    }
    
}
