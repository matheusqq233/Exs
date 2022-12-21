package aulas;

public class T01 {

    static int soma(int x, int y){
    int s = x + y;
    return s;
}
    public static void main(String[] args) {
        int s = soma(3,7);
        System.out.printf("A soma vale %d\n", s);
    }
}
