import java.util.Scanner; 
public class Tipos_Variaveis {
    public static void main(String[] args){
        byte idade = 27; // 1 byte
        short ano = 2023;
        int cep = 70000000;
        long cpf = 12345678901L; // L para indicar que é um long
        float pi = 3.1415F; // F para indicar que é um float
        double salario = 15250.75;

        //Casting
        short numShort = 10;
        int numInt = numShort; // Não precisa de casting
        short numShort2 = (short) numInt; // Precisa de casting
        
        //Constante vs Variável
        final float PI = 3.1415F; // Constante
        float pi2 = 3.1415F; // Variável
        //Testes
        //Q 9 - Stefanini
        //for(;;) System.out.println("Teste");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();
        System.out.println("O número digitado foi: " + num);
        leitor.close();

    }

}
