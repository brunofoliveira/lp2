import java.util.Scanner;

public class CPF {

    public int[] vetor = new int[11];

    public void converteCPF() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nove primeiros digitos do CPF: ");
        String cpf = input.next();

        int tamanho = cpf.length();
        
        for (int i = 0; i < tamanho; i++) {
            char caracter = cpf.charAt(i);
            vetor[i] = Character.getNumericValue(caracter);
        }
    }

    public void achaX() {
        int peso = 10, soma = 0
        int x = 0, resto1 = 0;
        
        for (int i = 0; i <= 8; i++) {
            soma += vetor[i] * peso;
            peso--;
        }
        resto1 = soma % 11;
        
        if (resto1 < 2) {
            x = 0;
        } else {
            x = 11 - resto1;
        }

        vetor[9] = x;
    }

    public void achaY() {
        int peso = 11, soma2 = 0;
        int y = 0, resto2 = 0;
        
        for (int i = 0; i <= 9; i++) {
            soma2 += vetor[i] * peso;
            peso--;
        }
        resto2 = soma2 % 11;
        
        if (resto2 < 2) {
            y = 0;
        } else {
            y = 11 - resto2;
        }

        vetor[10] = y;
    }

    public static void main(String[] args) {

        CPF cpf = new CPF();
        cpf.converteCPF();
        cpf.achaX();
        cpf.achaY();

        System.out.print("O CPF completo eh: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(cpf.vetor[i]);
        }

    }

}
