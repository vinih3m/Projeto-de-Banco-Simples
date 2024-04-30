package poo;
public class Funcionario {
    private int DiasTrabalhados=22;
    protected void ola(){
        System.out.println("Você realizou a orientação a objetos");
    }
    protected void setDiasTrabalhados(int n){
        DiasTrabalhados +=n;
    }
    protected void getDiasTrabalhados(){
        System.out.println("Total de dias trabalhados: "+DiasTrabalhados);
    }
}
