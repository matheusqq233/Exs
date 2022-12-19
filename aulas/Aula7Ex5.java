package aulas;

import java.util.Scanner;
public class Aula7Ex5 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String sexo_M;
        String sexo_F;
        for(int i = 1;i<=8;i++){
        
        System.out.print("Digite o sexo da pessoa(M)/(F): ");
        String sexo = read.next();
         
        while(!sexo.equals("M") && !sexo.equals("F")){
         System.out.print("RESPOSTA INVÁLIDA. TENTE NOVAMENTE.");
         System.out.print("Digite o sexo da pessoa(M)/(F): ");
         sexo = read.next();
    }
        
        System.out.print("Digite o peso da pessoa: ");
        float peso = read.nextFloat();
        
        if(sexo==sexo_M){
            
        }
    }
        System.out.printf("");
    }
    
}
