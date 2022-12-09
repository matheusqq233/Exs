package aula1;

import java.util.Scanner;
public class Ex036 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        int a = 0;
        while(a<=20){
            System.out.print(a + " ");
            a += 3;
        }
        System.out.println("\nACABOU!!");
    }
    
}