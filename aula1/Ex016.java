package aula1;



import java.util.Scanner;
public class Ex016 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = read.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float nota2 = read.nextFloat();
        
        float media = (nota1+nota2)/2;
        System.out.printf("sua média foi de %.2f", media);
        
        if (media>=9){
            System.out.print("\nAprovado!");
        }
        else{
           System.out.print("\nReprovado!");
                    
         
        }
        
        
    }
    
}
