package aula1;

import java.util.Scanner;
public class Ex044 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int count_numero = 0, count_par = 0, count_impar = 0, acima_de_cem = 0;
        float soma = 0;
        float n;
        do{
            System.out.print("DIGITE UM NUMERO(DIGITE 0 PARA SAIR): ");  
            n = read.nextFloat();
            soma += n;
            
            if(n!=0){
                count_numero++;
            }
            
            if(n % 2 == 0 && n!=0){
                count_par++;
            }else{
                count_impar++;
            }
            if(n>=100){
                acima_de_cem++;
            }
        
            
        }while(n!=0);
        System.out.printf("OS VALORES DIGITADOS FORAM: %d\n ", count_numero);
        System.out.printf("O TOTAL DE PARES: %d\n", count_par);
        System.out.printf("O TOTAL DE IMPARES: %d\n", count_impar);
        System.out.printf("OS NÚMEROS ACIMA DE CEM FORAM: %d\n", acima_de_cem);
        System.out.printf("MÉDIA= %.2f\n", soma/count_numero);
       
    }
    
}