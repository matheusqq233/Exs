package aula1;


import java.util.Scanner;
public class Ex025 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a largura do terreno: ");
        float l = read.nextFloat();
        System.out.print("Digite o comprimento do terreno: ");
        float c = read.nextFloat();
        
        float t = (l*c);
        
        if(t<100){
            System.out.println("Terreno popular");
        }else if(t>=100 && t<=500){
            System.out.println("Terreno Master");
            
        }else{
            System.out.println("Terreno VIP");
        }
    }
    
}
