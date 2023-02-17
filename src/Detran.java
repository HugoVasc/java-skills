import java.util.Scanner; 
public class Detran {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        if(velocidadeAtual > 66){
          System.out.println("Foi Multado");
        } else {
          System.out.println("Não foi Multado");
        }

    }
}
