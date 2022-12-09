
package aula1; 

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
                
        System.out.print("Qual o seu nome? ");
        String nome = keyboard.nextLine();
        System.out.print("Qual foi a sua nota? ");
        float nota = keyboard.nextFloat();
        System.out.printf("%s sua nota é %.2f!", nome , nota);
         
    }
    
}
