package aula1;
import java.util.Scanner;
public class Ex046 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int idade,idades = 0, acima_de_21 = 0;
        String r;
        float soma = 0;
        
        do{
            System.out.print("DIGITE ALGUMA IDADE: ");
            idade = read.nextInt();
            idades++;
            soma += idade;
            
            if(idade >= 21){
                acima_de_21++;
            }
            System.out.print("DESEJA CONTINUAR [S/N]? ");
            r = read.next();
            
            while(!r.equals("S") && !r.equals("N")){
                System.out.print("RESPOSTA INVÁLIDA. TENTE NOVAMENTE.");
                System.out.print("Deseja continuar[(S/N)]? ");
                r = read.next();  
            }
            
        }while(r.equals("S"));

       
        System.out.printf("O TOTAL DE IDADES DIGITADAS: %d\n", idades);
        System.out.printf("O TOTAL DE IDADES ACIMA DE 21: %d\n", acima_de_21);
        System.out.printf("A MEDIA DE IDADE: %.2f\n", soma/idades);
                

    }
}


