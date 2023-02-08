import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        // Leitura de dados string

        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Voce digitou: " + x);

        // Leitura de dados inteiro

        Scanner inteiro = new Scanner(System.in);
        int y;
        y = inteiro.nextInt();
        System.out.println("Voce digitou: " + y);

        // Leitura de dados double

        Scanner doubleou = new Scanner(System.in);
        double d;
        d = doubleou.nextDouble();
        System.out.println("Voce digitou: " + d);

        // Leitura de dados char

        Scanner caractere = new Scanner(System.in);
        char c;
        c = caractere.next().charAt(0);
        System.out.println("Voce digitou: " + c);

        // Para ler varios dados na mesma linha

        Scanner varios = new Scanner(System.in);
        String aa;
        int yy;
        double zz;
        aa = varios.next();
        yy = varios.nextInt();
        zz = varios.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(aa);
        System.out.println(yy);
        System.out.println(zz);

        // Para ler um texto até a quebra de linha

        Scanner texto = new Scanner(System.in);
        String s1, s2, s3;
        s1 = texto.nextLine();
        s2 = texto.nextLine();
        s3 = texto.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        varios.close();
        sc.close();
        caractere.close();
        doubleou.close();
        texto.close();
        inteiro.close();
    }
}
