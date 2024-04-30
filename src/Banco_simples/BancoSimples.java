package Banco_simples;
public class BancoSimples { //Cosntrutor Primário
    private String titular;
    private float saldo;

    public BancoSimples(String titular, float saldo) { //Construtor Secundário
        this.saldo = saldo;
        this.titular = titular;
    }
        private void ajustarValor(float valor){
            saldo+=valor;
        }
        protected void depositar(float valor){//SET - Alterar
               if (valor>10000f){
                   System.out.println("Não é possivel fazer um depósito com valor acima de R$10.000,00");
               }else{
                   System.out.println("Realizando depósito...");
                   ajustarValor(valor);
               }
        }
        protected void sacar(float saque){
            if(saque > 50000f){
                System.out.println("Não é possivel fazer o saque com valor acima de R$50.000,00");
            }else{
                if(saque> saldo){
                    System.out.println("Não e possivel efetur saque");
                } else if ( saque == saldo){
                    System.out.println("Sua conta está zerada");
                    ajustarValor(-saque);
                }else{
                    System.out.println("Realizando saque...");
                    ajustarValor(-saque);
                }
            }

        }

        protected void getSaldo(){ // GET - Pegar ou Mostrar
            System.out.println("\n"+titular);
            System.out.println("seu saldo atual é de: "+saldo);
    }
}
