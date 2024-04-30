package poo_2;

public class Cachorro extends Domestico{
    @Override
    public void som() {
        System.out.println("O cachorro está latindo...");
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo ração...");
    }
}
