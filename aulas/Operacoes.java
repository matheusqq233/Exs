package aulas;

public class Operacoes {
    
    public static String contador(int inicio, int fim, int salto){
        String s = "";
        for(int contador = inicio; contador <= fim; contador+=salto){
            s += contador + " ";
        }
    return s;
    }
}
