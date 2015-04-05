import java.util.Scanner;

public class NumeroMuitoGrande {

    int flag = 0;
    int num1[] = new int[30];
    int num2[] = new int[30];
    int soma[] = new int[30];
    int mult[] = new int[30];


    public void somar() {
        int cont = 0;
        for (int i = 29; i >= 0; i--) {
            if (i == 0) {
                if ((soma[i] + num1[i] + num2[i]) > 10) {
                    System.out.println("Numeros grandes demais.");
                    flag = 1;
                    break;
                }
            }
            if (soma[i] + num1[i] + num2[i] >= 10) {
                soma[i] = (soma[i] + num1[i] + num2[i]) - 10;
                cont = 1;
            } else {
                soma[i] = soma[i] + num1[i] + num2[i];
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
        Scanner input = new Scanner(System.in);
        NumeroMuitoGrande NM = new NumeroMuitoGrande();
        String nume1, nume2;

        System.out.println("1o Numero: ");
        nume1 = input.next();
        System.out.println("2o Numero: ");
        nume2 = input.next();
        contarNum1 = nume1.length();
        contarNum2 = nume2.length();
        
        int i, j;
        for (i = contarNum1, j = 0; i > 0; i--, j++) {
            char caracter = nume1.charAt(j);
            NM.num1[30 - i] = Character.getNumericValue(caracter);
        }
        for (i = contarNum2, j = 0; i > 0; i--, j++) {
            char caracter2 = nume2.charAt(j);
            NM.num2[30 - i] = Character.getNumericValue(caracter2);
        }
  
        NM.somar();
  
        if (NM.flag != 1) {
            NM.EscreverSoma();
        }
      }
}
