package aula1;

import java.util.Scanner;
public class T005 {
    public static void main(String[] args) {
        
        String nome1 = "Matheus"; 
        String nome2 = "Matheus";
        String nome3 = new String ("Matheus");
        String resultado1;
        String resultado2;
        String resultado3;
        
        resultado1 = (nome1 == nome2) ? "igual":"diferente";
        System.out.println(resultado1);
        
        resultado2 = (nome1 == nome3) ? "igual":"diferente";
        System.out.println(resultado2);
        
        resultado3 = (nome1.equals(nome3)) ? "igual":"diferente";
        System.out.println(resultado3);
    }
    
}