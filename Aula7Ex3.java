package aulas;

import java.util.Scanner;
public class Aula7Ex3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
         int t = 1;
         String r;
        
        System.out.print("Digite um valor: ");
        int n = read.nextInt();
        
        for(int i = 0;i <= 10;i++){
            System.out.print("\n"+i + " x " + n + " = " + i*n);
        }
        
        System.out.print("\nDeseja continuar? (S)/(N): ");
        r = read.next();
        
        while(r.equals("S")){
         System.out.print("\nDigite um valor: ");
         n = read.nextInt();
         
            for(int i = 0;i <= 10;i++){
            System.out.print("\n"+i + " x " + n + " = " + i*n);
            }  
            
        System.out.print("\nDeseja continuar? (S)/(N): ");
        r = read.next();
        }
        
        while(!r.equals("S") && !r.equals("N")){
         System.out.print("RESPOSTA INVÁLIDA. TENTE NOVAMENTE.");
         System.out.print("Deseja continuar? (S/N)");
         r = read.next();
    }
        
         while(r.equals("S")){
         System.out.print("\nDigite um valor: ");
         n = read.nextInt();
         
            for(int i = 0;i <= 10;i++){
            System.out.print("\n"+i + " x " + n + " = " + i*n);
            }
            
        System.out.print("\nDeseja continuar? (S)/(N): ");
        r = read.next();
        }
        
    }
}


