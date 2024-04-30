package Banco_simples;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome");
        String titular = sc.next();
        System.out.println("Com qual valor iremos iniciar sua conta?");
        float saldo = sc.nextFloat();
        BancoSimples bc = new BancoSimples(titular, saldo);

        while (true){
            System.out.println("Digite uma das opções abaixo");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            int x = sc.nextInt();
            if(x == 1){
                System.out.println("Digite um valor do deposito");
                float value = sc.nextFloat();
                bc.depositar(value);
            } else if (x == 2){
                System.out.println("Digite o valor do saque");
                float value = sc.nextFloat();
                bc.sacar(value);
            } else if ( x == 3){
                bc.getSaldo();
            }else{
                break;
            }
        }
    }
}
