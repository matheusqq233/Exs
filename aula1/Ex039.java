package aula1;

import java.util.Scanner;
public class Ex039 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = 30;
        while(a>=1){
            if(a % 4 == 0){
            System.out.printf("[%d]",a);
            }else{
                System.out.printf(" %d ",a);
            }
        a--;
            
        
            
        }
    }
}
