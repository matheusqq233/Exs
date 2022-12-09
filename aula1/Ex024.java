package aula1;


import java.util.Scanner;
public class Ex024 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a 1 nota: ");
        float nota = read.nextFloat();
        System.out.print("Digite a 2 nota: ");
        float nota2 = read.nextFloat();
        
        float m = (nota+nota2)/2;
        
        if(m<=4.9){
            System.out.printf("Sua média foi %.2f REPROVADO!!",m);
        }else if(m>=5 && m<=6.9){
            System.out.printf("Sua média foi %.2f RECUPERAÇÃO!!",m);
        } else{
            System.out.printf("Sua média foi %.2f APROVADO!!",m);     
        }
        }
        
    }
    

