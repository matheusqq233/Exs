package aula1;

import java.util.Scanner;
public class Ex047 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int n,par = 0,ns = 0;
        String r;
        float soma = 0, menor = 12000;
        
        do{
            System.out.print("DIGITE ALGUM NÚMERO: ");
            n = read.nextInt();
            ns++;
            soma += n;
            
            if(ns == 0){
                menor = n;
            }
            if(ns != 0 && n < menor){
                menor = n;
            }
            if(n % 2 == 0){
                    par++;
            }
            System.out.println("======================");
            System.out.println("       ESCOLHA        ");
            System.out.println("======================");
            System.out.println("DESEJA CONTINUAR?     ");
            System.out.println("[S] CONTINUAR         ");
            System.out.println("[N] PARAR             ");
            System.out.println("======================");
            System.out.print("  =>  QUAL SUA OPÇÃO? ");
            r = read.next();
            
            while(!r.equals("S") && !r.equals("N")){
                System.out.print("RESPOSTA INVÁLIDA. TENTE NOVAMENTE.");
                System.out.print("Deseja continuar[(S/N)]? ");
                r = read.next();  
            }
            
        }while(r.equals("S"));
        
        System.out.printf("A SOMA DE TODOS OS NUMEROS: %.2f\n ", soma);
        System.out.printf("A QUANTIDADE DE NÚMEROS PARES: %d\n ", par);
        System.out.printf("MEDIA: %.2f\n", soma/ns);
        System.out.printf("O MENOR VALOR DIGITADO É: %.2f\n", menor);
                

    }
}