package aulas;


import java.util.Scanner;
public class Ex054 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String mes[] = {"Janeiro", "Fevereiro","Março","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        System.out.print("Digite um número: ");
        int n = read.nextInt();
        
        while(n<=0 || n>=13){
            System.out.print("Digite um número de 1 a 12: ");
            n = read.nextInt();
        }
        
        System.out.printf("Esse valor representa o mês %s.",mes[n-1]);
        System.out.printf("\n%s possui %d dias",mes[n-1], dias[n-1]);
    }
    
}
