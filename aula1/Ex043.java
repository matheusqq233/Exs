package aula1;

import java.util.Scanner;
public class Ex043 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int soma = 0, n = 0;
        String r;
        do{
        System.out.print("DIGITE UM NUMERO: ");
         n = read.nextInt();
          soma += n;
            System.out.print("DESEJA DIGITAR OUTRO NUMERO S/N: ");
             r = read.next();
             while(!r.equals("S") && !r.equals("N")){
                 System.out.print("RESPOSTA INVÁLIDA. TENTE NOVAMENTE.");
                 System.out.print("Deseja continuar? (S/N)");
                 r = read.next();
             }
        }while(r.equals("S"));
        System.out.printf("A soma de todos os numeros foi %d", soma);
    }
        
    
}
