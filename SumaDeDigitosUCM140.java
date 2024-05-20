import java.util.Scanner;

public class SumaDeDigitosUCM140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String numero = scanner.nextLine().trim();
            int n = Integer.parseInt(numero);
            if (n < 0) {
                break;
            }

            int suma = 0;
            StringBuilder resultado = new StringBuilder();

            for (int i = 0; i < numero.length(); i++) {
                int digito = Character.getNumericValue(numero.charAt(i));
                suma += digito;
                if (i > 0) {
                    resultado.append(" + ");
                }
                resultado.append(digito);
            }

            resultado.append(" = ").append(suma);
            System.out.println(resultado);
        }

        scanner.close();
    }
}