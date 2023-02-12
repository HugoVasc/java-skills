public class MyClass {
    public static void main (String [] args){
        
        final String BR = "Brasil"; //Variável com valor imutável
        final Double PI = 3.1415;
        
        System.out.println("\nThis is My Class!");
        System.out.println(saudar("Hugo", "Vasconcelos"));
    }

    private static String saudar (String primeiroNome, String segundoNome){
        return "Olá " + primeiroNome + " " + segundoNome;
    }
}
