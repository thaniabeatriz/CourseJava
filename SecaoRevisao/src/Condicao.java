import java.util.Scanner;

public class Condicao {
    public static void main(String[] args) {

        // Condicao If-Else

        Scanner hora = new Scanner(System.in);
        int h = hora.nextInt();

        if (h < 12) {
            System.out.println("Bom dia");
        } else if (h < 18) {
            System.out.println("Boa tarde");
        } else
            System.out.println("Boa noite");

        // Condicao Switch Case

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.printf("Dia da semana: " + dia);
        sc.close();
        hora.close();

        // Condicao operador ternario
        // (condicao) ? valor_se_verdadeiro : valor_se_falso

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

    }
}
