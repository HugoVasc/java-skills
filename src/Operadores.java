

import java.util.Date;

public class Operadores {
    public static void main(String[] args){
        double soma = 1 + 2;
        double subtracao = 1 - 2;
        double multiplicacao = 1 * 2;
        double divisao = 1 / 2F;
        double resto_modulo = 1 % 2;
        Date data = new Date();
        boolean interruptor = true;
        // Operadores unários
        int num = 10;
        num++;
        System.out.println(num);
        num--;
        System.out.println(num);
        num += 10;
        System.out.println(num);
        num -= 10;

        int num2 = -10;
        System.out.println(num2);

        //piscaPisca();
        
        while(num2 < 10){
            interruptor = toggle(interruptor);
            num2+=5;
            //operador ternário
            System.out.println(interruptor ? "Luz acesa" : "Luz apagada");
        }
        // Comparando objetos
        String nome = "Nome";
        String nome2 = new String("Nome");
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2)); //Compara conteúdos

        // Operadores lógicos
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso ? "Verdadeiro" : "Falso");
        System.out.println(verdadeiro || falso ? "Verdadeiro" : "Falso");
        System.out.println(verdadeiro^verdadeiro ? "Verdadeiro" : "Falso");
    }

    private static boolean toggle(boolean interruptor){
        return !interruptor;
    }
}
