import java.util.Scanner;

public class ExercicioFourAndFive {

    public static void main(String[] args) {

        // While

        /*
         * Escreva um programa que repita a leitura de uma senha até que ela seja
         * válida. Para cada leitura de senha
         * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
         * informada corretamente deve ser
         * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
         * a senha correta é o valor 2002.
         */

        // Scanner um = new Scanner(System.in);
        // int senha = 2002;
        // int tentativa = um.nextInt();

        // while (tentativa != senha) {
        //     System.out.printf("Senha invalida %n");
        //     tentativa = um.nextInt();
        // }

        // System.out.println("Acesso permitido");


        //FOR

        /*
         * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso
         */

         Scanner dois = new Scanner(System.in);
         int num = dois.nextInt();
         int i;

        if ( (1 <= num) && (num <= 1000) ){

            for(i=0; i<num; i++){
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }

        }

    }

}