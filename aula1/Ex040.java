package aula1;

import java.util.Scanner;
public class Ex040 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("INICIO: ");
        int inicio = read.nextInt();
        System.out.print("FIM: ");
        int fim = read.nextInt();
        System.out.print("SALTO: ");
        int salto = read.nextInt();
        
        while(inicio <= fim){
            System.out.printf("%d ", inicio);
            inicio = inicio + salto;
        }
    }
    
}
