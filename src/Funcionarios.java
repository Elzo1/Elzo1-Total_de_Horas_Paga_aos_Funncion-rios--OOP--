public class Funcionarios {

    public String nome;
    public double valorPorHora;
    public int horas;


    public double total() {
        return  valorPorHora * horas;
    }
}
