import java.util.Scanner;

public class NumeroMuitoGrande {

    int flag = 0;
    int n1[] = new int[30];
    int n2[] = new int[30];
    int soma[] = new int[30];

    public void Soma() {
        int cont = 0;
        for (int i = 29; i >= 0; i--) {
            if (i == 0) {
                if ((soma[i] + n1[i] + n2[i]) > 10) {
                    System.out.println("Numeros grandes demais.");
                    flag = 1;
                    break;
                }
            }
            if (soma[i] + n1[i] + n2[i] >= 10) {
                soma[i] = (soma[i] + n1[i] + n2[i]) - 10;
                cont = 1;
            } else {
                soma[i] = soma[i] + n1[i] + n2[i];
            }
            if (cont == 1) {
                cont = 0;
                soma[i - 1] = 1;
            }
        }
    }

    public void EscreverSoma() {
        int cont = 0;
        System.out.println("Soma: ");

        for (int i = 0; i <= 29; i++) {
            if (soma[i] == 0 && cont == 0) {
                if (soma[i + 1] != 0) {
                    cont = 1;
                }
            } else {
                System.out.print(soma[i]);
            }
        }
    }

    public static void main(String[] args) {
        int contarNum1, contarNum2;
        String num1, num2;
        Scanner input = new Scanner(System.in);
        NumeroMuitoGrande BigInt = new NumeroMuitoGrande();

        System.out.println("1o Numero: ");
        num1 = input.next();
        System.out.println("2o Numero: ");
        num2 = input.next();
        contarNum1 = num1.length();
        contarNum2 = num2.length();

        int i, j;
        for (i = contarNum1, j = 0; i > 0; i--, j++) {
            char caracter = num1.charAt(j);
            BigInt.n1[30 - i] = Character.getNumericValue(caracter);
        }
        for (i = contarNum2, j = 0; i > 0; i--, j++) {
            char caracter2 = num2.charAt(j);
            BigInt.n2[30 - i] = Character.getNumericValue(caracter2);
        }

        BigInt.Soma();

        if (BigInt.flag != 1) {
            BigInt.EscreverSoma();
        }
    }
}
