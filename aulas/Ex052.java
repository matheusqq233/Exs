package aulas;
import java.util.Scanner;
public class Ex052 {
    public static void main(String[] args) {
        
    
        Scanner read = new Scanner(System.in);
        System.out.print("INICIO: ");
        int inicio = read.nextInt();
        System.out.print("FIM: ");
        int fim = read.nextInt();
        System.out.print("SALTO: ");
        int salto = read.nextInt();
        
        while(salto < 0){
            System.out.print("\n****Resposta inválida ****\n");
            System.out.print("Salto: ");
            salto = read.nextInt();
        }
           if(inicio<=fim){
            for(int i = inicio; i<=fim;i+=salto){
            System.out.printf(" %d ",i);
       }
       }else{
               for(int e = inicio;e>=fim;e-=salto){
                   System.out.printf(" %d ",e);
               }
           }
}
}
       

