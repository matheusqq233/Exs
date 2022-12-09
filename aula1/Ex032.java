package aula1;

import java.util.Scanner;
public class Ex032 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = -1;
        while(a<10){
           a++;
        if(a==4 || a==5){
            continue;
        }
            
            if(a==7){
                break;
            }
            System.out.print(a + " ");
        
            
        
            }
    }
    
}
