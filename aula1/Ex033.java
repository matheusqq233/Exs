package aula1;


import java.util.Scanner;
public class Ex033 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cont = 1;
        int n,fat = 1;
        
        do{
        System.out.print("Digite um número: ");
         n = read.nextInt();
        
        for(int i = 1;i <= n; i++){
            fat = fat * i;
        }
        
            System.out.println("!"+n+"="+fat);
            cont++;
                    
        }while(cont<2);
    }
}
        
         
        
    
    

