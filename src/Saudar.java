import java.util.Locale;
import java.util.Scanner;

public class Saudar {
    public static void main (String [] args){        
        final String BR = "Brasil"; //Variável com valor imutável
        final Double PI = 3.1415;
        
        System.out.println("\nThis is My Class!");
        if(args.length > 1)
        System.out.println(saudar(args[0], args[1]));
        else if(args.length > 0)
        System.out.println(saudar(args[0], ""));
        else{
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome: ");
            String nome = scan.next();
            System.out.println("Digite seu sobrenome: ");
            String sobreNome = scan.next();
            System.out.println(saudar(nome, sobreNome));
        }

    }

    private static String saudar (String primeiroNome, String segundoNome){
        return "Olá " + primeiroNome + " " + segundoNome;
    }
}
