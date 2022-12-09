package aula1;


import java.util.Scanner;
public class Ex027 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Tamanho da reta 1: ");
        float r1 = read.nextFloat();
        System.out.print("Tamanho da reta 2: ");
        float r2 = read.nextFloat();
        System.out.print("Tamanho da reta 3: ");
        float r3 = read.nextFloat();

        boolean V1 = (r1< r2+r3);
        boolean V2 = (r2< r1+r3);
        boolean V3 = (r3< r1+r2);
        
        if(V1 && V2 && V3){
            System.out.println("R1,R2 e R3 conseguem gerar um triângulo!");
        }else {
            System.out.println("R1,R2 e R3 não conseguem gerar um triângulo!");
        }
    }
    
}
