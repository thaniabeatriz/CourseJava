import java.util.Scanner;

public class ExercicioThree {
    
    public static void main (String[] args){

        /*
         * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
         */
        // Scanner um = new Scanner(System.in);
        // int num = um.nextInt();

        // if (num < 0) {
        //     System.out.printf("NEGATIVO");
        // } else {
        //     System.out.printf("NAO NEGATIVO");
        // }
        // um.close();

        /*
         * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         */
            // Scanner dois = new Scanner(System.in);
            // int num = dois.nextInt();

            // int resul = num%2;
            // if(resul == 0){
            //     System.out.printf("PAR");
            // } else { 
            //     System.out.printf("IMPAR");
            // }

            // dois.close();


            /*
             * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente
             */

                // Scanner tres = new Scanner(System.in);
                // int a = tres.nextInt();
                // int b = tres.nextInt();

                // if (a%b == 0 || b%a == 0){
                //     System.out.printf("SAO MULTIPLOS");
                // } else {
                //     System.out.printf("NAO SAO MULTIPLOS");
                // }

            /*
             * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
             */

            Scanner quatro = new Scanner(System.in);
            int inicio, fim, horas;
            inicio = quatro.nextInt();
            fim = quatro.nextInt();

            if (inicio < fim) { 
                horas = fim - inicio;
            } else {
                horas = 24 - inicio + fim;
            }

            System.out.printf("O JOGO DUROU %d HORAS", horas);
    }
}
