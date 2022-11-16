import java.util.Locale;
import java.util.Scanner;

public class Programa {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionarios f1, f2;

        f1 = new Funcionarios();
        f2 = new Funcionarios();


        String nome1, nome2;
        double valorProHora1, valorPagoProHora2;
        int horas1, horas2;

        System.out.print("Digite os dados do primeiro funcionario: ");
        f1.nome = sc.next();
        f1.valorPorHora = sc.nextDouble();
        f1.horas = sc.nextInt();

        System.out.println("");

        System.out.print("Digite os dados do primeiro funcionario: ");
        f2.nome = sc.next();
        f2.valorPorHora = sc.nextDouble();
        f2.horas = sc.nextInt();

        double total = f1.total() +  f2.total();

        System.out.printf("O Total = %.2f%n",total);
    }
}
