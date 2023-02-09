import java.util.Scanner;

public class ExercicioTwo {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
         * soma desses números com uma
         * mensagem explicativa, conforme exemplos.
         */

        /*
         * int x = 0;
         * int y = 0;
         * int soma = 0;
         * Scanner um = new Scanner(System.in);
         * x = um.nextInt();
         * y = um.nextInt();
         * soma = x + y;
         * System.out.printf("SOMA = %d %n", soma);
         * um.close();
         * /*
         * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
         * valor da área deste círculo com quatro
         * casas decimais conforme exemplos.
         * Fórmula da área: area = π . raio2
         * Considere o valor de π = 3.14159
         */

        /*
         * double pi = 3.14159;
         * double area = 0.0;
         * double raio = 0.0;
         * Scanner two = new Scanner(System.in);
         * raio = two.nextDouble();
         * area = pi * Math.pow(raio,2);
         * System.out.printf("%n A = " + area);
         * two.close();
         * 
         * /*
         * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
         * calcule e mostre a diferença do produto
         * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
         * D).
         */

        /*
         * int a = 0;
         * int b = 0;
         * int c = 0;
         * int d = 0;
         * int dif = 0;
         * Scanner three = new Scanner(System.in);
         * a = three.nextInt();
         * b = three.nextInt();
         * c = three.nextInt();
         * d = three.nextInt();
         * dif = a * b - c * d;
         * System.out.printf("%n DIFERENCA = %d", dif);
         * 
         * /*
         * Fazer um programa que leia o número de um funcionário, seu número de horas
         * trabalhadas, o valor que recebe por
         * hora e calcula o salário desse funcionário. A seguir, mostre o número e o
         * salário do funcionário, com duas casas
         * decimais.
         */

        /*
         * int num = 0;
         * int horas = 0;
         * float valor = 0;
         * float salario = 0;
         * Scanner quapro = new Scanner(System.in);
         * num = quapro.nextInt();
         * horas = quapro.nextInt();
         * valor = quapro.nextFloat();
         * salario = (float) horas * valor;
         * System.out.printf("NUMBER = %d", num);
         * System.out.printf("%n SALARY = %.2f", salario);
         * 
         * /*
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
         * valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago
         */

        /*
         * int cod1, num1, cod2, num2;
         * float valor1, valor2, total;
         * 
         * Scanner cinco = new Scanner(System.in);
         * cod1 = cinco.nextInt();
         * num1 = cinco.nextInt();
         * valor1 = cinco.nextFloat();
         * 
         * cod2 = cinco.nextInt();
         * num2 = cinco.nextInt();
         * valor2 = cinco.nextFloat();
         * 
         * total = (float) ((num1 * valor1) + (num2 * valor2));
         * System.out.printf("VALOR A PATGAR: R$ %.2f", total);
         * 
         * /*
         * Fazer um programa que leia três valores com ponto flutuante de dupla
         * precisão: A, B e C. Em seguida, calcule e
         * mostre:
         * a) a área do triângulo retângulo que tem A por base e C por altura.
         * b) a área do círculo de raio C. (pi = 3.14159)
         * c) a área do trapézio que tem A e B por bases e C por altura.
         * d) a área do quadrado que tem lado B.
         * e) a área do retângulo que tem lados A e B
         */

        float a, b, c;
        double areaA, areaB, areaC, areaD, areaE;
        double pi = 3.14159;
        Scanner seis = new Scanner(System.in);
        a = seis.nextFloat();
        b = seis.nextFloat();
        c = seis.nextFloat();

        areaA = (double) (a * c) / 2;
        areaB = (double) pi * Math.pow(c, 2);
        areaC = (double) ((a + b) * c) / 2;
        areaD = (double) b * b;
        areaE = (double) a * b;
        System.out.printf("TRIANGULO: %f", areaA);
        System.out.printf("CIRCULO: %f", areaB);
        System.out.printf("TRAPEZIO: %f", areaC);
        System.out.printf("QUADRADO: %f", areaD);
        System.out.printf("RETANGULO: %f", areaE);

    }
}
