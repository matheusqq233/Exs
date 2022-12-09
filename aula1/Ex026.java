package aula1;

import java.util.Scanner;
public class Ex026 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o nome do funcionario: ");
        String nome = read.nextLine();
        System.out.print("Digite o sálario do funcionario: ");
        float s = read.nextFloat();
        System.out.print("A quanto tempo ele está na empresa(anos)? ");
        int temp = read.nextInt();
        
        if(temp<3){
            System.out.printf("Seu novo sálario é: R$%.2f",s+(s*0.03));
        }else if(temp>=3 && temp<=10){
            System.out.printf("Seu novo sálario é: R$%.2f",s+(s*12.5/100));
        } 
        else{
            System.out.printf("Seu novo sálario é: R$%.2f",s+(s*20/100));
        }
    }
    
}
