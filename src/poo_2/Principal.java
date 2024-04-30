package poo_2;

public class Principal {
    public static void main(String[]args){
         Leao l1 = new Leao();
         l1.correr=100;
         l1.cor="Amarelo";
         l1.qtd_cacar=10;
        System.out.println("___________");
        System.out.println("A cor do leão é: "+l1.cor);
        System.out.println("A quantidade de caça diária do leão é:"+l1.qtd_cacar);
        System.out.println("O leão :"+l1.correr+"km/H");
        l1.som();
        l1.comer();
        l1.test();
    }
}
