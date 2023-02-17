package dio.exercises;
import java.io.IOException;
import java.util.Scanner;

public class DesafiosCodigo {

	
  public static void main(String[] args) throws IOException {
        soma_fracionaria();
    }
	
    public static void positivos_e_media() throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;

        //TODO: Implemente as condições adequadas para obter a quantidade 
        //de valores positivos e a média dos valores positivos:
            for (int i = 0; i < 6; i++ ) {
                x = leitor.nextDouble();
                if(x>0) {
                    cont++;
                    media+=x;
                }
            }
            
            media = media/cont;
            System.out.println(cont + " valores positivos");
            System.out.println(String.format("%.1f", media));
            leitor.close();
    }



    public static void soma_fracionaria() throws IOException {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        for (double i = 1; i <= n; i++) {
            h += 1/i;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(Math.round(h));
        sc.close();
    }

}

