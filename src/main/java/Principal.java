
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double soma = 0;
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            double numero = leitor.nextDouble();

            if (numero > 0) {
                positivos++;
                soma+= numero;
            }
        }
        double media = soma / positivos;
        
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f%n", media);
    }
}
