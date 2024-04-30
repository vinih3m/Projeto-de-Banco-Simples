package poo;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.ola();
        int extra= 15;
        f1.setDiasTrabalhados(extra);
        f1.getDiasTrabalhados();
    }
}
