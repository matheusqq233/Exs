package aula1;
public class Ex050 {   
    public static void main(String[] args) {
        
        for(int i = 0;i<=50;i+=2){
            System.out.printf("%d", i);
            if(i!=50){
                System.out.print(",");
            }else{
            System.out.printf(". Fim!!");
        }
        }
    }
    
}
